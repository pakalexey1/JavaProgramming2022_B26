package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many friends you have?");
        int numOfFriends = input.nextInt();
        input.nextLine();

        System.out.println("Enter friends names one a time");
        String [] friendList = new String[numOfFriends];

        for (int i = 0; i < numOfFriends; i++) {
            friendList [i] = input.nextLine();
        }

        String friendListStr = Arrays.toString(friendList);
        friendListStr = friendListStr.replace("[","");
        friendListStr = friendListStr.replace("]","");


        System.out.println((friendListStr));
    }
}
