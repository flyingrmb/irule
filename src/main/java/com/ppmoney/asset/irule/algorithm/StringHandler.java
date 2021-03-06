package com.ppmoney.asset.irule.algorithm;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.Assert;

/**
 * Created by paul on 2018/5/1.
 */
public class StringHandler {
    public String substring(JSONObject parameter, Object... input) {
        Assert.notNull(parameter, "parameter should not be null.");
        Assert.notNull(input, "input should not be empty.");
        Assert.isTrue(input.length == 1, "substring can only handle one input string.");
        Assert.isInstanceOf(String.class, input[0], "input should be a string.");

        return _substring((String)input[0], parameter.getInteger("begin"), parameter.getInteger("length"));
    }

    private final String _substring(String input, int begin, int length) {
        return input.substring(begin, begin + length);
    }
}
