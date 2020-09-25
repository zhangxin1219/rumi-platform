package cn.edu.njupt.rumi.start;

import cn.edu.njupt.rumi.base.dto.RumiUserDTO;
import cn.edu.njupt.rumi.base.error.BaseException;
import cn.edu.njupt.rumi.base.rpc.Result;
import cn.edu.njupt.rumi.client.service.RumiTestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author ZhangXin
 * @date 2020/9/20 19:07
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RumiTestServiceTest {
    @Resource
    private RumiTestService rumiTestService;

    @Test
    public void test() throws BaseException {
        RumiUserDTO rumiUserDTO = new RumiUserDTO();
        Result<Void> result1 = rumiTestService.testBaseException(rumiUserDTO);
        log.info(result1.toString());

        Result<Boolean> result2 = rumiTestService.testNullPointerException(rumiUserDTO);
        log.info(result2.toString());
    }
}
