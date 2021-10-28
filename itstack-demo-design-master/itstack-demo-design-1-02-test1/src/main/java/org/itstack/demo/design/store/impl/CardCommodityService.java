package org.itstack.demo.design.store.impl;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.itstack.demo.design.card.IQiYiCardService;
import org.itstack.demo.design.store.ICommodity;

import java.util.Map;

@Slf4j
public class CardCommodityService implements ICommodity {

     private IQiYiCardService iQiYiCardService = new IQiYiCardService();

     @Override
     public void SendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
          String mobile = queryUserMobile(uId);
          iQiYiCardService.grantToken(mobile,bizId);
          log.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
          log.info("测试结果[爱奇艺兑换卡]：success");
     }

     private String queryUserMobile(String uId){
          return  "15200101232";
     }
}
