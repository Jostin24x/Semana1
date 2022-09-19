package ciclo_04;
import java.util.Scanner;
/**
 *
 * @author JOSTHEN GABRIEL
 */
public class Suma {
    public static void main(String[] args){
        Scanner digitar = new Scanner (System.in);
        int suma=0;
        
        for (int i=0; i<5; i++){
            System.out.println("Introduce el numero:");
            int n = digitar.nextInt();
            suma = suma + n;
        }
        System.out.println("La suma es:" +suma);
    } 
}
