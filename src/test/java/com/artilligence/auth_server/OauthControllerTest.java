package com.artilligence.auth_server;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class OauthControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void it_will_return_bad_request() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/authorize").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void it_will_return_redirect_url() throws Exception {
        String redirectUrl = "https://vk.com";

        MvcResult result = mvc.perform(MockMvcRequestBuilders
                .get("/authorize")
                .param("client_id", "31872837193")
                .param("client_secret", "dsakjdskaldjakl")
                .param("redirect_url", redirectUrl)
                .param("password", "12345678")
                .param("email", "djsaldkjsaldk@mail.ru"))
                .andExpect(status().is3xxRedirection()).andReturn();

        List<NameValuePair> params = URLEncodedUtils.parse(
                new URI((String) result.getResponse().getHeaderValue("Location")),
                String.valueOf(Charset.forName("UTF-8"))
        );

        Assert.assertNotNull(params.get(0).getValue());
    }
}
