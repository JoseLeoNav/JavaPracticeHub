package Enums.Colores;

import Enums.Colores.enums.Color;
import Enums.Colores.models.ConvertidorColor;

public class App {
    public static void main(String[] args) {

        pruebaConvertidorColor("#FF0000");
        pruebaConvertidorColor("#FFFF00");
        pruebaConvertidorColor("#0000FF");
        pruebaConvertidorColor("#00FF00");
        pruebaConvertidorColor("#FFFFFF");
    }

    private static void pruebaConvertidorColor(String valorHexadecimal) {

        Color color = ConvertidorColor.convertirHexadecimal(valorHexadecimal);
        if (color != null) {

            System.out.println("El valor hexadecimal " + valorHexadecimal + " corresponde al color " + color);
        } else {
            System.out.println(
                    "No se encontró un color primario correspondiente para el valor hexadecimal " + valorHexadecimal);
        }
    }
}