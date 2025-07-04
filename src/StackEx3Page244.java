class StackEx3Page244 {
    public static void main(String[] args) {
        Stack test = new Stack(10);

        char ch;
        int i;

        System.out.println("Использование стека test для сохранения алфавита.");
        // поместить буквенные символы
        for (i = 0; i < 10; i++)
            test.push((char) ('A' + i));

        // Извлечь буквенные символы и отобразить
        System.out.print("Содержимое стека test: ");
        for (i = 0; i < 10; i++) {
            ch = test.pop();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}

// Первым пришёл, последним обслужен
class Stack {
    private char stack[]; // массив для хранения элементов
    private int top; // индексы вершины стека

    Stack(int size) {
        stack = new char[size]; // выделить память для стека
        top = -1;
    }

    // Поместить символ в стек
    void push(char ch) {
        if (top == stack.length - 1) {
            System.out.println(" - Стек заполнен.");
            return;
        }
        stack[++top] = ch;
    }

    // Извлечь символ из стека. Извлечь последний пришедший элемент.
    char pop() {
        if (top == -1) {
            System.out.println(" - Стек пуст.");
            return (char) 0;
        }
        return stack[top--];
    }
}
