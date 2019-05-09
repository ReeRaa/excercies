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

        //sorting players
        Collections.sort(footballTeam);
        System.out.println("After sorting:");
        for (Player pl : footballTeam) {
            System.out.println("Age: "+pl.getAge()+", Name: "+pl.getName()+", Ranking: "+pl.getRanking());
        }
    }
}
