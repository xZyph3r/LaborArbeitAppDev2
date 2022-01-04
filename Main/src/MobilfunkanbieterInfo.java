import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface MobilfunkanbieterInfo extends Remote {

    public abstract void getNumVertraege()
            throws RemoteException;

    public boolean verfugbarkeitsprufung(int a)
            throws RemoteException;

    public boolean vertragstBestätigung(int kundennr, boolean bonitaetsprüfung, boolean mitarbeiterPruefung)
            throws RemoteException;

    public void updateKundendatenbank(Kunde kunde)
            throws RemoteException;
}
