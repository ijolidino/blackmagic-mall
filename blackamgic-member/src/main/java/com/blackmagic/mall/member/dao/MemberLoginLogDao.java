package com.blackmagic.mall.member.dao;

import com.blackmagic.mall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author tanfuwen
 * @email 1149864038@qq.com
 * @date 2021-01-10 16:36:44
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
