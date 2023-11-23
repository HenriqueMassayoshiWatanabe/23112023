import java.util.Scanner;
public class atividade9 {
    public static void main(String[] args) {
     
        Scanner intScanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int n1 = intScanner.nextInt();

        if (n1 >= 18) {
            System.out.println("Você é maior de idade!");               
        } else {
            System.out.println("Você é menor de idade.");                
        }
        intScanner.close();
    }
}

