/*11/18 방과후과제3*/

package com.variable.practice;

public class practice3 {
    public static void main(String[] args) {
                int iNum1 = 10;
                int iNum2 = 4;
                float fNum = 3.0f;
                double dNum = 2.5;
                char ch = 'A'; // 'A'는 유니코드 값이 65

                System.out.println(iNum1 / iNum2); // 몫으로 2
                System.out.println((int)dNum); // double을 정수로 변환 2

                System.out.println(iNum2 * dNum); // 10.0
                System.out.println((double)iNum1); // 정수(int)를 실수(double)로 변환 10.0

                System.out.println(iNum1/(double)iNum2); // 정수 나눗셈 후 double로 변환 2.5
                System.out.println(dNum); // 문자 그대로 출력 2.5

                System.out.println((int)fNum); // float을 정수로 변환 3
                System.out.println(iNum1 % fNum); // 나머지 연산 1
                System.out.println(iNum1 / fNum);// float 3.3333333
                System.out.println(iNum1 / (double)fNum); // double 3.3333333333333335

                System.out.println(ch); // 변수명 그대로 출력 'A'
                System.out.println((int) ch); // 65 ch → int로 변환해서 출력해보기
                System.out.println(ch + iNum1); // 75 (문자와 정수의 덧셈, 유니코드 값으로 계산)
                System.out.println((char)(ch + iNum1)); // 'K'

            }
        }