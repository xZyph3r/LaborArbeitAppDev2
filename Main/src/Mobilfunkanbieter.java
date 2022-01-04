import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;

public class Mobilfunkanbieter extends UnicastRemoteObject implements MobilfunkanbieterInfo{

    public Mobilfunkanbieter() throws RemoteException
    {
    }
    static Connection conn = null;


    public void getNumVertraege() {
        try {
            String sql = "SELECT COUNT(vertragsNR) AS total FROM vertraege WHERE aktiv = 1";
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);

            int a = (res.getInt("total"));
            System.out.println(a);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public boolean verfugbarkeitsprufung(int a) {
        if(a < Vertraege.gesamtAnzahlVertraege) {
            return true;
        }
        else return false;


    }

    public boolean vertragstBestätigung(int kundennr, boolean bonitaetsprüfung, boolean mitarbeiterPruefung) {
        if(bonitaetsprüfung){
            Mitarbeiter.mitarbeiterPruefung(kundennr);
            if(mitarbeiterPruefung){
                return true;
            }
            else return false;
        }
        else return false;
    }
    public void updateKundendatenbank(Kunde kunde) {
            try {
                //String sql = "INSERT INTO kunde values "+ Personen.vorname+ Personen.name+ Personen.geburtstag+ Personen.straße+ Personen.hausnummer+ Personen.postleitzahl+ Personen.ort+ kunde.persoDaten;
                Statement stat = conn.createStatement();
                //int upd = stat.executeUpdate(sql);

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }







}


