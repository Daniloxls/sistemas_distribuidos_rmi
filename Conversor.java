import java.rmi.*;

public interface Conversor extends Remote {
    public float euroReal(float a) throws RemoteException;
    public float realEuro(float a) throws RemoteException;
    public float dolarReal(float a) throws RemoteException;
    public float realDolar(float a) throws RemoteException;
}