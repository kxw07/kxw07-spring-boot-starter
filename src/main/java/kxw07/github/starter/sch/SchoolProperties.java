package kxw07.github.starter.sch;

import kxw07.github.starter.kla.Klass;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties("kxw07.example.school")
public class SchoolProperties {
    private String name;
    private List<Klass> klasses;
}
