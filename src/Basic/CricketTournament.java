package Basic;
import java.util.Scanner;

public class CricketTournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter total runs scored: ");
            double totalRuns = Double.parseDouble(sc.nextLine());

            System.out.print("Enter total overs faced: ");
            double totalOvers = Double.parseDouble(sc.nextLine());


            double runRate =(double) totalRuns / totalOvers;
            System.out.println("Run rate: " + runRate);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
 
