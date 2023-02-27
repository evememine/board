
# Spring boot 게시판 만들기 


## 프로젝트 목적
- MVC패턴을 자바로 학습한 적은 있지만 spring boot로는 사용해보지 않았다.
- spring boot를 학습하고 싶지만 뭐부터 해야할지 모르겠어서 우선 따라해보기로 했다. 

## 참고 자료
https://youtube.com/playlist?list=PLZzruF3-_clsWF2aULPsUPomgolJ-idGJ

## 기간
2023.2.2 ~ 2023.2.10

## 개발 환경 
- Java 1.8 
- Spring boot 2.5.4
- maria DB 10.10.2

## 오류 해결

### java, Spring boot 버전 문제
- start.spring.io 에서 프로젝트를 생성하였으나 실행이 되지 않음 
- 강의에서 사용되는 Java1.8은 spring boot 3.X 에서는 지원되지 않음 
- `build.gradle`에서 버전을 `2.5.4`로 낮춤 
- IDE의 프로젝트 Java 버전을 1.8로 수정 

### Entity 이름 관련
- `Unable to locate Attribute  with the the given name`
- entity 이름을 정확히 일치시키지 않아서 발생한 오류 

### .gitgnore 사용하기 
- 실수로 `application.properties` 추가하지 않음 
- 이미 파일이 올라간 경우엔 `git rm --chached 파일경로`로 내역을 삭제해야 함 

### git stash
- 엉뚱한 branch에서 작업하고 있음을 깨달음 
- `git stash`로 변경사항 저장
- `git checkout branch`로 브랜치 변경
- `git stash pop`으로 변경사항 저장 

