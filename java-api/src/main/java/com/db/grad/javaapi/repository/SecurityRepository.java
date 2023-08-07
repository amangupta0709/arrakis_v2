package com.db.grad.javaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.grad.javaapi.model.Security;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface SecurityRepository extends JpaRepository<Security,Long> {

    List<Security> findAllByMaturityDateBetween(Date start, Date end);

   
}
