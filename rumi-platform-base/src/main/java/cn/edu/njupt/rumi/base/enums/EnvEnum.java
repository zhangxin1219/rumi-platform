package cn.edu.njupt.rumi.base.enums;

import cn.edu.njupt.rumi.base.dto.PairValueDTO;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * 环境标枚举类
 *
 * @author ZhangXin
 * @date 2020/9/25 14:38
 */
public enum EnvEnum implements BaseEnum {

    /**
     * 日常环境（项目环境）
     */
    DAILY("daily", "日常环境"),

    /**
     * 预发环境
     */
    PRE("pre", "预发环境"),

    /**
     * 生产环境（线上环境）
     */
    PROD("online", "生产环境");

    private final String label;

    private final String value;

    EnvEnum(String label, String value) {
        this.label = label;
        this.value = value;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public List<PairValueDTO> toList() {
        List<PairValueDTO> result = Lists.newArrayList();
        for (EnvEnum environment : EnvEnum.values()) {
            result.add(new PairValueDTO(environment.getLabel(), environment.getValue()));
        }
        return result;
    }
}
