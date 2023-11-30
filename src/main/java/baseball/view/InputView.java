package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

import static baseball.view.Validator.validator;

public class InputView {
    public static final InputView inputView = new InputView();


    public List<Integer> returnInputNumbers() {
        String input = Console.readLine();

        validator.checkInputNumbers(input);

        return inputToList(input);
    }

    private List<Integer> inputToList(String input) {
        List<Integer> inputNumbers = new ArrayList<>();
        int convertedInput = Integer.parseInt(input);
        while(convertedInput != 0) {
            validator.checkRestartOrNot(inputNumbers.contains(convertedInput % 10));
            inputNumbers.add(convertedInput % 10);
            convertedInput /= 10;
        }
        return inputNumbers;
    }

    public boolean returnRestartOrNot() {
        String input = Console.readLine();
        validator.checkRestartOrNot(!input.equals("1") && !input.equals("2"));

        return input.equals("1");
    }
}
