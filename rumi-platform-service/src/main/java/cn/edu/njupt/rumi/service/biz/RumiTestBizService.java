package cn.edu.njupt.rumi.service.biz;

import cn.edu.njupt.rumi.base.dto.OptUserDTO;
import cn.edu.njupt.rumi.service.RumiServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author ZhangXin
 * @date 2020/9/19 15:49
 */
@Slf4j
@Service
public class RumiTestBizService {
    public void testRumiServiceException(OptUserDTO optUser) {
        log.info("RumiTestBizService.testRumiServiceException@@@{}", optUser);
        throw new RumiServiceException("test_error", "测试错误");
    }

    public boolean testNullPointerException(OptUserDTO optUser) {
        log.info("RumiTestBizService.testNullPointerException@@@{}", optUser);
        throw new NullPointerException();
    }
}
