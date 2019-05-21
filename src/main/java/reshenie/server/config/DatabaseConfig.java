package reshenie.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories("com.reshenie.server.repository")
@EnableTransactionManagement // поддержка транзакций
@PropertySource("dp.properties")
@ComponentScan("reshenie.server")
public class DatabaseConfig {

    // заинжектить объект Environment - будем получать доступ к нашим проперти файлам
    @Resource
    private Environment env;


}
