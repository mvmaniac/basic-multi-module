package io.devfactory.member;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberInternalController {

    private final MemberInternalService memberInternalService;

    @GetMapping("/internal/member/{id}")
    public Member getMember(@PathVariable Long id) {
        return memberInternalService.getMember(id);
    }

    @GetMapping("/internal/members")
    public List<Member> getMembers() {
        return memberInternalService.getMembers();
    }

}
