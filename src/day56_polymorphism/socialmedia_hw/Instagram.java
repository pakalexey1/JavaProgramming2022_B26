package day56_polymorphism.socialmedia_hw;

import java.time.LocalTime;
import java.util.ArrayList;

public class Instagram extends SocialMedia implements hasPictures {
    private int numberOfFollowers;
    private int numberOfFollowings;
    private ArrayList<Picture> pictures;

    static {
        SocialMedia.platform = "Instagram";
    }

    public Instagram(String username, String password) {
        this.username = username;
        if (password.contains(username)) {
            System.err.println("Password contains username. Default password created: ‘password’");
            this.password = "password";
        } else {
            this.password = password;
        }
        this.personalURL = "instagram.com/" + username;
    }

    @Override
    public void directMessaging(String username, String msg) {
        System.out.println(msg + " sent to " + username);
    }

    @Override
    public void post(Object obj) {
        pictures.add(new Picture(new byte[]{12, 2, 3}, "jpg", "my photo"));
    }

    @Override
    public void notifications() {
        if (LocalTime.now().getHour() >= 10 && LocalTime.now().getHour() <= 20) {
            System.out.println("Notification");
        } else {
            System.out.println("Sleep mode");
        }

    }

    @Override
    public void likePicture() {
        System.out.println("Like");
    }

    @Override
    public void unlikePicture() {
        System.out.println("Unlike");
    }

    @Override
    public void sharePicture() {
        System.out.println("Share");
    }
}

/*
Instagram Class:
• Create a class Instagram that will inherit the SocialMedia class
• Add additional instance variables: number of followers, number of
followings, and pictures (ArrayList of Pictures)
• Set the platform for all objects to be "Instagram"
• Encapsulate the variables
• Create a constructor to initialize the username and password
- Set up the user's person url:
"Instagram.com/" + $username
• Implement all the abstract methods coming from the Social Media class
o Direct messaging (String username, String message)
- print = %message sent to %username
o Post (Object body)
- Let’s keep it simple and say our variable body will be a picture)
Add the picture object
o Notifications ()
- Checks the current time. If the time is between 10 am - 8 pm print "Notification",
otherwise print "Sleep mode"
Note: use this code to get the current hour: LocalTime.now().getHour()
- The return value will be given in 24 hour format.
 */