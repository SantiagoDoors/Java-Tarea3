import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C3_Ejercicio_2 {
    public static void main(String[] args) {

    // ingresar los numeros a ordenar

        Scanner in = new Scanner(System.in);
        int num1,num2,num3,asc;
        System.out.println("ingrese el primer numero");
        num1=in.nextInt();
        System.out.println("ingrese el segundo numero");
        num2=in.nextInt();
        System.out.println("ingrese el tercer numero");
        num3=in.nextInt();

    // ingresar la forma de orden

        System.out.println("ingrese el tipo de orden preferido siendo '1' Ascendente, o '0' Descendente");
        asc=in.nextInt();
        in.close();

    //ordenar de forma Ascendente

        if(asc == 1){
            int resultado[] = {num1, num2, num3};
            Arrays.sort(resultado);
            System.out.println("los numeros en orden Ascendente son: ");
            for (int n : resultado){
                System.out.println(n);
            }

    //ordenar de forma Descendente

        } else if (asc == 0){
            Integer resultado[] = {num1, num2, num3};
            Arrays.sort(resultado, Collections.reverseOrder());
            System.out.println("los numeros en orden Descendente son: ");
            for (int n : resultado){
                System.out.println(n);
            }
        }
    }
}
