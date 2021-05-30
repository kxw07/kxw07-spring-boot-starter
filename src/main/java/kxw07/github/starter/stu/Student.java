package kxw07.github.starter.stu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private String id;
    private String name;

    public Student(StudentProperties studentProperties) {
        this.id = studentProperties.getId();
        this.name = studentProperties.getName();
    }
}
