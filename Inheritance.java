class Car{
    String color;
    String model;
    String brand;
    int mileage;
    int no_of_gear;

    Car(String color,String model,String brand,int mileage,int no_of_gear){
        this.color=color;
        this.model=model;
        this.brand=brand;
        this.mileage=mileage;
        this.no_of_gear=no_of_gear;

    }
    void applybrake(){
        System.out.println("braking....");
    }

    void applyspeed(){
    System.out.println("speed....");
    }

    void shiftgear(){
        System.out.println("Shifting gear...");
    }
}
class Verna extends Car{
    int capacity;

     Verna (String color,String model,String brand,int mileage,int no_of_gear,int capacity){
        super(color, model, brand, mileage, no_of_gear);
        this.capacity=capacity;

    }
    void airbags(){
        System.out.println("Airbags.....");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Verna v = new Verna("black", "top", "Hundai", 25, 6, 5);
        System.out.println(v.model);
    }
}  

