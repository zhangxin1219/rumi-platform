package cn.edu.njupt.rumi.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 *
 * @author ZhangXin
 * @date 2020/9/19 10:48
 */
@ComponentScan({
        "cn.edu.njupt.rumi.base",
        "cn.edu.njupt.rumi.client",
        "cn.edu.njupt.rumi.service"})
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

}
