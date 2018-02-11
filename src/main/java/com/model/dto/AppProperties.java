package com.model.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * 自定义参数
 *
 * @author 秦瑞华
 */
@Data
@ConfigurationProperties(prefix = "appConfig")
public class AppProperties {
    private String appName;
    private String appNameCn;
    /**
     * 核心服务调用密钥
     */
    private String secretOfCoreService;
    /**
     * 名单服务调用密钥
     */
    private String secretOfListService;
    /**
     * 规则引擎接入系统编号
     */
    private Integer systemId;
    private Alioss alioss;
    private CreditWeb creditWeb;
    /**
     * 连连签约 user_id前缀
     */
    private String userIdPrefix;

    private Map<String, String> smsList;

    private Map<String ,String > pmTemplate;
}

