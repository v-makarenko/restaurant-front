package ru.vmakarenko.dto;

import java.util.List;

/**
 * Created by vmakarenko on 22.04.2015.
 */
public class CommonResponse{
    private String result;
    private String msg;
    private List<CommonDto> data;


    public CommonResponse(String result) {
        this(result, null);
    }

    public CommonResponse(String result, String msg) {
        this.result = result;
        this.msg = msg;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<CommonDto> getData() {
        return data;
    }

    public void setData(List<CommonDto> data) {
        this.data = data;
    }
}
