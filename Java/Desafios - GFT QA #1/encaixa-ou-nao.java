// Encaixa ou Não I

/* Paulinho tem em suas mãos um pequeno problema. A professora lhe pediu que ele construísse um programa para verificar, à partir de dois valores inteiros A e B, se B corresponde aos últimos dígitos de A. */

import java.util.Scanner;

public class Problem {

   public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      
      int count = scan.nextInt();
      
      for (int i = 0; i < count; i++) {
         int a = scan.nextInt();
         int b = scan.nextInt();

         String str_a = String.valueOf(a);
         String str_b = String.valueOf(b);

         int lenght_a = str_a.length();
         int lenght_b = str_b.length();

         if( (lenght_b > lenght_a) || !(str_a.substring(lenght_a - lenght_b).equals(str_b)) )
         System.out.println("nao encaixa");
         else System.out.println("encaixa");
      }
   }
}