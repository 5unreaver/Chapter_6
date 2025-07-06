class Page244Ex4 {
    int a;

    Page244Ex4(int i) {
        a = i;
    }

    void swap(Page244Ex4 ob1, Page244Ex4 ob2) {
        int temporaryStorage = ob1.a;
        ob1.a = ob2.a;
        ob2.a = temporaryStorage;
    }
}

class Page244Ex4Test {
    public static void main(String[] args) {
        Page244Ex4 ob1 = new Page244Ex4(1);
        Page244Ex4 ob2 = new Page244Ex4(20);

        System.out.println("Значение до swap(): ob1.a = " +
                ob1.a + ", ob2.a =  " + ob2.a);
        ob1.swap(ob1, ob2);
        System.out.println("Значение после swap(): ob1.a = " +
                ob1.a + ", ob2.a = " + ob2.a);
    }
}