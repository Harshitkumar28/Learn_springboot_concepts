package com.anuj.youtube.internalWorkingOfSpringBoot;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

//@Component
//@Service
//@RestController
//@Repository
//@Controller
public class StripePaymentService implements PaymentService{

    @Override
    public String pay() {
        String payment = "";
        System.out.println("paying from...+payment");
        return payment;
    }
}
