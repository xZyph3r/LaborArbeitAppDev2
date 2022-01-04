import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Mitarbeiter extends Personen{

    int mitarbeiterNr;
    private double gehalt;


    public Mitarbeiter(int MitarbeiterNR, double Gehalt,String vorname, String nachname, int alter, String strasse, String plz, String hausnr, String ort){
        super(vorname,nachname,alter,strasse,plz,hausnr,ort);
        this.mitarbeiterNr = MitarbeiterNR;
        this.gehalt = Gehalt;

    }

    public static boolean mitarbeiterPruefung(int kundennr)
    {
        if (ExternesUnternehmen.bonitaetspruefung(kundennr)){
            System.out.println("Bonitätsprüfung war erfolgreich.");
        }
        else System.out.println("Bonitätsprüfung war NICHT erfolgreich.");
        System.out.println("Kunden mit Kundennummer "+kundennr+ "zum Vertragsabschluss berechtigen? y/n");
        if (System.console().readLine() == "y") {
            return true;
        }
        else return false;
    }
    static Connection conn = null;

    public void erhaeltProvision(int ePGeld)
    {
        gehalt += ePGeld;
        try {
            String sql = "UPDATE mitarbeiter SET gehalt="+gehalt+"WHERE MitarbeiterNr="+mitarbeiterNr;
            Statement stat = conn.createStatement();
            int upd = stat.executeUpdate(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public double getGehalt() {
        return gehalt;
    }
}
