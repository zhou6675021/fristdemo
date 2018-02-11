package com.commons;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义Properties配置
 * 集中配置，减少本地文件修改
 * .properties的属性值相互引用
 */
@EnableConfigurationProperties({com.model.dto.AppProperties.class})
@Configuration
public class PropertiesConfig {
}
