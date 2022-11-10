package com.clarity.metric.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clarity.metric.model.MetricModel;
import com.clarity.metric.model.MetricModelSummary;
import com.clarity.metric.service.MetricService;

@RestController
//@RequestMapping("metrics")
public class MetricController {

	@Autowired
	MetricService metricServiceImpl;

	@GetMapping(value = "/metrics")
	public List<MetricModel> getAllMetricDetails() {
		
		return metricServiceImpl.getAllMetricDetails();

	}
	
	@GetMapping(value = "/metrics/{id}")
	public MetricModel getMetricDetails(@PathVariable int id) {
		
		return metricServiceImpl.getMetricDetails(id);

	}
	
	@PostMapping(value = "/metrics")
	public boolean createMetric(@RequestBody MetricModel metricModel) {
		
		return metricServiceImpl.createOrUpdateMetricModel(metricModel);

	}
	
	@PutMapping(value = "/metrics/{id}")
	public boolean updateMetric(@RequestBody MetricModel metricModel) {
		
		return metricServiceImpl.createOrUpdateMetricModel(metricModel);

	}
	
	@GetMapping(value = "/metricsSummary")
	public MetricModelSummary getMetricSummary() {
		
		return metricServiceImpl.getMetricSummary();

	}
	
}
