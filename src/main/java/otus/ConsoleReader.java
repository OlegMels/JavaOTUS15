package otus;

import otus.exception.IncorrectNumberException;

import java.util.Scanner;

public class ConsoleReader {
    private final Scanner scanner;

    public ConsoleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Integer readNumber() {
        System.out.println("Введите сумму, конвертируемую в число (0 - выход):");

        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.next();
            throw new IncorrectNumberException("Произошла ошибка при обработке числа");
        }
    }
}
