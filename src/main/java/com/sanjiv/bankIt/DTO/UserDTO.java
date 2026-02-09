package com.sanjiv.bankIt.DTO;

import lombok.*;

@Data
@NoArgsConstructor          // ⭐ MUST
@AllArgsConstructor         // ⭐ SAFE
@Builder
public class UserDTO {

    private String gender;
    private String address;
    private String firstName;
    private String lastName;
    private String otherName;
    private String stateOfOrigin;

    private String email;
    private String phoneNumber;
    private String alternativePhoneNumber;
}
