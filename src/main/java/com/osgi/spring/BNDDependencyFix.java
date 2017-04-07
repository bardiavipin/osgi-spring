package com.osgi.spring;

import org.springframework.beans.factory.xml.SimplePropertyNamespaceHandler;
import org.springframework.cache.annotation.AnnotationCacheOperationSource;
import org.springframework.cache.config.CacheNamespaceHandler;
import org.springframework.context.config.ContextNamespaceHandler;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.validation.beanvalidation.OptionalValidatorFactoryBean;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.portlet.mvc.annotation.AnnotationMethodHandlerAdapter;
import org.springframework.web.servlet.ViewRendererServlet;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.MvcNamespaceHandler;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;


@SuppressWarnings("unused")
public class BNDDependencyFix {

    static {
        System.out.println(ModelAndViewResolver.class);
        System.out.println(InternalResourceViewResolver.class);
        System.out.println(ContextNamespaceHandler.class);
        System.out.println(ViewRendererServlet.class);
        System.out.println(ContextLoaderListener.class);
        System.out.println(InternalResourceView.class);
        System.out.println(ViewResolver.class);
        System.out.println(MvcNamespaceHandler.class);
        System.out.println(CacheNamespaceHandler.class);
        System.out.println(SimplePropertyNamespaceHandler.class);
        System.out.println(ReloadableResourceBundleMessageSource.class);
        System.out.println(AnnotationCacheOperationSource.class);
        System.out.println(OptionalValidatorFactoryBean.class);
        System.out.println(AnnotationMethodHandlerAdapter.class);
        System.out.println(FreeMarkerConfigurer.class);
        System.out.println(ConfigurableWebBindingInitializer.class);
        System.out.println(DefaultConversionService.class);
    }

}