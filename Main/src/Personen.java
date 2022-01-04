public class Personen
{
    public String vorname;
    public String nachname;
    public String gebuDatum;
    public String strasse;
    public String plz;
    public String hausnr;
    public String ort;

    public Personen(String vorname, String nachname, String geburtDatum, String strasse, String plz, String hausnr, String ort) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.gebuDatum = geburtDatum;
        this.strasse = strasse;
        this.plz = plz;
        this.hausnr = hausnr;
        this.ort = ort;
    }


    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setGebuDatum(String geburtDatum) {
        this.gebuDatum = geburtDatum;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

}
