package jjayojjayo;

import java.util.Random;

import jjayojjayo.food.Food;

public class Customer extends Thread {
	Food food;
	Table table;

	Customer(int i, int j) {
		this.setName(i + "번째 손님");
		this.food = Food.foodlist.get(i);

	}

	@Override
	public void run() {
		
		
		Random r = new Random();
		int number = r.nextInt(Table.list.size());

		if (1 < Table.list.size()) {
			for (int i = 0; i < Table.list.size(); i++) {
				if (Table.list.get(number).equals(food)) {
					
					Table.list.remove(number);

					System.out.println(this.getName() + "이 " +food.getName()+"먹었습니다.");

				}
			}

		} else {
		}

	
	}
}