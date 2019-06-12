package footballteam;

import footballteam.Player;

import java.util.*;

public class PlayerSorter {
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();

        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(24, "Bob", 24);
        Player player3 = new Player(35, "Michael", 12);

        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before sorting: ");
        for (Player pl : footballTeam) {
            System.out.println("Age: "+pl.getAge()+", Name: "+pl.getName()+", Ranking: "+pl.getRanking());
        }

        System.out.println();

        //sorting players by ranking
        Collections.sort(footballTeam);
        System.out.println("Sorting by ranking:");
        for (Player pl : footballTeam) {
            System.out.println("Age: "+pl.getAge()+", Name: "+pl.getName()+", Ranking: "+pl.getRanking());
        }

        System.out.println();

        //sorting players by ranking with use of separate class
        System.out.println("Sorting by Ranking with use of separate class: ");

        PlayerRankingComparator rankingComparator=new PlayerRankingComparator();
        Collections.sort(footballTeam,rankingComparator);

        for (Player pl:footballTeam){
            System.out.println("Age: "+pl.getAge()+", Name: "+pl.getName()+", Ranking: "+pl.getRanking());
        }
        System.out.println();

        //sorting players by age with use of comparator class
        System.out.println("Sorting by age:");

        PlayerAgeComparator ageComparator=new PlayerAgeComparator();
        Collections.sort(footballTeam,ageComparator);

        for (Player pl:footballTeam){
            System.out.println("Age: "+pl.getAge()+", Name: "+pl.getName()+", Ranking: "+pl.getRanking());
        }

        System.out.println();

        //use lambda expression to comparator
        Comparator<Player> byRanking=(Player pl1,Player pl2) -> pl1.getRanking() -pl2.getRanking();
        System.out.println("By ranking with lambda:");
        Comparator<Player> byRankingComp = Comparator.comparing(Player::getRanking);
        for (Player pl:footballTeam){
            System.out.println("Age: "+pl.getAge()+", Name: "+pl.getName()+", Ranking: "+pl.getRanking());
        }
        System.out.println();
        System.out.println("By age with lambda:");
        Comparator<Player> byAgeComp=Comparator.comparing(Player::getAge);
        for (Player pl:footballTeam){
            System.out.println("Age: "+pl.getAge()+", Name: "+pl.getName()+", Ranking: "+pl.getRanking());
        }


    }
}
