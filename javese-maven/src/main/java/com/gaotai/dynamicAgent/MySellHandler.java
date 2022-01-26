package com.gaotai.dynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author： hzm
 * @date： 2022/1/25 16:53
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class MySellHandler implements InvocationHandler {
    //目标对象
    private  Object target=null;
    public MySellHandler() {
    }
    public MySellHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       //执行目标方法
        Object ret = method.invoke(target,args);
        float price = (float) ret;
        //在目标方法执行后，增强功能
        ret = price + 300;
        return  ret;
    }
}
