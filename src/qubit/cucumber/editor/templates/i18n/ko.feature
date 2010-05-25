# language: ko
# Source: http://github.com/aslakhellesoy/cucumber/blob/master/examples/i18n/ko/features/addition.feature
# Updated: Tue May 25 15:52:04 +0200 2010
기능: 덧셈
  예기치못한 실수을 방지하기 위해
  수학을 잘 못하는 사람으로써 
  두숫자의 합을 알고 싶다

  시나리오 개요: 두 숫자를 더하기
    조건 계산기에 <입력1>을 입력했음
    그리고 계산기에 <입력2>을 입력했음
    만일 내가 <버튼>를 누르면
    그러면 화면에 출력된 결과는 <결과>이다

  예:
    | 입력1 | 입력2 | 버튼 | 결과 |
    | 20    | 30    | add  | 50 |
    | 2     | 5     | add  | 7  |
    | 0     | 40    | add  | 40 |