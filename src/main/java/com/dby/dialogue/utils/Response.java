package com.dby.dialogue.utils;

import lombok.Data;

import java.util.Map;

@Data
public class Response {
    public String msg;
    public int code;
    public Object data;
}
