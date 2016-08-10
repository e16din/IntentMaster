package com.e16din.intentmaster;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;


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
}
