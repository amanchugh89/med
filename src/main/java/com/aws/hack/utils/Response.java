package com.aws.hack.utils;

public enum Response {
    OK("OK"),
    NO_RESPONSE("No Response Received- check logs");
    private final String desc;

    Response(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
    }
