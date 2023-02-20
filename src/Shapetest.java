public class Shapetest {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.r=7;
        circle.calculatearea();
        circle.calculateperimiter();

        Square square=new Square();
        square.a=8;
        square.calculatearea();
        square.calculateperimiter();
    }
}
