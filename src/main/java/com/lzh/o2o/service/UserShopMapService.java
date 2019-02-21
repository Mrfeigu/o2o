package com.lzh.o2o.service;

import com.lzh.o2o.dto.UserShopMapExecution;
import com.lzh.o2o.entity.UserShopMap;

public interface UserShopMapService {

	UserShopMapExecution listUserShopMap(UserShopMap userShopMapCondition,
			int pageIndex, int pageSize);

}
