package com.itwd.learnproject.designmode.creatormode.simplefactory;


import com.itwd.learnproject.designmode.creatormode.simplefactory.impl.ChildCommodityImpl1;
import com.itwd.learnproject.designmode.creatormode.simplefactory.impl.ChildCommodityImpl2;

/**
 * @Author: wangdong
 * @Date: 2021/3/10 10:15
 * @Version 1.0
 */
public class CommodityFactory {
    public ICommodity getCommodity(Integer id){
        if(id == 1){
            return new ChildCommodityImpl1();
        }
        if(id == 2){
            return new ChildCommodityImpl2();
        }
        throw new RuntimeException("不存在的商品");
    }
}
