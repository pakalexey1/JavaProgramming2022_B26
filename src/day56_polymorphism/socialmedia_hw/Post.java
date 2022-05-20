package day56_polymorphism.socialmedia_hw;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    private String body;
    final private String dateTime;

    public Post(String body){
        setBody(body);
        this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDateTime() {
        return dateTime;
    }


}

/*
Post class
• Create a class that has the following instance variable:
String body, and String dateTime
- Encapsulate body. Provide a public getter and setter
- Make dateTime final, private, read only (getter, but no setter)
• Create a constructor that will take and initialize the body instance variable.
Upon creation of the post the current date and time should be taken and
stored into the dateTime variable. Use the code given below
Note: Since we didn’t learn this class use the follow code:
 this.dateTime =
LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy
| hh:mm a"));
➔Need to have these two imports for the above code:
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 */
