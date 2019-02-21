package com.lzh.o2o.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzh.o2o.dao.UserShopMapDao;
import com.lzh.o2o.dto.UserShopMapExecution;
import com.lzh.o2o.entity.UserShopMap;
import com.lzh.o2o.service.UserShopMapService;
import com.lzh.o2o.util.PageCalculator;

@Service
public class UserShopMapServiceImpl implements UserShopMapService {
	@Autowired
	private UserShopMapDao userShopMapDao;

	@Override
	public UserShopMapExecution listUserShopMap(
			UserShopMap userShopMapCondition, int pageIndex, int pageSize) {
		if (userShopMapCondition != null && pageIndex != -1 && pageSize != -1) {
			int beginIndex = PageCalculator.calculateRowIndex(pageIndex,
					pageSize);
			List<UserShopMap> userShopMapList = userShopMapDao
					.queryUserShopMapList(userShopMapCondition, beginIndex,
							pageSize);
			int count = userShopMapDao
					.queryUserShopMapCount(userShopMapCondition);
			UserShopMapExecution ue = new UserShopMapExecution();
			ue.setUserShopMapList(userShopMapList);
			ue.setCount(count);
			return ue;
		} else {
			return null;
		}

	}
}