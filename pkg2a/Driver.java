package pkg2a;

class A {
    private int a = 1;
    private int b = 2;
    protected float c = 1.1f;
    protected float d = 2.2f;
    public int e = 3;
    public int f = 4;

}

class B extends A{


    void showSuperUsage(){
        int c = 10;
        System.out.println("A's C = " + super.c);
        System.out.println("B's C = " + c);
    }

    void randomMethod(){
        System.out.println("This random method is declared in class B");
    }

}

class C extends B{

    @Override
    void randomMethod(){
        System.out.println("This random method is declared in class C");
    }
}

class D extends B{
    int dVariable;
    D(){
        dVariable = 100;
        System.out.println(dVariable);
    }

    D(int dVariable){
        this.dVariable = dVariable;
        System.out.println(dVariable);
    }
}

public class Driver{
    public static void main(String[] args) {
        B bobject = new B();
        C cobject = new C();
        bobject.showSuperUsage();
        bobject.randomMethod();
        cobject.randomMethod();

        D dobject = new D();
        D dobject2 = new D(10);

    }
}