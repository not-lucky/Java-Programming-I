
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Team> stats = new ArrayList<>();


        System.out.println("File:");
        String file = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] lineArray = line.split(",");
                String homeTeam = lineArray[0];
                String visitingTeam = lineArray[1];
                int hPoint = Integer.valueOf(lineArray[2]);
                int vPoint = Integer.valueOf(lineArray[3]);

                stats.add(new Team(homeTeam, visitingTeam, hPoint, vPoint));
        
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Team:");
        String teamName = scanner.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;
        for (Team stat : stats) {
            if (stat.getHomeTeam().equals(teamName)) {
                if (stat.getHPoint() > stat.getVPoint()) {
                    wins++;
                } else {
                    losses++;
                }
                games++;
            }

            if (stat.getVisitingTeam().equals(teamName)) {
                if (stat.getHPoint() < stat.getVPoint()) {
                    wins++;
                } else {
                    losses++;
                }
                games++;
            }
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}