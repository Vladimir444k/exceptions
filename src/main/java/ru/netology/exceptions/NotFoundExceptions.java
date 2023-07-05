package ru.netology.exceptions;

public class NotFoundExceptions extends RuntimeException {
    public NotFoundExceptions(int id) {
        super("Element with id: " + id + " not found");
    }
}
