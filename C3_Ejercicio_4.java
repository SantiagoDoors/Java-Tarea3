import javax.swing.JOptionPane;


public class C3_Ejercicio_4 {
    public static void main(String[] args) {
        String Cifrado = "";
        String Frase = JOptionPane.showInputDialog("Introduzca su frase a ser cifrada (sin acentos, ni ñ)");
        String desplazamiento = JOptionPane.showInputDialog("introduzca la cantidad de desplazamiento del cifrado");

        for (int i = 0; i < Frase.length(); i++){
            int Letras = (int)(Frase.charAt(i));
            Cifrado = Cifrado+String.valueOf((char)(Letras+Integer.valueOf(desplazamiento)));
        }
        System.out.println("su Frase es: "+Frase);
        System.out.println("eligió desplazar las letras: "+Integer.valueOf(desplazamiento)+" veces");
        System.out.println("Su Frase Cifrada es: "+Cifrado);
    }
}