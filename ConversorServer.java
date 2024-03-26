import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ConversorServer extends UnicastRemoteObject implements Conversor{

    public ConversorServer() throws RemoteException {
        super();
    }

    @Override
    public float euroReal(float a) throws RemoteException {
        return(a * (float)5.40);
    }

    @Override
    public float realEuro(float a) throws RemoteException {
        return(a * (float)0.19);
    }

    @Override
    public float dolarReal(float a) throws RemoteException {
        return(a * (float)0.2);
    }

    @Override
    public float realDolar(float a) throws RemoteException {
        return (a * (float)4.98);
    }

    public static void main(String[] args) {
        try {
            ConversorServer server = new ConversorServer();
            System.out.println("CalculadoraServer is running...");
            Naming.rebind("rmi://127.0.0.1:11099/RMIInterface", new ConversorServer());
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

}
