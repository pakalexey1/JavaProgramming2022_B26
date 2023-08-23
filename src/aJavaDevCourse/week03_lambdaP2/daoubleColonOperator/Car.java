package aJavaDevCourse.week03_lambdaP2.daoubleColonOperator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String name;
    private int model;

    public Car() {
    }

    public Car(int model) {
        this.model = model;
    }

    public Car(String name, int model) {
        this.name = name;
        this.model = model;
    }


}
