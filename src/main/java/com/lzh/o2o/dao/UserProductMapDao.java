package com.lzh.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lzh.o2o.entity.UserProductMap;


/**
 * 用户与商品对应表（相当于订单表）
 * @author pda
 *
 */
public interface UserProductMapDao {
	/**
	 * 
	 * @param userProductCondition
	 * @param rowIndex
	 * @param pageSize
	 * @return
	 */
	List<UserProductMap> queryUserProductMapList(
			@Param("userProductCondition") UserProductMap userProductCondition,
			@Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

	/**
	 * 
	 * @param userProductCondition
	 * @return
	 */
	int queryUserProductMapCount(
			@Param("userProductCondition") UserProductMap userProductCondition);

	/**
	 * 
	 * @param userProductMap
	 * @return
	 */
	int insertUserProductMap(UserProductMap userProductMap);
}
