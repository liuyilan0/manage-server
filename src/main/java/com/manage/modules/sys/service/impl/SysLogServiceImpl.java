package com.manage.modules.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.manage.modules.sys.entity.SysLog;
import com.manage.modules.sys.mapper.SysLogMapper;
import com.manage.modules.sys.service.SysLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {

}
