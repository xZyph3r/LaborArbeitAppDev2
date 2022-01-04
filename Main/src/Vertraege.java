<<<<<<< Updated upstream
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Vertraege extends Remote{

    public abstract int gesamtAnzahlVertraege()
            throws RemoteException;

    public abstract boolean vertragNr(int vertragNr)
            throws RemoteException;
=======
public class Vertraege {

    static final int gesamtAnzahlVertraege = 5;
    int vertragNr = 0;


    public int erhoeheVertragNr(boolean vertragstBestätigung) {
        if (vertragstBestätigung) {
            return vertragNr += 1;
        }
        else return vertragNr;
    }
>>>>>>> Stashed changes
}
