package com.craftingjava.teapot;

import static org.springframework.http.HttpStatus.I_AM_A_TEAPOT;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

  @RequestMapping("/**")
  public ModelAndView showPage() {
    ModelAndView modelAndView = new ModelAndView("index");
    modelAndView.setStatus(I_AM_A_TEAPOT);
    return modelAndView;
  }

}
