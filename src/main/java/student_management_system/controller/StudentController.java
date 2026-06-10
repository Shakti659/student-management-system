package student_management_system.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import student_management_system.entity.Student;
import student_management_system.service.StudentService;
import student_management_system.dto.AssignCourseRequest;
import student_management_system.dto.UpdateProfileRequest;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    public Student create(
            @RequestBody Student student){

        return service.save(student);
    }
    @PostMapping("/assign-course")
    public Student assignCourse(
            @RequestBody AssignCourseRequest request) {

        return service.assignCourse(
                request.getStudentId(),
                request.getCourseId());
    }
    @GetMapping("/search")
    public List<Student> searchStudents(
            @RequestParam String name) {

        return service.searchStudents(name);
    }
    @PutMapping("/{studentId}/profile")
    public Student updateProfile(
            @PathVariable Long studentId,
            @RequestBody UpdateProfileRequest request) {

        return service.updateProfile(
                studentId,
                request);
    }
}
