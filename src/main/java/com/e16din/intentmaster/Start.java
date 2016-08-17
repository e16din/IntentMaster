package com.e16din.intentmaster;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;

import com.e16din.intentmaster.model.Data;

import java.io.Serializable;

public final class Start {

    private Start() {
        super();
    }


    /// ACTION_VIEW


    /**
     * Start an activity with
     * intent.setAction(Intent.ACTION_VIEW);
     * intent.setData(dataUri)
     *
     * @param context context
     * @param dataUri data URI string
     */
    public static void activity(@NonNull final Context context, @NonNull final String dataUri) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(dataUri));
                context.startActivity(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    /**
     * Start an activity with
     * intent.setAction(Intent.ACTION_VIEW);
     * intent.setData(dataUri)
     *
     * @param context context
     * @param dataUri data URI string resId
     */
    public static void activity(@NonNull final Context context, @StringRes final int dataUri) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(context.getString(dataUri)));
                context.startActivity(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    /**
     * Start an activity with
     * intent.setAction(Intent.ACTION_VIEW);
     * intent.setData(dataUri)
     *
     * @param context context
     * @param dataUri data URI
     */
    public static void activity(@NonNull final Context context, @NonNull final Uri dataUri) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(dataUri);
                context.startActivity(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }


    /// activity


    public static void activity(@NonNull final Context context, @NonNull final Class cls) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(context, cls);
                context.startActivity(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activity(@NonNull final Context context, @NonNull final Class cls, final Data... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(context, cls, data);
                context.startActivity(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activity(@NonNull final Context context, @NonNull final Class cls, final Serializable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(context, cls, data);
                context.startActivity(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activity(@NonNull final Context context, @NonNull final Class cls, final Parcelable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(context, cls, data);
                context.startActivity(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }


    /// for result


    public static void activityForResult(@NonNull final Activity activity, @NonNull final Class cls,
                                         final int requestCode) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(activity, cls);
                activity.startActivityForResult(intent, requestCode);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Activity activity, @NonNull final Class cls,
                                         final int requestCode, final Data... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(activity, cls, data);
                activity.startActivityForResult(intent, requestCode);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Activity activity, @NonNull final Class cls,
                                         final int requestCode, final Serializable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(activity, cls, data);
                activity.startActivityForResult(intent, requestCode);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Activity activity, @NonNull final Class cls,
                                         final int requestCode, final Parcelable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(activity, cls, data);
                activity.startActivityForResult(intent, requestCode);
            }
        }, IntentMaster.needIgnoreExceptions());
    }


    public static void activityForResult(@NonNull final Fragment fragment, @NonNull final Class cls,
                                         final int requestCode) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls);
                fragment.startActivityForResult(intent, requestCode);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, final Data... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                fragment.startActivityForResult(intent, requestCode);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, final Serializable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                fragment.startActivityForResult(intent, requestCode);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, final Parcelable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                fragment.startActivityForResult(intent, requestCode);
            }
        }, IntentMaster.needIgnoreExceptions());
    }


    public static void activityForResult(@NonNull final android.app.Fragment fragment, @NonNull final Class cls,
                                         final int requestCode) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls);
                fragment.startActivityForResult(intent, requestCode);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final android.app.Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, final Data... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                fragment.startActivityForResult(intent, requestCode);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final android.app.Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, final Serializable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                fragment.startActivityForResult(intent, requestCode);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final android.app.Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, final Parcelable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                fragment.startActivityForResult(intent, requestCode);
            }
        }, IntentMaster.needIgnoreExceptions());
    }


    /// for result with default request code


    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls) {
        activityForResult(activity, cls, 0);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls, Data... data) {
        activityForResult(activity, cls, 0, data);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls, Serializable... data) {
        activityForResult(activity, cls, 0, data);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls, Parcelable... data) {
        activityForResult(activity, cls, 0, data);
    }


    public static void activityForResult0(@NonNull Fragment fragment, @NonNull Class cls) {
        activityForResult(fragment, cls, 0);
    }

    public static void startActivityForResult0(@NonNull Fragment fragment, @NonNull Class cls, Data... data) {
        activityForResult(fragment, cls, 0, data);
    }

    public static void activityForResult0(@NonNull Fragment fragment, @NonNull Class cls, Serializable... data) {
        activityForResult(fragment, cls, 0, data);
    }

    public static void activityForResult0(@NonNull Fragment fragment, @NonNull Class cls, Parcelable... data) {
        activityForResult(fragment, cls, 0, data);
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


    /// activity with options (ActivityOptionsCompat)


    public static void activity(@NonNull final Context context, @NonNull final Class cls,
                                @NonNull final ActivityOptionsCompat options) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(context, cls);
                ActivityCompat.startActivity(Utils.scanForActivity(context), intent, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activity(@NonNull final Context context, @NonNull final Class cls,
                                @NonNull final ActivityOptionsCompat options, final Data... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(context, cls, data);
                ActivityCompat.startActivity(Utils.scanForActivity(context), intent, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activity(@NonNull final Context context, @NonNull final Class cls,
                                @NonNull final ActivityOptionsCompat options, final Serializable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(context, cls, data);
                ActivityCompat.startActivity(Utils.scanForActivity(context), intent, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activity(@NonNull final Context context, @NonNull final Class cls,
                                @NonNull final ActivityOptionsCompat options, final Parcelable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(context, cls, data);
                ActivityCompat.startActivity(Utils.scanForActivity(context), intent, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }


    /// for result with options


    public static void activityForResult(@NonNull final Activity activity, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptionsCompat options) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(activity, cls);
                ActivityCompat.startActivityForResult(activity, intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Activity activity, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptionsCompat options,
                                         final Data... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(activity, cls, data);
                ActivityCompat.startActivityForResult(activity, intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Activity activity, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptionsCompat options,
                                         final Serializable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(activity, cls, data);
                ActivityCompat.startActivityForResult(activity, intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Activity activity, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptionsCompat options,
                                         final Parcelable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(activity, cls, data);
                ActivityCompat.startActivityForResult(activity, intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }


    public static void activityForResult(@NonNull final Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptionsCompat options) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls);
                fragment.startActivityForResult(intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptionsCompat options,
                                         final Data... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                fragment.startActivityForResult(intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptionsCompat options,
                                         final Serializable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                fragment.startActivityForResult(intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptionsCompat options,
                                         final Parcelable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                fragment.startActivityForResult(intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }


    public static void activityForResult(@NonNull final android.app.Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptionsCompat options) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls);
                ActivityCompat.startActivityForResult(fragment.getActivity(), intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final android.app.Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptionsCompat options,
                                         final Data... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                ActivityCompat.startActivityForResult(fragment.getActivity(), intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final android.app.Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptionsCompat options,
                                         final Serializable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                ActivityCompat.startActivityForResult(fragment.getActivity(), intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final android.app.Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptionsCompat options,
                                         final Parcelable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                ActivityCompat.startActivityForResult(fragment.getActivity(), intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }


    /// for result with default request code with options


    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls,
                                          @NonNull ActivityOptionsCompat options) {
        activityForResult(activity, cls, 0, options);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls,
                                          @NonNull ActivityOptionsCompat options, Data... data) {
        activityForResult(activity, cls, 0, options, data);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls,
                                          @NonNull ActivityOptionsCompat options, Serializable... data) {
        activityForResult(activity, cls, 0, options, data);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls,
                                          @NonNull ActivityOptionsCompat options, Parcelable... data) {
        activityForResult(activity, cls, 0, options, data);
    }


    public static void activityForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                          @NonNull ActivityOptionsCompat options) {
        activityForResult(fragment, cls, 0, options);
    }

    public static void startActivityForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                               @NonNull ActivityOptionsCompat options, Data... data) {
        activityForResult(fragment, cls, 0, options, data);
    }

    public static void activityForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                          @NonNull ActivityOptionsCompat options, Serializable... data) {
        activityForResult(fragment, cls, 0, options, data);
    }

    public static void activityForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                          @NonNull ActivityOptionsCompat options, Parcelable... data) {
        activityForResult(fragment, cls, 0, options, data);
    }


    public static void activityForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                          @NonNull ActivityOptionsCompat options) {
        activityForResult(fragment, cls, 0, options);
    }

    public static void activityForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                          @NonNull ActivityOptionsCompat options, Data... data) {
        activityForResult(fragment, cls, 0, options, data);
    }

    public static void activityForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                          @NonNull ActivityOptionsCompat options, Serializable... data) {
        activityForResult(fragment, cls, 0, options, data);
    }

    public static void activityForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                          @NonNull ActivityOptionsCompat options, Parcelable... data) {
        activityForResult(fragment, cls, 0, options, data);
    }


    /// activity with options (ActivityOptions)


    public static void activity(@NonNull final Context context, @NonNull final Class cls,
                                @NonNull final ActivityOptions options) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(context, cls);
                ActivityCompat.startActivity(Utils.scanForActivity(context), intent, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activity(@NonNull final Context context, @NonNull final Class cls,
                                @NonNull final ActivityOptions options, final Data... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(context, cls, data);
                ActivityCompat.startActivity(Utils.scanForActivity(context), intent, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activity(@NonNull final Context context, @NonNull final Class cls,
                                @NonNull final ActivityOptions options, final Serializable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(context, cls, data);
                ActivityCompat.startActivity(Utils.scanForActivity(context), intent, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activity(@NonNull final Context context, @NonNull final Class cls,
                                @NonNull final ActivityOptions options, final Parcelable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(context, cls, data);
                ActivityCompat.startActivity(Utils.scanForActivity(context), intent, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }


    /// for result with options


    public static void activityForResult(@NonNull final Activity activity, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptions options) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(activity, cls);
                ActivityCompat.startActivityForResult(activity, intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Activity activity, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptions options,
                                         final Data... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(activity, cls, data);
                ActivityCompat.startActivityForResult(activity, intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Activity activity, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptions options,
                                         final Serializable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(activity, cls, data);
                ActivityCompat.startActivityForResult(activity, intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Activity activity, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptions options,
                                         final Parcelable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(activity, cls, data);
                ActivityCompat.startActivityForResult(activity, intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }


    public static void activityForResult(@NonNull final Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptions options) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls);
                ActivityCompat.startActivityForResult(fragment.getActivity(), intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptions options,
                                         final Data... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                ActivityCompat.startActivityForResult(fragment.getActivity(), intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptions options,
                                         final Serializable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                ActivityCompat.startActivityForResult(fragment.getActivity(), intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptions options,
                                         final Parcelable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                ActivityCompat.startActivityForResult(fragment.getActivity(), intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }


    public static void activityForResult(@NonNull final android.app.Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptions options) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls);
                ActivityCompat.startActivityForResult(fragment.getActivity(), intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final android.app.Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptions options,
                                         final Data... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                ActivityCompat.startActivityForResult(fragment.getActivity(), intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final android.app.Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptions options,
                                         final Serializable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                ActivityCompat.startActivityForResult(fragment.getActivity(), intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }

    public static void activityForResult(@NonNull final android.app.Fragment fragment, @NonNull final Class cls,
                                         final int requestCode, @NonNull final ActivityOptions options,
                                         final Parcelable... data) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(fragment.getActivity(), cls, data);
                ActivityCompat.startActivityForResult(fragment.getActivity(), intent, requestCode, options.toBundle());
            }
        }, IntentMaster.needIgnoreExceptions());
    }


    /// for result with default request code with options


    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls,
                                          @NonNull ActivityOptions options) {
        activityForResult(activity, cls, 0, options);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls,
                                          @NonNull ActivityOptions options, Data... data) {
        activityForResult(activity, cls, 0, options, data);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls,
                                          @NonNull ActivityOptions options, Serializable... data) {
        activityForResult(activity, cls, 0, options, data);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls,
                                          @NonNull ActivityOptions options, Parcelable... data) {
        activityForResult(activity, cls, 0, options, data);
    }


    public static void activityForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                          @NonNull ActivityOptions options) {
        activityForResult(fragment, cls, 0, options);
    }

    public static void startActivityForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                               @NonNull ActivityOptions options, Data... data) {
        activityForResult(fragment, cls, 0, options, data);
    }

    public static void activityForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                          @NonNull ActivityOptions options, Serializable... data) {
        activityForResult(fragment, cls, 0, options, data);
    }

    public static void activityForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                          @NonNull ActivityOptions options, Parcelable... data) {
        activityForResult(fragment, cls, 0, options, data);
    }


    public static void activityForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                          @NonNull ActivityOptions options) {
        activityForResult(fragment, cls, 0, options);
    }

    public static void activityForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                          @NonNull ActivityOptions options, Data... data) {
        activityForResult(fragment, cls, 0, options, data);
    }

    public static void activityForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                          @NonNull ActivityOptions options, Serializable... data) {
        activityForResult(fragment, cls, 0, options, data);
    }

    public static void activityForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                          @NonNull ActivityOptions options, Parcelable... data) {
        activityForResult(fragment, cls, 0, options, data);
    }


    /// service


    public static void service(@NonNull final Context context, @NonNull final Class cls) {
        Utils.tryThis(new Runnable() {
            @Override
            public void run() {
                Intent intent = Create.intent(context, cls);
                context.startService(intent);
            }
        }, IntentMaster.needIgnoreExceptions());
    }

}