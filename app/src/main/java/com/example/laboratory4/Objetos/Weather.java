package com.example.laboratory4.Objetos;

public class Weather {
    public Main main;
    public String name;
    public int cod;
    public String wind;

    public Main getMain() {
        return main;
    }

    public String getName() {
        return name;
    }

    public int getCod() {
        return cod;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }
}
