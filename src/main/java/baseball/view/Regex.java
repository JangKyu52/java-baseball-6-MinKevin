package baseball.view;

public enum Regex {
    INPUT_NUMBER_REGEX("^[1-9]{3}$");

    final String regex;

    Regex(String regex){
        this.regex = regex;
    }
}
