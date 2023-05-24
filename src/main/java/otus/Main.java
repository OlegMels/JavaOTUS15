package otus;

import otus.exception.ExceptionCode;
import otus.exception.IncorrectNumberException;
import otus.exception.NegativeNumberException;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader(new Scanner(System.in));
        NumberToStringConverter numberToStringConverter = new NumberToRubStringConverter();

        while (true) {
            try {
                Integer number = consoleReader.readNumber();

                if (number == 0) {
                    exit(0);
                }

                String convertedNumToStr = numberToStringConverter.convertNumToStr(number);

                System.out.println(convertedNumToStr);
            } catch (IncorrectNumberException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                if (e instanceof NegativeNumberException) {
                    System.out.println(ExceptionCode.NEGATIVE_NUMBER_EXCEPTION);
                } else {
                    System.out.println(ExceptionCode.UNKNOWN_EXCEPTION);
                }
            }
        }
    }
}
