package dto;

/**
 * Created by vmakarenko on 22.04.2015.
 */
public class CommonResponse{
    private String result;
    private String msg;
    private Object data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
