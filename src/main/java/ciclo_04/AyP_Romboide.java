package ciclo_04;
import java.util.Scanner;
/**
 * @author JOSTHEN GABRIEL
 */
public class AyP_Romboide {
    public static void main(String[] args){
        Scanner rtn = new Scanner (System.in);       
          
        System.out.println("AREA Y PERIMETRO DEL ROMBOIDE");
        System.out.println("Ingrese la base:");
        double b=rtn.nextDouble();
        System.out.println("Ingrese la altura:");
        double h=rtn.nextDouble();
        double A=b*h;
        double P=(2*b)+(2*h);        
        System.out.println("El Area es: "+A);
        System.out.println("El Perimetro es: "+P);
    }
}
