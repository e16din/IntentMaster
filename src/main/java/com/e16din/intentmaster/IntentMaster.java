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

public final class IntentMaster {

    private IntentMaster() {
        super();
    }

    public static void start(Context context, @NonNull Class cls) {
        Intent intent = Create.intent(context, cls);
        context.startActivity(intent);
    }

    public static void start(Context context, @NonNull Class cls, Data... data) {
        Intent intent = Create.intent(context, cls, data);
        context.startActivity(intent);
    }

    public static void start(Context context, @NonNull Class cls, Serializable... data) {
        Intent intent = Create.intent(context, cls, data);
        context.startActivity(intent);
    }

    public static void start(Context context, @NonNull Class cls, Parcelable... data) {
        Intent intent = Create.intent(context, cls, data);
        context.startActivity(intent);
    }

    public static void startForResult(@NonNull Activity activity, @NonNull Class cls, int requestCode) {
        Intent intent = Create.intent(activity, cls);
        activity.startActivityForResult(intent, requestCode);
    }

    public static void startForResult(@NonNull Activity activity, @NonNull Class cls, int requestCode,
                                      Data... data) {
        Intent intent = Create.intent(activity, cls, data);
        activity.startActivityForResult(intent, requestCode);
    }

    public static void startForResult(@NonNull Activity activity, @NonNull Class cls, int requestCode,
                                      Serializable... data) {
        Intent intent = Create.intent(activity, cls, data);
        activity.startActivityForResult(intent, requestCode);
    }

    public static void startForResult(@NonNull Activity activity, @NonNull Class cls, int requestCode,
                                      Parcelable... data) {
        Intent intent = Create.intent(activity, cls, data);
        activity.startActivityForResult(intent, requestCode);
    }

    public static void startForResult0(@NonNull Activity activity, @NonNull Class cls) {
        startForResult(activity, cls, 0);
    }

    public static void startForResult0(@NonNull Activity activity, @NonNull Class cls, Data... data) {
        startForResult(activity, cls, 0, data);
    }

    public static void startForResult0(@NonNull Activity activity, @NonNull Class cls,
                                       Serializable... data) {
        startForResult(activity, cls, 0, data);
    }

    public static void startForResult0(@NonNull Activity activity, @NonNull Class cls,
                                       Parcelable... data) {
        startForResult(activity, cls, 0, data);
    }

    ///
    public static void startForResult(@NonNull Fragment fragment, @NonNull Class cls, int requestCode) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void startForResult(@NonNull Fragment fragment, @NonNull Class cls, int requestCode,
                                      Data... data) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void startForResult(@NonNull Fragment fragment, @NonNull Class cls, int requestCode,
                                      Serializable... data) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void startForResult(@NonNull Fragment fragment, @NonNull Class cls, int requestCode,
                                      Parcelable... data) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void startForResult0(@NonNull Fragment fragment, @NonNull Class cls) {
        startForResult(fragment, cls, 0);
    }

    public static void startActivityForResult0(@NonNull Fragment fragment, @NonNull Class cls, Data... data) {
        startForResult(fragment, cls, 0, data);
    }

    public static void startForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                       Serializable... data) {
        startForResult(fragment, cls, 0, data);
    }

    public static void startForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                       Parcelable... data) {
        startForResult(fragment, cls, 0, data);
    }

    ///

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void startForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls, int requestCode) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls);
        fragment.startActivityForResult(intent, requestCode);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void startForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls, int requestCode,
                                      Data... data) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void startForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls, int requestCode,
                                      Serializable... data) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void startForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls, int requestCode,
                                      Parcelable... data) {
        Activity activity = fragment.getActivity();
        Intent intent = Create.intent(activity, cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void startForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls) {
        startForResult(fragment, cls, 0);
    }

    public static void startForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls, Data... data) {
        startForResult(fragment, cls, 0, data);
    }

    public static void startForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                       Serializable... data) {
        startForResult(fragment, cls, 0, data);
    }

    public static void startForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                       Parcelable... data) {
        startForResult(fragment, cls, 0, data);
    }

    //broadcast

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void sendBroadcast(@NonNull android.app.Fragment fragment, @NonNull String action) {
        Intent intent = Create.intent(action);
        fragment.getActivity().sendBroadcast(intent);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void sendBroadcast(@NonNull android.app.Fragment fragment, @NonNull String action, Data... data) {
        Intent intent = Create.intent(action, data);
        fragment.getActivity().sendBroadcast(intent);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void sendBroadcast(@NonNull android.app.Fragment fragment, @NonNull String action, Serializable... data) {
        Intent intent = Create.intent(action, data);
        fragment.getActivity().sendBroadcast(intent);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void sendBroadcast(@NonNull android.app.Fragment fragment, @NonNull String action, Parcelable... data) {
        Intent intent = Create.intent(action, data);
        fragment.getActivity().sendBroadcast(intent);
    }


    public static void sendBroadcast(@NonNull Fragment fragment, @NonNull String action) {
        Intent intent = Create.intent(action);
        fragment.getActivity().sendBroadcast(intent);
    }

    public static void sendBroadcast(@NonNull Fragment fragment, @NonNull String action, Data... data) {
        Intent intent = Create.intent(action, data);
        fragment.getActivity().sendBroadcast(intent);
    }

    public static void sendBroadcast(@NonNull Fragment fragment, @NonNull String action, Serializable... data) {
        Intent intent = Create.intent(action, data);
        fragment.getActivity().sendBroadcast(intent);
    }

    public static void sendBroadcast(@NonNull Fragment fragment, @NonNull String action, Parcelable... data) {
        Intent intent = Create.intent(action, data);
        fragment.getActivity().sendBroadcast(intent);
    }


    public static void sendBroadcast(@NonNull Activity activity, @NonNull String action) {
        Intent intent = Create.intent(action);
        activity.sendBroadcast(intent);
    }

    public static void sendBroadcast(@NonNull Activity activity, @NonNull String action, Data... data) {
        Intent intent = Create.intent(action, data);
        activity.sendBroadcast(intent);
    }

    public static void sendBroadcast(@NonNull Activity activity, @NonNull String action, Serializable... data) {
        Intent intent = Create.intent(action, data);
        activity.sendBroadcast(intent);
    }

    public static void sendBroadcast(@NonNull Activity activity, @NonNull String action, Parcelable... data) {
        Intent intent = Create.intent(action, data);
        activity.sendBroadcast(intent);
    }

    //todo: show view by url

    //todo: put and get fragment args from newInstance bundle

    //todo: sendBroadcast

    //todo: may be Create.intent()
}