package com.jbk.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jbk.dao.StudentDao;
import com.jbk.dao.SubjectDao;
import com.jbk.entity.Subject;

@Service
public class SubjectServiceImpl implements SubjectService {

	  @Autowired
	    private SubjectDao dao;

    @Override
    public String addSubject(Subject subject) {
        return dao.addSubject(subject);
    }

    @Override
    public List<Subject> getAllSubjects() {
        return dao.getAllSubjects();
    }

    @Override
    public Subject getSubjectById(Long id) {
        return dao.getSubjectById(id);
    }

    @Override
    public Subject updateSubject(Subject subject) {
        return dao.updateSubject(subject);
    }


    @Override
    public String deleteSubject(Long id) {
        return dao.deleteSubject(id);
    }
}
