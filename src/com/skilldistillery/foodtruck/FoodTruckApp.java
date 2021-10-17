package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		FoodTruckApp foodtrucks = new FoodTruckApp();
		FoodTruck[] allTrucks = new FoodTruck[5];
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Welcome to Yelp but worse. Here you can enter in different food trucks you have visited, and give them a rating");

		foodtrucks.enterFoodTrucks(allTrucks, sc);
		foodtrucks.userMenu(allTrucks, sc);
	}

	public void enterFoodTrucks(FoodTruck[] allTrucks, Scanner sc) {
		String ans;
		for (int i = 0; i < 5; i++) {
			System.out.println("\nYou may either type \"Quit\" to quit or... ");
			System.out.print("Please enter in the name of a Food Truck you visited: ");
			ans = sc.nextLine();
			if (ans.equals("Quit")) {
				break;
			} else if (ans.equals("quit")) {
				break;
			} else {
				System.out.print("What type of food do they serve? ");
				String ans2 = sc.nextLine();
				System.out.print("Sounds awful. What rating do you give them between 1 and 10? ");
				int ans3 = sc.nextInt();
				sc.nextLine();
				allTrucks[i] = new FoodTruck("truck" + i, ans, ans2, ans3);
			}

		}
	}

	public void userMenu(FoodTruck[] allTrucks, Scanner sc) {

		boolean keepGoing = true;
		do {
			System.out.println("\n====================");
			System.out.println("~~~~~~~ Menu ~~~~~~~");
			System.out.println("====================");
			System.out.println("");
			System.out.println("1. List All Existing Food Trucks");
			System.out.println("2. See the Average Rating of Food Trucks");
			System.out.println("3. Display the Highest Rated Food Truck");
			System.out.println("4. Quit");
			System.out.println("");
			System.out.print("Please enter a choice 1-4: ");
			char ans = sc.next().charAt(0);

			switch (ans) {
			case '1':
				System.out.println("\nHere is the list of all the Food Trucks you have reviewed:");
				for (int i = 0; i < allTrucks.length; i++) {
					if (allTrucks[i] == null) {
						break;
					} else {
						System.out.println(allTrucks[i].toString());
					}
				}
				break;
			case '2':
				double avgRat = 0;
				int numOfTrucks = 0;
				for (int i = 0; i < allTrucks.length; i++) {
					if (allTrucks[i] == null) {
						break;
					} else {
						avgRat = avgRat + allTrucks[i].getRating();
						numOfTrucks++;
					}
				}
				System.out.println("\nThe average Food Truck rating is: " + (avgRat / numOfTrucks));
				break;
			case '3':
				int highestRating = allTrucks[0].getRating();
				String highestRated = allTrucks[0].getName();
				for (int i = 0; i < allTrucks.length; i++) {
					if (allTrucks[i] == null) {
						break;
					} else if (allTrucks[i].getRating() > highestRating) {
						highestRated = allTrucks[i].getName();
					}
				}
				System.out.println("\nThe highest rated Food Trucks is: " + highestRated);
				break;
			case '4':
				System.out.println("\nThanks for reviewing these Food Trucks. I hope you are happy with your choices");
				System.exit(0);
			default:
				System.out.println("Command not recognized. Please try again");
				break;
			}
		} while (keepGoing);

	}

}
