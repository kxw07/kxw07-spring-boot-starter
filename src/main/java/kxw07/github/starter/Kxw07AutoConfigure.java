package kxw07.github.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Kxw07Service.class)
@EnableConfigurationProperties(Kxw07Properties.class)
public class Kxw07AutoConfigure {

    @Autowired
    private Kxw07Properties kxw07Properties;

    @Bean
    @ConditionalOnMissingBean(Kxw07Service.class)
    @ConditionalOnProperty(prefix = "kxw07.example", value = "enabled", havingValue = "true")
    Kxw07Service kxwService() {
        return new Kxw07Service(kxw07Properties);
    }
}
