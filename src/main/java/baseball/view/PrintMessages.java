package baseball.view;

public enum PrintMessages {
    INFORM_START("숫자 야구 게임을 시작합니다."),
    PLEASE_ENTER_NUMBERS("숫자를 입력해주세요 : "),
    INFORM_NUMBER_IS_CORRECT("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    INFORM_RESTART_OR_NOT("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    INFORM_BALL_AND_STRIKE_RESULT("%d볼 %d스트라이크\n"),
    INFORM_NOTHING("낫싱");
    ;

    final String message;

    PrintMessages(String message) {
        this.message = message;
    }
}
