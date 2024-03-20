package com.manage.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.manage.modules.sys.entity.SysMenuNew;
import com.manage.modules.sys.vo.SysMenuNewVO;

import java.util.List;


/**
 * 菜单管理
 *
 * @author author
 * @email author@163.com
 */
public interface SysMenuNewService extends IService<SysMenuNew> {

	List<SysMenuNewVO> getUserMenu();
}
