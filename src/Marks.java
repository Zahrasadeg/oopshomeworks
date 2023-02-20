public abstract class Marks {
abstract void getpercentage();
}
class A extends Marks{
    double history;
    double math;
    double scince;
    void getpercentage() {
        System.out.println((history + math + scince)/3);
    }
}
class B extends A{
    double biology;

    @Override
    void getpercentage() {
        System.out.println((history + math + scince + biology)/4);
    }
}
