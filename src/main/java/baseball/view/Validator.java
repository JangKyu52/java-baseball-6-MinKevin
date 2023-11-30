package baseball.view;

import java.util.regex.Pattern;

public class Validator {
    public static final Validator validator = new Validator();

    Pattern pattern = Pattern.compile(Regex.INPUT_NUMBER_REGEX.regex);


    public void checkRestartOrNot(boolean input) {
        if (input)
            throw new IllegalArgumentException();
    }

    public void checkInputNumbers(String input) {
        if (!pattern.matcher(input).matches()) {
            throw new IllegalArgumentException();
        }
    }
}
