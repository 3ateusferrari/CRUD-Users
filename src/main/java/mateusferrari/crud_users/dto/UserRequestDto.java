package mateusferrari.crud_users.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {
    @NotBlank(message = "Username cannot be empty")
    private String username;

    @Size(min = 6, message = "The password need to have at least 6 characters")
    private String password;
}
