package com.itwd.learnproject.designmode.creatormode.simplefactory;

/**
 * @Author: wangdong
 * @Date: 2021/3/10 10:19
 * @Version 1.0
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CommodityFactory cf = new CommodityFactory();
        ICommodity c1 = cf.getCommodity(1);
        c1.pirntFactroyName();
        ICommodity c2 = cf.getCommodity(2);
        c2.pirntFactroyName();
    }
}
