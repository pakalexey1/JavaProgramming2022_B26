package aJavaDevCourse.day01_oop.sportsTeam;

import day52_inheritance.hiding.B;

public class TeamTest{
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

//        Team liverpool = new Team("Liverpool");

        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");

        liverpool.addPlayer(beckham);

//        Team <String> teamString = new Team<String>("String Team"); //doesn't accept string anymore because Team only accepts <Player> type of objects

        System.out.println(liverpool.numPlayers());
    }
}
