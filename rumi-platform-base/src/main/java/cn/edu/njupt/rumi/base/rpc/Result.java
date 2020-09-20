package cn.edu.njupt.rumi.base.rpc;

import cn.edu.njupt.rumi.base.error.ErrorCode;
import lombok.Data;

import java.util.Date;

/**
 * RPC返回结果
 *
 * @author ZhangXin
 * @date 2020/9/18 15:33
 */
@Data
public class Result<T> {
    /**
     * traceId
     */
    private String traceId;

    /**
     * 时间
     */
    private Date time;

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误信息
     */
    private String errorMsg;

    /**
     * data
     */
    private T data;

    /**
     * 成功
     *
     * @param data 返回值
     * @param <T>  类型
     * @return 成功result
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<T>();
        result.setSuccess(true);
        result.setTime(new Date());
        result.setErrorCode(null);
        result.setErrorMsg(null);
        result.setData(data);
        return result;
    }

    /**
     * 失败
     *
     * @param errorCode 错误码
     * @param errorMsg  错误信息
     * @param <T>       类型
     * @return 错误result
     */
    public static <T> Result<T> error(String errorCode, String errorMsg) {
        Result<T> result = new Result<T>();
        result.setSuccess(false);
        result.setTime(new Date());
        result.setErrorCode(errorCode);
        result.setErrorMsg(errorMsg);
        return result;
    }

    /**
     * 失败
     *
     * @param errorCode 错误码
     * @param <T>       类型
     * @return 错误result
     */
    public static <T> Result<T> error(ErrorCode errorCode) {
        Result<T> result = new Result<T>();
        result.setSuccess(false);
        result.setTime(new Date());
        result.setErrorCode(errorCode.getLabel());
        result.setErrorMsg(errorCode.getValue());
        return result;
    }
}
