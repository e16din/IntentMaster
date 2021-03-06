package com.e16din.intentmaster;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

public final class Share {

    private Share() {
        super();
    }

    //share link

    /**
     * Share link with other applications
     * <p/>
     * You may override intent_master_share_link_title string resource to change title
     */
    public static void link(@NonNull Context context, @NonNull String url) {
        link(context, url, context.getString(R.string.intent_master_share_link_title));
    }

    /**
     * Share link with other applications
     */
    public static void link(@NonNull Context context, @NonNull String text, String title) {
        text(context, text, title);
    }

    //share text

    /**
     * Share text with other applications
     * <p/>
     * You may override intent_master_share_text_title string resource to change title
     */
    public static void text(@NonNull Context context, @NonNull String text) {
        text(context, text, context.getString(R.string.intent_master_share_text_title));
    }

    /**
     * Share text with other applications
     */
    public static void text(@NonNull final Context context, @NonNull final String text, final String title) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, text);
                context.startActivity(Intent.createChooser(shareIntent, title));
            }
        }, IntentMaster.needIgnoreExceptions());
    }
}