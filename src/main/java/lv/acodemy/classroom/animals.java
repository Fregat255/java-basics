package lv.acodemy.classroom;

public class animals {
    private int  age ;
    private double weight ;
    private String color ;
    private Enum size ;
    private String name ;
    private boolean isMammal ;


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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Enum getSize() {
        return size;
    }

    public void setSize(Enum size) {
        this.size = size;
    }

public void speak () {
    if (energy <= 0) {
        System.out.println("I do not have ");
        getEnergy();
    } else {
        System.out.println("I am speking");
        energy--;
    }
}
public void feed (String foodname){
        if (energy==4) {
    System.out.println("I am full !");
}else{

        }


    energy ++ ;
}

    public animals(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public animals() {
    }

    public animals(int age, double weight, String color, Enum size, String name, boolean isMammal) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.size = size;
        this.name = name;
        this.isMammal = isMammal;
    }
private int energy = 4 ;
    public int getEnergy (){
        return energy;
    }

    @Override
    public String toString() {
        return "animals{" +
                "age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", isMammal=" + isMammal +
                '}';
    }
}
