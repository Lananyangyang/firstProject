package com.rhxt.ic.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rhxt.ic.generic.GenericDao;
import com.rhxt.ic.user.model.TLoginUser;
import com.rhxt.ic.user.model.TLoginUserExample;

public interface TLoginUserMapper extends GenericDao<TLoginUser, String>
{
	int countByExample(TLoginUserExample example);

	int deleteByExample(TLoginUserExample example);

	int insert(TLoginUser record);

	List<TLoginUser> selectByExample(TLoginUserExample example);

	int updateByExampleSelective(@Param("record") TLoginUser record, @Param("example") TLoginUserExample example);

	int updateByExample(@Param("record") TLoginUser record, @Param("example") TLoginUserExample example);

	int updateByPrimaryKey(TLoginUser record);
}