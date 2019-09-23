package io.devfactory.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberInternalService {

    private final MemberRepository memberRepository;

    public Long signUp(Member member) {
        return memberRepository.save(member).getId();
    }

    public Member getMember(Long id) {
        return memberRepository.findById(id).orElse(Member.builder().build());
    }

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }

}
