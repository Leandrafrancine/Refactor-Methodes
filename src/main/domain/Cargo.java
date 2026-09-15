package main.domain;

public class Cargo {
    private double weight;
    private double declaredValue;
    private boolean hazardous;

    public Cargo(String description, double weight, double declaredValue, boolean hazardous) {
        this.weight = weight;
        this.declaredValue = declaredValue;
        this.hazardous = hazardous;

    }

    public double getWeight() { return weight; }
    public double getDeclaredValue() { return declaredValue; }
    public boolean isHazardous() { return hazardous; }
}
