package com.infinity.configconsumer.configconsumer;

import com.infinity.configconsumer.configconsumer.model.UserProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

    @Autowired
    UserProfileConfiguration userProfileConfiguration;

    @RequestMapping("/profile")
    public String getConfig(Model model){

        model.addAttribute("model",userProfileConfiguration.getDefaultModel());
        model.addAttribute("min",userProfileConfiguration.getMinRentPeriod());
        return "mprofile";

    }

}
