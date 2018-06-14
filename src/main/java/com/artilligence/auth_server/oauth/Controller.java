package com.artilligence.auth_server.oauth;

import com.artilligence.auth_server.domains.OauthClient;
import com.artilligence.auth_server.domains.OauthSession;
import com.artilligence.auth_server.domains.User;
import com.artilligence.auth_server.exceptions.NotFoundException;
import com.artilligence.auth_server.repositories.UserRepository;
import com.artilligence.auth_server.services.SessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

@RestController
public class Controller {
    @Autowired
    SessionManager sessionManager;

    @Autowired
    private Repository repository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/authorize")
    public void Authorize(
            HttpServletResponse response,
            @RequestParam(value = "client_id", required = true) String clientId,
            @RequestParam(value = "client_secret", required = true) String clientSecret,
            @RequestParam(value = "redirect_url", required = true) String redirectUrl,
            @RequestParam(value = "password", required = true) String password,
            @RequestParam(value = "email", required = true) String email
    ) throws IOException, NotFoundException, NoSuchAlgorithmException {
        OauthClient oauthClient = repository.getClient(clientId);

        oauthClient.hasScopes(new String[] {"oauth"});
        oauthClient.hisUrl(redirectUrl);

        User user = userRepository.getByEmailAndPassword(email, password, true);
        OauthSession session = sessionManager.startSession(oauthClient, user);

        String url = String.format("%s?code=%s", redirectUrl, session.getPojo().getCode());

        response.sendRedirect(url);
    }
}
