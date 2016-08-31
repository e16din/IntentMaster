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


    private static Bundle sCurrentBundle;
    private static int sPosition;

    public static void resetPosition() {
        sPosition = 0;
    }

    public static void setPosition(int position) {
        sPosition = position;
    }

    public static void setCurrentBundle(Bundle currentBundle) {
        sCurrentBundle = currentBundle;
    }

    public static void freeCurrentBundle() {
        sCurrentBundle = null;
    }

    // get bundle


    @Nullable
    public static Bundle getBundle(@NonNull Fragment fragment) {
        return fragment.getArguments();
    }

    @Nullable
    public static Bundle getBundle(@NonNull android.app.Fragment fragment) {
        return fragment.getArguments();
    }

    @Nullable
    public static Bundle getBundle(@NonNull Intent intent) {
        return intent.getExtras();
    }

    @Nullable
    public static Bundle getBundle(@NonNull Activity activity) {
        return activity.getIntent() == null ? null : activity.getIntent().getExtras();
    }

    // get next

    /**
     * Get next data from arguments
     *
     * @return next data object or null if no more objects
     */
    @Nullable
    public static Object getNext(Fragment fragment) {
        return getNext(getBundle(fragment));
    }


    /**
     * Get next data from arguments
     *
     * @return next data object or null if no more objects
     */
    @Nullable
    public static Object getNext(android.app.Fragment fragment) {
        return getNext(getBundle(fragment));
    }

    /**
     * Get next data from extras
     *
     * @return next data object or null if no more objects
     */
    @Nullable
    public static Object getNext(Intent intent) {
        return getNext(getBundle(intent));
    }

    /**
     * Get next data from extras
     *
     * @return next data object or null if no more objects
     */
    @Nullable
    public static Object getNext(Activity activity) {
        return getNext(getBundle(activity));
    }

    /**
     * Get next data from bundle
     *
     * @return next data object or null if no more objects
     */
    @Nullable
    public static Object getNext(Bundle bundle) {
        if (sCurrentBundle == null) {
            sCurrentBundle = bundle;
        }

        if (!sCurrentBundle.equals(bundle)) {
            resetPosition();
        }

        setCurrentBundle(bundle);

        return bundle.get(getKey(sPosition));
    }

    /**
     * Get next data from last bundle
     *
     * @return next data object or null if no more objects
     */
    @Nullable
    public static Object getNext() {
        return getNext(sCurrentBundle);
    }

    // get from fragment

    public static Object get(@NonNull Fragment fragment, @NonNull String key) {
        final Bundle bundle = getBundle(fragment);
        return bundle == null ? null : bundle.getSerializable(key);
    }

    public static Object get(@NonNull Fragment fragment) {
        return get(fragment, 0);
    }

    public static Object get(@NonNull Fragment fragment, int position) {
        return get(fragment, getKey(position));
    }

    public static Object get(@NonNull android.app.Fragment fragment, @NonNull String key) {
        final Bundle bundle = getBundle(fragment);
        return bundle == null ? null : bundle.getSerializable(key);
    }

    public static Object get(@NonNull android.app.Fragment fragment) {
        return get(fragment, 0);
    }

    public static Object get(@NonNull android.app.Fragment fragment, int position) {
        return get(fragment, getKey(position));
    }

    // get from intent

    public static Object get(@NonNull Intent intent, @NonNull String key) {
        final Bundle bundle = getBundle(intent);
        return bundle == null ? null : bundle.getSerializable(key);
    }

    public static Object get(@NonNull Intent intent) {
        return get(intent, 0);
    }

    public static Object get(@NonNull Intent intent, int position) {
        return get(intent, getKey(position));
    }

    // get from activity

    public static Object get(@NonNull Activity activity) {
        return get(activity, 0);
    }

    public static Object get(@NonNull Activity activity, @NonNull String key) {
        return get(activity.getIntent(), key);
    }

    public static Object get(@NonNull Activity activity, int position) {
        return get(activity.getIntent(), getKey(position));
    }

    @NonNull
    private static String getKey(int position) {
        return KEY_DATA + "_" + position;
    }

    // contains key

    public static boolean containsKey(@NonNull Intent intent, @NonNull String key) {
        final Bundle bundle = getBundle(intent);
        return bundle != null && bundle.containsKey(key);
    }

    public static boolean containsKey(@NonNull android.app.Fragment fragment, @NonNull String key) {
        final Bundle bundle = getBundle(fragment);
        return bundle != null && bundle.containsKey(key);
    }

    public static boolean containsKey(@NonNull Fragment fragment, @NonNull String key) {
        final Bundle bundle = getBundle(fragment);
        return bundle != null && bundle.containsKey(key);
    }

    public static boolean containsKey(@NonNull Activity activity, @NonNull String key) {
        final Bundle bundle = getBundle(activity);
        return bundle != null && bundle.containsKey(key);
    }

    // get count

    /**
     * Get count of extras
     */
    public static int getCount(@NonNull Intent intent) {
        final Bundle bundle = getBundle(intent);
        return bundle == null ? 0 : bundle.size();
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
        final Bundle bundle = getBundle(fragment);
        return bundle == null ? 0 : bundle.size();
    }

    /**
     * Get count of arguments
     */
    public static int getCount(@NonNull Fragment fragment) {
        final Bundle bundle = getBundle(fragment);
        return bundle == null ? 0 : bundle.size();
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
        for (Data d : data) {
            intent.putExtra(d.getKey(), d.getValue());
        }
        return intent;
    }

    public static Intent put(@NonNull Intent intent, Serializable[] data) {
        for (int i = 0; i < data.length; i++) {
            intent.putExtra(getKey(i), data[i]);
        }
        return intent;
    }

    public static Intent put(@NonNull Intent intent, Parcelable[] data) {
        for (int i = 0; i < data.length; i++) {
            intent.putExtra(getKey(i), data[i]);
        }
        return intent;
    }

    public static Bundle put(Bundle bundle, Data[] data) {
        for (int i = 0; i < data.length; i++) {
            bundle.putSerializable(getKey(i), data[i]);
        }
        return bundle;
    }

    public static Bundle put(Bundle bundle, Parcelable[] data) {
        for (int i = 0; i < data.length; i++) {
            bundle.putParcelable(getKey(i), data[i]);
        }
        return bundle;
    }

    public static Bundle put(Bundle bundle, Serializable[] data) {
        for (int i = 0; i < data.length; i++) {
            bundle.putSerializable(getKey(i), data[i]);
        }
        return bundle;
    }
}