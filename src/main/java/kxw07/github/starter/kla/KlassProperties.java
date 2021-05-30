package kxw07.github.starter.kla;

import kxw07.github.starter.stu.Student;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties("kxw07.example.klass")
public class KlassProperties {
    private String name;
    private List<Student> students;
}
