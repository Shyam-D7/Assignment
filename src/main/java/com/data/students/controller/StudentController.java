package com.data.students.controller;

import com.data.students.Student;
import com.data.students.exception.StudentNotFoundException;
import com.data.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("")
    public List<Student> displayAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Student displayStudentDetailsWithGivenId(@PathVariable Long id){
        Optional<Student> studentDetails = studentRepository.findById(id);
        if (studentDetails.isPresent()) {
            return studentDetails.get();
        }
        else{
            throw new StudentNotFoundException("id-" + id);
        }
    }

    @PostMapping("")
    public @ResponseBody String createNewStudent(@RequestBody Student newStudentDetails){
        studentRepository.save(newStudentDetails);

        return "new student with id :"+ newStudentDetails.getId() +"has been added to the database";
    }

    @PutMapping("/{id}")
    public @ResponseBody String updatingTheStudentDetailsForTheGivenId(@PathVariable Long id ,@RequestBody Student updatedStudentDetails ){
        Optional<Student> studentOptional = studentRepository.findById(id);
        if(studentOptional.isPresent()){
            updatedStudentDetails.setId(id);
            studentRepository.save(updatedStudentDetails);
            return "Student details with the student id: "+ updatedStudentDetails.getId()+ "has been updated successfully";
        }
        else{
            return "There is no student present with the id: " + id;
        }
    }

    @DeleteMapping("/{id}")
    public @ResponseBody String deleteStudentById(@PathVariable Long id){
        Optional<Student> studentOptional = studentRepository.findById(id);
        if(studentOptional.isPresent()){
            studentRepository.deleteById(id);
            return "student details with the id: "+id +"has been deleted successfully";
        }
        else{
            return "There is no student with the id: "+ id +"in the database";
        }
    }

}
