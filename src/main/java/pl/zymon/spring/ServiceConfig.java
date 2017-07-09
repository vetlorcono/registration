package pl.zymon.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"pl.zymon.service"})
public class ServiceConfig {
}
