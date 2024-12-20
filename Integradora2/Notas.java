package Integradora2;

import java.util.Arrays;

public class Notas {
    public static void main(String[] args) {
        String[] array = new String[15];
        for (int i = 0; i < array.length; i++) {
            int ran = (int) Math.floor((Math.random() * 10) + 1);
            String random = String.valueOf(ran);
            array[i] = random;
        }
        int contadorAprobados = 0;
        int contadorDesaprobados = 0;
        int contadorExcelente = 0;
        for (String element : array) {
            double nota = Double.valueOf(element);
            if (nota < 4) {
                contadorDesaprobados++;
            } else if (nota >= 4 && nota < 10) {
                contadorAprobados++;
            } else if (nota == 10) {
                contadorExcelente++;
            }
        }
        String[] desaprobados = new String[contadorDesaprobados];
        String[] aprobados = new String[contadorAprobados];
        String[] excelente = new String[contadorExcelente];

        int indexDesaprobados = 0;
        int indexAprobados = 0;
        int indexExcelente = 0;
        
        for (String element : array) {
            double nota = Double.valueOf(element);
            if (nota < 4) {
                desaprobados[indexDesaprobados++] = element;
            } else if (nota >= 4 && nota < 10) {
                aprobados[indexAprobados++] = element;
            } else if (nota == 10) {
                excelente[indexExcelente++] = element;
            }
        }

        double sumaTotal = 0;
        double sumaDesaprobados = 0;
        double sumaAprobados = 0;
        double sumaExcelente = 0;
        
        for (String s : array) {
            sumaTotal += Double.valueOf(s);
        }

        for (String s : desaprobados) {
            sumaDesaprobados += Double.valueOf(s);
        }
        
        for (String s : aprobados) {
            sumaAprobados += Double.valueOf(s);
        }
        
        for (String s : excelente) {
            sumaExcelente += Double.valueOf(s);
        }

        double promedioTotal = 0;
        if (array.length > 0) {
            promedioTotal = sumaTotal / array.length;
        }

        double promedioDesaprobados = 0;
        if (desaprobados.length > 0) {
            promedioDesaprobados = sumaDesaprobados / desaprobados.length;
        }

        double promedioAprobados = 0;
        if (aprobados.length > 0) {
            promedioAprobados = sumaAprobados / aprobados.length;
        }

        double promedioExcelente = 0;
        if (excelente.length > 0) {
            promedioExcelente = sumaExcelente / excelente.length;
        }

        System.out.println("Estos son lso resultados: ");
        System.out.println("Array de notas: " +Arrays.toString(array));
        System.out.println("SU promedio : " +promedioTotal);
        System.out.println("Array de desaprobados: " +Arrays.toString(desaprobados));
        System.out.println("SU promedio : " +promedioDesaprobados);
        System.out.println("Array de aprobados: " +Arrays.toString(aprobados));
        System.out.println("SU promedio : " +promedioAprobados);
        System.out.println("Array de Excelentes: " +Arrays.toString(excelente));
        System.out.println("SU promedio : " +promedioExcelente);
    }

}
