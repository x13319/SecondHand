package com.cn.xu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.cn.xu.pojo.User;
import com.cn.xu.service.IUserService;

@Controller  
@Scope("prototype")
@RequestMapping("/user") 
public class UserController {
	public final static String KEY = "data";
	public final static String RESULT = "json";
	
	@Resource  
    private IUserService userService;  
      
    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "showUser";
    }
    
    /**
	 * ����api�ӿ�
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "test")
	public String test(Model model) {
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("a", "�۹�������");
		jsonObject.put("b", "Ŷ�ǺǺǣ�");
		model.addAttribute(KEY, jsonObject.toString());
		return RESULT;
	}

}
