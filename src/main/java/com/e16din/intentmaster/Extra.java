package com.e16din.intentmaster;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.e16din.intentmaster.model.Data;

import java.io.Serializable;

public final class Extra {

    private Extra() {
        super();
    }

    public static final String KEY_DATA = "data";

    public static int sPosition = 0;

    //get next

    /**
     * Get next data from arguments
     *
     * @return next data object or null if no more objects
     */
    @Nullable
    public static Object getNext(@NonNull Fragment fragment) {
        return sPosition + 1 >= getCount(fragment) ? null : get(fragment, sPosition);
    }

    /**
     * Get next data from arguments
     *
     * @return next data object or null if no more objects
     */
    @Nullable
    public static Object getNext(@NonNull android.app.Fragment fragment) {
        return sPosition + 1 >= getCount(fragment) ? null : get(fragment, sPosition);
    }

    /**
     * Get next data from extras
     *
     * @return next data object or null if no more objects
     */
    @Nullable
    public static Object getNext(@NonNull Intent intent) {
        return sPosition + 1 >= getCount(intent) ? null : get(intent, sPosition);
    }

    /**
     * Get next data from extras
     *
     * @return next data object or null if no more objects
     */
    @Nullable
    public static Object getNext(@NonNull Activity activity) {
        return sPosition + 1 >= getCount(activity) ? null : get(activity, sPosition);
    }

    /**
     * Reset next position to 0
     */
    public static void resetPosition() {
        sPosition = 0;
    }

    // get from fragment

    public static Object get(@NonNull Fragment fragment, @NonNull String key) {
        return fragment.getArguments() == null ? null : fragment.getArguments().getSerializable(key);
    }

    public static Object get(@NonNull Fragment fragment) {
        return get(fragment, 0);
    }

    public static Object get(@NonNull Fragment fragment, int position) {
        return get(fragment, KEY_DATA + "_" + position);
    }

    public static Object get(@NonNull android.app.Fragment fragment, @NonNull String key) {
        return fragment.getArguments() == null ? null : fragment.getArguments().getSerializable(key);
    }

    public static Object get(@NonNull android.app.Fragment fragment) {
        return get(fragment, 0);
    }

    public static Object get(@NonNull android.app.Fragment fragment, int position) {
        return get(fragment, KEY_DATA + "_" + position);
    }

    // get from intent

    public static Object get(@NonNull Intent intent, @NonNull String key) {
        return intent.getExtras() == null ? null : intent.getExtras().getSerializable(key);
    }

    public static Object get(@NonNull Intent intent) {
        return get(intent, 0);
    }

    public static Object get(@NonNull Intent intent, int position) {
        return get(intent, KEY_DATA + "_" + position);
    }

    // get from activity

    public static Object get(@NonNull Activity activity) {
        return get(activity, 0);
    }

    public static Object get(@NonNull Activity activity, @NonNull String key) {
        return get(activity.getIntent(), key);
    }

    public static Object get(@NonNull Activity activity, int position) {
        return get(activity.getIntent(), KEY_DATA + "_" + position);
    }

    // contains key

    public static boolean containsKey(@NonNull Intent intent, @NonNull String key) {
        return intent.getExtras() != null && intent.getExtras().containsKey(key);
    }

    public static boolean containsKey(@NonNull android.app.Fragment fragment, @NonNull String key) {
        return fragment.getArguments().containsKey(key);
    }

    public static boolean containsArg(@NonNull Fragment fragment, @NonNull String key) {
        return fragment.getArguments().containsKey(key);
    }

    public static boolean containsArg(@NonNull Activity activity, @NonNull String key) {
        return containsKey(activity.getIntent(), key);
    }

    // get count

    /**
     * Get count of extras
     */
    public static int getCount(@NonNull Intent intent) {
        return intent.getExtras() == null ? 0 : intent.getExtras().size();
    }

    /**
     * Get count of extras
     */
    public static int getCount(@NonNull Activity activity) {
        return getCount(activity.getIntent());
    }

    /**
     * Get count of arguments
     */
    public static int getCount(@NonNull android.app.Fragment fragment) {
        return fragment.getArguments() == null ? 0 : fragment.getArguments().size();
    }

    /**
     * Get count of arguments
     */
    public static int getCount(@NonNull Fragment fragment) {
        return fragment.getArguments() == null ? 0 : fragment.getArguments().size();
    }

    // has

    public static boolean has(@NonNull Intent intent) {
        return getCount(intent) > 0;
    }

    public static boolean has(@NonNull Activity activity) {
        return has(activity.getIntent());
    }

    public static boolean has(@NonNull android.app.Fragment fragment) {
        return getCount(fragment) > 0;
    }

    public static boolean has(@NonNull Fragment fragment) {
        return getCount(fragment) > 0;
    }

    // put

    public static Intent put(@NonNull Intent intent, Data[] data) {
        for (Data aData : data) {
            intent.putExtra(aData.getKey(), aData.getValue());
        }
        return intent;
    }

    public static Intent put(@NonNull Intent intent, Serializable[] data) {
        for (int i = 0; i < data.length; i++) {
            intent.putExtra(KEY_DATA + "_" + i, data[i]);
        }
        return intent;
    }

    public static Intent put(@NonNull Intent intent, Parcelable[] data) {
        for (int i = 0; i < data.length; i++) {
            intent.putExtra(KEY_DATA + "_" + i, data[i]);
        }
        return intent;
    }

    public static Bundle put(Bundle bundle, Data[] data) {
        for (int i = 0; i < data.length; i++) {
            bundle.putSerializable(KEY_DATA + "_" + i, data[i]);
        }
        return bundle;
    }

    public static Bundle put(Bundle bundle, Parcelable[] data) {
        for (int i = 0; i < data.length; i++) {
            bundle.putParcelable(KEY_DATA + "_" + i, data[i]);
        }
        return bundle;
    }

    public static Bundle put(Bundle bundle, Serializable[] data) {
        for (int i = 0; i < data.length; i++) {
            bundle.putSerializable(KEY_DATA + "_" + i, data[i]);
        }
        return bundle;
    }
}