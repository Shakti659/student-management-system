package student_management_system.dto;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssignCourseRequest {

    private Long studentId;
    private Long courseId;
}