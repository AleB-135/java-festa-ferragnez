import java.util.Scanner;
 
 public class CheckGuest {
 
     public static void main(String[] args) {
 
 
         String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
 
 
         Scanner scanner = new Scanner(System.in);
 
         System.out.println("Inserisci il tuo nome");
         String name = scanner.nextLine();

         boolean invitatoInLista = false;
 
         scanner.close();
 
        /*
                             // METODO 1: CICLO FOR
                             
             for (int i = 0; i < listaInvitati.length; i++);
 
                 if (name.equals("Dua Lipa")) {
                     System.out.println("Sei sulla lista. Benvenuta!");
 
                 } else if (name.equalsIgnoreCase("Paris Hilton")) {
                     System.out.println("Sei sulla lista. Benvenuta!");
 
                 } else if (name.equalsIgnoreCase("Manuel Agnelli")) {
                     System.out.println("Sei sulla lista. Benvenuto!");
 
                 } else if (name.equalsIgnoreCase("J-Ax")) {
                     System.out.println("Sei sulla lista. Benvenuto!");
 
                 } else if (name.equalsIgnoreCase("Francesco Totti")) {
                     System.out.println("Sei sulla lista. Benvenuto!");
 
                 } else if (name.equalsIgnoreCase("Ilary Blasi")) {
                     System.out.println("Sei sulla lista. Benvenuta!");
 
                 } else if (name.equalsIgnoreCase("Bebe Vio")) {
                     System.out.println("Sei sulla lista. Benvenuta!");
 
                 } else if (name.equalsIgnoreCase("Luis")) {
                     System.out.println("Sei sulla lista. Benvenuto!");
 
                 } else if (name.equalsIgnoreCase("Pardis Zarei")) {
                     System.out.println("Sei sulla lista. Benvenuto!");
 
                 } else if (name.equalsIgnoreCase("Martina Maccherone")) {
                     System.out.println("Sei sulla lista. Benvenuta!");
 
                 } else if (name.equalsIgnoreCase("Rachel Zeilic")) {
                     System.out.println("Sei sulla lista. Benvenuta!");
 
                 } else
                     System.out.println("Non sei sulla lista. Non puoi entrare.");

        */

                                // METODO UNO : CICLO FOR CORRETTO

            for (int i = 0; i < listaInvitati.length; i++) {
                System.out.println("Ricerco il nome sulla lista che corrisponda a: " + listaInvitati[i]);
                if (name.trim().equalsIgnoreCase(listaInvitati[i])) {
                    invitatoInLista = true;
                    break;
                } 

            }


                                 // METODO DUE: CICLO WHILE
             /* 
             int i = 0;
             while (i < listaInvitati.length) {
                 if (name.equalsIgnoreCase("Dua Lipa")) {
                 System.out.println("Sei sulla lista. Benvenuta!");
                 break;
 
                 }   else if (name.equalsIgnoreCase("Paris Hilton")) {
                     System.out.println("Sei sulla lista. Benvenuta!");
                     break;
 
                 } else if (name.equalsIgnoreCase("Manuel Agnelli")) {
                     System.out.println("Sei sulla lista. Benvenuto!");
                     break;
                 
                 } else if (name.equalsIgnoreCase("J-Ax")) {
                     System.out.println("Sei sulla lista. Benvenuto!");
                     break;
                 
                 } else if (name.equalsIgnoreCase("Francesco Totti")) {
                     System.out.println("Sei sulla lista. Benvenuto!");
                     break;
                 
                 } else if (name.equalsIgnoreCase("Ilary Blasi")) {
                     System.out.println("Sei sulla lista. Benvenuta!");
                     break;
                 
                 } else if (name.equalsIgnoreCase("Bebe Vio")) {
                     System.out.println("Sei sulla lista. Benvenuta!");
                     break;
                 
                 } else if (name.equalsIgnoreCase("Luis")) {
                     System.out.println("Sei sulla lista. Benvenuto!");
                     break;
                 
                 } else if (name.equalsIgnoreCase("Pardis Zarei")) {
                     System.out.println("Sei sulla lista. Benvenuto!");
                     break;
                 
                 } else if (name.equalsIgnoreCase("Martina Maccherone")) {
                     System.out.println("Sei sulla lista. Benvenuta!");
                     break;
                 
                 } else if (name.equalsIgnoreCase("Rachel Zeilic")) {
                     System.out.println("Sei sulla lista. Benvenuta!");
                     break;
                 
                 } else
                     System.out.println("Non sei sulla lista. Non puoi entrare.");
                     break;
             } 


             */
                                        // METODO DUE: CICLO WHILE CORRETTO
            
            /*int index = 0;

            while (!invitatoInLista && index < listaInvitati.length) {
                System.out.println("Ricerco il nome sulla lista che corrisponda a: " + listaInvitati[index]);
                if (name.trim().equalsIgnoreCase(listaInvitati[index])) {
                    invitatoInLista = true;
            }
            
            index++;
            
        }
            */  
             
             
             
            if (invitatoInLista) {
                System.out.println("Sei sulla lista. Diveriti " + name + "!");
             } else {
                System.out.println("Non sei sulla lista. Non puoi entrare.");
             }
     }
 
 
 }