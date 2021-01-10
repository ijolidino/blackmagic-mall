package com.blackmagic.mall.order.dao;

import com.blackmagic.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author tanfuwen
 * @email 1149864038@qq.com
 * @date 2021-01-10 16:54:04
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
