# Fruit Slot Machine Game

Welcome to the Fruit Slot Machine Game! This Java program simulates a slot machine where the player deposits money and gets three random fruits. The player earns money based on the combination of fruits obtained.

## How to Play

1. Enter the amount of money you want to deposit when prompted.
2. Three fruits will be randomly selected from the list: ["ORANGE", "APPLE", "MELON", "CHERRY", "BANANA", "STRAWBERRY"].
3. If all three fruits are the same, you earn three times your deposit. If two fruits are the same, you earn twice your deposit. Otherwise, you don't earn anything.
4. Choose to play again ('y') or exit ('n').

## Game Implementation

The game uses a loop to allow players to play multiple times. It tracks the total deposited money, total earned money, and calculates the overall profit. The program displays statistics at the end of the game.

```java
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] fruits = {"ORANGE", "APPLE", "MELON", "CHERRY", "BANANA", "STRAWBERRY"};
        String[] chosenFruits = new String[3];
        String cont;
        double totalDeposit = 0, totalEarned = 0, earned;

        do {
            System.out.print("Enter The Money That You Want to Deposit: ");
            double money = input.nextDouble();
            totalDeposit += money;

            // Choosing three random fruits and adding them to chosenFruits
            for (int i = 0; i < 3; i++) {
                int randomIndex = random.nextInt(fruits.length);
                chosenFruits[i] = fruits[randomIndex];
            }

            System.out.println("\nFruits Are Selecting Randomly:");
            System.out.println(chosenFruits[0] + " " + chosenFruits[1] + " " + chosenFruits[2]);

            // Checking for matched fruits and earned money
            if ((chosenFruits[0].equals(chosenFruits[1])) && (chosenFruits[1].equals(chosenFruits[2]))) {
                earned = money * 3;
                System.out.printf("Deposited Money: %.2f₺\nEarned Money: %.2f₺\n", money, earned);
            } else if ((chosenFruits[0].equals(chosenFruits[1])) || (chosenFruits[1].equals(chosenFruits[2]))
                    || (chosenFruits[0].equals(chosenFruits[2]))) {
                earned = money * 2;
                System.out.printf("Deposited Money: %.2f₺\nEarned Money: %.2f₺\n", money, earned);
            } else {
                earned = 0;
                System.out.printf("Deposited Money: %.2f₺\nEarned Money: %.2f₺\n", money, earned);
            }

            totalEarned += earned;

            System.out.print("Do You Want to Play Again (y/n): ");
            cont = input.next();
            System.out.println();

        } while (cont.equals("y"));

        double profit = totalEarned - totalDeposit;

        // Printing the statistics when the game ends after the user enters a letter other than 'y'
        System.out.printf("Total Deposited Money: %.2f₺\n", totalDeposit);
        System.out.printf("Total Earned Money: %.2f₺\n", totalEarned);
        System.out.printf("Profit: %.2f₺\n", profit);
    }
}
