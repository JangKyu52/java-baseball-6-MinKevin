package baseball.model;

import baseball.controller.BallType;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberBaseBallModel {
    List<Integer> answerNumber = new ArrayList<>();

    public void initAnswerNumber() {
        answerNumber.clear();
        while (answerNumber.size() != 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!answerNumber.contains(randomNumber)) {
                answerNumber.add(randomNumber);
            }
        }
    }


}
