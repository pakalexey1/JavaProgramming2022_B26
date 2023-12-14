package practice2023.Inheritance;

public class Device {
    public String name;
    public int weight;

    public void isOn(){
        System.out.println("The " + Device.class.getName() + " is on");
    }
}
