import Abstraction.AMTreeNode;
import Abstraction.ArithmeticMethod;
import Arithmetic.ArithmeticHelper;

public class AMOperationNode extends AMTreeNode<ArithmeticMethod> {

    public AMOperationNode(char operationChar) {
        this.value = ArithmeticHelper.parseFromChar(operationChar);
    }

    public double calcIntermediately() {

        return this.leftNode.calcIntermediately() + this.rightNode.calcIntermediately();

        /*double valLeft, valueRight;
        if (this.leftNode.getClass() == AMOperationNode.class) {
            valLeft = ((AMOperationNode) this.leftNode).calcIntermediately();
        } else {
            valLeft = (double) this.leftNode.getValue();
        }
        if (this.rightNode.getClass() == AMOperationNode.class) {
            valueRight = ((AMOperationNode) this.rightNode).calcIntermediately();
        } else {
            valueRight = (double) this.rightNode.getValue();
        }
        return valLeft + valueRight;*/
    }
}
