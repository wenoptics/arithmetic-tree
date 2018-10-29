package Abstraction;

import javax.naming.OperationNotSupportedException;

public class AMTreeNode<E> {

    protected E value;

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

    protected AMTreeNode leftNode;
    protected AMTreeNode rightNode;

    public AMTreeNode() {

    }


}
