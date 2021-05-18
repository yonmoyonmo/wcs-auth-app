package wcs.auth.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import wcs.auth.payload.AuthTest;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AuthorizationTestController {

    @GetMapping("/oauth2/redirect")
    public void authTest(HttpServletRequest request){
        System.out.println(request.getParameter("code"));

    }
}
