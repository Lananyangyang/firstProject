/**
 * 
 */
package com.rhxt.ic.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.rhxt.ic.generic.GenericDao;
import com.rhxt.ic.generic.GenericServiceImpl;
import com.rhxt.ic.user.dao.TLoginUserMapper;
import com.rhxt.ic.user.model.TLoginUser;
import com.rhxt.ic.user.model.TLoginUserExample;
import com.rhxt.ic.user.model.TLoginUserExample.Criteria;
import com.rhxt.ic.user.service.ITLoginUserService;

/**
 *
 * @ClassName: TLoginUserServiceImpl
 * @Description: TODO
 * @author gaowang
 * @date 2018年6月13日 上午11:27:55
 *
 */
@Service
public class TLoginUserServiceImpl extends GenericServiceImpl<TLoginUser, String> implements ITLoginUserService
{

	@Resource
	private TLoginUserMapper tLoginUserMapper;

	@Override
	public GenericDao<TLoginUser, String> getDao()
	{
		return tLoginUserMapper;
	}

	@Override
	public List<TLoginUser> selectByExample()
	{
		TLoginUserExample example = new TLoginUserExample();
		PageHelper.startPage(1, 13);
		List<TLoginUser> list = tLoginUserMapper.selectByExample(example);

		for (TLoginUser tLoginUser : list) {
			byte[] b1 = Base64.decodeBase64(tLoginUser.getPassword());
			String password = new String(b1);
			tLoginUser.setPassword(password);
		}

		return list;
	}

	@Override
	public List<TLoginUser> checkLoginName(String name)
	{

		TLoginUserExample example = new TLoginUserExample();
		Criteria criteria = example.createCriteria();
		if (StringUtils.isNotEmpty(name)) {

			criteria.andLoginNameEqualTo(name);
		}

		List<TLoginUser> list = tLoginUserMapper.selectByExample(example);

		return list;
	}

	@Override
	public List<TLoginUser> selectByLoginName(String loginName)
	{
		TLoginUserExample example = new TLoginUserExample();
		Criteria criteria = example.createCriteria();
		if (StringUtils.isNotEmpty(loginName)) {

			criteria.andLoginNameEqualTo(loginName);
		}
		List<TLoginUser> list = tLoginUserMapper.selectByExample(example);
		return list;
	}

	@Override
	public int updateByPrimaryKey(TLoginUser user)
	{

		int i = tLoginUserMapper.updateByPrimaryKeySelective(user);

		return i;
	}

	@Override
	public int resetUser(TLoginUser user) {
		TLoginUser tLoginUser = tLoginUserMapper.selectByPrimaryKey(user.getId());
		int i =0;
		if(tLoginUser != null){
			byte[] base64 = Base64.encodeBase64("123456".getBytes(),true);
			tLoginUser.setPassword(new String(base64));
			i = tLoginUserMapper.updateByPrimaryKey(tLoginUser);
			
		}
		
		return i;
		
		
	}
	
	
	

}
