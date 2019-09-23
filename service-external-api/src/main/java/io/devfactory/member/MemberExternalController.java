package io.devfactory.member;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberExternalController {

    private final MemberExternalService memberExternalService;

    @GetMapping("/external/member/{id}")
    public String getMember(@PathVariable Long id) {
        return memberExternalService.getMember(id);
    }

    @GetMapping("/external/members")
    public String getMembers() {
        return memberExternalService.getMembers();
    }

}
