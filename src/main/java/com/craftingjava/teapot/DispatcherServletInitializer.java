/*
  Copyright [2018-2019] Laszlo Csontos (sole trader)

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
*/

package com.craftingjava.teapot;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer
    extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[]{AppConfig.class};
  }

  @Override
  @SuppressFBWarnings(
      value = "PZLA_PREFER_ZERO_LENGTH_ARRAYS",
      justification = "According to javadoc null should be used here"
  )
  protected Class<?>[] getServletConfigClasses() {
    // All configuration is specified through root config classes
    return null;
  }

  @Override
  protected String[] getServletMappings() {
    return new String[]{"/"};
  }

}
