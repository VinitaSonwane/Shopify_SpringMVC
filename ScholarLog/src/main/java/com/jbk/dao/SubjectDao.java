package com.jbk.dao;

import java.util.List;

import com.jbk.entity.Student;
import com.jbk.entity.Subject;

public interface SubjectDao {
    
    String addSubject(Subject subject);

    List<Subject> getAllSubjects();

    Subject getSubjectById(Long id);

    Subject updateSubject(Subject subject);

    String deleteSubject(Long id);
}

