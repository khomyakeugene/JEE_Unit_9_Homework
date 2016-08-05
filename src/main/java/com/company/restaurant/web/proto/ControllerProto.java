package com.company.restaurant.web.proto;

import java.util.Base64;

/**
 * Created by Yevhen on 05.08.2016.
 */
public class ControllerProto {
    protected String base64EncodeToString(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }
}
