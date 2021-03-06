package org.robotframework.remoteserver.servlet;

/**
 * Thrown when a path is not valid for mapping to a library
 */
@SuppressWarnings("serial")
public class IllegalPathException extends RuntimeException {

    public IllegalPathException(String message) {
        super(message);
    }
}
