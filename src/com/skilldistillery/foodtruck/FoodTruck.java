package com.skilldistillery.foodtruck;
//data: name, rating, genre of food, id
public class FoodTruck {
	//this class has data
	//including ID which will be generated 
	//automatically
	String name;
	String genre;
	int rating;
	String foodTruckID;
	
	public FoodTruck(String inputID, String inputName, String inputGenre, int inputRating) {
		this.foodTruckID = inputID;
		this.name = inputName;
		this.genre = inputGenre;
		this.rating = inputRating;
	}

	public String toString() {
		return foodTruckID + "\t Name: " + name + "\tType of Food: " + genre + "\t Rating: " + rating;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
