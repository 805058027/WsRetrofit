package com.example.administrator.wsretrofit.model;

import java.io.Serializable;
import java.util.List;

/**
 * Description
 *
 * @author azzbcc on 17-4-27 下午3:22
 * @email azzbcc@sina.com
 */
public class BaseModel<T>implements Serializable {

    private int nRes;
    private T object;
    private String vcRes;
    private List<T> objects;

    public boolean isSuccess() {
        return 1 == nRes;
    }

    public int getnRes() {
        return nRes;
    }

    public void setnRes(int nRes) {
        this.nRes = nRes;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public String getVcRes() {
        return vcRes;
    }

    public void setVcRes(String vcRes) {
        this.vcRes = vcRes;
    }

    public List<T> getObjects() {
        return objects;
    }

    public void setObjects(List<T> objects) {
        this.objects = objects;
    }
}
