package cn.edu.njupt.rumi.base.dto;

import lombok.Data;

/**
 * 操作人DTO
 *
 * @author ZhangXin
 * @date 2020/9/19 10:48
 */
@Data
public class RumiUserDTO {

    /**
     * id
     */
    private Long userId;

    /**
     * name
     */
    private Long userName;

    /**
     * buId
     */
    private Long buId;

    /**
     * 部门id
     */
    private Long depId;
}
