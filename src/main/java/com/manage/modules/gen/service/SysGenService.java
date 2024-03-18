package com.manage.modules.gen.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.manage.modules.gen.entity.MakerConfigEntity;
import com.manage.modules.gen.entity.InfoRmationSchema;

public interface SysGenService extends IService<InfoRmationSchema> {

    IPage<InfoRmationSchema> queryTableList(IPage page, QueryWrapper<InfoRmationSchema> entityWrapper);

    void generatorCode(MakerConfigEntity config);
}
