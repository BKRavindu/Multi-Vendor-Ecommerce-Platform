package com.ecommerce.modal;


import com.ecommerce.domain.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetails {
    private Long paymentId;
    private String razorpayPaymentLinkedId;
    private String razorpayPaymentLinkStatus;
    private String razorpayPaymentLinkReferenceId;
    private String razorpayPaymentId;
    private PaymentStatus status;
    private LocalDateTime paymentDate = LocalDateTime.now();
}
//2:21:42