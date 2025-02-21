package com.saiketsystems.temperatureconverter;

public class ConverterService {
    public double convert(String type, double temperature) {
        return switch (type.toLowerCase()) {
            case "c-to-f" -> TemperatureConverter.celsiusToFahrenheit(temperature);
            case "f-to-c" -> TemperatureConverter.fahrenheitToCelsius(temperature);
            default -> throw new IllegalArgumentException("Invalid conversion type");
        };
    }
}
