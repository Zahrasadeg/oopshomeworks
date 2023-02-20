public class Car {
    String color;
    double price;
    void calculateSalePrice(){
        System.out.println("price of the car is "+price);
    }
}
class Truck extends Car {
    double wight;

    @Override
    void calculateSalePrice() {
        if (wight > 2000) {
            System.out.println("the price of this car is "+(price-((price*10)/100)));
        } else {
            System.out.println("the price of this car is "+(price-(price * 20) / 100));
        }
    }
}
class Sedan extends Car{
    int length;

    @Override
    void calculateSalePrice() {
       if(length>20){
           System.out.println("the price of this car is "+(price-(price*5)/100));
       }else{
           System.out.println("the price of this car is "+(price-(price*10)/100));

       }
    }
}
