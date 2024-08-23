package com.jbk.service;

import java.util.List;

import com.jbk.entity.Subject;

public interface SubjectService {
    String addSubject(Subject subject);
    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
    Subject updateSubject(Subject subject);
    String deleteSubject(Long id);
}
