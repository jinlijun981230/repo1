package com.itheima.proxy;

public interface IProducer {

    /**
     * 销售
     * @param money
     */
    public void saleProduct(Float money);

    /**
     * 售后
     * @param money
     */
    public void afterService(float money);

}
