package com.blackmagic.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blackmagic.commons.utils.PageUtils;
import com.blackmagic.commons.utils.PageUtils;
import com.blackmagic.mall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author tanfuwen
 * @email 1149864038@qq.com
 * @date 2021-01-10 13:31:51
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

