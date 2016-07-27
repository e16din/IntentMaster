package com.e16din.intentmaster;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;

import com.e16din.intentmaster.model.Data;

import java.io.Serializable;

public final class Create {

    private Create() {
        super();
    }

    public static Fragment fragment(@NonNull Fragment fragment, Data... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static Fragment fragment(@NonNull Fragment fragment, Serializable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static Fragment fragment(@NonNull Fragment fragment, Parcelable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static android.app.Fragment fragment(@NonNull android.app.Fragment fragment, Data... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static android.app.Fragment fragment(@NonNull android.app.Fragment fragment, Serializable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static android.app.Fragment fragment(@NonNull android.app.Fragment fragment, Parcelable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static DialogFragment dialogFragment(@NonNull DialogFragment fragment, Data... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static DialogFragment dialogFragment(@NonNull DialogFragment fragment, Serializable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static DialogFragment dialogFragment(@NonNull DialogFragment fragment, Parcelable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static android.app.DialogFragment dialogFragment(@NonNull android.app.DialogFragment fragment, Data... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static android.app.DialogFragment dialogFragment(@NonNull android.app.DialogFragment fragment, Serializable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static android.app.DialogFragment dialogFragment(@NonNull android.app.DialogFragment fragment, Parcelable... data) {
        Bundle bundle = Create.bundle(data);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static Bundle bundle(Serializable... data) {
        Bundle bundle = bundle();
        Extra.put(bundle, data);
        return bundle;
    }

    public static Bundle bundle(Parcelable... data) {
        Bundle bundle = bundle();
        Extra.put(bundle, data);
        return bundle;
    }

    public static Bundle bundle(Data... data) {
        Bundle bundle = bundle();
        Extra.put(bundle, data);
        return bundle;
    }

    public static Bundle bundle() {
        return new Bundle();
    }

    public static Intent intent(@NonNull Context context, @NonNull Class cls, Serializable... data) {
        Intent intent = new Intent(context, cls);
        Extra.put(intent, data);
        return intent;
    }

    public static Intent intent(@NonNull Context context, @NonNull Class cls, Parcelable... data) {
        Intent intent = new Intent(context, cls);
        Extra.put(intent, data);
        return intent;
    }

    public static Intent intent(@NonNull Context context, @NonNull Class cls, Data... data) {
        Intent intent = new Intent(context, cls);
        Extra.put(intent, data);
        return intent;
    }

    public static Intent intent(@NonNull Context context, @NonNull Class cls) {
        return new Intent(context, cls);
    }

    public static Intent intent(@NonNull String action, Serializable... data) {
        Intent intent = new Intent(action);
        Extra.put(intent, data);
        return intent;
    }

    public static Intent intent(@NonNull String action, Parcelable... data) {
        Intent intent = new Intent(action);
        Extra.put(intent, data);
        return intent;
    }

    public static Intent intent(@NonNull String action, Data... data) {
        Intent intent = new Intent(action);
        Extra.put(intent, data);
        return intent;
    }

    public static Intent intent(@NonNull String action) {
        return new Intent(action);
    }

}