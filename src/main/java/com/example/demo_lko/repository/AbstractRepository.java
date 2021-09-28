package com.example.demo_lko.repository;

import com.example.demo_lko.entity.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Date;

@NoRepositoryBean
public interface AbstractRepository<E extends AbstractEntity> extends JpaRepository<E, Integer>, JpaSpecificationExecutor<E> {

    Long countAllByCreatedBetween(Date start, Date end);
}
