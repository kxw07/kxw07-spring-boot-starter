package kxw07.github.starter.kla;

import kxw07.github.starter.stu.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(Student.class)
@ConditionalOnClass(Klass.class)
@EnableConfigurationProperties(KlassProperties.class)
public class KlassAutoConfigure {

    @Autowired
    private KlassProperties klassProperties;

    @Bean
    @ConditionalOnMissingBean(Klass.class)
    @ConditionalOnProperty(prefix = "kxw07.example.klass", value = "enabled", havingValue = "true")
    Klass klass() {
        return new Klass(this.klassProperties);
    }
}
