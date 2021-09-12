package com.handong.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.handong.lab2.Fruit.FruitComparator;
import com.handong.lab2.Fruit.FruitComparatorDesc;

public class Main {

	public static void main(String[] args) {
		
		Main runner = new Main();
		runner.run(args);

	}
	
	public void run(String[] args) {
		List<Fruit> fl = new ArrayList<Fruit>();
		FruitComparator fruitComparator = new FruitComparator();
		
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit(101, "apple", 1);
		fl.add(s1);
		Fruit s2 = new Fruit(102, "kiwi", 2);
		fl.add(s2);
		Fruit s3 = new Fruit(103, "melon", 1);
		fl.add(s3);
		Fruit s4 = new Fruit(104, "water melon", 1);
		fl.add(s4);
		Fruit s5 = new Fruit(105, "pine apple", 3);
		fl.add(s5);
		Fruit s6 = new Fruit(106, "peach", 2);
		fl.add(s6);
		Fruit s7 = new Fruit(107, "strawberry", 1);
		fl.add(s7);
		Fruit s8 = new Fruit(108, "pear", 2);
		fl.add(s8);
		Fruit s9 = new Fruit(109, "orange", 1);
		fl.add(s9);
		Fruit s10 = new Fruit(110, "mandarine", 4);
		fl.add(s10);
		
		Collections.sort(fl, new FruitComparator());
		for(Fruit s: fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		for(int i = 0; i < fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
		
	}
}


