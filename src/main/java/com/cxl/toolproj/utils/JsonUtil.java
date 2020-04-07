//package com.cxl.toolproj.utils;
//
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//
//public class JsonUtil {
//    /**
//     * 从一个JSON数组得到一个java对象数组，形如：
//     * [{"id" : idValue, "name" : nameValue}, {"id" : idValue, "name" : nameValue}, ...]
//     * @param object
//     * @param clazz
//     * @return
//     */
//    public static Object[] getDTOArray(String jsonString, Class clazz){
//        JSONArray array = JSONArray.fromObject(jsonString);
//        Object[] obj = new Object[array.size()];
//        for(int i = 0; i < array.size(); i++){
//            JSONObject jsonObject = array.getJSONObject(i);
//            obj[i] = JSONObject.toBean(jsonObject, clazz);
//        }
//        return obj;
//    }
//}
