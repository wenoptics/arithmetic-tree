package Abstraction;

import javax.naming.OperationNotSupportedException;

public abstract class AMTreeNode<E> {

    protected E content;
    protected AMTreeNode leftNode;
    protected AMTreeNode rightNode;

    public E getContent() {
        return content;
    }

    /*public void setContent(E content) {
        this.content = content;
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

    public abstract double calcIntermediately() throws Exception;


}
