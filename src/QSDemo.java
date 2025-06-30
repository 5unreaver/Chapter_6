// Упражнение 6.3. Простая версия класса Quicksort,
// реализующего быструю сортировку
class Quicksort {
    // Организовать вызов фактического метода быстрой сортировки
    static void qsort(char items[]) {
        qs(items, 0, items.length - 1);
    }

    // Рекурсивная версия метода быстрой сортировки символов.
    // Метод используется только в классе, поэтому он приватный.
    private static void qs(char items[], int left, int right) {
        int i, j; // индексы для прохода о массиву
        char x, y; // x = компаранд (опорный). y = временная переменная для хранения.

        i = left; // устанавливаем начало сортируемого участка
        j = right;
        x = items[(left + right) / 2]; // выбор x как среднего, опорного (pivot)

        // первый внутренний цикл
        do {
            while ((items[i] < x) && (i < right)) i++;
            // перемещаем i слева направо, пока не найдём элемент => опорного
            // или не дойдём до левой границы
            while ((x < items[j]) && (j > left)) j--;
            // аналогично для j

            // второй внутренний цикл
            if (i <= j) {
                // Если индексы не пересеклись (или встретились), выполняем обмен (swap)
                y = items[i];
                items[i] = items[j];
                items[j] = y;

                // сдвигаем индексы после обмена
                i++;
                j--;
            }
        } while (i <= j); // продолжаем, пока индексы не пересекутся.

        if (left < j) qs(items, left, j);
        // Рекурсивный вызов для левой части (если она есть)
        if (i < right) qs(items, i, right);
        // Аналогично
    }
}

class QSDemo {
    public static void main(String[] args) {
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        System.out.print("Исходный массив: ");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i]);

        System.out.println();

        // Отсортировать массив
        Quicksort.qsort(a);

        System.out.print("Отсортированный массив: ");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i]);
    }
}
