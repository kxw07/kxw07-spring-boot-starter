package kxw07.github.starter.kla;

import kxw07.github.starter.stu.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Klass {
    private String name;
    private List<Student> students;

    public Klass(KlassProperties klassProperties) {
        this.name = klassProperties.getName();
        this.students = klassProperties.getStudents();
    }
}
