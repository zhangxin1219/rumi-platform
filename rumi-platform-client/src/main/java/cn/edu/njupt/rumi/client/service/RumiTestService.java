package cn.edu.njupt.rumi.client.service;

import cn.edu.njupt.rumi.base.dto.RumiUserDTO;
import cn.edu.njupt.rumi.base.rpc.Result;

/**
 * @author ZhangXin
 * @date 2020/9/19 15:25
 */
public interface RumiTestService {

    /**
     * 测试
     *
     * @param rumiUser 操作者
     * @return void
     */
    Result<Void> testBaseException(RumiUserDTO rumiUser);

    /**
     * 测试空指针异常
     *
     * @param rumiUser 操作者
     * @return boolean
     */
    Result<Boolean> testNullPointerException(RumiUserDTO rumiUser);
}
