package kxw07.github.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("kxw07.example")
public class Kxw07Properties {
    private String host;
    private int port;
}
