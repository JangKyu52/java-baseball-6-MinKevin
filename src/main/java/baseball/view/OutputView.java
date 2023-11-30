package baseball.view;

import baseball.controller.BallType;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;
import java.util.Map;

import static baseball.view.InputView.inputView;
import static baseball.view.PrintMessages.*;

public class OutputView {
    public static final OutputView outputView = new OutputView();

    public void printStartMessage() {
        System.out.println(INFORM_START.message);
    }

    public List<Integer> printPleaseInsertNumberMessage() {
        System.out.print(PLEASE_ENTER_NUMBERS.message);
        return inputView.returnInputNumbers();
    }

    public boolean printRestartOrNotMessage() {
        System.out.println(INFORM_RESTART_OR_NOT.message);
        return inputView.returnRestartOrNot();
    }

    public void printCheckedResultMessage(Map<BallType, Integer> checkedResult) {
        if (checkedResult.size() == 0)
            System.out.println(INFORM_NOTHING.message);

        if (checkedResult.size() == 1) {
            for (Map.Entry<BallType, Integer> ballTypeIntegerEntry : checkedResult.entrySet()) {
                System.out.println(ballTypeIntegerEntry.getValue() + ballTypeIntegerEntry.getKey().name());
                return;
            }
        }

        if (checkedResult.size() == 2) {
            System.out.printf(INFORM_BALL_AND_STRIKE_RESULT.message, checkedResult.get(BallType.BALL), checkedResult.get(BallType.STRIKE));
        }
    }
}
