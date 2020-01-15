package com.lcb.springcloud.learning.response;

public class ResponseResult<T> {
    // 状态码
    private Integer status;
    // 消息,成功消息或者失败消息
    private String msg;
    // 返回的数据
    private T data;

    public ResponseResult() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseResult(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private void setResultCode(ResultCode code) {
        this.status = code.code();
        this.msg = code.msg();
    }

    /**
     * 成功，无date数据返回
     * @return
     */
    public static ResponseResult success() {
        ResponseResult result = new ResponseResult();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }

    /**
     * 成功，有date数据返回
     * @param data
     * @return
     */
    public static ResponseResult success(Object data) {
        ResponseResult result = new ResponseResult();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    /**
     * 失败，指定失败编码code和msg
     * @param status
     * @param msg
     * @return
     */
    public static ResponseResult fail(Integer status, String msg) {
        ResponseResult result = new ResponseResult();
        result.setStatus(status);
        result.setMsg(msg);
        return result;
    }

    /**
     * 失败，指定失败枚举
     * @param resultCode
     * @return
     */
    public static ResponseResult fail(ResultCode resultCode) {
        ResponseResult result = new ResponseResult();
        result.setResultCode(resultCode);
        return result;
    }
}