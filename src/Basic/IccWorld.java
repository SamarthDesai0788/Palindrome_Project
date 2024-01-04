package Basic;
import java.util.Scanner;
public class IccWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] WorldCupTeams = {"India", "Australia", "England", "South Africa", "New Zealand", "Pakistan", "Sri Lanka", "West Indies", "Bangladesh", "Afghanistan", "Netherlands"};
        try {
            System.out.print("Enter the predicted winner ICC World Cup 2023 = ");
            String predictedWinner = scanner.nextLine();
            if (predictedWinner.equalsIgnoreCase("Ind")) {
                predictedWinner = "India";
            } else if (predictedWinner.equalsIgnoreCase("Aus")) {
                predictedWinner = "Australia";
            }
            else if(predictedWinner.equalsIgnoreCase("Eng")){
                predictedWinner = "England";
            }
            else if(predictedWinner.equalsIgnoreCase("RSA")){
                predictedWinner = "South Africa";
            }
                else if(predictedWinner.equalsIgnoreCase("NZ")){
                    predictedWinner = "New Zeland";
            }
                else if(predictedWinner.equalsIgnoreCase("Pak")){
                    predictedWinner = "Pakistan";
                }
                else if(predictedWinner.equalsIgnoreCase("SL")){
                    predictedWinner = "Sri Lanka";
                }
                else if(predictedWinner.equalsIgnoreCase("NEL")){
                    predictedWinner = "Netherlands";
                }
                else if(predictedWinner.equalsIgnoreCase("AFG")){
                    predictedWinner = "Afghanistan";
                }
                else if(predictedWinner.equalsIgnoreCase("BAN")){
                    predictedWinner = "Bangladesh";
                }
                else if(predictedWinner.equalsIgnoreCase("WI")){
                    predictedWinner = "West Indies";
                }
            
            boolean found = false;
            for (String team : WorldCupTeams) {
                if (team.equalsIgnoreCase(predictedWinner)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new Exception(predictedWinner + " not found in the list of teams.");
            }
            System.out.println("The predicted winner of the ICC World Cup 2023 is " + predictedWinner + ".");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
