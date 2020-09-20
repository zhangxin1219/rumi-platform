package cn.edu.njupt.rumi.base.dto;

import lombok.Data;

/**
 * 键值对
 *
 * @author ZhangXin
 * @date 2020/9/19 10:51
 */
@Data
public class PairValueDTO {

    /**
     * label
     */
    private String label;

    /**
     * value
     */
    private String value;

    public PairValueDTO(String label, String value) {
        this.label = label;
        this.value = value;
    }
}
