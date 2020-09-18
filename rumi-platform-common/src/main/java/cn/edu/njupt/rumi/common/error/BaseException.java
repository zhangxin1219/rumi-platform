package cn.edu.njupt.rumi.common.error;

/**
 * 异常基类
 *
 * @author ZhangXin
 * @date 2020/9/18 15:12
 */
public class BaseException extends Exception {
    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误消息
     */
    private String errorMsg;



    public BaseException(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

}
