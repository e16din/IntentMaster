package com.e16din.intentmaster;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.WindowManager;

import com.e16din.intentmaster.model.Data;

import java.io.Serializable;

public final class Finish {

    private Finish() {
        super();
    }


    public static void withResult(@NonNull final Activity activity, final Serializable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                createResultIntent(activity, data);
                activity.finish();
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void withResult(@NonNull final Activity activity, final Parcelable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                createResultIntent(activity, data);
                activity.finish();
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void withResult(@NonNull final Activity activity, final Data... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                createResultIntent(activity, data);
                activity.finish();
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    @Nullable
    public static Intent createResultIntent(@NonNull Activity activity, Serializable... data) {
        if (!IntentMaster.needIgnoreExceptions()) {
            return createResult(activity, data);
        }

        try {
            return createResult(activity, data);
        } catch (NullPointerException | WindowManager.BadTokenException | IllegalStateException e) {
            e.printStackTrace();
        }

        return null;
    }

    @NonNull
    private static Intent createResult(@NonNull Activity activity, Serializable[] data) {
        Intent intent = new Intent();
        Extra.put(intent, data);
        activity.setResult(Activity.RESULT_OK, intent);
        return intent;
    }

    @Nullable
    public static Intent createResultIntent(@NonNull Activity activity, Parcelable... data) {
        if (!IntentMaster.needIgnoreExceptions()) {
            return createResult(activity, data);
        }

        try {
            return createResult(activity, data);
        } catch (NullPointerException | WindowManager.BadTokenException | IllegalStateException e) {
            e.printStackTrace();
        }

        return null;
    }

    @NonNull
    private static Intent createResult(@NonNull Activity activity, Parcelable[] data) {
        Intent intent = new Intent();
        Extra.put(intent, data);
        activity.setResult(Activity.RESULT_OK, intent);
        return intent;
    }

    @Nullable
    public static Intent createResultIntent(@NonNull Activity activity, Data... data) {
        if (!IntentMaster.needIgnoreExceptions()) {
            return createResult(activity, data);
        }

        try {
            return createResult(activity, data);
        } catch (NullPointerException | WindowManager.BadTokenException | IllegalStateException e) {
            e.printStackTrace();
        }

        return null;
    }

    @NonNull
    private static Intent createResult(@NonNull Activity activity, Data[] data) {
        Intent intent = new Intent();
        Extra.put(intent, data);
        activity.setResult(Activity.RESULT_OK, intent);
        return intent;
    }
}