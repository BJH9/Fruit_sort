package com.handong.lab2;

import java.util.Comparator;

public class Fruit {

	private int no;
	private String name;
	private int age;
	
	public Fruit() {}
	
	public Fruit(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	static class FruitComparator implements Comparator<Fruit>{
		@Override
		public int compare(Fruit o1, Fruit o2) {
			return o1.name.compareTo(o2.name);
		}
	}
	
	static class FruitComparatorDesc implements Comparator<Fruit>{
		@Override
		public int compare(Fruit o1, Fruit o2) {
			return o2.name.compareTo(o1.name);
		}
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	
	
}


