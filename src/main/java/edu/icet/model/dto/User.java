package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {

    private String userId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private LocalDate membershipDate;

}
