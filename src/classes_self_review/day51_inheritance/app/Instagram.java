package classes_self_review.day51_inheritance.app;

public class Instagram extends App{

    public Instagram(double version){
        super("Instagram",version);
    }
    public void postPicture(){
        System.out.println("Posting picture to " + name);
    }
}

/* Create a class Instagram
    - Instagram class inherits App class
    - create constructor to call parent constructor and set up variables (name and version)
    - create method:
        -postPicture()
            Example output: prints Posting picture to Instagram
 */

/*
Why not do this?
    public Instagram(String name, double version){
    super(name, version);
    }

    new Instagram("Instagram", 2.1);
    new Instagram("Instagram", 3.4);
    new Instagram("Instagram", 4.7);

    so instead of putting "Instagram" all the time we hardcode it.
 */