package com.e16din.intentmaster;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;

import com.e16din.intentmaster.model.Data;

import java.io.Serializable;

public final class IntentMaster {

    private IntentMaster() {
        super();
    }

    //new fragment

    public static Fragment newFragment(@NonNull Fragment fragment, Data... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static Fragment newFragment(@NonNull Fragment fragment, Serializable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static Fragment newFragment(@NonNull Fragment fragment, Parcelable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static android.app.Fragment newFragment(@NonNull android.app.Fragment fragment, Data... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static android.app.Fragment newFragment(@NonNull android.app.Fragment fragment, Serializable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static android.app.Fragment newFragment(@NonNull android.app.Fragment fragment, Parcelable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static DialogFragment newDialogFragment(@NonNull DialogFragment fragment, Data... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static DialogFragment newDialogFragment(@NonNull DialogFragment fragment, Serializable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static DialogFragment newDialogFragment(@NonNull DialogFragment fragment, Parcelable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static android.app.DialogFragment newDialogFragment(@NonNull android.app.DialogFragment fragment, Data... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static android.app.DialogFragment newDialogFragment(@NonNull android.app.DialogFragment fragment, Serializable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static android.app.DialogFragment newDialogFragment(@NonNull android.app.DialogFragment fragment, Parcelable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    //get argument

    public static Serializable getArgument(@NonNull Fragment fragment, @NonNull String key) {
        return Extra.get(fragment, key);
    }

    public static Serializable getArgument(@NonNull Fragment fragment) {
        return Extra.get(fragment);
    }

    public static Serializable getArgument(@NonNull Fragment fragment, int position) {
        return Extra.get(fragment, position);
    }

    public static Parcelable getArgumentP(@NonNull Fragment fragment, @NonNull String key) {
        return Extra.getP(fragment, key);
    }

    public static Parcelable getArgumentP(@NonNull Fragment fragment) {
        return Extra.getP(fragment);
    }

    public static Parcelable getArgumentP(@NonNull Fragment fragment, int position) {
        return Extra.getP(fragment, position);
    }

    //start activity

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

    //start activity for result

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

    // get extra

    public static Serializable getExtra(@NonNull Intent intent, @NonNull String key) {
        return Extra.get(intent, key);
    }

    public static Serializable getExtra(@NonNull Intent intent) {
        return Extra.get(intent);
    }

    public static Serializable getExtra(@NonNull Intent intent, int position) {
        return Extra.get(intent, position);
    }

    public static Serializable getExtra(@NonNull Activity activity) {
        return Extra.get(activity);
    }

    public static Serializable getExtra(@NonNull Activity activity, @NonNull String key) {
        return Extra.get(activity, key);
    }

    public static Serializable getExtra(@NonNull Activity activity, int position) {
        return Extra.get(activity, position);
    }


    public static Parcelable getExtraP(@NonNull Intent intent, @NonNull String key) {
        return Extra.getP(intent, key);
    }

    public static Parcelable getExtraP(@NonNull Intent intent) {
        return Extra.getP(intent);
    }

    public static Parcelable getExtraP(@NonNull Intent intent, int position) {
        return Extra.getP(intent, position);
    }

    public static Parcelable getExtraP(@NonNull Activity activity) {
        return Extra.getP(activity);
    }

    public static Parcelable getExtraP(@NonNull Activity activity, @NonNull String key) {
        return Extra.getP(activity, key);
    }

    public static Parcelable getExtraP(@NonNull Activity activity, int position) {
        return Extra.getP(activity, position);
    }

    public static boolean containsKey(@NonNull Intent intent, @NonNull String key) {
        return Extra.containsKey(intent, key);
    }

    public static int getExtrasCount(@NonNull Intent intent) {
        return Extra.getExtrasCount(intent);
    }

    public static int getExtrasCount(@NonNull Activity activity) {
        return Extra.getExtrasCount(activity);
    }

    public static boolean hasExtra(@NonNull Intent intent) {
        return Extra.has(intent);
    }

    public static boolean hasExtra(@NonNull Activity activity) {
        return Extra.has(activity);
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
}