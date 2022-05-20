package day57_exceptions.webelement;

public class Image implements WebElement{

    String imgExtension;

    @Override
    public void click(){
        System.out.println("Clicking image");
    }

    @Override
    public String getText(){
        return "Text desc.";
    }
    @Override
    public void sendKeys(String txt){
        System.out.println("Uploading picture");
    }

}
