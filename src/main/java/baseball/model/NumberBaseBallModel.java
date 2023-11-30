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

    public Map<BallType, Integer> checkInputNumber(List<Integer> inputNumbers) {
        Map<BallType, Integer> results = new HashMap<>();
        for (Integer inputNumber : inputNumbers) {
            if (answerNumber.contains(inputNumber)) {
                addResultToMap(inputNumbers, inputNumber, results);
            }
        }
        return results;
    }

    private void addResultToMap(List<Integer> inputNumbers, Integer inputNumber, Map<BallType, Integer> results) {
        if (answerNumber.indexOf(inputNumber) == inputNumbers.indexOf(inputNumber)) {
            if (!results.containsKey(BallType.STRIKE)) {
                results.put(BallType.STRIKE, 1);
                return;
            }
            results.put(BallType.STRIKE, results.get(BallType.STRIKE) + 1);
            return;
        }

        if (!results.containsKey(BallType.BALL)) {
            results.put(BallType.BALL, 1);
            return;
        }
        results.put(BallType.BALL, results.get(BallType.BALL) + 1);
    }
}
