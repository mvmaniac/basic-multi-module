package io.devfactory.member;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@DataJpaTest
class MemberRepositoryTest {

  @Autowired
  private MemberRepository memberRepository;

  @Test
  void 회원_가입을_할_수_있다() {
    // given
    String name = "dev";
    String email = "dev@gmail.com";

    // when
    Member savedMember = memberRepository.save(new Member(name, email));
    Member findMember = memberRepository.findById(savedMember.getId()).orElse(Member.builder().build());

    log.debug("savedMember = {}, findMember = {}", savedMember, findMember);

    // then
    assertThat(findMember.getName()).isEqualTo(name);
  }

}
