package cd.edu.njupt.rumi.base.enums;

import cd.edu.njupt.rumi.base.dto.PairValueDTO;

import java.util.List;

/**
 * 枚举接口
 *
 * @author ZhangXin
 * @date 2020/9/18 15:11
 */
public interface BaseEnum {

    /**
     * 获取label
     *
     * @return label
     */
    String getLabel();

    /**
     * 返回value
     *
     * @return value
     */
    String getValue();

    /**
     * 返回所有枚举项
     * @return 枚举项键值对
     */
    List<PairValueDTO> toList();
}
