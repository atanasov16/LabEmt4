package mk.ukim.finki.emt.usermanagement.xport.client;


import mk.ukim.finki.emt.usermanagement.domain.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;

@Service
public class UserClient {
    private final RestTemplate restTemplate;
    private final String serverUrl;

    public UserClient(@Value("${app.user-catalog.url}") String serverUrl){
        this.serverUrl = serverUrl;
        this.restTemplate = new RestTemplate();
        var requestFactory = new SimpleClientHttpRequestFactory();
        this.restTemplate.setRequestFactory(requestFactory);
    }
    private UriComponentsBuilder uri(){
        return UriComponentsBuilder.fromUriString(this.serverUrl);
    }
    public List<User> findAll(){
        try{
            return restTemplate.exchange(uri()
                    .path("api/user").build().toUri(),
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<User>>(){

                    }).getBody();
        } catch (Exception e){
            return Collections.emptyList();
        }
    }
}
