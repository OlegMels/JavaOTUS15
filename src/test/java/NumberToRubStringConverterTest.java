import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import otus.NumberToRubStringConverter;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumberToRubStringConverterTest {
    private final NumberToRubStringConverter numberToRubStringConverter = new NumberToRubStringConverter();

    @ParameterizedTest()
    @MethodSource("provideParameters")
    public void correctNumConversion(int number, String expectedString) {
        String result = numberToRubStringConverter.convertNumToStr(number);
        assertEquals(expectedString, result);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(11, "одиннадцать рублей"),
                Arguments.of(12, "двенадцать рублей"),
                Arguments.of(13, "тринадцать рублей"),
                Arguments.of(14, "четырнадцать рублей"),
                Arguments.of(15, "пятнадцать рублей"),
                Arguments.of(28, "двадцать восемь рублей"),
                Arguments.of(147, "сто сорок семь рублей"),
                Arguments.of(1, "один рубль"),
                Arguments.of(1890, "одна тысяча восемьсот девяносто рублей")
        );
    }
}
