package com.manage.common.base;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.manage.common.utils.MPPageConvert;
import com.manage.common.utils.UserUtil;
import com.manage.authentication.detail.CustomUserDetailsUser;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Controller公共组件
 *
 * @author czx
 * @email object_czx@163.com
 * @date 2016年11月9日 下午9:42:26
 */

public abstract class AbstractController {

	@Autowired
	protected MPPageConvert mpPageConvert;

	@Autowired
	public ObjectMapper objectMapper;

	protected CustomUserDetailsUser getUser() {
		return UserUtil.getUser();
	}

	@SneakyThrows
	protected String getUserId() {
		return UserUtil.getUserId();
	}
}
