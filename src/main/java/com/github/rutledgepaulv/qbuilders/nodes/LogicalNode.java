package com.github.rutledgepaulv.qbuilders.nodes;

import java.util.List;

public abstract class LogicalNode extends AbstractNode {

    public LogicalNode(AbstractNode parent, List<AbstractNode> children) {
        super(parent, children);
    }

}
