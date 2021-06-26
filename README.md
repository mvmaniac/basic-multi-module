# Basic Multi Module

### 1. 블로그 실습 예제 기반

- [Gradle 멀티 프로젝트 관리](https://jojoldu.tistory.com/123 "Gradle 멀티 프로젝트 관리") 참고
- [마이크로서비스 분산 모니터링](https://brunch.co.kr/@springboot/58 "마이크로서비스 분산 모니터링") 참고

### 2. 차이점

- Spring Boot 2, Gradle 7 기반
- 아래 3개의 모듈은 별도의 어플리케이션으로 동작함
    - service-client
    - service-external-api
    - service-internal-api
    - service-internal-common 만 service-internal-api 에 라이브러리 형태로 포함됨

### 3. TODO
