package cn.edu.njupt.rumi.base.error;

import cn.edu.njupt.rumi.base.rpc.Result;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 异常捕捉切面
 *
 * @author ZhangXin
 * @date 2020/9/20 18:32
 */
@Component
@Aspect
@Slf4j
public class AccessableAspect {

    @Pointcut("@within(cn.edu.njupt.rumi.base.error.Accessable)")
    private void pointcut() {
    }

    @SuppressWarnings("unchecked")
    @Around("pointcut()")
    public Result<Void> process(ProceedingJoinPoint proceedingJoinPoint) {
        Result<Void> result;
        try {
            result = (Result<Void>) proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            if (throwable instanceof BaseException) {
                BaseException baseException = (BaseException) throwable;
                result = Result.error(baseException.getErrorCode(), baseException.getErrorMsg());
            } else {
                result = Result.error(ErrorCode.SYSTEM_ERROR);
            }
            log.error("", throwable);
        }
        return result;
    }
}
