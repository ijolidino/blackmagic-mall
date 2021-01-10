package com.blackmagic.mall.order.dao;

import com.blackmagic.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author tanfuwen
 * @email 1149864038@qq.com
 * @date 2021-01-10 16:54:03
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
