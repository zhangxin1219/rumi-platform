package cd.edu.njupt.rumi.base.error;

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
    private final String errorCode;

    /**
     * 错误消息
     */
    private final String errorMsg;

    public BaseException(String errorCode, String errorMsg) {
        super();
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BaseException(ErrorCode errorCode) {
        super();
        this.errorCode = errorCode.getLabel();
        this.errorMsg = errorCode.getValue();
    }
}
