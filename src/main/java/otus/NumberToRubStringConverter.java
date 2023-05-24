package otus;

import otus.exception.NegativeNumberException;

public class NumberToRubStringConverter extends NumberToStringConverter {
    @Override
    public String getCurrency(int sumToConvertToTxt) throws NegativeNumberException {
        if (sumToConvertToTxt < 0) {
            throw new NegativeNumberException("Число меньше 0");
        }

        int divRest = sumToConvertToTxt % 100;

        if (divRest > 10 && divRest < 15) {
            return " рублей";
        } else {
            return switch (sumToConvertToTxt % 10) {
                case 1 -> " рубль";
                case 2, 3, 4 -> " рубля";
                default -> " рублей";
            };
        }
    }
}
