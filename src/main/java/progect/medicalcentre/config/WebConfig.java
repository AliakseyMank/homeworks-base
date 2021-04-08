package progect.medicalcentre.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Locale;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "progect.medicalcentre")
public class WebConfig implements WebMvcConfigurer {

    @Bean
    ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/res/**").addResourceLocations("/res/");
    }

    @Bean(name = "messageSource")
    public MessageSource getMessageSource(){
        ReloadableResourceBundleMessageSource ret = new ReloadableResourceBundleMessageSource();
        ret.setBasename("classpath:config/messages");
        ret.setCacheSeconds(1);
        ret.setUseCodeAsDefaultMessage(true);
        ret.setDefaultEncoding("utf-8");
        return ret;
    }

    @Bean(name = "localeResolver")
    public SessionLocaleResolver getSessionLocalResolver(){
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(Locale.ENGLISH);
        return localeResolver;
    }

    @Bean(name = "localeIntersaptor")
    public LocaleChangeInterceptor localeChangeInterceptor(){
        LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
        interceptor.setParamName("lang");
        return interceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }
}
