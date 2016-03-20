package com.binns.configuration;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.binns.endpoints.StringManipulationEndpoints;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

@Configuration
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
        registerEndpoints();
        configureSwagger();
    }

    private void configureSwagger() {
        register(ApiListingResource.class);
        register(SwaggerSerializers.class);
        
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("0.1.0");
        beanConfig.setSchemes(new String[]{"http"});
        //beanConfig.setHost(NetworkInterface.getNetworkInterface + "8080");
        beanConfig.setBasePath("/api");
        beanConfig.setResourcePackage("com.binns.endpoints");
        beanConfig.setPrettyPrint(true);
        beanConfig.setScan(true);
    }

    private void registerEndpoints() {
    	register(StringManipulationEndpoints.class);
    }
	
}
