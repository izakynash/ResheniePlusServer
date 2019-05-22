package reshenie.server;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Annotation;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import reshenie.server.config.WebConfig;
import reshenie.server.repository.BookRepository;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer implements WebApplicationInitializer {

    private final static String DISPATCHER = "dispatcher";

    // выполнить какие-то действия перед и во время деплоинга СервлетКонтекста
    public void onStartup(ServletContext servletContext) throws ServletException {
        // создать контекст:
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        // регистрируем веб конфиг
        ctx.register(WebConfig.class);
        // регистрируем контекст в наш сервлетКонтекст:
        servletContext.addListener(new ContextLoaderListener(ctx));

        // добавим в диспетчер сервлетов наш сервлет контекст и замаппим его на опред url
        ServletRegistration.Dynamic servlet = servletContext.addServlet(DISPATCHER, new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1); // порядок инициализации нашего сервлета

    }

}
