import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Vertraege extends Remote{

    public abstract int gesamtAnzahlVertraege()
            throws RemoteException;

    public abstract boolean vertragNr(int vertragNr)
            throws RemoteException;
}
