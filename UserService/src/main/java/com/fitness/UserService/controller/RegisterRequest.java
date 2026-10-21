package com.fitness.UserService.controller;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {

    @NotBlank(message="Email is required")
    @Email(message = "Invalid email format")

    private String email;

    @NotBlank(message = " Password is required")
    @Size(min=6,message="Password must have atleast 6 character")
    private String password;
    private String  firstName;
    private String  lastName;

    public @NotBlank(message = "Email is required") @Email(message = "Invalid email format") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Invalid email format") String email) {
        this.email = email;
    }

    public @NotBlank(message = " Password is required") @Size(min = 6, message = "Password must have atleast 6 character") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = " Password is required") @Size(min = 6, message = "Password must have atleast 6 character") String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
