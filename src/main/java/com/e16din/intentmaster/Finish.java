package com.e16din.intentmaster;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;

import com.e16din.intentmaster.model.Data;

import java.io.Serializable;

public final class Finish {

    private Finish() {
        super();
    }


    public static void withResult(@NonNull Activity activity, Serializable... data) {
        createResultIntent(activity, data);
        activity.finish();
    }

    public static void withResult(@NonNull Activity activity, Parcelable... data) {
        createResultIntent(activity, data);
        activity.finish();
    }

    public static void withResult(@NonNull Activity activity, Data... data) {
        createResultIntent(activity, data);
        activity.finish();
    }

    public static Intent createResultIntent(@NonNull Activity activity, Serializable... data) {
        Intent intent = new Intent();
        Extra.put(intent, data);
        activity.setResult(Activity.RESULT_OK, intent);
        return intent;
    }

    public static Intent createResultIntent(@NonNull Activity activity, Parcelable... data) {
        Intent intent = new Intent();
        Extra.put(intent, data);
        activity.setResult(Activity.RESULT_OK, intent);
        return intent;
    }

    public static Intent createResultIntent(@NonNull Activity activity, Data... data) {
        Intent intent = new Intent();
        Extra.put(intent, data);
        activity.setResult(Activity.RESULT_OK, intent);
        return intent;
    }
}