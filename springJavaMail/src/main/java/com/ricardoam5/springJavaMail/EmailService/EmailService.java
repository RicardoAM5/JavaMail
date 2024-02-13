package com.ricardoam5.springJavaMail.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String toEmail,String subject,String body){
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom("ricardoamdev@gmail.com");
        mail.setTo(toEmail);
        mail.setSubject(subject);
        mail.setText(body);

        javaMailSender.send(mail);
        System.out.println("Main sent successfully");

    }


}
