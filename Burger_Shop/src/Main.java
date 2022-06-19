import AddWithBurger.AddDrinks.Coffee;
import AddWithBurger.AddDrinks.Coke;
import AddWithBurger.AddDrinks.Water;
import AddWithBurger.ExtraCheese;
import AddWithBurger.FrenchFries;
import AddWithBurger.OnionRings;
import BurgerTypes.BeefBurger;
import BurgerTypes.Burger;
import BurgerTypes.VeggiBurger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice,subchoice;
        Burger burger;

        while (true){
            System.out.println("Menu:");
            System.out.println("1.Beef burger with French fry and cheese");
            System.out.println("2.Veggi burger with onion rings and Bottle of Water");
            System.out.println("3.A combo meal with Veggi burger, French Fry and Coke");
            System.out.println("4.A combo meal with Veggi burger, Onion Rings, Coffee and Water");
            System.out.println("5.A Beef burger only");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    burger = new ExtraCheese(new FrenchFries(new BeefBurger()));
                    System.out.println("\nTotal Price of Your Order: " + burger.getPrice());
                    break;
                case 2:
                    System.out.print("How many drinks do you want: ");
                    subchoice = scanner.nextInt();
                    burger = new Water(new OnionRings(new VeggiBurger()));
                    for (int i=0;i<subchoice-1;i++){
                        burger = new Water(burger);
                    }
                    System.out.println("\nTotal Price of Your Order: " + burger.getPrice());
                    break;
                case 3:
                    System.out.print("How many drinks do you want: ");
                    subchoice = scanner.nextInt();
                    burger = new Coke(new FrenchFries(new VeggiBurger()));
                    for (int i=0;i<subchoice-1;i++){
                        burger = new Coke(burger);
                    }
                    System.out.println("\nTotal Price of Your Order: " + burger.getPrice());
                    break;
                case 4:
                    System.out.print("How many Water bottle do you want: ");
                    subchoice = scanner.nextInt();
                    burger = new Water(new Coffee(new OnionRings(new VeggiBurger())));
                    for (int i=0;i<subchoice-1;i++){
                        burger = new Water(burger);
                    }
                    System.out.print("\nHow many Coffee do you want: ");
                    subchoice = scanner.nextInt();
                    for (int i=0;i<subchoice-1;i++){
                        burger = new Coffee(burger);
                    }
                    System.out.println("\nTotal Price of Your Order: " + burger.getPrice());
                    break;
                case 5:
                    burger = new BeefBurger();
                    System.out.println("\nTotal Price of Your Order: " + burger.getPrice());
                    break;
                default:
                    burger = null;
                    System.out.println("\nNot available!!");
                    break;
            }
            if(choice>5) {
                break;
            }
            System.out.println("______________________________________________________________________");
        }
    }
}