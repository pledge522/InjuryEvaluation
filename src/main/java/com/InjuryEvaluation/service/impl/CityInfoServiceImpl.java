package com.InjuryEvaluation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InjuryEvaluation.dao.CityInfoMapper;
import com.InjuryEvaluation.entity.City;
import com.InjuryEvaluation.entity.CityReturn;
import com.InjuryEvaluation.entity.Position;
import com.InjuryEvaluation.entity.PositionListReturn;
import com.InjuryEvaluation.service.CityInfoService;
@Service
public class CityInfoServiceImpl implements CityInfoService{
	@Autowired
	CityInfoMapper citymapper;
	public CityReturn getInfoByPosition(String lng, String lat) {
		City cityinfo=citymapper.getCityInfo(lng, lat);
		CityReturn result=new CityReturn();
		if(cityinfo!=null)
			result.setStatus(0);
		else 
			result.setStatus(1);
		result.setData(cityinfo);
		
		return result;
	}
	public PositionListReturn getPositionList() {
		PositionListReturn result=new PositionListReturn();
		List<Position> list=citymapper.getPositionInfo();
		if(list.size()!=0)
			result.setStatus(0);
		else
			result.setStatus(1);
		result.setData(list);
		
		return result;
	}

}
