
package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ryanu
 */
@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String page(Model model) {
       // model.addAttribute("attribute", "value");
        return "index";
    }
    @RequestMapping("/contaco")
    public String paginaContacto(Model model) {
       // model.addAttribute("attribute", "value");
        return "info";
    }
    
}
