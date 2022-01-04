import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.sql.*;

public class Server {

    public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException, NotBoundException, SQLException, ClassNotFoundException {
        Registry reg = java.rmi.registry.LocateRegistry.createRegistry(1099);
        Naming.bind("rmi://localhost:1099/Mobilfunkanbieter_server", new Mobilfunkanbieter());





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

        //SQL
        /*
        String dbURL = "jdbc:mariadb://localhost/test";
        String driver = "org.mariadb.jdbc.Driver";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(dbURL, "root", "");
        Statement statement = conn.createStatement();

        //get Info execute(...) – Methode erwartet eine Zeichenkette als Parameter
        //statement.execute("SELECT * FROM Kunde");

        //Liefert ein ResultSet-Objekt mit den Ergebnissen der Abfrage zurück
        ResultSet res1 = statement.getResultSet();


        //get Methode erhält eine SQL-Abfrage(!) als Zeichenkette als Parameter;
        String sql = "SELECT * FROM EMPLOYEE";
        statement = conn.createStatement();
        //Liefert ein ResultSet-Objekt mit den Ergebnissen der Abfrage zurück
        ResultSet res2 = statement.executeQuery(sql);

        try
        {
            while( res1.next() ) // solange noch Zeilen im Ergebnis
            {
                // jeweils Spalten mit Namen 'kdNr' und 'name' ausgeben
                System.out.println(res1.getInt("kdNr")+ " " +res1.getString("name"));
            }
        }catch (Exception e){

        }
        */
        //insert
        //statement.executeUpdate("INSERT INTO Customers " + "VALUES (1001, 'Simpson', 'Mr.', 'Springfield', 2001)");
    }
}
