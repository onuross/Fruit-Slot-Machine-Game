
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] fruits = {"ORANGE","APPLE","MELON","CHERRY","BANANA","STRAWBERRY"};
        String[] chosenFruits = new String[3];
        String cont;
        double totalDeposit = 0, totalEarned=0, earned;
        do{
            System.out.print("Enter The Money That You Want to Deposit:");
            double money = input.nextDouble();
            totalDeposit += money;
            // Choosing the random 3 fruits from the fruits and adding it to chosenFruits
            for (int i = 0; i<3; i++){
                int randomIndex = random.nextInt(fruits.length);
                chosenFruits[i] = fruits[randomIndex];
            }
            System.out.println("\nFruits Are Selecting Randomly;");
            System.out.println(chosenFruits[0] + " " + chosenFruits[1] + " " + chosenFruits[2]);
            // Checking for the matched fruits and earned money
            if ((chosenFruits[0].equals(chosenFruits[1])) && (chosenFruits[1].equals(chosenFruits[2]))){
                // banana banana banana
                earned = money * 3;
                System.out.printf("Deposited Money: %s₺\nEarned Money: %s₺",money,earned + "\n");
            } else if ((chosenFruits[0].equals(chosenFruits[1])) || (chosenFruits[1].equals(chosenFruits[2]))
                    || (chosenFruits[0].equals(chosenFruits[2]))) {
                // apple strawberry apple
                earned = money * 2;
                System.out.printf("Deposited Money: %s\n₺Earned Money: %s₺",money,earned + "\n");
            }else {
                // apple melon cherry
                earned = 0;
                System.out.printf("Deposited Money: %s\n₺Earned Money: %s₺",money,earned + "\n");
            }
            totalEarned += earned;
            System.out.print("Do You Want to Play Again (y/n):");
            Scanner inputCont = new Scanner(System.in);
            cont = inputCont.nextLine();
            System.out.println();

        }while (cont.equals("y"));
        double profit = totalEarned-totalDeposit;
        // Printing the statistics when game ended after user entered letter another than 'y'
        System.out.printf("Total Deposited Money: %.2f₺\n", totalDeposit);
        System.out.printf("Total Earned Money: %.2f₺\n",totalEarned);
        System.out.printf("Profit: %.2f₺\n",profit);
    }
}