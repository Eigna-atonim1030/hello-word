import java.util.Scanner;

class Bisiesto 
{
   public static void main(String v[])
   {
      Scanner lea = new Scanner(System.in);
      int year;
      System.out.println("Digite un a�o ");
      year = lea.nextInt();
      
      if (  (  (year % 4) == 0 && (year % 100) != 0) || (  (year % 100) == 0 ) && ((year % 400) == 0 ))
      {
         System.out.println("EL A�O ES BISIESTO");
      }
      else
      {
         System.out.println("EL A�O NO ES BISIESTO");
      }
   }
}

