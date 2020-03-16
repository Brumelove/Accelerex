package com.brume.global.accelerex.Usecase.api.exception;

public class InValidRequest extends IllegalArgumentException {

    public InValidRequest() {
        super();
    }

    public InValidRequest(String message) {
        super(message);
    }
}
