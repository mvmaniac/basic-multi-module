package io.devfactory.member;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberClientController {

  private final MemberClientService memberClientService;

  @GetMapping("/member/{id}")
  public String getMember(@PathVariable Long id) {
    return memberClientService.getMember(id);
  }

  @GetMapping("/members")
  public String getMembers() {
    return memberClientService.getMembers();
  }

}
