package com.blackmagic.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blackmagic.commons.utils.PageUtils;
import com.blackmagic.mall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author tanfuwen
 * @email 1149864038@qq.com
 * @date 2021-01-10 15:47:14
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveDetail(CategoryBrandRelationEntity categoryBrandRelation);

    void updateBrand(Long brandId, String name);

    void updateCategory(Long catId, String name);
}

