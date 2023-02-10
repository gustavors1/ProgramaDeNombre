import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Command para pedir texto en console
        //Buscar en stackoverflow en inglés
        System.out.print("Hola, ingrese su nombre: ");
        String name = br.readLine();
        System.out.println("Your name is: " + name);
    }
}

