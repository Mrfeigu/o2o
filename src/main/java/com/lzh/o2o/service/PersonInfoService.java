package com.lzh.o2o.service;

import com.lzh.o2o.dto.PersonInfoExecution;
import com.lzh.o2o.entity.PersonInfo;

public interface PersonInfoService {

	/**
	 * 
	 * @param userId
	 * @return
	 */
	PersonInfo getPersonInfoById(Long userId);

	/**
	 * 
	 * @param personInfoCondition
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	PersonInfoExecution getPersonInfoList(PersonInfo personInfoCondition,
			int pageIndex, int pageSize);

	/**
	 * 
	 * @param personInfo
	 * @return
	 */
	PersonInfoExecution addPersonInfo(PersonInfo personInfo);

	/**
	 * 
	 * @param personInfo
	 * @return
	 */
	PersonInfoExecution modifyPersonInfo(PersonInfo personInfo);

}
