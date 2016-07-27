package com.e16din.intentmaster;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import com.e16din.intentmaster.model.Data;

import java.io.Serializable;

public final class Extra {

    private Extra() {
        super();
    }

    public static String KEY_DATA = "data";

    public static Serializable get(@NonNull Fragment fragment, @NonNull String key) {
        return fragment.getArguments() == null ? null : fragment.getArguments().getSerializable(key);
    }

    public static Serializable get(@NonNull Fragment fragment) {
        return get(fragment, 0);
    }

    public static Serializable get(@NonNull  Fragment fragment, int position) {
        return get(fragment, KEY_DATA + "_" + position);
    }

    public static Parcelable getP(@NonNull Fragment fragment, @NonNull String key) {
        return fragment.getArguments() == null ? null : fragment.getArguments().getParcelable(key);
    }

    public static Parcelable getP(@NonNull Fragment fragment) {
        return getP(fragment, 0);
    }

    public static Parcelable getP(@NonNull  Fragment fragment, int position) {
        return getP(fragment, KEY_DATA + "_" + position);
    }


    public static Serializable get(@NonNull Intent intent, @NonNull String key) {
        return intent.getExtras() == null ? null : intent.getExtras().getSerializable(key);
    }

    public static Serializable get(@NonNull Intent intent) {
        return get(intent, 0);
    }

    public static Serializable get(@NonNull Intent intent, int position) {
        return get(intent, KEY_DATA + "_" + position);
    }

    public static Serializable get(@NonNull Activity activity) {
        return get(activity, 0);
    }

    public static Serializable get(@NonNull Activity activity, @NonNull String key) {
        return get(activity.getIntent(), key);
    }

    public static Serializable get(@NonNull Activity activity, int position) {
        return get(activity.getIntent(), KEY_DATA + "_" + position);
    }


    public static Parcelable getP(@NonNull Intent intent, @NonNull String key) {
        return intent.getExtras() == null ? null : intent.getExtras().getParcelable(key);
    }

    public static Parcelable getP(@NonNull Intent intent) {
        return getP(intent, 0);
    }

    public static Parcelable getP(@NonNull Intent intent, int position) {
        return getP(intent, KEY_DATA + "_" + position);
    }

    public static Parcelable getP(@NonNull Activity activity) {
        return getP(activity, 0);
    }

    public static Parcelable getP(@NonNull Activity activity, @NonNull String key) {
        return getP(activity.getIntent(), key);
    }

    public static Parcelable getP(@NonNull Activity activity, int position) {
        return getP(activity.getIntent(), KEY_DATA + "_" + position);
    }


    public static boolean containsKey(@NonNull Intent intent, @NonNull String key) {
        return intent.getExtras() != null && intent.getExtras().containsKey(key);
    }

    public static int getExtrasCount(@NonNull Intent intent) {
        return intent.getExtras() == null ? 0 : intent.getExtras().size();
    }

    public static int getExtrasCount(@NonNull Activity activity) {
        return getExtrasCount(activity.getIntent());
    }

    public static boolean has(@NonNull Intent intent) {
        return getExtrasCount(intent) > 0;
    }

    public static boolean has(@NonNull Activity activity) {
        return has(activity.getIntent());
    }

    public static void put(@NonNull Intent intent, Data[] data) {
        for (int i = 0; i < data.length; i++) {
            intent.putExtra(data[i].getKey(), data[i].getValue());
        }
    }

    public static void put(@NonNull Intent intent, Serializable[] data) {
        for (int i = 0; i < data.length; i++) {
            intent.putExtra(KEY_DATA + "_" + i, data[i]);
        }
    }

    public static void put(@NonNull Intent intent, Parcelable[] data) {
        for (int i = 0; i < data.length; i++) {
            intent.putExtra(KEY_DATA + "_" + i, data[i]);
        }
    }

    public static void put(Bundle bundle, Data[] data) {
        for (int i = 0; i < data.length; i++) {
            bundle.putSerializable(KEY_DATA + "_" + i, data[i]);
        }
    }

    public static void put(Bundle bundle, Parcelable[] data) {
        for (int i = 0; i < data.length; i++) {
            bundle.putParcelable(KEY_DATA + "_" + i, data[i]);
        }
    }

    public static void put(Bundle bundle, Serializable[] data) {
        for (int i = 0; i < data.length; i++) {
            bundle.putSerializable(KEY_DATA + "_" + i, data[i]);
        }
    }
}