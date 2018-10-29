import Abstraction.AMTreeNode;
import Abstraction.ArithmeticMethod;
import Arithmetic.ArithmeticHelper;

public class AMOperationNode extends AMTreeNode<ArithmeticMethod> {

    public AMOperationNode(char operationChar) {
        this.value = ArithmeticHelper.parseFromChar(operationChar);

    }

    public void calcIntermediately() {

    }
}
