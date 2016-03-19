package com.binns.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.binns.endpoints.StringManipulationEndpoints;

@Configuration
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
        register(StringManipulationEndpoints.class);
    }
	
}
