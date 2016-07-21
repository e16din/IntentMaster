package com.e16din.intentmaster;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import com.e16din.intentmaster.model.Data;

import java.io.Serializable;

public final class Start {

    private Start() {
        super();
    }

    //todo: public static void startActivity(Fragment fragment //like startActivityForResult
    public static void activity(Context context, @NonNull Class cls) {
        Intent intent = Create.intent(context, cls);
        context.startActivity(intent);
    }

    public static void activity(Context context, @NonNull Class cls, Data... data) {
        Intent intent = Create.intent(context, cls, data);
        context.startActivity(intent);
    }

    public static void activity(Context context, @NonNull Class cls, Serializable... data) {
        Intent intent = Create.intent(context, cls, data);
        context.startActivity(intent);
    }

    public static void activity(Context context, @NonNull Class cls, Parcelable... data) {
        Intent intent = Create.intent(context, cls, data);
        context.startActivity(intent);
    }

    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls, int requestCode) {
        Intent intent = Create.intent(activity, cls);
        activity.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls, int requestCode,
                                      Data... data) {
        Intent intent = Create.intent(activity, cls, data);
        activity.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls, int requestCode,
                                      Serializable... data) {
        Intent intent = Create.intent(activity, cls, data);
        activity.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls, int requestCode,
                                      Parcelable... data) {
        Intent intent = Create.intent(activity, cls, data);
        activity.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls) {
        activityForResult(activity, cls, 0);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls, Data... data) {
        activityForResult(activity, cls, 0, data);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls,
                                       Serializable... data) {
        activityForResult(activity, cls, 0, data);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls,
                                       Parcelable... data) {
        activityForResult(activity, cls, 0, data);
    }

    ///
    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls, int requestCode) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls, int requestCode,
                                      Data... data) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls, int requestCode,
                                      Serializable... data) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls, int requestCode,
                                      Parcelable... data) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult0(@NonNull Fragment fragment, @NonNull Class cls) {
        activityForResult(fragment, cls, 0);
    }

    public static void startActivityForResult0(@NonNull Fragment fragment, @NonNull Class cls, Data... data) {
        activityForResult(fragment, cls, 0, data);
    }

    public static void activityForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                       Serializable... data) {
        activityForResult(fragment, cls, 0, data);
    }

    public static void activityForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                       Parcelable... data) {
        activityForResult(fragment, cls, 0, data);
    }

    ///

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls, int requestCode) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls);
        fragment.startActivityForResult(intent, requestCode);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls, int requestCode,
                                      Data... data) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls, int requestCode,
                                      Serializable... data) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls, int requestCode,
                                      Parcelable... data) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls) {
        activityForResult(fragment, cls, 0);
    }

    public static void activityForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls, Data... data) {
        activityForResult(fragment, cls, 0, data);
    }

    public static void activityForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                       Serializable... data) {
        activityForResult(fragment, cls, 0, data);
    }

    public static void activityForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                       Parcelable... data) {
        activityForResult(fragment, cls, 0, data);
    }

    public static void service(@NonNull Context context, @NonNull Class cls) {
        Intent intent = Create.intent(context, cls);
        context.startService(intent);
    }
}