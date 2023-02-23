package java_homework.hw6;

public class Laptop {
    private String brand;
    private String model;
    private String color;
    private double diagonal;
    private int SSD;
    private int operativeMemory;


    public Laptop() {
    }

    public Laptop(String brand, String model, String color, double diagonal, int SSD, int operativeMemory) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.diagonal = diagonal;
        this.SSD = SSD;
        this.operativeMemory = operativeMemory;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return getColor(null);
    }

    public String getColor(String requestUserForSearch) {
        return color;
    }

    public int getSSD() {
        return SSD;
    }
    public int getOperativeMemory() {
        return operativeMemory;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String printInfo(){
        System.out.printf("Brand: %s, Model: %s, Color: %s, Диагональ: %s, Объем SSD %s, RAM: %s", brand, model, color, diagonal, SSD, operativeMemory);
        return ".";
    }
}
