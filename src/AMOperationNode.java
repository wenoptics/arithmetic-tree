import Abstraction.AMTreeNode;
import Abstraction.ArithmeticMethod;
import Arithmetic.ArithmeticHelper;

public class AMOperationNode extends AMTreeNode<ArithmeticMethod<Double>> {

    public AMOperationNode(char operationChar) {
        this.content = ArithmeticHelper.parseFromChar(operationChar);
    }

    public double calcIntermediately() throws Exception {

        return content.doCalculation(leftNode.calcIntermediately(), rightNode.calcIntermediately());

        /*double valLeft, valueRight;
        if (this.leftNode.getClass() == AMOperationNode.class) {
            valLeft = ((AMOperationNode) this.leftNode).calcIntermediately();
        } else {
            valLeft = (double) this.leftNode.getContent();
        }
        if (this.rightNode.getClass() == AMOperationNode.class) {
            valueRight = ((AMOperationNode) this.rightNode).calcIntermediately();
        } else {
            valueRight = (double) this.rightNode.getContent();
        }
        return valLeft + valueRight;*/
    }
}
