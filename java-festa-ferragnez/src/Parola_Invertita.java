import java.util.Scanner;

public class Parola_Invertita {
    
    public static void main(String[] args) {
        
        System.out.println("Inserisci una parola che vuoi venga invertita");

        Scanner scanner = new Scanner (System.in);

        String parolaUtente = scanner.nextLine();
        String parolaInvertita = "";

       /* for (int i = parolaUtente.length() - 1; i >= 0; i--) {
            parolaInvertita += parolaUtente.charAt(i); 
       }
        */
        
        for (int i = 0; i < parolaUtente.length(); i++) {
            parolaInvertita = parolaUtente.charAt(i) + parolaInvertita;
        }

        System.out.println(parolaInvertita);
    }
        
}
