package ciclo_04;
import java.util.Scanner;
/**
 *
 * @author JOSTHEN GABRIEL
 */
public class AyP_Rectangulo {
    public static void main(String[] args){
        Scanner rtn = new Scanner (System.in);      
        int b=0, h=0;
        int P=0, A=0;
        
        System.out.println("AREA Y PERIMETRO DEL RECTANGULO");
        System.out.println("Ingrese la base:");
        b=rtn.nextInt();
        System.out.println("Ingrese la altura:");
        h=rtn.nextInt();
        A=b*h;
        P=(2*b)+(2*h);
        System.out.println("El Area es: "+A);
        System.out.println("El Perimetro es: "+P);
    }
}
