package com.lzh.o2o.dao;

import java.util.List;

import com.lzh.o2o.entity.ProductImg;

/**
 * 产品图片
 * @author pda
 *
 */
public interface ProductImgDao {

	List<ProductImg> queryProductImgList(long productId);

	int batchInsertProductImg(List<ProductImg> productImgList);

	int deleteProductImgByProductId(long productId);
}
