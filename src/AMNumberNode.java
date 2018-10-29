import Abstraction.AMTreeNode;

import javax.naming.OperationNotSupportedException;

public class AMNumberNode extends AMTreeNode<Double> {

    public AMNumberNode(double number) {
        this.content = number;
        this.leftNode = null;
        this.rightNode = null;
    }

    public double calcIntermediately() {
        return this.content;
    }

    @Override
    public void setLeftNode(AMTreeNode leftNode) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    @Override
    public void setRightNode(AMTreeNode rightNode) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    @Override
    public AMTreeNode getLeftNode() {
        return null;
    }

    @Override
    public AMTreeNode getRightNode() {
        return null;
    }
}
