package com.itwd.learnproject.designmode.creatormode.simplefactory.impl;


import com.itwd.learnproject.designmode.creatormode.simplefactory.ICommodity;

/**
 * @Author: wangdong
 * @Date: 2021/3/10 10:10
 * @Version 1.0
 */
public class ChildCommodityImpl2 implements ICommodity {
    @Override
    public void pirntFactroyName() {
        System.out.println("这个是商品2");
    }
}
