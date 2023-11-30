package baseball.controller;

public enum BallType {
    STRIKE("스트라이크"), BALL("볼");

    String name;

    BallType(String name) {
        this.name = name;
    }
}
