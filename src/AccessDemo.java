public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        /* Доступ к переменной alpha возможен только
        с помощью специально предназначенных для этой цели методов
        */
        ob.setAplha(-99);
        System.out.println("ob.alpha: " + ob.getAplha());

        // Обратиться к alpha так, как показано ниже, нельзя!
        // ob.alpha = 10; // Ошибка: alpha - закрытая переменная.

        // Следующие обращения вполне допустимы, т. к.
        // переменные beta, gamma - открытые.
        ob.beta = 10;
        ob.gamma = 10;
    }
}

// сравнение видов доступов private и public
class MyClass {
    private int alpha;
    public int beta;
    int gamma; // тип доступа по умолчанию, по сути, public

    /* Методы доступа к переменной alpha.
    Члены класса могут обращаться к закрытым членам того же класса.
    */
    void setAplha(int a) {
        alpha = a;
    }

    int getAplha() {
        return alpha;
    }
}