package lv.acodemy.classroom;

import static lv.acodemy.classroom.sizes.*;

public class objectpractice {
    public static void main(String[] args) {
        animals barsik = new animals () ;
       String catname = barsik.getName();
        //name = null
       System.out.println(catname);
        System.out.println(barsik);
        // name = BersiksTV
        barsik.setName("BarsiksTV");
        System.out.println(barsik);

        // age = 5
        barsik.setAge(5);
        System.out.println(barsik);
        System.out.println("My cat is : " + barsik.getAge()+ "years old.");

        // Create getter and setter for weight , color , size ;
        // Set data using setters

        barsik.setWeight(8);
        barsik.setColor("gray");
        barsik.setSize(xl);
        System.out.println(barsik);

       animals ballzik = new animals(14,"Ballzik");
       //My name is Ballzik .I am 14 years old.
        System.out.printf("My name is %s. I am %d old. \n", ballzik.getName(), ballzik.getAge());

        // Create all argument constructor;
        animals Zorik = new animals(5,6.00, "yellow",l,"Zorik",true);
        System.out.println(Zorik);

        Zorik.speak();
        String food = "bulka";
        Zorik.feed(food );

        Zorik.speak();
        System.out.println(Zorik.getEnergy());

    }
}
