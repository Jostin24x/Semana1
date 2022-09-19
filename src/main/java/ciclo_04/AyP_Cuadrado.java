package ciclo_04;
import java.util.Scanner;
/**
 *
 * @author JOSTHEN GABRIEL
 */
public class AyP_Cuadrado {
    public static void main(String[] args){
        Scanner cdr = new Scanner (System.in);   
        int l=0;
        int P=0, A=0;
        
        System.out.println("AREA Y PERIMETRO DEL CUADRADO");
        System.out.println("Ingrese el lado:");
        l=cdr.nextInt();
        
        A=l*l;
        P=4*l;
        
        System.out.println("El Area es: "+A);
        System.out.println("El Perimetro es: "+P);
    }
}
