package com.clarity.metric.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clarity.metric.dao.MetricDao;
import com.clarity.metric.entity.Metric;
import com.clarity.metric.model.MetricModel;
import com.clarity.metric.model.MetricModelSummary;
import com.clarity.metric.service.MetricService;

@Service
public class MetricServiceImpl implements MetricService{
	
	@Autowired
	MetricDao metricDaoImpl;

	@Override
	public List<MetricModel> getAllMetricDetails() {
		List<MetricModel> metricModels = new ArrayList<>();
		metricDaoImpl.findAll().forEach(metric -> {
			metricModels.add(mapMetricEnityToModel(metric));
		});
		
		return metricModels;
	}

	
	@Override
	public MetricModel getMetricDetails(long id) {
		Optional<Metric> metricEntity = metricDaoImpl.findById(id);
		return mapMetricEnityToModel(metricEntity.get());
	}

	@Override
	public boolean createOrUpdateMetricModel(MetricModel metricModel) {
		if( null != metricModel) {
			Metric metricEntity = null;
			if(null != metricModel.getId()) {
				metricEntity = metricDaoImpl.findById(Long.valueOf( metricModel.getId())).get();
			} else {
				metricEntity = new Metric();
			}
			metricEntity.setName(metricModel.getName());
			metricEntity.setSystem(metricModel.getSystem());
//			metricEntity.setVaalue(null == metricModel.getValue()? null);
			metricDaoImpl.save(metricEntity);
			return true;
		}
		return false;
	}


	@Override
	public MetricModelSummary getMetricSummary() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private MetricModel mapMetricEnityToModel(Metric metricEntity) {
		MetricModel metricModel = null;
		if(null != metricEntity) {
			metricModel = new MetricModel();
			metricModel.setId(metricEntity.getId());
			metricModel.setName(metricEntity.getName());
			metricModel.setSystem(metricEntity.getSystem());
//			metricModel.setDate(metricEntity.getDate());
		}
		return metricModel;
	}
	

}
