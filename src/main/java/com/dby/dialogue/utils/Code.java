package com.dby.dialogue.utils;

import java.util.HashMap;
import java.util.Map;

public class Code {

    public static String getMsg(int code) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10001, "用户列表数据请求失败");
        map.put(500, "内部异常");
        return map.getOrDefault(code, map.get(500));
    }
}
