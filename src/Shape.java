public interface Shape{
    void calculatearea();
    void calculateperimiter();
}
class Circle implements Shape{
    double pi=3.14;
    int r;

    @Override
    public void calculatearea() {
        System.out.println(2*pi*r);
    }

    @Override
    public void calculateperimiter() {
        System.out.println(pi*(r*r));
    }
}
class Square implements Shape{
    int a;

    @Override
    public void calculatearea() {
        System.out.println(4*a);
    }

    @Override
    public void calculateperimiter() {
        System.out.println(a*a);
    }
}
