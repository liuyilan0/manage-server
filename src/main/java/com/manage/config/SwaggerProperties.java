package com.manage.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description //TODO $
 * @Date 16:01
 * @Author yzcheng90@qq.com
 **/
@Data
@Component
@ConfigurationProperties(value = "swagger")
public class SwaggerProperties {

    /**
     * 是否开启swagger，生产环境一般关闭，所以这里定义一个变量
     */
    private Boolean enable = false;

    /**
     * 项目信息
     */
    private String title = "后管平台";

    /**
     * 描述信息
     */
    private String description = "接口平台";

    /**
     * 版本信息
     */
    private String version = "0.0.1";

    /**
     * 作者
     */
    private String author = "liuyilan";

    /**
     * url
     */
    private String url = "";

    /**
     * email
     */
    private String email = "liuyilan1995@163.com";

}
