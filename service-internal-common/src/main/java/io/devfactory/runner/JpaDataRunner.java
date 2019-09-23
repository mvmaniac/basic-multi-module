package io.devfactory.runner;

import io.devfactory.member.Member;
import io.devfactory.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class JpaDataRunner implements ApplicationRunner {

    private final MemberRepository memberRepository;

    @Override
    public void run(ApplicationArguments args) {
        log.debug("JpaDataRunner run...");

        memberRepository.save(new Member("dev1", "dev1@gmail.com"));
        memberRepository.save(new Member("dev2", "dev2@gmail.com"));
        memberRepository.save(new Member("dev3", "dev3@gmail.com"));
    }

}
