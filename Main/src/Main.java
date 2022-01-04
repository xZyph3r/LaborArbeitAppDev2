<<<<<<< Updated upstream
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Main {

    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {

        Vertraege tarif = (Vertraege) Naming.lookup("rmi://localhost:1099/tarif_server");

        //Willkommen Satz


        //Kunden anlegen, Name, Vorname, Geburtstag, Adresse
        // --> Kunde kriegt eine KundenNR
        // --> Persodaten prüfen
        // --> Unterschreibt



        //Kunde
        //kunden nr prüfen
        int aKunde = 12;
        if( tarif.gesamtAnzahlVertraege() < 42 )
        {
            //existiert die Nr 12
            if(tarif.vertragNr(aKunde) )
            {
                System.out.println("Vertrag: " + aKunde + " Existiert bereich");
            }

        }else
        {
            System.out.println("keine freien plätze");
        }
=======
public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello Farshad");

>>>>>>> Stashed changes
    }
}
