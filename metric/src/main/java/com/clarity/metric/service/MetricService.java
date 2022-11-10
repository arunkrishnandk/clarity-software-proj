package com.clarity.metric.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.clarity.metric.model.MetricModel;
import com.clarity.metric.model.MetricModelSummary;

@Service
public interface MetricService {

	List<MetricModel> getAllMetricDetails();

	MetricModel getMetricDetails(long id);

	boolean createOrUpdateMetricModel(MetricModel metricModel);

	MetricModelSummary getMetricSummary();

}
