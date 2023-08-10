package aJavaDevCourse.day01_oop.sportsTeam;

import java.util.ArrayList;

public class Team<T extends Player> { //accepting only types that belong to Player (baseball, football, soccer)

    private String name;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(((Player)player).getName() + " is already on this team"); //casting is no longer needed and is optional here since T extends Player
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " was added to the team " + this.name); //casting is no longer needed since T extends Player
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }
}
