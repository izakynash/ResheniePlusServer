package reshenie.server.config.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration // класс является конфигурацией, его нужно выполнить перед деплойингом контекста спринга
@EnableWebMvc // включить режим веб мвс (возм исп контроллеры)
@ComponentScan("reshenie.server.config") // укажет, где искать все наши "бины" - классы, компоненты, сервисы, репозитории

public class WebConfig extends WebMvcConfigurationSupport {
}
