package cd.edu.njupt.rumi.base.dto;

import lombok.Data;

/**
 * 分页查询对象
 *
 * @author ZhangXin
 * @date 2020/9/20 17:54
 */
@Data
public class PageQueryDTO<T> {

    /**
     * 查询页数
     */
    private Long queryPage;

    /**
     * 每页大小
     */
    private Integer pageSize;
}
