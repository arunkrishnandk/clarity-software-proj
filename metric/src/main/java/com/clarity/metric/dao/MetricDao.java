package com.clarity.metric.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clarity.metric.entity.Metric;

@Repository
public interface MetricDao extends CrudRepository<Metric, Long> {

}
