package cn.edu.njupt.rumi.base.error;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 异常基类
 *
 * @author ZhangXin
 * @date 2020/9/18 15:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseException extends RuntimeException {
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
