package com.lzh.o2o.dao;

import java.util.List;

import com.lzh.o2o.entity.Area;

public interface AreaDao {
	/**
	 * 列出地域列表
	 * 
	 * @param areaCondition
	 * @return
	 */
	List<Area> queryArea();

	/**
	 * 插入
	 * @param area
	 * @return
	 */
	int insertArea(Area area);

	/**
	 * 更新
	 * @param area
	 * @return
	 */
	int updateArea(Area area);

	/**
	 * 通过id删除
	 * @param areaId
	 * @return
	 */
	int deleteArea(long areaId);

	/**
	 * 通过id批量删除
	 * @param areaIdList
	 * @return
	 */
	int batchDeleteArea(List<Long> areaIdList);
}
