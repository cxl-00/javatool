package com.cxl.toolproj.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间相关
 */
public class DateUtils {
    /**
     * 把String类型转换成Date类型
     * @param date
     * @return
     */
    public static Date stringToDate(String date){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = null;
        try {
            d = format.parse(date);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        return d;
    }
    /**
     * 天数加一
     * @param dateTime
     * @return
     * @throws Exception
     */
    public static String dateFamte(String dateTime) throws Exception{
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(dateTime);
        Calendar calendar = Calendar.getInstance();//日历对象
        calendar.setTime(date);//设置当前日期
        calendar.add(Calendar.DAY_OF_MONTH, 1);//天数加一
        return format.format(calendar.getTime());
    }
}
