package cn.edu.njupt.rumi.service.impl;

import cd.edu.njupt.rumi.base.dto.OptUserDTO;
import cd.edu.njupt.rumi.base.rpc.Result;
import cn.edu.njupt.rumi.client.service.AccountMgrService;
import cn.edu.njupt.rumi.service.biz.AccountMgrBizService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ZhangXin
 * @date 2020/9/19 15:28
 */
@Slf4j
@Service
public class AccountMgrServiceImpl implements AccountMgrService {
    @Resource
    private AccountMgrBizService accountMgrBizService;

    @Override
    public Result<Void> test(OptUserDTO optUser) {
        log.info("AccountMgrServiceImpl.test@@@{}", optUser);
        accountMgrBizService.test(optUser);
        return Result.success(null);
    }
}
