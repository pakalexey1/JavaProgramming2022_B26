package classes_self_review.day44_custom_classes.employee;

public class Offer {

    String location;
    String company;
    public double salary;
    boolean isFullTime;
    int numberOfPTO;

    public Offer(String location, String company) {
        this.location = location;
        this.company = company;
    }

    public Offer(String location, String company, double salary) {
        this(location, company);
        this.salary = salary;
    }

    public Offer(String location, String company, double salary, boolean isFullTime, int numberOfPTO) {
        this(location, company, salary);
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    public String toString() {
        String info = "\n"+company + " located at " + location;
        info += ", " + (salary > 0 ? salary : "");
        info += ", " + (isFullTime ? "Full time" : "Contract");
        info += ", " + (numberOfPTO>0 ? numberOfPTO : "")+" | ";
        return info;

    }
}

/*
create a class called Offer
- data:
    location, company, salary, is full time, number of PTO
- constructor
    - create a constructor that creates an Offer object with the company and location
    - create a constructor that creates an Offer object with the company, location, and salary
    - create a constructor that creates an Offer object with the company, location, salary, is ful time and number of
     PTO

- method:
    toString()
            print all the employees information

create a separate class to create and test the Offer objects

 */
