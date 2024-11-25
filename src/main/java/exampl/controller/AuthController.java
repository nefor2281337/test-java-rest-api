package exampl.controller;


import exampl.DTO.AuthDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/auth")
    public String auth(@RequestBody AuthDTO authDTO) {
        return null;
    }

}
