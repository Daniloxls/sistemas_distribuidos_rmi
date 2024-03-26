import java.rmi.Naming;

public class ConversorClient {
    private static Conversor conv = null;

    public static void main(String[] args) {
        try {
            conv = (Conversor) Naming.lookup("rmi://127.0.0.1:11099/RMIInterface");
            System.out.println(String.valueOf(conv.dolarReal(4)));
        }
        catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }
}
