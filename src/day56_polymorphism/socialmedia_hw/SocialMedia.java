package day56_polymorphism.socialmedia_hw;

public abstract class SocialMedia {
    int accountLength;
    static String platform;
    String username;
    String password;
    String fullName;
    String personalURL;

    public abstract void directMessaging (String username, String msg);

    public abstract void  post(Object obj);

    public abstract void notifications();
}

/*
Create an abstract class SocialMedia
• The SocialMedia class will have the following fields:
- Personal url (String)
- Account length (int)
- Platform (static String)
- Username
- Password
- Full name
• The SocialMedia class will have the following abstract methods:
- Direct messaging (String username, String message)
- Post (Object media) [using Object type as the parameter]
- Notifications ()
 */