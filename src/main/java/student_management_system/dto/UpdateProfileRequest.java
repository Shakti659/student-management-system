package student_management_system.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateProfileRequest {

    private String email;

    private String mobileNumber;

    private String fatherName;

    private String motherName;
}
