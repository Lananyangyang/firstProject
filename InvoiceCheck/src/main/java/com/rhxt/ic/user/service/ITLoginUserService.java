/**
 * 
 */
package com.rhxt.ic.user.service;

import java.util.List;

import com.rhxt.ic.generic.GenericService;
import com.rhxt.ic.user.model.TLoginUser;

/**
 *
 * @ClassName: ILoginUserService
 * @Description: TODO
 * @author gaowang
 * @date 2018年6月13日 上午11:25:57
 *
 */
public interface ITLoginUserService extends GenericService<TLoginUser, String>
{
	List<TLoginUser> selectByExample();

	List<TLoginUser> checkLoginName(String loginName);

	List<TLoginUser> selectByLoginName(String loginName);

	int updateByPrimaryKey(TLoginUser user);
	
	int resetUser(TLoginUser user);

}
