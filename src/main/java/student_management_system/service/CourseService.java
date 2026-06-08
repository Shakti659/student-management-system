package student_management_system.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import student_management_system.entity.Course;
import student_management_system.repository.CourseRepository;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository repository;

    public Course save(Course course){
        return repository.save(course);
    }
}
