package com.coderscampus.arrayList;


public class CustomApplication  {
	

	public static void main(String[] args) {
	CustomArrayList <String> animals = new CustomArrayList<>();
	animals.add("cat");
	animals.add("dog");
	animals.add("parrot");
	animals.add("snek");
	animals.add("crocodile");
	animals.add("monkey");
	animals.add("chipmunk");
	animals.add("zebra");
	animals.add("lion");
	animals.add("bear");
	animals.add("eagle");
	animals.add("skunk");
	animals.add("fox");
	animals.add("whale");
	
	 {

	}
	System.out.println("Size of my list of animals: "+ animals.getSize());
	System.out.println("animal at index 3: " + animals.get(6));

	}

}
