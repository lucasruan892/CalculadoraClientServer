import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleJavaServer {

    public static float Soma(float num1, float num2) {
        return num1 + num2;
    }

    public static float Subtracao(float num1, float num2) {
        return num1 - num2;
    }

    public static float Multiplicacao(float num1, float num2) {
        return num1 * num2;
    }

    public static float Divisao(float num1, float num2) {
        return num1 / num2;
    }

    public static void main(String[] args) 	{

        try {
            ServerSocket s = new ServerSocket(9999);
            String str;
            Float n1, n2, res = null;

            while (true) {
                Socket c = s.accept();
                InputStream i = c.getInputStream();
                OutputStream o = c.getOutputStream();
                do {
                    byte[] line = new byte[100];
                    i.read(line);
                    str = new String(line);

                    str = str.replaceAll("\\s+", "");

                    if (str.indexOf("+") >= 0) {
                        String[] valores = str.split("\\+");
                        n1 = Float.parseFloat(valores[0]);
                        n2 = Float.parseFloat(valores[1]);
                        res = Soma(n1, n2);
                        System.out.println(valores);
                    }

                    if (str.indexOf("-") >= 0) {
                        String[] valores = str.split("-");
                        n1 = Float.parseFloat(valores[0]);
                        n2 = Float.parseFloat(valores[1]);
                        res = Subtracao(n1, n2);
                        System.out.println(valores);
                    }

                    if (str.indexOf("*") >= 0) {
                        String[] valores = str.split("\\*");
                        n1 = Float.parseFloat(valores[0]);
                        n2 = Float.parseFloat(valores[1]);
                        res = Multiplicacao(n1, n2);
                        System.out.println(valores);
                    }

                    if (str.indexOf("/") >= 0) {
                        String[] valores = str.split("/");
                        n1 = Float.parseFloat(valores[0]);
                        n2 = Float.parseFloat(valores[1]);
                        res = Divisao(n1, n2);
                        System.out.println(valores);
                    }

                    str = String.valueOf(res);
                    o.write(str.getBytes());
                    System.out.println(str.trim());
                    //if (str.trim().equals("Thomas"))
                    //    o.write("Rabelo".getBytes());
                    str = new String(line);
                } while ( !str.trim().equals("bye") );
                c.close();
            }
        }
        catch (Exception err){
            System.err.println(err);
        }
    }

}
