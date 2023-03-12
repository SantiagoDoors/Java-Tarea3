
public class C3_Ejercicio_3 {
    public static void main(String[] args) {

/*
        Los valores de los mayores a "x=33" son: {96,83,1892,154,54} 
        y la suma de los mismos da como resultado -> "2279"
*/

    //inicializando variables necesarias

        int resultado = 0, x = 33, Vector[] = {14,21,96,83,27,1892,154,22,54,8};    
    
    //recorremos el vector en busca de los mayores a x
        for (int i = 0; i < Vector.length; i++) {            
            if (x < Vector[i]) {
    // sumamos los resultados mayores a X            
            resultado += Vector[i];
            }
        }
    //mostramos el resultado por consola
        System.out.println("el resultado de la suma de los mayores a 'x' es: "+resultado);
    }
}