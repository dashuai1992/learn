package org.docker.demo.demo;


import java.util.UUID;

public class Mark {

    private static final String code;
    static {
        code = UUID.randomUUID().toString();
    }

    public static final String APP_MARK = code;

}
