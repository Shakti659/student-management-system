package student_management_system.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import student_management_system.entity.Student;
import student_management_system.repository.StudentRepository;
import student_management_system.entity.Course;
import student_management_system.repository.CourseRepository;
import student_management_system.dto.UpdateProfileRequest;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {


    private final StudentRepository repository;
    private final CourseRepository courseRepository;

    public Student save(Student student){
        return repository.save(student);
    }
    public Student assignCourse(Long studentId, Long courseId) {

        Student student = repository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        student.getCourses().add(course);

        return repository.save(student);
    }
    public List<Student> searchStudents(String name) {

        return repository
                .findByNameContainingIgnoreCase(name);
    }
    public Student updateProfile(
            Long studentId,
            UpdateProfileRequest request) {

        Student student = repository.findById(studentId)
                .orElseThrow(() ->
                        new RuntimeException("Student not found"));

        student.setEmail(request.getEmail());
        student.setMobileNumber(request.getMobileNumber());
        student.setFatherName(request.getFatherName());
        student.setMotherName(request.getMotherName());

        return repository.save(student);
    }
}

