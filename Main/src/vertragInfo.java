import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

    public class vertragInfo extends UnicastRemoteObject implements Vertraege {

        public vertragInfo() throws RemoteException {
        }

        @Override
        public int gesamtAnzahlVertraege() throws RemoteException {
            return 30;
        }

        @Override
        public boolean vertragNr(int vertragNr) throws RemoteException {
            return true;
        }
    }

