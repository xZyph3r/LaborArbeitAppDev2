public class Vertraege {

    static final int gesamtAnzahlVertraege = 5;
    int vertragNr = 0;


    public int erhoeheVertragNr(boolean vertragstBestätigung) {
        if (vertragstBestätigung) {
            return vertragNr += 1;
        }
        else return vertragNr;
    }