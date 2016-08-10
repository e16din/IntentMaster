package com.e16din.intentmaster;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
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
    public static void activity(@NonNull Context context, @NonNull String dataUri) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(dataUri));
        context.startActivity(intent);
    }

    /**
     * Start an activity with
     * intent.setAction(Intent.ACTION_VIEW);
     * intent.setData(dataUri)
     *
     * @param context context
     * @param dataUri data URI string resId
     */
    public static void activity(@NonNull Context context, @StringRes int dataUri) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(context.getString(dataUri)));
        context.startActivity(intent);
    }

    /**
     * Start an activity with
     * intent.setAction(Intent.ACTION_VIEW);
     * intent.setData(dataUri)
     *
     * @param context context
     * @param dataUri data URI
     */
    public static void activity(@NonNull Context context, @NonNull Uri dataUri) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(dataUri);
        context.startActivity(intent);
    }


    /// activity


    public static void activity(@NonNull Context context, @NonNull Class cls) {
        Intent intent = Create.intent(context, cls);
        context.startActivity(intent);
    }

    public static void activity(@NonNull Context context, @NonNull Class cls, Data... data) {
        Intent intent = Create.intent(context, cls, data);
        context.startActivity(intent);
    }

    public static void activity(@NonNull Context context, @NonNull Class cls, Serializable... data) {
        Intent intent = Create.intent(context, cls, data);
        context.startActivity(intent);
    }

    public static void activity(@NonNull Context context, @NonNull Class cls, Parcelable... data) {
        Intent intent = Create.intent(context, cls, data);
        context.startActivity(intent);
    }


    /// for result


    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls,
                                         int requestCode) {
        Intent intent = Create.intent(activity, cls);
        activity.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls,
                                         int requestCode,
                                         Data... data) {
        Intent intent = Create.intent(activity, cls, data);
        activity.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls,
                                         int requestCode,
                                         Serializable... data) {
        Intent intent = Create.intent(activity, cls, data);
        activity.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls,
                                         int requestCode,
                                         Parcelable... data) {
        Intent intent = Create.intent(activity, cls, data);
        activity.startActivityForResult(intent, requestCode);
    }


    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls,
                                         int requestCode) {
        Intent intent = Create.intent(fragment.getActivity(), cls);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls,
                                         int requestCode,
                                         Data... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls,
                                         int requestCode,
                                         Serializable... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls,
                                         int requestCode,
                                         Parcelable... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }


    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                         int requestCode) {
        Intent intent = Create.intent(fragment.getActivity(), cls);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                         int requestCode, Data... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                         int requestCode, Serializable... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }

    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                         int requestCode, Parcelable... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode);
    }


    /// for result with default request code


    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls) {
        activityForResult(activity, cls, 0);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls,
                                          Data... data) {
        activityForResult(activity, cls, 0, data);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls,
                                          Serializable... data) {
        activityForResult(activity, cls, 0, data);
    }

    public static void activityForResult0(@NonNull Activity activity, @NonNull Class cls,
                                          Parcelable... data) {
        activityForResult(activity, cls, 0, data);
    }


    public static void activityForResult0(@NonNull Fragment fragment, @NonNull Class cls) {
        activityForResult(fragment, cls, 0);
    }

    public static void startActivityForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                               Data... data) {
        activityForResult(fragment, cls, 0, data);
    }

    public static void activityForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                          Serializable... data) {
        activityForResult(fragment, cls, 0, data);
    }

    public static void activityForResult0(@NonNull Fragment fragment, @NonNull Class cls,
                                          Parcelable... data) {
        activityForResult(fragment, cls, 0, data);
    }


    public static void activityForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls) {
        activityForResult(fragment, cls, 0);
    }

    public static void activityForResult0(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                          Data... data) {
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


    public static void activity(@NonNull Context context, @NonNull Class cls,
                                @NonNull ActivityOptionsCompat options) {
        Intent intent = Create.intent(context, cls);
        context.startActivity(intent, options.toBundle());
    }

    public static void activity(@NonNull Context context, @NonNull Class cls,
                                @NonNull ActivityOptionsCompat options, Data... data) {
        Intent intent = Create.intent(context, cls, data);
        context.startActivity(intent, options.toBundle());
    }

    public static void activity(@NonNull Context context, @NonNull Class cls,
                                @NonNull ActivityOptionsCompat options, Serializable... data) {
        Intent intent = Create.intent(context, cls, data);
        context.startActivity(intent, options.toBundle());
    }

    public static void activity(@NonNull Context context, @NonNull Class cls,
                                @NonNull ActivityOptionsCompat options, Parcelable... data) {
        Intent intent = Create.intent(context, cls, data);
        context.startActivity(intent, options.toBundle());
    }


    /// for result with options


    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptionsCompat options) {
        Intent intent = Create.intent(activity, cls);
        activity.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptionsCompat options,
                                         Data... data) {
        Intent intent = Create.intent(activity, cls, data);
        activity.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptionsCompat options,
                                         Serializable... data) {
        Intent intent = Create.intent(activity, cls, data);
        activity.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptionsCompat options,
                                         Parcelable... data) {
        Intent intent = Create.intent(activity, cls, data);
        activity.startActivityForResult(intent, requestCode, options.toBundle());
    }


    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptionsCompat options) {
        Intent intent = Create.intent(fragment.getActivity(), cls);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptionsCompat options, Data... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptionsCompat options,
                                         Serializable... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptionsCompat options,
                                         Parcelable... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
    }


    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptionsCompat options) {
        Intent intent = Create.intent(fragment.getActivity(), cls);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptionsCompat options, Data... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptionsCompat options,
                                         Serializable... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptionsCompat options,
                                         Parcelable... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
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


    public static void activity(@NonNull Context context, @NonNull Class cls,
                                @NonNull ActivityOptions options) {
        Intent intent = Create.intent(context, cls);
        context.startActivity(intent, options.toBundle());
    }

    public static void activity(@NonNull Context context, @NonNull Class cls,
                                @NonNull ActivityOptions options, Data... data) {
        Intent intent = Create.intent(context, cls, data);
        context.startActivity(intent, options.toBundle());
    }

    public static void activity(@NonNull Context context, @NonNull Class cls,
                                @NonNull ActivityOptions options, Serializable... data) {
        Intent intent = Create.intent(context, cls, data);
        context.startActivity(intent, options.toBundle());
    }

    public static void activity(@NonNull Context context, @NonNull Class cls,
                                @NonNull ActivityOptions options, Parcelable... data) {
        Intent intent = Create.intent(context, cls, data);
        context.startActivity(intent, options.toBundle());
    }


    /// for result with options


    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptions options) {
        Intent intent = Create.intent(activity, cls);
        activity.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptions options,
                                         Data... data) {
        Intent intent = Create.intent(activity, cls, data);
        activity.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptions options,
                                         Serializable... data) {
        Intent intent = Create.intent(activity, cls, data);
        activity.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull Activity activity, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptions options,
                                         Parcelable... data) {
        Intent intent = Create.intent(activity, cls, data);
        activity.startActivityForResult(intent, requestCode, options.toBundle());
    }


    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptions options) {
        Intent intent = Create.intent(fragment.getActivity(), cls);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptions options, Data... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptions options,
                                         Serializable... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptions options,
                                         Parcelable... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
    }


    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptions options) {
        Intent intent = Create.intent(fragment.getActivity(), cls);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptions options, Data... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptions options,
                                         Serializable... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
    }

    public static void activityForResult(@NonNull android.app.Fragment fragment, @NonNull Class cls,
                                         int requestCode, @NonNull ActivityOptions options,
                                         Parcelable... data) {
        Intent intent = Create.intent(fragment.getActivity(), cls, data);
        fragment.startActivityForResult(intent, requestCode, options.toBundle());
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


    public static void service(@NonNull Context context, @NonNull Class cls) {
        Intent intent = Create.intent(context, cls);
        context.startService(intent);
    }
}