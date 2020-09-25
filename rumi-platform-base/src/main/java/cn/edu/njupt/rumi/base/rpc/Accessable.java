package cn.edu.njupt.rumi.base.rpc;

/**
 * 异常捕捉
 *
 * @author ZhangXin
 * @date 2020/9/20 18:19
 */
public @interface Accessable {

    /**
     * 返回打印日志的logName
     *
     * @return 打印日志的logName
     */
    String value();
}
