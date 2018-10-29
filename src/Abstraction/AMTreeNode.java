package Abstraction;

import javax.naming.OperationNotSupportedException;

public abstract class AMTreeNode<E> {

    protected E value;
    protected AMTreeNode leftNode;
    protected AMTreeNode rightNode;

    public E getValue() {
        return value;
    }

    /*public void setValue(E value) {
        this.value = value;
    }*/

    public AMTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(AMTreeNode leftNode) throws OperationNotSupportedException {
        this.leftNode = leftNode;
    }

    public AMTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(AMTreeNode rightNode) throws OperationNotSupportedException {
        this.rightNode = rightNode;
    }

    public AMTreeNode() {

    }

    public abstract double calcIntermediately();


}
