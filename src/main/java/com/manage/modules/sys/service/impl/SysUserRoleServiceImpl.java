package com.manage.modules.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.manage.modules.sys.service.SysUserRoleService;
import com.manage.modules.sys.entity.SysUserRole;
import com.manage.modules.sys.mapper.SysUserRoleMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


/**
 * 用户与角色对应关系
 *
 * @author author
 * @email author@163.com
 * @date 2019年4月17日
 */
@Service
@AllArgsConstructor
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

}
