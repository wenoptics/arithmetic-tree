import Abstraction.AMTreeNode;
import Abstraction.ArithmeticMethod;

import javax.naming.OperationNotSupportedException;

public class AMNumberNode<E extends Number> extends AMTreeNode<E> {

    public AMNumberNode(E number) {
        this.value = number;
        this.leftNode = null;
        this.rightNode = null;
    }

    @Override
    public void setLeftNode(AMTreeNode leftNode) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    @Override
    public void setRightNode(AMTreeNode rightNode) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    public void calcIntermediately() {

    }
}
