package io.devfactory.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class MemberClientService {

    private final RestTemplate restTemplate;

    public String getMember(Long id) {
        return restTemplate.getForObject("http://localhost:8082/external/member/" + id, String.class);
    }

    public String getMembers() {
        return restTemplate.getForObject("http://localhost:8082/external/members", String.class);
    }

}
