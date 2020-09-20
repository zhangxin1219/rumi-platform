package cn.edu.njupt.rumi.service;

import cn.edu.njupt.rumi.base.error.BaseException;
import cn.edu.njupt.rumi.base.error.ErrorCode;

/**
 * @author ZhangXin
 * @date 2020/9/20 21:33
 */
public class RumiServiceException extends BaseException {
    public RumiServiceException(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }

    public RumiServiceException(ErrorCode errorCode) {
        super(errorCode);
    }
}
