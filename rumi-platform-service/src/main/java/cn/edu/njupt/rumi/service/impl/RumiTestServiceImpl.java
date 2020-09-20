package cn.edu.njupt.rumi.service.impl;

import cn.edu.njupt.rumi.base.dto.OptUserDTO;
import cn.edu.njupt.rumi.base.error.Accessable;
import cn.edu.njupt.rumi.base.rpc.Result;
import cn.edu.njupt.rumi.client.service.RumiTestService;
import cn.edu.njupt.rumi.service.biz.RumiTestBizService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ZhangXin
 * @date 2020/9/19 15:28
 */
@Slf4j
@Accessable("rumi")
@Service
public class RumiTestServiceImpl implements RumiTestService {
    @Resource
    private RumiTestBizService rumiTestBizService;

    @Override
    public Result<Void> testBaseException(OptUserDTO optUser) {
        log.info("RumiTestServiceImpl.testRumiServiceException@@@{}", optUser);
        rumiTestBizService.testRumiServiceException(optUser);
        return Result.success(null);
    }

    @Override
    public Result<Boolean> testNullPointerException(OptUserDTO optUser) {
        log.info("RumiTestServiceImpl.testNullPointerException@@@{}", optUser);
        rumiTestBizService.testNullPointerException(optUser);
        return Result.success(true);
    }
}
