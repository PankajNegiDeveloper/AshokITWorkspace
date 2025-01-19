package in.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "in.aop")
public class AppConfig {

}
