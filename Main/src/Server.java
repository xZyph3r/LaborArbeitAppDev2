import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException, NotBoundException {
        Registry reg = java.rmi.registry.LocateRegistry.createRegistry(1099);
        Naming.bind("rmi://localhost:1099/tarif_server",new vertragInfo());

        //Mitarbeiter anlegen, Name, Vorname, Geburtstag, Adresse
        // --> Mitarbeiter kriegt eine MitarbeiterNR
        // --> Gehalt wird gesetzt
        // --> kriegt pro Kunde Provision
        // --> Mitarbeiter kann Kunden Bonität nochmal prüfen (Ja/Nein)


        //Mobilfunkanbierter
        // --> verfügbarkeit der Verträge prüfen (gesamt Anzahl verträge)
        // --> Vertrag bestätigen daraus folgt Vertrag kriegt VertragNR
        // --> Kunden in die Datenbank pflegen (SQL)


        //Externes Unternehmen
        // --> prüft Bonität

    }
}
