package org.springbug.txbug;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Qualifier("CTIChild")
public class CTIChild extends CTIParent {

    @Override
    public void execute(String param) {
        System.out.println("executeAfter");
    }
}
