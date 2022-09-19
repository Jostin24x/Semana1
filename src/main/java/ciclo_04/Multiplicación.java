package ciclo_04;
import java.util.Scanner;
/**
 *
 * @author JOSTHEN GABRIEL
 */
public class Multiplicación {
    public static void main(String[] args){
        Scanner por = new Scanner (System.in);
        int a,b,c,d,e;
	int multi;
	System.out.println("Ingrese las 5 numeros");
	a = (int) Double.parseDouble(por.nextLine());
	b = (int) Double.parseDouble(por.nextLine());
	c = (int) Double.parseDouble(por.nextLine());
	d = (int) Double.parseDouble(por.nextLine());
	e = (int) Double.parseDouble(por.nextLine());
	multi = (int) (a*b*c*d*e);
        
	System.out.println("La multiplicacion de los 5 numeros es: "+multi);
    } 
}
