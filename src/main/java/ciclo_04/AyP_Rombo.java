package ciclo_04;
import java.util.Scanner;
/**
 *
 * @author JOSTHEN GABRIEL
 */
public class AyP_Rombo {
    public static void main(String[] args){
        Scanner rob = new Scanner (System.in);        
        int dx=0, dy=0, l=0;
        int P=0, A=0;
        
        System.out.println("AREA DEL ROMBO");
        System.out.println("Ingrese la diagonal mayor:");
        dx=rob.nextInt();
        System.out.println("Ingrese la diagonal menor:");
        dy=rob.nextInt();
        A=(dx*dy)/2;
        System.out.println("El Area es: "+A);
        System.out.println("================================");
        System.out.println("PERIMETRO DEL ROMBO");
        System.out.println("Ingrese el valor del lado:");
        l=rob.nextInt();
        P=4*l;
        System.out.println("El Perimetro es: "+P);
    }
}
