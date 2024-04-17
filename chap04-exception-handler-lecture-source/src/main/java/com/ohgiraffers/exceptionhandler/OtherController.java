package com.ohgiraffers.exceptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OtherController {

    /* 필기.
    *   다른 컨트롤러에서 Exception 이 발생 했을 떄
    *   우리가 ExceptionHandlerController 에 정의해둔
    *   @ExceptionHandler 가 동작하지 않는다.
    *  */

    @GetMapping("other-controller-null")
    public String otherNullPointerExceptionTest() {

        String str = null;
        System.out.println(str.charAt(0));

        return "/";
    }

    @GetMapping("other-controller-user")
    public String otherUserExceptionTest() throws MemberRegistException {

        boolean check = true;
        if (check) {
            throw new MemberRegistException("회원이 아닙니다");
        }

        return "/";

    }

    @GetMapping("other-controller-array")
    public String otherArrayExceptionTest() {

        double[] array = new double[0];
        System.out.println(array[0]);

        return "/";
    }
}
