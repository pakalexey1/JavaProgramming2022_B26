package aJavaDevCourse.week04_streams.state;

import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {

        State va= new State();
        va.addCity("McLean");
        va.addCity("Arlington");
        va.addCity("Fairfax");
        va.addCity("Fallschurs");

        State tx = new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Austin");
        tx.addCity("Houston");

        List<State> list = Arrays.asList(va,tx);

        System.out.println("Print the stream of streams list");
        list.stream().map(state -> state.getCity()).forEach(System.out::println);

        System.out.println("\nFlatten stream of streams and print");
        list.stream()
                .map(state -> state.getCity())
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
