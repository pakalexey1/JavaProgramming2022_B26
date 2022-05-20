package day56_polymorphism.socialmedia_hw;

public class Runner {
    public static void main(String[] args) {

        Facebook fb1 = new Facebook("hambone", "asdfsahambone1", "HamboneFakenamington");
        System.out.println(fb1);
        System.out.println(fb1.platform);
       fb1.numberOfGroups = 5;
        fb1.setNumberOfFriends(50001);
        System.out.println(fb1.getNumberOfFriends());

        Facebook fb2 = new Facebook("hambone", "wer32dfddf", "HamboneFakenamington");

        fb2.setAge(19);
        System.out.println(fb2.getAge());
        fb2.post(new Post("A facebook post"));

        System.out.println(fb2.platform);

    }
}
