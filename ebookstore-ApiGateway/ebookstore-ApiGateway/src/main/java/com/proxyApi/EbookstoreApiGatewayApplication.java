package com.proxyApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.proxyApi.filter.ErrorFilter;
import com.proxyApi.filter.PostFilter;
import com.proxyApi.filter.PreFilter;
import com.proxyApi.filter.RouteFilter;

@EnableZuulProxy
@SpringBootApplication
@EnableEurekaClient
public class EbookstoreApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbookstoreApiGatewayApplication.class, args);
	}
	
	@Bean
	public PreFilter getPreFilter() {
		return new PreFilter();
	}
	
	@Bean
	public PostFilter getPostFilter() {
		return new PostFilter();
	}
	
	@Bean
	public RouteFilter getRouteFilter() {
		return new RouteFilter();
	}
	
	@Bean
	public ErrorFilter gErrorFilter() {
		return new ErrorFilter();
	}
	
}
