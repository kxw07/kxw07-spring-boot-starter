package kxw07.github.starter.sch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(School.class)
@EnableConfigurationProperties(SchoolProperties.class)
public class SchoolAutoConfigure {

    @Autowired
    private SchoolProperties schoolProperties;

    @Bean
    @ConditionalOnMissingBean(School.class)
    @ConditionalOnProperty(prefix = "kxw07.example.school", value = "enabled", havingValue = "true")
    School school() {
        return new School(this.schoolProperties);
    }
}
