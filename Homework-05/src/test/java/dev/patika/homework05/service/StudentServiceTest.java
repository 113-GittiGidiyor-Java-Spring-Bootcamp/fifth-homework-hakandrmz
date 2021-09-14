package dev.patika.homework05.service;

import dev.patika.homework05.entity.Student;
import dev.patika.homework05.mappers.StudentMapper;
import dev.patika.homework05.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

    @Mock
    StudentRepository mockStudentRepository;

    @Mock
    StudentMapper studentMapper;

    @Mock
    StudentService studentService;

    //TODO i will update this after
    @Test
    void save() {

    }

    //TODO i will update this after
    @Test
    void update() {
    }
}