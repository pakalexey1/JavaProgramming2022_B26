package day57_exceptions.webelement;

import java.util.ArrayList;

public class Apple {
    public static void main(String[] args) {

        Form obj = new Form();
        Link obj2 = new Link();
        Input obj3 = new Input();
        Image obj4 = new Image();

        ArrayList<WebElement> elements = new ArrayList<>();// ArrayList of WebElements, which means the objects
        // impement the WebElement interface.
        elements.add(obj);
        elements.add(obj2);
        elements.add(obj3);
        elements.add(obj4);
        elements.add(new Form());

        for(WebElement each : elements){
            System.out.println(each.getText());

            if (each instanceof Form){
                ((Form)each).submit();
            }
        }

        System.out.println("================");
        WebElement logo = new Image();
        logo.click();//click method is accessible by the WebElement interface reference, then exectution happens on
        // object side
        // logo.imgExtension = ".png"; WebElement interface doesn't have accessibility to the variable

        ((Image)logo).imgExtension = ".png";// ((Image)logo) --> casts the logo (WebElement reference) to an Image
        // reference, then the Image reference has access to the extension variable

        //option 2:
        Image logoAsImage = ((Image)logo);
        logoAsImage.imgExtension = ".png";
    }
}

/*
without instanceof part you would be trying to cast all of the obj for Form, but objs don't have relation to Form
((Form)each
 */
