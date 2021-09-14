package dev.patika.homework05.controller;

import dev.patika.homework05.dto.CourseDTO;
import dev.patika.homework05.entity.Course;
import dev.patika.homework05.service.CourseService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CourseControllerTest {

    //TODO i will update this after

    @Mock
    CourseService mockCourseService;

    @InjectMocks
    CourseController courseController;

    @Test
    void getCourseById() {
    }

    @Test
    void deleteCourseById() {

        Course course = new Course();
        course.setCourseCode("cs101");
        Optional<Course> expected = Optional.of(course);
        when(mockCourseService.save(course)).thenReturn(course);
    }

    @Test
    void addNewCourse() {

      Course course = new Course();
      course.setCredit(5);
      Optional<Course> expected = Optional.of(course);
      when(mockCourseService.save((CourseDTO) any())).thenReturn(expected);

      CourseDTO courseDTO = new CourseDTO();
      Course actual = this.courseController.addNewCourse(courseDTO).getBody();

      assertAll(
              () -> assertNull(actual),
              () -> assertEquals(expected.get(),actual),
              () -> assertEquals(course.getCredit(),actual.getCredit())
      );

    }
}