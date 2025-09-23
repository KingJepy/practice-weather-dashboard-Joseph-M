package com.example.demo.model;

public class WeatherResponse {
    public Location location;
    public Current current;

    public static class Location {
        public String name;
    }

    public static class Current {
        public double temp_c;
        public Condition condition;
        public int humidity;
    }

    public static class Condition {
        public String text;
    }
}
