package aJavaDevCourse.day02_lambda.AppleSortingAgain;

import aJavaDevCourse.day03_lambdaP2.Color;

public class Apple {
    private int weight;
    private Color Color;

    public Apple(int weight, aJavaDevCourse.day03_lambdaP2.Color color) {
        this.weight = weight;
        Color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public aJavaDevCourse.day03_lambdaP2.Color getColor() {
        return Color;
    }

    public void setColor(aJavaDevCourse.day03_lambdaP2.Color color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", COLOR=" + Color +
                '}';
    }
}
