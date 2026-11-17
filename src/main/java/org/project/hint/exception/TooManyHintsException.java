package org.project.hint.exception;

public class TooManyHintsException extends RuntimeException {

    public TooManyHintsException(String gameId) {
        super("Hint limit reached for game: " + gameId);
    }
}
