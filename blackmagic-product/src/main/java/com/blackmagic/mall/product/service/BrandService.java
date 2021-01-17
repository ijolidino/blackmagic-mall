package com.blackmagic.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blackmagic.commons.utils.PageUtils;
import com.blackmagic.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author tanfuwen
 * @email 1149864038@qq.com
 * @date 2021-01-10 15:47:14
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

