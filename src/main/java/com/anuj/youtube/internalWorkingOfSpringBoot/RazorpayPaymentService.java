package com.anuj.youtube.internalWorkingOfSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class RazorpayPaymentService implements PaymentService {

    @Override
    public String pay() {
        String payment = "Razorpay payment";
        System.out.println("Payment from: "+ payment);
        return payment;
    }
}
