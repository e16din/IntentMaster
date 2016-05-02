package com.e16din.intentmaster;

import java.io.Serializable;

public class Data implements Serializable {
    private String key;
    private Serializable value;

    public Data() {
    }

    public Data(String key, Serializable value) {
        this();
        this.key = key;
        this.value = value;
    }

    public Serializable getValue() {
        return value;
    }

    public void setValue(Serializable value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
