package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class InputView {
    public static final InputView inputView = new InputView();

    Pattern pattern = Pattern.compile(Regex.INPUT_NUMBER_REGEX.regex);

    public List<Integer> returnInputNumbers() {
        String input = Console.readLine();

        if (!pattern.matcher(input).matches()) {
            throw new IllegalArgumentException();
        }

        return inputToList(input);
    }

    private List<Integer> inputToList(String input) {
        List<Integer> inputNumbers = new ArrayList<>();
        int convertedInput = Integer.parseInt(input);
        while(convertedInput != 0) {
            if (inputNumbers.contains(convertedInput % 10))
                throw new IllegalArgumentException();
            inputNumbers.add(convertedInput % 10);
            convertedInput /= 10;
        }
        return inputNumbers;
    }

    public boolean returnRestartOrNot() {
        String input = Console.readLine();
        if (!input.equals("1") && !input.equals("2"))
            throw new IllegalArgumentException();

        if (input.equals("1"))
            return true;
        return false;
    }
}
