/* В этом классе реализуется "отказоустойчивый" массив,
предотвращающий ошибки времени выполнения. */

class FailSoftArray {
    private int a[]; // ссылка на массив
    private int errval; // значение, возвращаемое в случае
    // ошибки при выполнении метода get()
    public int length; // открытая переменная length

    /* Конструктору данного класса передаётся размер массива и
    значение, которое должен возвращать метод get() при
    возникновении ошибки. */

    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    // Возвратить значение элемента массива с заданным индексом
    public int get(int index) {
        if (indexOK(index)) return a[index]; // Отслеживание попытки выхода за границы массива
        return errval;
    }

    // Установить значение элемента с заданным индексом.
    // Если возникнет ошибка, возвратить логическое значение false.
    public boolean put(int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    // Вернуть логическое значение true, если индекс
    // не выходит за границы массива
    private boolean indexOK(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}

// Демонстрация работы с отказоустойчивым массивом
class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // Демонстрация корректной обработки ошибок
        System.out.println("Обработка ошибок без вывода отчёта.");
        for (int i = 0; i < (fs.length * 2); i++)
            fs.put(i, i * 10); // для обращения к элементам массива должны использоваться методы доступа

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);

            if (x != -1) System.out.print(x + " "); // пока не выпала ошибка
        }
        System.out.println(" ");

        // Обработать ошибки
        System.out.println("\nОбработка ошибок с выводом отчёта.");
        for (int i = 0; i < (fs.length * 2); i++)
            if (!fs.put(i, i * 10))
                System.out.println("Индекс " + i +
                        " вне допустимого диапазона.");

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else
                System.out.println("Индекс " + i +
                        " вне допустимого диапазона.");
        }
    }
}
