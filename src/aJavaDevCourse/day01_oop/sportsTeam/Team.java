package aJavaDevCourse.day01_oop.sportsTeam;

import java.util.ArrayList;

public class Team<T> {

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
            System.out.println(((Player)player).getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(((Player)player).getName() + " was added to the team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }
}
