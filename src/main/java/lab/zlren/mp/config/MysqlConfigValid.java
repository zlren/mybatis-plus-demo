package lab.zlren.mp.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zlren
 * @date 2017-11-13
 */
@Component
public class MysqlConfigValid {

    @Value("${spring.datasource.driver-class-name}")
    @Getter
    private String driverClassName;

    @Value("${spring.datasource.url}")
    @Getter
    private String url;

    @Value("${spring.datasource.username}")
    @Getter
    private String username;

    @Value("${spring.datasource.password}")
    @Getter
    private String password;
}
