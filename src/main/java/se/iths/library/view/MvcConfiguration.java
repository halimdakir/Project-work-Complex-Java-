package se.iths.library.view;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfiguration implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/home.xhtml");
        registry.addViewController("/home").setViewName("forward:/home.xhtml");
        registry.addViewController("/admin").setViewName("forward:/admin.xhtml");
        registry.addViewController("/registerAdmin").setViewName("forward:/registerAdmin.xhtml");
        registry.addViewController("/user").setViewName("forward:/user.xhtml");
        registry.addViewController("/userInfo").setViewName("forward:/userInfo.xhtml");
        registry.addViewController("/info").setViewName("forward:/info.xhtml");
        registry.addViewController("/users").setViewName("forward:/users.xhtml");
        registry.addViewController("/item").setViewName("forward:/item.xhtml");
        registry.addViewController("/login").setViewName("forward:/login.xhtml");
        registry.addViewController("/register").setViewName("forward:/register.xhtml");
        registry.addViewController("/connect").setViewName("forward:/connect.xhtml");
        registry.addViewController("/reserve").setViewName("forward:/reserve.xhtml");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

}
