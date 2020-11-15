package com.custom.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Documented;

// NOTE this is no more necessary since Spring Boot 2.X
// @ConditionalOnExpression("${my.rest.controller.enabled:false}") - corresponding value set in application

@Target({ElementType.METHOD, ElementType.TYPE})             // can be use in method only.
@Retention(RetentionPolicy.RUNTIME)                         // loaded at runtime
@Documented
public @interface FeatureFlag {

    public boolean enabled() default true;
}
