package S6_HW;

import java.util.Objects;

public class notebooks {
    private String model;
    private String os;
    private String color;
    private int memory;
    private float price;

    public notebooks(String model, String os, String color, int memory, float price) {
        this.model = model;
        this.os = os;
        this.color = color;
        this.memory = memory;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getOs() {
        return os;
    }
    
    public String getColor() {
        return color;
    }

    public int getMemory() {
        return memory;
    }
    
    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("| %s | %s | %s | %d | %.2f |", 
        model, color, os, memory, price);
    }

}
