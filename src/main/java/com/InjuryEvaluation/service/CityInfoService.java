package com.InjuryEvaluation.service;

import com.InjuryEvaluation.entity.CityReturn;
import com.InjuryEvaluation.entity.PositionListReturn;

public interface CityInfoService {
	public CityReturn getInfoByPosition(String lng,String lat);
	public PositionListReturn getPositionList();
}
