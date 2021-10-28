package org.itstack.demo.design.store;

import java.util.Map;

public interface ICommodity {

    void SendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
