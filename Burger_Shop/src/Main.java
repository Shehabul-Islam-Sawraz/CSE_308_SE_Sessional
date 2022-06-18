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
        int choice;
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
                    System.out.println("Total Price of Your Order: " + burger.getPrice());
                    break;
                case 2:
                    burger = new Water(new OnionRings(new VeggiBurger()));
                    System.out.println("Total Price of Your Order: " + burger.getPrice());
                    break;
                case 3:
                    burger = new Coke(new FrenchFries(new VeggiBurger()));
                    System.out.println("Total Price of Your Order: " + burger.getPrice());
                    break;
                case 4:
                    burger = new Water(new Coffee(new OnionRings(new VeggiBurger())));
                    System.out.println("Total Price of Your Order: " + burger.getPrice());
                    break;
                case 5:
                    burger = new BeefBurger();
                    System.out.println("Total Price of Your Order: " + burger.getPrice());
                    break;
                default:
                    burger = null;
                    System.out.println("Not available!!");
                    break;
            }
            if(choice>5) {
                break;
            }
            System.out.println("______________________________________________________________________");
        }
    }
}