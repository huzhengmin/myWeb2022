package com.gaotai.dynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author： hzm
 * @date： 2022/1/25 16:43
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class dyamicMain {
    public static void main(String[] args) {
        //静态代理
        TaoBao taoBao = new TaoBao();
        WeiShang weiShang = new WeiShang();
        System.out.println("taobao "+taoBao.sell(1));
        System.out.println("weishang "+weiShang.sell(1));

        //动态代理
        //创建代理
        UsbKingFaction  usbKingFaction = new UsbKingFaction();
        //创建调用处理器
        InvocationHandler handler = new MySellHandler(usbKingFaction);
        //创建jdk动态代理
        IUsbSell tb = (IUsbSell)Proxy.newProxyInstance(usbKingFaction.getClass().getClassLoader(),
                usbKingFaction.getClass().getInterfaces(),handler);
        //通过代理对象执行业务方法，增加利润
        float price = tb.sell(1);
        System.out.println(price);
    }
}
