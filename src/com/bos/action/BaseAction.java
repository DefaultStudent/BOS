package com.bos.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 通过Action实现
 * @author Simon
 *
 * @param <T>
 */

public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{

    /**
     * 模型对象
     */
    protected T model;

    @Override
    public T getModel() {
        return model;
    }

    /**
     * 在构造方法中动态获得实现类型，通过反射创建模型对象
     * @return
     */
    public BaseAction() {
        ParameterizedType genericSuperclass = (ParameterizedType) super.getClass().getGenericSuperclass();
        Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
        // 获得实体类型
        Class<T> entityClass = (Class<T>) actualTypeArguments[0];
        try {
            // 通过反射创建对象
            model = entityClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
