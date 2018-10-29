import Abstraction.AMTreeNode;

import javax.naming.OperationNotSupportedException;

public class demo {

    public static void main(String[] args) {
        AMTreeNode root = new AMOperationNode('-');

        AMTreeNode l2_0 = new AMOperationNode('/');
        AMTreeNode l2_1 = new AMOperationNode('+');

        AMTreeNode l3_0 = new AMOperationNode('*');
        AMTreeNode l3_1 = new AMOperationNode('+');
        AMTreeNode l3_2 = new AMOperationNode('*');
        AMTreeNode l3_3 = new AMNumberNode<Double>((double) 6);

        AMTreeNode l4_0 = new AMOperationNode('+');
        AMTreeNode l4_1 = new AMNumberNode<Double>((double) 3);
        AMTreeNode l4_2 = new AMOperationNode('-');
        AMTreeNode l4_3 = new AMNumberNode<Double>((double) 2);
        AMTreeNode l4_4 = new AMNumberNode<Double>((double) 3);
        AMTreeNode l4_5 = new AMOperationNode('-');

        AMTreeNode l5_0 = new AMNumberNode<Double>((double) 3);;
        AMTreeNode l5_1 = new AMNumberNode<Double>((double) 1);;
        AMTreeNode l5_2 = new AMNumberNode<Double>((double) 9);;
        AMTreeNode l5_3 = new AMNumberNode<Double>((double) 5);;
        AMTreeNode l5_4 = new AMNumberNode<Double>((double) 7);;
        AMTreeNode l5_5 = new AMNumberNode<Double>((double) 4);;

        try {
            root.setLeftNode(l2_0);
            root.setRightNode(l2_1);

            l2_0.setLeftNode(l3_0);
            l2_0.setRightNode(l3_1);
            l2_1.setLeftNode(l3_2);
            l2_1.setRightNode(l3_3);

            l3_0.setLeftNode(l4_0);
            l3_0.setRightNode(l4_1);
            l3_1.setLeftNode(l4_2);
            l3_1.setRightNode(l4_3);
            l3_2.setLeftNode(l4_4);
            l3_2.setRightNode(l4_5);

            l4_0.setLeftNode(l5_0);
            l4_0.setRightNode(l5_1);
            l4_2.setLeftNode(l5_2);
            l4_2.setRightNode(l5_3);
            l4_5.setLeftNode(l5_4);
            l4_5.setRightNode(l5_5);
        } catch (OperationNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
