package For;

public class RandomPares {
    public static void main(String[] args) {

        float[] numeros = new float[20];
        
        for (int i = 0; i < numeros.length; i++) {
            float random = (float) Math.floor(Math.random() * 100) + 1;
            numeros[i] = random;
        }
        float suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        float promedio = suma / numeros.length;
        System.out.println(
                "El resultado de la suma de los elementos del array es " + suma + ", y su promedio es " + promedio);

    }
}
