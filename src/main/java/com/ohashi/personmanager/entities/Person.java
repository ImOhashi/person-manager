package com.ohashi.personmanager.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Generated
@Validated
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {

    @NotNull
    private String name;

    @NotNull
    private String surname;

    @CPF
    @NotNull
    @NotEmpty
    private String cpf;

    @NotNull
    @NotEmpty
    private String email;

    @NotNull
    @NotEmpty
    private String phone;

    @NotNull
    private LocalDate birthDate;
}
