### 피드백 반영사항
---
- [x] @ParametertizedTest, @CsvSource를 활용한 테스트코드 작성
- [x] RandomNumbers에 숫자 중복이 되지 않도록 설정
- [x] (optional)private member 변수에 직접 접근하지 않기. 대신 메세지를 보내는 식으로 개선(무슨 말인지 잘 이해 안됨)
    - 객체의 member 변수에 직접 접근해서 사용하면 변경성이 떨어짐(두 번째 영상 26:30 참고)
- [x] (optional)enum을 사용해보기. enum에 전달한 메세지를 처리할 method 만들어보기(16:00)
- [x] stream 문법 사용해보기(15:50)
- [x] 객체지향 생활체조 원칙 3번, 원시값을 포장하기 적용해보기(두 번째 영상 37:50) 포장한 곳에서 원시값에 대한 유효성 체크 진행

### 객체지향 생활체조 원칙
---
1. 메서드에 오직 한 단계의 들여쓰기만 한다.
2. else 예약어를 쓰지 않는다.
3. 모든 원시 값과 문자열을 포장한다.
4. 한 줄에 점을 하나만 찍는다.
5. 줄여 쓰지 않는다(축약 금지).
6. 모든 엔티티를 작게 유지한다.
7. 3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다.
8. 일급 컬렉션을 쓴다.
9. getter/setter/프로퍼티를 쓰지 않는다.

### Todos
---
- 컴퓨터의 Ball, 사용자의 Ball
- 컴퓨터의 Balls, 사용자의 Balls 결국 같음

- Ball
    - private final int index
    - private final int number
    - BallStatus compare(Ball ball)

- Balls
    - private final List<Ball> balls

- BallStatus
    - BALL, STRIKE, NOTHING

### 배운 점
---
- 문자열의 비교는 String.equals() method를 사용해야 함. js처럼 == 으로 하면 안됨
- 객체지향 생활체조 원칙 3번 "모든 원시 값과 문자열을 포장한다"와 8번 "1급 컬렉션을 쓴다", 9번 "getter setter property를 쓰지 않는다"를 적용하며 각 원칙을 코드로 표현하는 방법을 배웠다. 
각 원칙을 지켜야 하는 이유에 대해서도 와닿기는 하지만 남은 과정에서 반복해 지키면서 더 공부해봐야겠다.
    - 원칙 9번은 가능한 지양하는 것이지 getter 등은 반드시 필요할 때가 있다는 것도 배웠다.
- enum은 jvm에 유일하게 존재하는 instance. class와 크게 다르지 않음
- stream() method를 활용해 map -> filter -> findFirst -> orElse 의 연결이 참 유용했다
    - double colon operator(::)를 활용해 lamda 식을 더 간단히 표현할 수 있었다

### 미흡한 점
- 게임 진행을 위한 사용자 interface 쪽 완성도가 떨어진다
    - 사용자 입력에 대한 유효성 검증을 하지 않았다
    - main method에 최대 3개의 indent가 있다
    - 게임 종료 조건의 예외 케이스 처리 로직이 없다
    - 종료 조건에 대한 값을 enum으로 처리하여 코드 가독성을 개선하지 않았다 


## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```