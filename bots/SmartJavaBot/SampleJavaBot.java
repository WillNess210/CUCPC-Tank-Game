import java.util.Scanner;

public class SampleJavaBot{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // INIT
        int myId = in.nextInt();
        int numSites = in.nextInt();
        for(int i = 0; i < numSites; i++){
            int siteX = in.nextInt();
            int siteY = in.nextInt();
        }
        // FOR EACH TURN
        while(true){
            int myCoins = in.nextInt();
            int opCoins = in.nextInt();
            int numUnits = in.nextInt();
            for(int i = 0; i < numUnits; i++){
                int unitID = in.nextInt();
                int unitOwner = in.nextInt();
                int unitType = in.nextInt();
                int unitX = in.nextInt();
                int unitY = in.nextInt();
                int unitParam1 = in.nextInt();
            }
            System.out.println("MOVE 0 500 250");
        }
    }
}