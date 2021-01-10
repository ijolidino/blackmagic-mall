package com.blackmagic.mall.member.dao;

import com.blackmagic.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tanfuwen
 * @email 1149864038@qq.com
 * @date 2021-01-10 16:36:44
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
