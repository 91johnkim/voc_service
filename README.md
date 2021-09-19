
### 프로젝트 구성
* 개발스펙
  * Spring Boot
  * Srping Security
  * H2 in-memory
  * gradle
  * thymeleaf
  
* 구성
  * back-end
    * /api/v1/voc/questions
      * 리스트 조회
      * 문의 등록
    * /api/v1/voc/counselors
      * 미답변 목록 조회
      * 문의 수락
      * 답변등록
  * front-end (미구현)
  * Test Case (미구현)

### 실행방법

1. git clone 명령으로 해당 프로젝트 파일을 받아옵니다.
  1. git clone https://github.com/91johnkim/voc_service.git

2. Gradle로 해당 프로젝트를 빌드 합니다. project의 bulid 디렉터리에 산출물을 확인합니다.
  1. cd voc_service
  2. ./gradlew clean build
  3. voc_service/build/libs/

3. Java 명령으로 빌드된 파일을 실행시킵니다.
  1. java -jar 산출물.jar


### 문제 해결 전략
* 답변자 지정시 쓰레드 동시성제어를 위해 synchronized 사용 
* 답변자 할당 테이블 (assignment) 생성하여 DB구조적으로 중복되지 않도록 처리