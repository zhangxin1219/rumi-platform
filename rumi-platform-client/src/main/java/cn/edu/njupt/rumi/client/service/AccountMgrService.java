package cn.edu.njupt.rumi.client.service;

import cd.edu.njupt.rumi.base.dto.OptUserDTO;
import cd.edu.njupt.rumi.base.rpc.Result;

/**
 * @author ZhangXin
 * @date 2020/9/19 15:25
 */
public interface AccountMgrService {

    /**
     * 测试
     *
     * @param optUser 操作者
     * @return void
     */
    Result<Void> test(OptUserDTO optUser);
}
