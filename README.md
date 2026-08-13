# StoryLeave Android

StoryLeave 유저 앱입니다. 현재는 단일 `:app` 모듈과 XML/ViewBinding 기반으로 구성합니다.

## Package structure

```text
kr.ac.anu.storyleave
├── core
│   ├── common       # 공통 결과 타입과 확장 함수
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
