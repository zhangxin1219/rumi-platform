package cd.edu.njupt.rumi.base.dto;

import lombok.Data;

import java.util.List;

/**
 * 分页查询返回对象
 *
 * @author ZhangXin
 * @date 2020/9/20 18:04
 */
@Data
public class PaginationDTO<T> {

    /**
     * 当前页数
     */
    private Long currentPage;

    /**
     * 每页大小
     */
    private Integer pageSize;

    /**
     * 总页数
     */
    private Integer pageCount;

    /**
     * 总大小
     */
    private Integer totalCount;

    /**
     * data
     */
    private List<T> dataList;
}
