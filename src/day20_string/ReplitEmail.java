package day20_string;

public class ReplitEmail {
    public static void main(String[] args) {

        String email = "sergey_brin@gmail.com";
        char firstInitial = email.toUpperCase().charAt(0);
        String firstName = email.substring(1, email.indexOf("_"));
        String firstFullName = firstInitial + firstName;
        String lastInitial = email.toUpperCase().substring(email.indexOf("_") + 1, email.indexOf("_") + 2);
        String lastName = email.substring(email.indexOf("_") + 2, email.indexOf("@"));
        String lastFullName = lastInitial + lastName;
        String domainInitial = email.toUpperCase().substring(email.indexOf("@")+1,email.indexOf("@")+2);
        String domainName = email.substring(email.indexOf("@")+2, email.indexOf("."));
        String fullDomain = domainInitial + domainName;

        System.out.println("First name: " + firstFullName);
        System.out.println("Last name: " + lastFullName);
        System.out.println("Domain: " + fullDomain);

    }
}

/*
Use String methods to divide the given email into separate parts. The email will always be in this format:
firstName_lastName@domain.com
Pull apart and print the first name, last name, and domain. When printing the values all three should be in proper capitalization format - The first letter of each word is uppercase and the rest are lowercase. Output in the following format:

First name: $first name
Last name: $last name
Domain: $domain
First name: $first name
Last name: $last name
Domain: $domain
Hint: Think about how to use substring and indexOf together
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

Ex:
  Input:
    jeff_bezos@amazon.us
    ​
  Output:
    First name: Jeff
    Last name: Bezos
    Domain: Amazon
copied!
Ex:
  Input:
    jeff_bezos@amazon.us

  Output:
    First name: Jeff
    Last name: Bezos
    Domain: Amazon
Ex:
  Input:
    sergey_brin@gmail.com
    ​
  Output:
    First name: Sergey
    Last name: Brin
    Domain: Gmail
 */
