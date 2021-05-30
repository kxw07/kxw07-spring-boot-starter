package kxw07.github.starter.stu;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("kxw07.example.student")
public class StudentProperties {
    private String id;
    private String name;
}
