package baseball.view;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static baseball.view.Validator.validator;
import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    @ParameterizedTest
    @CsvSource(value = {"012", "가나다", "abc", "a12"}, delimiter = ':')
    void checkInputNumbers(String input) {
        Assertions.assertThatThrownBy(() ->
                validator.checkInputNumbers(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}