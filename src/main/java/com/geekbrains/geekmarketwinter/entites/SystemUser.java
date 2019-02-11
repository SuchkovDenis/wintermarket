package com.geekbrains.geekmarketwinter.entites;


import com.geekbrains.geekmarketwinter.validation.FieldMatch;
import com.geekbrains.geekmarketwinter.validation.ValidEmail;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@FieldMatch(first = "password", second = "matchingPassword", message = "Пароли не совпадают")
public class SystemUser {
    @NotNull(message = "поле не должно быть пустым")
    @Size(min = 3, message = "Имя пользователя должно состоять не менее чем из 3 символов")
//    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 letters/digits")
    private String userName;

    @NotNull(message = "поле не должно быть пустым")
    @Size(min = 1, message = "поле не должно быть пустым")
    private String password;

    @NotNull(message = "поле не должно быть пустым")
    @Size(min = 1, message = "поле не должно быть пустым")
    private String matchingPassword;

    @NotNull(message = "поле не должно быть пустым")
    @Size(min = 1, message = "поле не должно быть пустым")
    private String firstName;

    @NotNull(message = "поле не должно быть пустым")
    @Size(min = 1, message = "поле не должно быть пустым")
    private String lastName;

    @NotNull(message = "поле не должно быть пустым")
    @Size(min = 1, message = "поле не должно быть пустым")
    private String phone;

    @ValidEmail
    @NotNull(message = "поле не должно быть пустым")
    @Size(min = 1, message = "поле не должно быть пустым")
    private String email;
}
