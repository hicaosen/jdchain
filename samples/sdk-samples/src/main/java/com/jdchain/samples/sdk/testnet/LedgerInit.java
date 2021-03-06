package com.jdchain.samples.sdk.testnet;

import com.jd.blockchain.storage.service.impl.composite.CompositeConnectionFactory;
import com.jd.blockchain.tools.initializer.web.InitWebSecurityConfiguration;
import com.jd.blockchain.tools.initializer.web.InitWebServerConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Configuration
@EnableConfigurationProperties
@Import(value = { InitWebServerConfiguration.class, InitWebSecurityConfiguration.class })
public class LedgerInit {

    @Bean
    public CompositeConnectionFactory getCompositeConnectionFactory() {
        return new CompositeConnectionFactory();
    }
}
