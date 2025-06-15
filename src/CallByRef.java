// Объекты передаются методам по ссылке.
class TestByRef {
    int a, b;

    TestByRef(int i, int j) {
        a = i;
        b = j;
    }

    /* Передача объёкта методу. Теперь переменные
    ob.a и ob.b объекта, используемого при вызове, также будут изменяться. */
    void change(TestByRef ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

public class CallByRef {
    public static void main(String[] args) {
        TestByRef ob = new TestByRef(15, 20);

        System.out.println("a и b перед вызовом: " +
                ob.a + " " + ob.b);
        ob.change(ob);

        System.out.println("a и b после вызова: " +
                ob.a + " " + ob.b);
    }
}
