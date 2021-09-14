package dev.patika.homework05.service;

import dev.patika.homework05.dto.CourseDTO;
import dev.patika.homework05.entity.Course;
import dev.patika.homework05.mappers.CourseMapper;
import dev.patika.homework05.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CourseServiceTest {

    //TODO i will update this after

    @Mock
    CourseRepository mockCourseRepository;

    @Mock
    CourseMapper mockCourseMapper;

    @InjectMocks
    CourseService courseService;

    //TODO i will update this after
    @Test
    void save() {
      // Course course = new Course();
      // course.setId(1L);
      // when(mockCourseRepository.existsById(anyLong())).thenReturn(Boolean.FALSE);
      // when(mockCourseRepository.save(course)).thenReturn(course);

      // CourseDTO dto = new CourseDTO();
      // Course actual = this.courseService.save(dto).get();

      // assertAll(
      //         () -> assertNotNull(actual),
      //         () -> assertEquals(course.getId(),actual.getId())
      // );
    }

}