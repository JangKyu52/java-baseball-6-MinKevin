package baseball.controller;

import baseball.model.NumberBaseBallModel;
import baseball.view.InputView;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Randoms;
import org.mockito.internal.matchers.Null;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static baseball.view.InputView.inputView;
import static baseball.view.OutputView.outputView;

public class BaseBallGameController {
    private static final BaseBallGameController singleton = new BaseBallGameController();
    private static final NumberBaseBallModel numberBaseBallModel = new NumberBaseBallModel();

    private BaseBallGameController() {}

    public static BaseBallGameController getInstance() {
        return singleton;
    }

    public void process() {
        outputView.printStartMessage();
        do {
            numberBaseBallModel.initAnswerNumber();
            while(true) {
                List<Integer> inputNumbers = outputView.printPleaseInsertNumberMessage(); //여기서 validation
                Map<BallType, Integer> checkedResult = numberBaseBallModel.checkInputNumber(inputNumbers);

                outputView.printCheckedResultMessage(checkedResult);

                if (checkedResult.containsKey(BallType.STRIKE) && checkedResult.get(BallType.STRIKE) == 3)
                    break;
            }
        } while(outputView.printRestartOrNotMessage()); //boolean으로 반환
    }
}
