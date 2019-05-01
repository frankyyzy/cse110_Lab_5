package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature{

    public Celsius(float v) {
        super(v);
    }

    public String toString()
    {

        return getValue() + " C";
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(getValue()* 9 / 5 + 32);
    }
}
