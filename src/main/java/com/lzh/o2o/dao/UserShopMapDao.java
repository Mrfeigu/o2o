package com.lzh.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lzh.o2o.entity.UserShopMap;


/**
 * 用户与商店关系表
 * @author pda
 *
 */
public interface UserShopMapDao {
	/**
	 * 
	 * @param userShopCondition
	 * @param rowIndex
	 * @param pageSize
	 * @return
	 */
	List<UserShopMap> queryUserShopMapList(
			@Param("userShopCondition") UserShopMap userShopCondition,
			@Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

	UserShopMap queryUserShopMap(@Param("userId") long userId,
			@Param("shopId") long shopId);

	/**
	 * 
	 * @param userShopCondition
	 * @return
	 */
	int queryUserShopMapCount(
			@Param("userShopCondition") UserShopMap userShopCondition);

	/**
	 * 
	 * @param userShopMap
	 * @return
	 */
	int insertUserShopMap(UserShopMap userShopMap);

	/**
	 * 
	 * @param userShopMap
	 * @return
	 */
	int updateUserShopMapPoint(UserShopMap userShopMap);

}
