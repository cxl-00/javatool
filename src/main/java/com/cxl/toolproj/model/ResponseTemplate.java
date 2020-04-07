package com.cxl.toolproj.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author Chenxiaoling
 * @date 2020/4/7 1:53 下午
 */
@Builder
@Data
public class ResponseTemplate {
    public Integer code;
    public String message;
    public Object data;
}
