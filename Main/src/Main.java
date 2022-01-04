import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Main {

    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {

        MobilfunkanbieterInfo mfi = (MobilfunkanbieterInfo) Naming.lookup("rmi://localhost:1099/Mobilfunkanbieter_server");

        System.out.println("Willkommen im Scheiß Haus");
        System.out.println("____________________________________");


        while(true){
            System.out.println("Wollen Sie sich Registieren?(Ja/Nein)");
            String antwort = "Ja";
            if (antwort.equals("Ja"))
            {
                System.out.println("Vorname:");
                String vorname = "Farshad";

                System.out.println("Nachname:");
                String nachname = "Sahr";


                System.out.println("Alter:");
                String geburtstag = "07-10-1998";

                System.out.println("Straße:");
                String straße = "Porzerstraße";

                System.out.println("PLZ:");
                String plz = "51143";

                System.out.println("Hausnr:");
                String hausnr = "13";


                System.out.println("Ort:");
                String ort = "Porz";


                //Kundenanlegen und Unterschrift abfragen
                Kunde neuAnlegen = new Kunde(vorname,nachname,geburtstag,straße,plz,hausnr,ort);

                //Verfügbarkeit prüfen

                //Bonitätsprüfung

                //Mitarbeiterprüfung per RMI


                //Bestätigung und Vertrag den Kunden zur Unterschrift vorliegen
                String unterschrift = "";
                if (System.console().readLine() == "Ja")
                {
                    while (unterschrift == "")
                    {
                        System.out.println("Bitte unterschreiben Sie hier:");
                        unterschrift = System.console().readLine();

                        if(unterschrift != null){
                            System.out.println("Vielen Dank!");
                        }
                    }
                }

                //Kunde unterschrieben?
                Boolean unterschrieben = neuAnlegen.kVunterschrieben(unterschrift);

                if(unterschrieben){
                    //Kunde wird in Kundendatenbank aufgenommen
                    mfi.updateKundendatenbank(neuAnlegen);

                    //---> Server Seitig Mitarbeiter erhält Provision
                    //---> Vertrag Abschließen
                } else{
                    //Kunde hat nicht unterschrieben ENDE
                }

                if(neuAnlegen != null){
                    mfi.updateKundendatenbank(neuAnlegen);
                }
            }
        }


        //Willkommen Satz




        //Kunden anlegen, Name, Vorname, Geburtstag, Adresse
        // --> Kunde kriegt eine KundenNR
        // --> Persodaten prüfen
        // --> Unterschreibt

    }
}
