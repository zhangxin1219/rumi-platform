package cn.edu.njupt.rumi.service.biz;

import cd.edu.njupt.rumi.base.dto.OptUserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author ZhangXin
 * @date 2020/9/19 15:49
 */
@Slf4j
@Service
public class AccountMgrBizService {
    public void test(OptUserDTO optUser) {
        log.info("AccountMgrBizService.test@@@{}", optUser);
    }
}
