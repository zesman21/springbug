package org.springbug.txbug;

import org.springframework.transaction.annotation.Transactional;

public abstract class CTIParent {

    @Transactional(rollbackForClassName = "java.lang.Throwable")
    public void execute() {
        System.out.println("parent");
        String test = "test";
        execute(test);
    }

    public abstract void execute(String param);
}
