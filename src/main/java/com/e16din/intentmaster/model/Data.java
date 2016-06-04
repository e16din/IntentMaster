package com.e16din.intentmaster.model;

import android.support.v4.util.Pair;

import java.io.Serializable;

public class Data extends Pair<String, Serializable> implements Serializable {

    public Data(String key, Serializable value) {
        super(key, value);
    }

    public Serializable getValue() {
        return second;
    }

    public String getKey() {
        return first;
    }
}
