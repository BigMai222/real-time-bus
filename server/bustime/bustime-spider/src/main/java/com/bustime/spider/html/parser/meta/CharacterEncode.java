package com.bustime.spider.html.parser.meta;

/**
 * 编码.
 *
 * @author chengdong
 */
public enum CharacterEncode {

    UTF8("utf-8");

    private String encode;

    CharacterEncode(String encode) {
        this.encode = encode;
    }

    public String getEncode() {
        return encode;
    }

}
