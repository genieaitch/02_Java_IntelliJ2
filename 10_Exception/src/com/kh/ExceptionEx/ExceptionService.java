package com.kh.ExceptionEx;

/*
    Exception(예외) : 코드로 처리 가능한 에러
    Exception Handling (예외 처리) : Exception 발생 시 처리하는 구문
*/

public class ExceptionService {
    //method1 문제를 발생시킬 것
    public void method1(){
        //index   =  0 1 2 3 4
        int[] arr = {1,2,3,4,5}; //마지막 인덱스 ==4

        //for문으로 출력
        for (int i=0; i<=arr.length;i++){ //i = 0부터 5까지 출력
            System.out.println(arr[i]);
        }
        /*
        컴퓨터가 예기치 못한 상황이 발생했고,
        결과를 개발자한테 전달하고 예기치 못한 상황에 대해 해결해달라는 메시지를 전달

        Exception in thread "main"
        java.lang.ArrayIndexOutOfBoundsException:
        Index 5 out of bounds for length 5
        */

        /*
        예외 발생 구문을 try-catch로 처리 (예외 처리

        -try{} : 예외가 발생할 수 있을 것 같은 코드들을 시도하는 구문
                 (1) try ~ catch
                 (2) try ~ catch ~ catch ~ catch
                 (3) try ~ catch ~ catch ~ ... ~ finally
                 (4) try ~ catch ~ finally
                 (5) try ~ finally

        - catch(예외){} : try안에 작성한 코드들을 실행하던 도중 문제가 발생했고
                          발생한 문제가 예상했던 문제와 같으면 내가 생각한 문제가 맞아!
                          catch(잡아서) {} 중괄호 안에 작성된 구문 수행
                          → 발생된 예외를 다른 방식으로 처리했기 때문에
                            프로그램이 멈추지 않고 정상적으로 수행
                          catch는 1개가 아니라 100 1000개 이상 작성 가능

        - finally{} : chatch에 관계없이 마지막에 무조건적으로 실행하는 코드를 작성
                      finally는 필수로 작성하는 것이 아니라 필요하다면 선택적으로 작성
                      만약 finally 작성할 경우
                           (1) try ~ catch ~ finally
                           (2) try ~ finally
                      주로 사용하는 경우
                                외부 프로그램 / 장치 연결을 강제적으로 끊어야할 때 주로 사용


         문제가 발생하는데 어떤 문제인지 예상이 되지 않을 경우
         catch(Exception e){} 로 작성하면 모든 문제는 잡힘
        */
    }

    //method2 발생한 문제를 유연하게 처리할 것 try - catch
    public void method2(){
        int[] arr = {1,2,3,4,5}; // index 0~4 length =5
        try {//문제가 생길 수 있지만 실행은 해볼 것!
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception error) { //e는 발생된 문제 내용을 저장하고 있는 변수명
            System.out.println("값에 문제가 생긴 것 같습니다. ^^;");
            //문제가 생겼을 때 유연하게 처리함과 동시에 왜 문제가 생겼는지 개발자의 눈으로 확인하고 싶음!
            System.out.println(error);
        }
    }
}
