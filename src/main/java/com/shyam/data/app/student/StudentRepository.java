package com.shyam.data.app.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

/*  @Repository Annotation is a specialization of @Component annotation which is used to indicate that
the class provides the mechanism for storage, retrieval, update, delete and search operation on objects.
 This annotation is a general-purpose stereotype annotation */