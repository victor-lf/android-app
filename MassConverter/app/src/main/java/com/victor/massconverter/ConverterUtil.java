package com.victor.massconverter;

// Convert from lb to kg and vice versa

public class ConverterUtil {
    // converts to kg
    public static float convertPoundToKilogram(float pound) {
        return Math.round(pound*(float)0.45359237);
    }

    // converts to pound
    public static float convertKilogramToPound(float kilogram) {
        return Math.round(kilogram/(float)0.45359237);
    }
}
