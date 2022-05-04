package day51_inheritance.app;

public class YouTube extends App {
    public YouTube (double version){
        super("YouTube",version);
    }

    public void watchVideo(){
        System.out.println("Watching a video on " + name);
    }

}
