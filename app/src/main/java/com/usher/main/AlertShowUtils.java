package com.usher.main;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.github.ybq.android.spinkit.SpinKitView;
import com.github.ybq.android.spinkit.style.DoubleBounce;

/**
 * Created by UsherChen on 2017/6/12.
 * Details AlertShowUtils
 */

@SuppressLint("InflateParams")
class AlertShowUtils {

    static void showSimpleLoading(Context context) {
        Dialog loadingDialog = new Dialog(context);
        View rootView = LayoutInflater.from(context).inflate(R.layout.alert_loading, null);
        SpinKitView mSkvLoading = (SpinKitView) rootView.findViewById(R.id.skv_loading);
        mSkvLoading.setIndeterminateDrawable(new DoubleBounce());//设置动画类型
        loadingDialog.setContentView(rootView);
        loadingDialog.getWindow().setBackgroundDrawableResource(R.drawable.bg_loading_dialog);//设置背景
        loadingDialog.show();
    }

}
