package com.example.administrator.wsretrofit.util.toast;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.wsretrofit.R;
import com.example.administrator.wsretrofit.util.display.DisplayUtil;

import butterknife.ButterKnife;


/**
 * Description
 * author：azzbcc on 16-9-9 上午11:27
 * email：azzbcc@sina.com
 */
public class ToastUtils {
    private static Toast toast;

    public static void showToast(Context context, String content) {
        showToast(context, content, Toast.LENGTH_SHORT);
    }

    public static void showToast(Context context, String content, int length) {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_toast, null);      //加载布局文件
        TextView textView = ButterKnife.findById(view, R.id.toast_text); // 得到textview
        textView.setText(content);     //设置文本类荣，就是你想给用户看的提示数据
        if (toast != null) toast.cancel();
        toast = new Toast(context);     //创建一个toast
        toast.setDuration(length);          //设置toast显示时间，整数值
        toast.setGravity(Gravity.BOTTOM, 0, DisplayUtil.dp2px(context, 60));    //toast的显示位置，这里居中显示
        toast.setView(view);     //設置其显示的view,
        toast.show();             //显示toast
    }
}
