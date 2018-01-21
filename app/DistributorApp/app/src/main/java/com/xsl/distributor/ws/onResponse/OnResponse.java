package com.xsl.distributor.ws.onResponse;

import com.xsl.lerist.llibrarys.model.ResultInfo;

/**
 * Created by Constandine on 2016/4/5.
 * 服务器返回数据接口,http请求
 */
public interface OnResponse {
    /**
     * 用于接收服务器返回数据
     * @param str 服务器返回数据
     * @param clazz 将返回的json数据类型解析并保存在该类里面，解析使用Gson
     */
    public <T> void onReponse(ResultInfo str, Class<T> clazz);

    public <T> void onFinish();
}
