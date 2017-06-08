package com.example.administrator.wsretrofit.model;

import java.util.List;

/**
 * Created by Administrator on 2017/6/7.
 */

public class AreaInfo {

    public List<ObjectsBean> objects;

    public static class ObjectsBean {
        /**
         * vcAddress : 无
         * vcArea : 无
         * nId : 0
         */

        public String vcAddress;
        public String vcArea;
        public int nId;
    }
}
