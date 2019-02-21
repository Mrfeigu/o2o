package com.lzh.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lzh.o2o.entity.Award;

public interface AwardDao {
	/**
	 * 查询奖品
	 * @param awardCondition
	 * @param rowIndex
	 * @param pageSize
	 * @return
	 */
	List<Award> queryAwardList(@Param("awardCondition") Award awardCondition,
			@Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

	/**
	 * 查询奖品数量
	 * @param awardCondition
	 * @return
	 */
	int queryAwardCount(@Param("awardCondition") Award awardCondition);

	/**
	 * 通过奖品id查询奖品
	 * @param awardId
	 * @return
	 */
	Award queryAwardByAwardId(long awardId);
	
	/**
	 * 插入奖品
	 * @param award
	 * @return
	 */
	int insertAward(Award award);

	/**
	 * 更新奖品
	 * @param award
	 * @return
	 */
	int updateAward(Award award);

	/**
	 * 通过奖品id更新奖品
	 * @param awardId
	 * @return
	 */
	int deleteAward(long awardId);
}
