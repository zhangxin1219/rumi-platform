package cn.edu.njupt.rumi.base.constant;

import cn.edu.njupt.rumi.base.nacos.NacosConfig;

/**
 * 基础的常量类
 *
 * @author ZhangXin
 * @date 2020/9/25 14:46
 */
public class RumiConstants {

    /**
     * 项目名称
     */
    public static final String PROJECT_NAME = "rumi platform";

    /**
     * 子项目名称前缀
     */
    public static final String SUB_PROJECT_NAME_PREFIX = "rumi";

    /**
     * 项目缓存前缀
     */
    public static final String PROJECT_CACHE_PREFIX = "rumi_cache";

    /**
     * rumi-platform的作者
     */
    public static final String AUTHOR_NAME = NacosConfig.getAuthorName();
}
