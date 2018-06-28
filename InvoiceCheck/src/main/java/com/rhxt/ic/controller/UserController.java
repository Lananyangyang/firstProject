package com.rhxt.ic.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.rhxt.ic.generic.GenericController;
import com.rhxt.ic.user.model.TLoginUser;
import com.rhxt.ic.user.service.ITLoginUserService;

/**
 * 
 *
 * @ClassName: UserController
 * @Description: TODO
 * @author gaowang
 * @date 2018年6月13日 上午11:30:16
 *
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends GenericController
{

	@Resource
	private ITLoginUserService tLoginUserService;

	@RequestMapping(value = "/login")
	public ModelAndView login(TLoginUser user)
	{
		ModelAndView model = new ModelAndView();
		String referer = request.getHeader("Referer");
		if (referer == null) {
			model.setViewName("redirect:/index.jsp");
		}
		else {
			// String path = request.getContextPath();
			Object log = session.getAttribute("userInfo");
			if (log != null) {
				model.setViewName("main");
			}
			String name = user.getLoginName();
			String password = user.getPassword();
			if (StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(password)) {
				byte[] b = Base64.encodeBase64(password.getBytes(), true);
				password = new String(b).replaceAll("\r|\n", "");
				; // MTIzNDU2
				List<TLoginUser> list = tLoginUserService.checkLoginName(name);

				if (list.size() == 1 && list.get(0).getPassword().equals(password)) {

					session.setAttribute("userInfo", list.get(0));
					model.setViewName("main");
				}
				else {
					model.setViewName("redirect:/index.jsp");
					session.setAttribute("message", "账号或密码错误");

				}

			}
			else {
				model.setViewName("redirect:/index.jsp");
			}
		}
		return model;
	}

	@RequestMapping(value = "/logout")
	public void logout()
	{
		// ModelAndView model = new ModelAndView();

		session.removeAttribute("userInfo");

	}

	@RequestMapping(value = "/queryUser")
	@ResponseBody
	public List<TLoginUser> queryUser(ModelAndView model)
	{
		model.setViewName("main");
		List<TLoginUser> info = tLoginUserService.selectByExample();

		PageInfo<TLoginUser> pageInfo = new PageInfo<>(info);
		System.out.println(info);
		session.setAttribute("pageHelper", pageInfo);
		return info;

	}

	@RequestMapping(value = "/queryUserById", method = RequestMethod.POST)
	@ResponseBody
	public TLoginUser queryUser(TLoginUser user)
	{
		TLoginUser tLoginUser = tLoginUserService.selectById(user.getId());
		return tLoginUser;
	}

	@RequestMapping(value = "/insertUser")
	public void insertUser(TLoginUser user, Model model)
	{

		List<TLoginUser> list = tLoginUserService.selectByLoginName(user.getLoginName());
		if (list.size() > 0) {

			try {
				response.getWriter().write("2");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return;
		}


		// user.setPassword(DigestUtils.md5Hex(user.getPassword()));

		String password = user.getPassword();
		byte[] b = Base64.encodeBase64(password.getBytes(), true);
		password = new String(b);
		user.setPassword(password);
		user.setId(UUID.randomUUID().toString());
		user.setUserType((short) 0);
		user.setFillDate(new Date());
		int i = tLoginUserService.insert(user);
		if (i > 0) {
			try {
				response.getWriter().write("1");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	@RequestMapping(value = "/deleteUser")
	public void deleteUser(TLoginUser user)
	{
		int i = tLoginUserService.delete(user.getId());
		if (i > 0) {
			try {
				response.getWriter().write("删除成功");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				response.getWriter().write("删除失败");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	
	
	
	
	// updateByPrimaryKey
	// 更改用户
	@RequestMapping(value = "/updateUser")
	public void updateByPrimaryKey(TLoginUser user)
	{
		
		
		TLoginUser loginUser = tLoginUserService.selectById(user.getId());
		
		if(StringUtils.isNotEmpty(user.getLoginName())){
		
		List<TLoginUser> list = tLoginUserService.selectByLoginName(user.getLoginName());
		if (list.size() > 0) {
			String id = list.get(0).getId();
			if (!user.getId().equals(id)) {
				try {
					response.getWriter().write("2");
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				return;
			}

		}
		}
//		TLoginUser loginUser = list.get(0);
		String password = user.getPassword();
		byte[] b = Base64.encodeBase64(password.getBytes(), true);    
        password = new String(b); 
        loginUser.setPassword(password);
		loginUser.setLoginName(user.getLoginName());
        loginUser.setName(user.getName());
        
		int i = tLoginUserService.updateByPrimaryKey(loginUser);
		if (i > 0) {
			try {
				response.getWriter().write("1");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	//重置用户
	@RequestMapping(value="/resetUser")
	public  void resetUser(TLoginUser user){
		
		int i = tLoginUserService.resetUser(user);
		if(i>0){
			
			try {
				response.getWriter().write("重置成功");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	

}
