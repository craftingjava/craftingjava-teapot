package com.craftingjava.teapot;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer
    extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[]{AppConfig.class};
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    // All configuration is specified through root config classes
    return null;
  }

  @Override
  protected String[] getServletMappings() {
    return new String[]{"/"};
  }

}
