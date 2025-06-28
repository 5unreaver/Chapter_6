public class QDemo2 {
    public static void main(String[] args) {
        // Создать простую очередь для хранения 10 элементов
        Queue2 q1 = new Queue2(10);

        char name[] = {'T', 'o', 'm'};
        // Создать очередь на основе массива
        Queue2 q2 = new Queue2(name);

        char ch;
        int i;

        // Поместить ряд символов в очередь q1
        for (i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        // Создать одну очередь на основе другой
        Queue2 q3 = new Queue2(q1);

        // Показать очереди
        System.out.print("Содержимое q2: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}

class Queue2 {
    // Эти члены класса теперь являются закрытыми
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы для вставки и
    // извлечения элементов очереди

    // Сконструировать простую очередь заданного размера
    Queue2(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    // Конcтруктор, создающий один объект ипа Queue на основе другого.
    Queue2(Queue2 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // Копировать элементы очереди
        for (int i = getloc + 1; i <= putloc; i++)
            q[i] = ob.q[i];
    }

    Queue2(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1]; // длина очереди должна быть на 1 больше длины исходного массива

        for (int i = 0; i < a.length; i++) put(a[i]);
    }

    // Поместить символ в очередь
    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена.");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    // Извлечь символ из очереди
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}