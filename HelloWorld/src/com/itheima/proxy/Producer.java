package com.itheima.proxy;

public class Producer implements IProducer {

    /**
     * 销售
     * @param money
     */
    public void saleProduct(Float money){
        System.out.println("销售产品，并拿到钱：" + money);
    }

    /**
     * 售后
     * @param money
     */
    public void afterService(float money){
        System.out.println("提供售后服务，并拿到钱：" + money);
    }
}
