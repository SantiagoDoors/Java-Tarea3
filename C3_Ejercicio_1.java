import javax.swing.JOptionPane;

public class C3_Ejercicio_1 {
    public static void main(String[] args) {
        int CuentasLetra = 0, valor = 0, suma = valor;
        String cadena = JOptionPane.showInputDialog("ingrese una Frase");
        String Letra = JOptionPane.showInputDialog("ingrese una Letra");
        while (valor <= cadena.length()-1){
            suma = valor + 1;
            if (cadena.substring(valor, suma).equals(Letra))
                CuentasLetra++;
            valor++;
        }
        System.out.println("Contamos "+CuentasLetra+" letras " +Letra);
    }
}