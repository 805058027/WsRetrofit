package com.example.administrator.wsretrofit.util.logger;

import android.util.Log;



/**
 * 对Log类的二次封装
 *
 * @author azzbcc E-mail: azzbcc@sina.com
 * @version 创建时间：2015年11月4日 下午1:36:27
 */
public class Logger {
    public int LOG_LEVEL = 4;

    private static String TAG = "azzbcc";

    private static Logger log;

    private Logger() {
    }

    public static Logger getLogger() {
        if (log == null) {
            log = new Logger();
        }
        return log;
    }

    private String getFunctionName() {
        StackTraceElement[] sts = Thread.currentThread().getStackTrace();
        if (sts == null) {
            return null;
        }
        for (StackTraceElement st : sts) {
            if (st.isNativeMethod()) {
                continue;
            }
            if (st.getClassName().equals(Thread.class.getName())) {
                continue;
            }
            if (st.getClassName().equals(this.getClass().getName())) {
                continue;
            }
            return "[ " + Thread.currentThread().getName() + " "
                    + st.getFileName() + ":" + st.getLineNumber() + " "
                    + st.getMethodName() + " ]";
        }
        return null;
    }

    private void log(String tag, String msg, int level) {
        if (level < LOG_LEVEL) {
            return;
        }
        Log.println(level, tag, getFunctionName() + " " + msg);
    }

    private void log(String msg, int level) {
        log(TAG, msg, level);
    }

    private String combine(String title, Object msg) {
        return title + " --> " + msg.toString();
    }

    public void i(String msg) {
        if (null == msg) {
            log("null", Log.INFO);
            return;
        }
        log(msg, Log.INFO);
    }

    public void i(String title, Object msg) {
        if (null == msg) {
            log("null", Log.INFO);
            return;
        }
        log(combine(title, msg), Log.INFO);
    }

    public void d(String msg) {
        if (null == msg) {
            log("null", Log.DEBUG);
            return;
        }
        log(msg, Log.DEBUG);
    }

    public void d(String title, Object msg) {
        if (null == msg) {
            log("null", Log.DEBUG);
            return;
        }
        log(combine(title, msg), Log.DEBUG);
    }

    public void v(String msg) {
        if (null == msg) {
            log("null", Log.VERBOSE);
            return;
        }
        log(msg, Log.VERBOSE);
    }

    public void v(String title, Object msg) {
        if (null == msg) {
            log("null", Log.VERBOSE);
            return;
        }
        log(combine(title, msg), Log.VERBOSE);
    }

    public void w(String msg) {
        if (null == msg) {
            log("null", Log.WARN);
            return;
        }
        log(msg, Log.WARN);
    }

    public void w(String title, Object msg) {
        if (null == msg) {
            log("null", Log.WARN);
            return;
        }
        log(combine(title, msg), Log.WARN);
    }

    public void e(String msg) {
        if (null == msg) {
            log("null", Log.ERROR);
            return;
        }
        log(msg, Log.ERROR);
    }

    public void e(Throwable tr) {
        Log.e(TAG, getFunctionName(), tr);
    }

    public void e(String title, Object msg) {
        if (null == msg) {
            log("null", Log.ERROR);
            return;
        }
        log(combine(title, msg), Log.ERROR);
    }
}

