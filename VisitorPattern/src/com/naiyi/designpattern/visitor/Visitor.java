package com.naiyi.designpattern.visitor;

import com.naiyi.designpattern.visitor.item.Desktop;
import com.naiyi.designpattern.visitor.item.Laptop;

public interface Visitor {
    void visit(Laptop laptop);
    void visit(Desktop desktop);
    void showResult();
}

