package com.InjuryEvaluation.dao;

import java.util.List;

import com.InjuryEvaluation.entity.City;
import com.InjuryEvaluation.entity.Position;

public interface CityInfoMapper {
   public City getCityInfo(String lng,String lat);
   public List<Position> getPositionInfo();
}
