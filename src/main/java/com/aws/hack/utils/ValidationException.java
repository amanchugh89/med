package com.aws.hack.utils;

public class ValidationException extends Exception {

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    Response response;

    public ValidationException(Response response) {
        super(response.getDesc());
        this.response = response;


    }


}
