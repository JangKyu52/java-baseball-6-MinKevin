package baseball;

import baseball.controller.BaseBallGameController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        BaseBallGameController controller = BaseBallGameController.getInstance();

        controller.process();
    }
}
