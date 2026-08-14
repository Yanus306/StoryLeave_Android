# StoryLeave Android

StoryLeave 유저 앱입니다. 현재는 단일 `:app` 모듈과 XML/ViewBinding 기반으로 구성합니다.

## Package structure

```text
kr.ac.anu.storyleave
├── core
│   ├── common       # 공통 결과 타입과 확장 함수
│   ├── ui           # ViewBinding, UI 상태, WindowInsets 공통 처리
│   ├── navigation   # 화면 이동 관련 공통 코드
│   └── network      # 네트워크 공통 처리
├── data
│   ├── local        # DataStore 등 로컬 데이터 소스
│   ├── remote       # API와 원격 DTO
│   └── repository   # Repository 구현체
├── domain
│   ├── model        # 도메인 모델
│   ├── repository   # Repository 인터페이스
│   └── usecase      # 복합 비즈니스 로직
├── feature
│   ├── main
│   ├── auth
│   ├── highlight
│   ├── form
│   ├── post
│   ├── map
│   ├── friend
│   ├── my
│   └── ai
└── di               # Hilt 모듈
```

각 기능 패키지에는 화면 단위로 `Fragment`, `ViewModel`, `UiState`를 함께 둡니다. 데이터와 도메인 계층은 실제 기능에서 필요해질 때 구현합니다.

## UI conventions

- 공통 색상, 간격, 모서리와 컴포넌트 스타일은 `res/values`의 `sl_` 접두사 리소스를 사용합니다.
- 버튼은 `Widget.StoryLeave.Button.Primary` 또는 `Widget.StoryLeave.Button.Secondary` 스타일을 사용합니다.
- 화면은 `BaseBindingFragment`를 상속해 ViewBinding 생명주기를 관리합니다.
- `app_nav_graph` 아래에서 인증과 메인 그래프를 분리하며, 메인 하단 탭은 폼·하이라이트·마이로 구성합니다.
- 피그마에 없는 다크 테마를 임의로 만들지 않도록 현재는 라이트 테마만 제공합니다.

## Code style

- `./gradlew ktlintCheck`로 Kotlin 코드 스타일을 검사합니다.
- `./gradlew ktlintFormat`으로 자동 수정 가능한 스타일 문제를 정리합니다.
