package kxw07.github.starter.kla;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("kxw07.example.klass")
public class KlassProperties {
    private String name;
}
