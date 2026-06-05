package student_management_system.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import student_management_system.entity.Student;
import student_management_system.repository.StudentRepository;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public Student save(Student student){
        return repository.save(student);
    }
}
