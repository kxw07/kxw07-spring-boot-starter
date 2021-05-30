package kxw07.github.starter.sch;

import kxw07.github.starter.kla.Klass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class School {
    private String name;
    private List<Klass> klasses;

    public School(SchoolProperties schoolProperties) {
        this.name = schoolProperties.getName();
        this.klasses = schoolProperties.getKlasses();
    }
}
