package com.daniellavoie.elasticbouncer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ElasticBouncerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ElasticBouncerApplication.class, args);
	}
}
