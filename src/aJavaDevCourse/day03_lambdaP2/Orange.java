package aJavaDevCourse.day03_lambdaP2;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
@Data

public class Orange {
    private int weight;
    private Color color;
}

//@Builder generates an @AllArgsConstructor unless there is another @XConstructor