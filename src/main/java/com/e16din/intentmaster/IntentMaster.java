package com.e16din.intentmaster;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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

    // new fragment

    public static Fragment newFragment(@NonNull Fragment fragment, Data... data) {
        return Create.fragment(fragment, data);
    }

    public static Fragment newFragment(@NonNull Fragment fragment, Serializable... data) {
        return Create.fragment(fragment, data);
    }

    public static Fragment newFragment(@NonNull Fragment fragment, Parcelable... data) {
        return Create.fragment(fragment, data);
    }

    public static android.app.Fragment newFragment(@NonNull android.app.Fragment fragment,
                                                   Data... data) {
        return Create.fragment(fragment, data);
    }

    public static android.app.Fragment newFragment(@NonNull android.app.Fragment fragment,
                                                   Serializable... data) {
        return Create.fragment(fragment, data);
    }

    public static android.app.Fragment newFragment(@NonNull android.app.Fragment fragment,
                                                   Parcelable... data) {
        return Create.fragment(fragment, data);
    }

    // new dialog fragment

    public static DialogFragment newDialogFragment(@NonNull DialogFragment fragment, Data... data) {
        return Create.dialogFragment(fragment, data);
    }

    public static DialogFragment newDialogFragment(@NonNull DialogFragment fragment,
                                                   Serializable... data) {
        return Create.dialogFragment(fragment, data);
    }

    public static DialogFragment newDialogFragment(@NonNull DialogFragment fragment,
                                                   Parcelable... data) {
        return Create.dialogFragment(fragment, data);
    }

    public static android.app.DialogFragment newDialogFragment(
            @NonNull android.app.DialogFragment fragment, Data... data) {
        return Create.dialogFragment(fragment, data);
    }

    public static android.app.DialogFragment newDialogFragment(
            @NonNull android.app.DialogFragment fragment, Serializable... data) {
        return Create.dialogFragment(fragment, data);
    }

    public static android.app.DialogFragment newDialogFragment(
            @NonNull android.app.DialogFragment fragment, Parcelable... data) {
        return Create.dialogFragment(fragment, data);
    }

    //get argument

    public static Object getArgument(@NonNull Fragment fragment, @NonNull String key) {
        return Extra.get(fragment, key);
    }

    public static Object getArgument(@NonNull Fragment fragment) {
        return Extra.get(fragment);
    }

    public static Object getArgument(@NonNull Fragment fragment, int position) {
        return Extra.get(fragment, position);
    }

    //start activity

    public static void start(Context context, @NonNull Class cls) {
        Start.activity(context, cls);
    }

    public static void start(Context context, @NonNull Class cls, Data... data) {
        Start.activity(context, cls, data);
    }

    public static void start(Context context, @NonNull Class cls, Serializable... data) {
        Start.activity(context, cls, data);
    }

    public static void start(Context context, @NonNull Class cls, Parcelable... data) {
        Start.activity(context, cls, data);
    }

    //start activity for result

    public static void startForResult(@NonNull Activity activity, @NonNull Class cls, int requestCode) {
        Start.activityForResult(activity, cls, requestCode);
    }

    public static void startForResult(@NonNull Activity activity, @NonNull Class cls, int requestCode,
                                      Data... data) {
        Start.activityForResult(activity, cls, requestCode, data);
    }

    public static void startForResult(@NonNull Activity activity, @NonNull Class cls, int requestCode,
                                      Serializable... data) {
        Start.activityForResult(activity, cls, requestCode, data);
    }

    public static void startForResult(@NonNull Activity activity, @NonNull Class cls, int requestCode,
                                      Parcelable... data) {
        Start.activityForResult(activity, cls, requestCode, data);
    }

    public static void startForResult0(@NonNull Activity activity, @NonNull Class cls) {
        Start.activityForResult0(activity, cls);
    }

    public static void startForResult0(@NonNull Activity activity, @NonNull Class cls, Data... data) {
        Start.activityForResult0(activity, cls, data);
    }

    public static void startForResult0(@NonNull Activity activity, @NonNull Class cls,
                                       Serializable... data) {
        Start.activityForResult0(activity, cls, data);
    }

    public static void startForResult0(@NonNull Activity activity, @NonNull Class cls,
                                       Parcelable... data) {
        Start.activityForResult0(activity, cls, data);
    }

    public static void startForResult(@NonNull Fragment fragment, @NonNull Class cls, int requestCode) {
        Start.activityForResult(fragment, cls, requestCode);
    }

    public static void startForResult(@NonNull Fragment fragment, @NonNull Class cls, int requestCode,
                                      Data... data) {
        Start.activityForResult(fragment, cls, requestCode, data);
    }

    public static void startForResult(@NonNull Fragment fragment, @NonNull Class cls, int requestCode,
                                      Serializable... data) {
        Start.activityForResult(fragment, cls, requestCode, data);
    }

    public static void startForResult(@NonNull Fragment fragment, @NonNull Class cls, int requestCode,
                                      Parcelable... data) {
        Start.activityForResult(fragment, cls, requestCode, data);
    }

    public static void startForResult0(@NonNull Fragment fragment, @NonNull Class cls) {
        Start.activityForResult0(fragment, cls);
    }

    public static void startActivityForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                               Data... data) {
        Start.activityForResult0(fragment, cls, data);
    }

    public static void startForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                       Serializable... data) {
        Start.activityForResult0(fragment, cls, data);
    }

    public static void startForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                       Parcelable... data) {
        Start.activityForResult0(fragment, cls, data);
    }

    public static void startForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                      int requestCode) {
        Start.activityForResult(fragment, cls, requestCode);
    }

    public static void startForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                      int requestCode, Data... data) {
        Start.activityForResult(fragment, cls, requestCode, data);
    }

    public static void startForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                      int requestCode, Serializable... data) {
        Start.activityForResult(fragment, cls, requestCode, data);
    }

    public static void startForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                      int requestCode, Parcelable... data) {
        Start.activityForResult(fragment, cls, requestCode, data);
    }

    public static void startForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls) {
        startForResult(fragment, cls, 0);
    }

    public static void startForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                       Data... data) {
        Start.activityForResult0(fragment, cls, data);
    }

    public static void startForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                       Serializable... data) {
        Start.activityForResult0(fragment, cls, data);
    }

    public static void startForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                       Parcelable... data) {
        Start.activityForResult0(fragment, cls, data);
    }

    // get extra

    public static Object getExtra(@NonNull Intent intent, @NonNull String key) {
        return Extra.get(intent, key);
    }

    public static Object getExtra(@NonNull Intent intent) {
        return Extra.get(intent);
    }

    public static Object getExtra(@NonNull Intent intent, int position) {
        return Extra.get(intent, position);
    }

    public static Object getExtra(@NonNull Activity activity) {
        return Extra.get(activity);
    }

    public static Object getExtra(@NonNull Activity activity, @NonNull String key) {
        return Extra.get(activity, key);
    }

    public static Object getExtra(@NonNull Activity activity, int position) {
        return Extra.get(activity, position);
    }


    public static boolean containsKey(@NonNull Intent intent, @NonNull String key) {
        return Extra.containsKey(intent, key);
    }

    public static int getExtrasCount(@NonNull Intent intent) {
        return Extra.getCount(intent);
    }

    public static int getExtrasCount(@NonNull Activity activity) {
        return Extra.getCount(activity);
    }

    public static boolean hasExtra(@NonNull Intent intent) {
        return Extra.has(intent);
    }

    public static boolean hasExtra(@NonNull Activity activity) {
        return Extra.has(activity);
    }

    //broadcast


    public static void sendBroadcast(@NonNull android.app.Fragment fragment, @NonNull String action) {
        fragment.getActivity().sendBroadcast(Create.intent(action));
    }

    public static void sendBroadcast(@NonNull android.app.Fragment fragment, @NonNull String action,
                                     Data... data) {
        fragment.getActivity().sendBroadcast(Create.intent(action, data));
    }

    public static void sendBroadcast(@NonNull android.app.Fragment fragment, @NonNull String action,
                                     Serializable... data) {
        fragment.getActivity().sendBroadcast(Create.intent(action, data));
    }

    public static void sendBroadcast(@NonNull android.app.Fragment fragment, @NonNull String action,
                                     Parcelable... data) {
        fragment.getActivity().sendBroadcast(Create.intent(action, data));
    }


    public static void sendBroadcast(@NonNull Fragment fragment, @NonNull String action) {
        fragment.getActivity().sendBroadcast(Create.intent(action));
    }

    public static void sendBroadcast(@NonNull Fragment fragment, @NonNull String action,
                                     Data... data) {
        fragment.getActivity().sendBroadcast(Create.intent(action, data));
    }

    public static void sendBroadcast(@NonNull Fragment fragment, @NonNull String action,
                                     Serializable... data) {
        fragment.getActivity().sendBroadcast(Create.intent(action, data));
    }

    public static void sendBroadcast(@NonNull Fragment fragment, @NonNull String action,
                                     Parcelable... data) {
        fragment.getActivity().sendBroadcast(Create.intent(action, data));
    }


    public static void sendBroadcast(@NonNull Activity activity, @NonNull String action) {
        activity.sendBroadcast(Create.intent(action));
    }

    public static void sendBroadcast(@NonNull Activity activity, @NonNull String action,
                                     Data... data) {
        activity.sendBroadcast(Create.intent(action, data));
    }

    public static void sendBroadcast(@NonNull Activity activity, @NonNull String action,
                                     Serializable... data) {
        activity.sendBroadcast(Create.intent(action, data));
    }

    public static void sendBroadcast(@NonNull Activity activity, @NonNull String action,
                                     Parcelable... data) {
        activity.sendBroadcast(Create.intent(action, data));
    }

    //todo: show view by url
}