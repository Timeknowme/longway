package com.xyk.longwaytest.handler;

import com.xyk.longwaytest.model.TestMethod;
import org.springframework.stereotype.Component;

/**
 * @author xyk
 * @ClassName OperateHandler
 * @CreateDate 2021/8/25
 * @Description
 */
@Component
public class OperateHandler implements ManyMethodHandler {
    @Override
    public String getMethod() {
        return "operate";
    }

    @Override
    public void handleMethod(TestMethod testMethod) {
        System.out.println("now operate:" + testMethod.getName());
    }
}
