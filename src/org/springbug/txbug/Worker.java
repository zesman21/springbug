package org.springbug.txbug;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.annotation.PostConstruct;

@Service
public class Worker {

    private CTIParent parent;

    public Worker(@Qualifier("CTIChild") CTIParent parent) {
        this.parent = parent;
    }

    @PostConstruct
    public void init() {
        this.parent.execute();
    }
}
