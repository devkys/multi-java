package useclass;

import makeclass.Phone;
import makeclass.Dog;

public class First {
    public static void main(String[] args) {
	Phone p1 = new Phone();
	System.out.println(p1);

	p1.size = 11;
	p1.speaker = "banana";

	System.out.println(p1.size);
	System.out.println(p1.speaker);

	p1.call();
	p1.send();
	p1.picture();


	Phone p2 = new Phone();

	p2.size = 12;
	p2.speaker = "apple";

	p2.call();
	p2.picture();
	p2.send();



	Dog d1 = new Dog();
	System.out.println(d1);

	d1.dog_name = "mongsil";
	d1.dog_weight = 7.5;

	d1.bark();
	d1.love();
	d1.play();

    }
}
