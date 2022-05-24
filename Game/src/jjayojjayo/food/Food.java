package jjayojjayo.food;

import java.util.List;

public abstract class Food {
	private String name;
	private int cookingTime;
	private int exp;
	public static List<Food> foodlist;
	
	public Food(){};
	public Food(String name,int cookingTime, int exp){
		this.name = name;
		this.cookingTime = cookingTime;
		this.exp = exp;
	};
	
//	public abstract void levelup();
	
	public String getName() {
		return name;
	}
	
	
}
