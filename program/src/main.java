public class main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        System.out.println(calculate.addition(634,5,45) + calculate.reduction(10,4));

        Child child = new Child();
        System.out.println(child.addition(4,5));
        System.out.println(child.addition(4.0,5));
    }
}

class Calculate {
    public Calculate() {
        int a = 2;
        int b = 3;
    }

    public int addition(int a, int b) {
        return a+b;
    }
    public int addition(int a,int b,int c) {
        return a+b+c;
    }

    public int reduction(int a,int b) {
        return a-b;
    }
}

class Child extends Calculate {
    public double addition(double a,double b) {
        return (a+b)/2;
    }
}