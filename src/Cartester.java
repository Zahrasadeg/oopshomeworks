public class Cartester {
    public static void main(String[] args) {
        Car hunda=new Car();
        hunda.color="black";
        hunda.price=28000;
        hunda.calculateSalePrice();

        Truck truck=new Truck();
        truck.wight=3000;
        truck.price=30000;
        truck.calculateSalePrice();

        Sedan toyota=new Sedan();
        toyota.price=50000;
        toyota.length=10;
        toyota.calculateSalePrice();
    }
}
