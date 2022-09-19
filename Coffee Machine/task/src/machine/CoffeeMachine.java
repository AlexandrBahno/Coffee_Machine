package machine;

import java.util.Scanner;

public class CoffeeMachine {

    static int amountOfWater = 400; // сколько воды в машине
    static int amountOfMilk = 540; // сколько молока в машине
    static int numberOfCoffeeBeans = 120; // сколько зерен кофе в машине
    static int numberCupsForCoffee = 9; // сколько чашек для кофе в машине
    static int amountOfMoney = 550;  // сколько денег в автомате

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean i = true;
        while (i == true) {
            //String menuCommand = mainMenu(scanner); // обращение к основному меню
            switch (mainMenu(scanner)) {
                case ("buy"):
                    buyingCoffee(scanner);// функция покупки
                    break;

                case ("fill"):
                    restock(scanner);// ф-я пополнения
                    break;

                case ("take"):
                    pickUpCash();// ф-я вывода денег
                    break;

                case ("remaining"):
                    printingParametersOfTheCoffeeMachine(); // ф-я вывода данных машины
                    break;
                case ("exit"):
                    i = false; // ф-я выхода
                    break;
            }
        }
    }

    private static void buyingCoffee(Scanner scanner) {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String numMenu = scanner.next();
        switch (numMenu) {
            case ("1"):
                buyEspresso(); // покупка экспрессо
                break;
            case ("2"):
                buyLatte(); // покупка латте
                break;
            case ("3"):
                buyCappuccino(); // покупка капучино
                break;
            case ("back"):
                break; // выход в основное меню
        }
    }

    private static void buyEspresso() {  // можно ли приготовить экспрессо
        if (ICanBuyCoffee(250, 0, 16, 1)) {
            amountOfMoney = amountOfMoney + 4;  // сколько денег в автомат
        }
    }

    private static void buyLatte() {
        if (ICanBuyCoffee(350, 75, 20, 1)) {
            amountOfMoney = amountOfMoney + 7;  // сколько денег в автомат
        }
    }

    private static void buyCappuccino() {
        if (ICanBuyCoffee(200, 100, 12, 1)) {
            amountOfMoney = amountOfMoney + 6;  // сколько денег в автомате
        }
    }

    private static boolean ICanBuyCoffee(int water, int milk, int coffee, int cups) {
        if (amountOfWater >= water && amountOfMilk >= milk && numberOfCoffeeBeans >= coffee && numberCupsForCoffee >= cups) {
            System.out.println("I have enough resources, making you a coffee!");
            amountOfWater = amountOfWater - water; // сколько воды в машине
            amountOfMilk = amountOfMilk - milk; // сколько молока в машине
            numberOfCoffeeBeans = numberOfCoffeeBeans - coffee; // сколько зерен кофе в машине
            numberCupsForCoffee = numberCupsForCoffee - cups; // сколько чашек для кофе в машине
            return true;
        } else {
            if (amountOfWater < water) {
                System.out.println("Sorry, not enough water!");
            } else if (amountOfMilk < milk) {
                System.out.println("Sorry, not enough milk!");
            } else if (numberOfCoffeeBeans < coffee) {
                System.out.println("Sorry, not enough coffee beans!");
            } else {
                System.out.println("Sorry, not enough cups!");
            }
            return false;
        }
    }

    private static void restock(Scanner scanner) {
        System.out.println("Write how many ml of water you want to add:");
        amountOfWater = amountOfWater + scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        amountOfMilk = amountOfMilk + scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        numberOfCoffeeBeans = numberOfCoffeeBeans + scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        numberCupsForCoffee = numberCupsForCoffee + scanner.nextInt();
    }


    private static void pickUpCash() {
        System.out.println("I gave you $" + amountOfMoney);
        amountOfMoney = 0;
    }

    private static void printingParametersOfTheCoffeeMachine() {
        System.out.println("\nThe coffee machine has:\n" +
                amountOfWater + " ml of water\n" +
                +amountOfMilk + " ml of milk\n" +
                +numberOfCoffeeBeans + " g of coffee beans\n" +
                +numberCupsForCoffee + " disposable cups\n" +
                "$" + amountOfMoney + " of money");
    }

    private static String mainMenu(Scanner scanner) {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        return scanner.next();
    }
}
