package com.naiyi.designpattern.visitor.item;

import com.naiyi.designpattern.visitor.Visitor;

/* this is the abstract node */
public interface Item {
    void accept(Visitor visitor);
}
