package com.kuliah.latihanspringboot2.model;

import lombok.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    private UUID id_user;

    private String fname;
    private String lname;
    private String email;
    private String username;
    private String password;
}
