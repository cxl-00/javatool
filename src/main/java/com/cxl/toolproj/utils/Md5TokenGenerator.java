package com.cxl.toolproj.utils;

import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * @author Chenxiaoling
 * @date 2020/4/7 1:49 下午
 */
@Component
public class Md5TokenGenerator implements TokenGenerator {
    @Override
    public String generate(String... strings) {
        long   timestamp = System.currentTimeMillis();
        String tokenMeta = "";
        for (String s : strings) {
            tokenMeta = tokenMeta + s;
        }
        tokenMeta = tokenMeta + timestamp;
        String token = DigestUtils.md5DigestAsHex(tokenMeta.getBytes());
        return token;
    }
}
