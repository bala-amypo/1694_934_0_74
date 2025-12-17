package com.example.demo.Service.Impl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Student;
import com.example.demo.Repository.Studentrepo;
import com.example.demo.Service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    Studentrepo strepo;
    @Override
    public Student insertStudent(Student st){
        return strepo.save(st);
    }
    @Override
    public List<Student> getAllStudents(){
        return strepo.findAll();
    }
    @Override
    public Optional<Student> getOneStudent(Long id){
        return strepo.findById(id);
    }
    @Override
    public void deleteStudent(Long id){
        strepo.deleteById(id);
    }
}