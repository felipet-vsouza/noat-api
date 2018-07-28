package com.noat.data.representarion;

import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String id;

    private String name;
    private String username;
    private String hashedPassword;
}
