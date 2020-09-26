package cn.edu.njupt.rumi.base.nacos;

import cn.edu.njupt.rumi.base.error.BaseException;
import cn.edu.njupt.rumi.base.error.ErrorCode;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executor;

/**
 * @author ZhangXin
 * @date 2020/9/25 21:38
 */
@Slf4j
@Configuration
public class NacosConfig implements InitializingBean {

    @NacosInjected
    private ConfigService configService;

    private static final String DATA_ID = "rumi-platform";

    private static final String GROUP_ID = "DEFAULT_GROUP";

    private static final long TIMEOUT = 5000L;

    private static JSONObject data;

    private static final String PROJECT_NAME_KEY = "projectName";

    private static final String AUTHOR_KEY = "authorName";

    @Override
    public void afterPropertiesSet() {
        try {
            String configInfo = configService.getConfig(DATA_ID, GROUP_ID, TIMEOUT);
            log.info("NacosConfig.afterPropertiesSet@@@{}", configInfo);
            parse(configInfo);
            configService.addListener(DATA_ID, GROUP_ID, new Listener() {
                @Override
                public Executor getExecutor() {
                    return null;
                }

                @Override
                public void receiveConfigInfo(String configInfo) {
                    log.info("NacosConfig.receiveConfigInfo@@@{}", configInfo);
                    parse(configInfo);
                }
            });
        } catch (Exception e) {
            throw new BaseException(ErrorCode.SYSTEM_ERROR);
        }
    }

    private void parse(String configStr) {
        data = JSONObject.parseObject(configStr);
    }

    public static String getProjectName() {
        return data.getString(PROJECT_NAME_KEY);
    }

    public static String getAuthorName() {
        return data.getString(AUTHOR_KEY);
    }
}
