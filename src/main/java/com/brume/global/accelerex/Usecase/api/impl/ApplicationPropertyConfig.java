package com.brume.global.accelerex.Usecase.api.impl;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "apiurl")
@Data
public class ApplicationPropertyConfig {
    public  String episodes;
    public  String characters;

}
