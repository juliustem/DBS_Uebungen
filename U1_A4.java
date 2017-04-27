import java.util.Scanner;

public class U1_A4{
    public static void main(String[] args) {  //Main Funktion

        Scanner Eingabe = new Scanner(System.in); //Scanner Java ermoeglicht die Eingabe der Werte

        System.out.println("Geben Sie den Namen des Benutzers ein!"); //Aufforderung
        String name = Eingabe.next(); //Eingabe des Strings
        System.out.print("Hallo " + name + "!");  //Ausgabe der Begrueßung
    }
}
