package Enums.DiasDeLaSemana;

import Enums.DiasDeLaSemana.enums.DiaSemana;

public class App {
    public static void main(String[] args) {
        DiaSemana[] semana = generarArreglo(10);
        for (DiaSemana dia : semana) {
            imprimirDiaLaboral(dia);
        }

    }

    public static DiaSemana[] generarArreglo(int dias) {
        DiaSemana[] semana = new DiaSemana[dias];
        for (int i = 0; i < dias; i++) {
            semana[i] = DiaSemana.values()[(int) (Math.random() * DiaSemana.values().length)];
        }
        return semana;
    }

    public static void imprimirDiaLaboral(DiaSemana dia) {
        if (dia.esDiaLaboral()) {
            System.out.println("El día " + dia + " es un día laboral.");
        } else {
            System.out.println("El día " + dia + " no es un día laboral.");
        }
    }

}
