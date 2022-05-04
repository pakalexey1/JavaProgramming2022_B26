package day47_encapsulation;

public class TrafficLight {
    private String color;

    public TrafficLight (String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        switch (color.toLowerCase()) {
            case "red":
            case "yellow":
            case "green":
                this.color = color;
        }

    }
}
