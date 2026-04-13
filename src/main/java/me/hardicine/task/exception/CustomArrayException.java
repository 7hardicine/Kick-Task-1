package me.hardicine.task.exception;

public class CustomArrayException extends Exception {
  public CustomArrayException(String message) {
    super(message);
  }

  public CustomArrayException(String message, Throwable cause) {
    super(message, cause);
  }
}
