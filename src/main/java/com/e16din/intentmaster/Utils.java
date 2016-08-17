package com.e16din.intentmaster;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.annotation.NonNull;
import android.view.WindowManager;


public final class Utils {

    private Utils() {
    }

    /**
     * Get activity from context object
     *
     * @param context the context
     * @return object of Activity or null if it is not Activity
     */
    public static Activity scanForActivity(Context context) {
        if (context == null)
            return null;
        else if (context instanceof Activity)
            return (Activity) context;
        else if (context instanceof ContextWrapper)
            return scanForActivity(((ContextWrapper) context).getBaseContext());

        return null;
    }

    public static void tryThis(@NonNull Runnable runnable, boolean needIgnore) {
        if (!needIgnore) {
            runnable.run();
            return;
        }

        try {
            runnable.run();
        } catch (NullPointerException | WindowManager.BadTokenException | IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
