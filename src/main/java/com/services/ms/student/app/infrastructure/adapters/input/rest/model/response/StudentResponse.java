package com.services.ms.student.app.infrastructure.adapters.input.rest.model.response;


import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
    private Long id;
    private String firstname;
    private String lastname;
    private String age;
    private String address;
}
