package com.InjuryEvaluation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.InjuryEvaluation.dao.CityInfoMapper;
import com.InjuryEvaluation.entity.City;
import com.InjuryEvaluation.entity.CityReturn;
import com.InjuryEvaluation.entity.PositionListReturn;
import com.InjuryEvaluation.service.CityInfoService;


@Controller
@RequestMapping("/CityInfo")
public class CityInfoController {
	@Autowired
	CityInfoMapper citymapper;
	@Autowired
	private CityInfoService cityInfoService;
@RequestMapping(value = "/getPositionInfo", method = RequestMethod.GET)
@ResponseBody
public CityReturn getPositionInfo(@RequestParam(value="lng") String lng,@RequestParam(value="lat") String lat)
{
	return cityInfoService.getInfoByPosition(lng, lat);
}
@RequestMapping(value = "/getAllEarthQuakeCityPosition", method = RequestMethod.GET)
@ResponseBody
public PositionListReturn getPositionList()
{
	
	return cityInfoService.getPositionList();
}
}
