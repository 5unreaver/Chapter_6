/* Упражнение 5.2
Демонстрация использования класса Queue */

// демонстрация использования класса Queue
class QDemo {
    public static void main(String[] args) {
        Queue test = new Queue(10);
        // test.q = 99; // Ошибка!
        // test.putloc = -100;

        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4); // задаём две очереди

        char ch;
        int i;

        System.out.println("Использование очереди bigQ для сохранения алфавита.");
        // поместить буквенные символы в очередь bigQ
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        // Извлечь буквенные символы из очереди bigQ и отобразить
        System.out.print("Содержимое очереди bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации ошибок.");
        // Использовать очередь smallQ для генерации ошибок.
        for (i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        // Дополнительные ошибки при обращении к очереди smallQ
        System.out.print("Содержимое smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}