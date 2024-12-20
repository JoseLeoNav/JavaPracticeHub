package Enums.Colores.models;

import Enums.Colores.enums.Color;

public class ConvertidorColor {
    public static Color convertirHexadecimal(String valorHexadecimal) {
        for (Color color : Color.values()) {
            if (color.getValorHexadecimal().equalsIgnoreCase(valorHexadecimal)) {
                return color;
            }
        }
        return null;
    }
}