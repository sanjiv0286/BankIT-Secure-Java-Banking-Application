package com.sanjiv.bankIt.Services;

import com.sanjiv.bankIt.DTO.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
