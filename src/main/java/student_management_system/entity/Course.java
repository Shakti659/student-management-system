package student_management_system.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;

    private String description;

    private String courseType;

    private Integer duration;

    private String topics;



    @JsonIgnore
    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;
}