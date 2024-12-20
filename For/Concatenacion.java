package For;

public class Concatenacion {
    public static void main(String[] args) {
        String[] cadena = { "Mi", "primera", "concatenacion." };
        String texto = "";
        for (int i = 0; i < cadena.length; i++) {
            texto = texto.concat(cadena[i]).concat(" ");
        }
        System.out.println(texto);
    }

}
