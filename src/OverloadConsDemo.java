// Демонстрация перегрузки конструкторов


public class OverloadConsDemo {
    public static void main(String[] args) {
        MyClassOverloadConsDemo t1 = new MyClassOverloadConsDemo();
        MyClassOverloadConsDemo t2 = new MyClassOverloadConsDemo(88);
        MyClassOverloadConsDemo t3 = new MyClassOverloadConsDemo(17.23);
        MyClassOverloadConsDemo t4 = new MyClassOverloadConsDemo(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}

class MyClassOverloadConsDemo {
    int x;

    // Конструирование объектов разными способами
    MyClassOverloadConsDemo() {
        System.out.println("Внутри MyClass().");
        x = 0;
    }

    MyClassOverloadConsDemo(int i) {
        System.out.println("Внутри MyClass(int).");
        x = i;
    }

    MyClassOverloadConsDemo(double d) {
        System.out.println("Внутри MyClass(double).");
        x = (int) d;
    }

    MyClassOverloadConsDemo(int i, int j) {
        System.out.println("Внутри MyClass(int, int).");
        x = i * j;
    }
}