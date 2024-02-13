package com.ricardoam5.springJavaMail.RESTController;

import com.ricardoam5.springJavaMail.EmailService.EmailService;
import com.ricardoam5.springJavaMail.Model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/mail")
@CrossOrigin("*")
public class EmailServiceREST {

    @Autowired
    private  EmailService emailService;
    private Email email;

    @PostMapping("/sendEmail")
    public void SendEmail(@RequestBody Email email ){
        emailService.sendEmail(email.getToEmail(),email.getSubject(),email.getBody());
    }

}
