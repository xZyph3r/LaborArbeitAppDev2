public class Kunde extends Personen {

    static int kundennr;
    boolean persoDaten;

    public Kunde(String vorname, String nachname, String gebuDatum, String strasse, String plz, String hausnr, String ort) {
        super(vorname, nachname, gebuDatum, strasse, plz, hausnr, ort);

        kundennr = kundennr + 1;
        this.persoDaten = false;
    }


    public boolean kVunterschrieben(String unterschrift) {
        if (unterschrift != null) {
            System.out.println("Vielen Dank!");
            return true;
        }
        return false;
    }
}
