# Basic Multi Module

### 1. 블로그 실습 예제 기반

- build-logic을 활용한 Convention Plugins 방식의 멀티모듈
- 최소 Gradle 7.4 이상, Gradle 8.x 이상 최적화

### 2. 차이점

- Spring Boot 4, Gradle 9 기반
- 아래 3개의 모듈은 별도의 어플리케이션으로 동작함
  - :service:client
  - :service:external-api
  - :service:internal-api
  - :common:internal-common 만 :service:internal-api 에 라이브러리 형태로 포함됨
  
### 3. TODO
