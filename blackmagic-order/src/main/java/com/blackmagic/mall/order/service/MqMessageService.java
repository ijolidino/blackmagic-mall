package com.blackmagic.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blackmagic.commons.utils.PageUtils;
import com.blackmagic.mall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author tanfuwen
 * @email 1149864038@qq.com
 * @date 2021-01-10 16:54:03
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

