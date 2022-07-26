
package cicloforpotencias;

import java.util.Scanner;
public class CicloForpotencias
{

   // la J es el contador
    
    public static void main(String[] args) 
    {
        Scanner entrada= new Scanner (System.in);
        double num, potencia;
        
        for (int j = 1; j <= 10; j++) 
        {
            System.out.println("Escriba un numero decimal");
            num=entrada.nextDouble();
            potencia=num*num;
            System.out.println("La potencia es: "+potencia);
        }
    
    }
    
}
