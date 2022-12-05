package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Xyz {

	public static void main(String[] args) throws Exception{
		
		List<Item> l=new ArrayList<>() {{
			add(new Item(100));
			add(new Item(100));
			add(new Item(100));
			add(new Item(100));

		}};
		
		IntSummaryStatistics collect = l.stream().collect(Collectors.summarizingInt(Item::getPrice));
		System.out.println(collect);

	}
}

class Item{
	int price;

	public Item(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
