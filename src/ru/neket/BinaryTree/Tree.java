package ru.neket.BinaryTree;
import java.util.*;

public class Tree {
    private Node rootNode;

    public Tree(){rootNode = null;}

    public void addValue(int num)
    {
        Node newNode = new Node();
        newNode.setValue(num);
        if (rootNode == null)
            rootNode = newNode;
        else
        {
            Node correntNode = rootNode;
            Node parentNode;
            while (true)
            {
                parentNode = correntNode;
                if (num == correntNode.getValue())
                {
                    return ;
                }
                else if (num < correntNode.getValue())
                {
                    correntNode = correntNode.getLeft();
                    if (correntNode == null)
                    {
                        parentNode.setLeft(newNode);
                        return;
                    }
                }
                else
                {
                    correntNode = correntNode.getRight();
                    if (correntNode == null)
                    {
                        parentNode.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }
//    public void printTree() { // метод для вывода дерева в консоль
//        Stack globalStack = new Stack(); // общий стек для значений дерева
//        globalStack.push(rootNode);
//        int gaps = 32; // начальное значение расстояния между элементами
//        boolean isRowEmpty = false;
//        String separator = "-----------------------------------------------------------------";
//        System.out.println(separator);// черта для указания начала нового дерева
//        while (isRowEmpty == false) {
//            Stack localStack = new Stack(); // локальный стек для задания потомков элемента
//            isRowEmpty = true;
//
//            for (int j = 0; j < gaps; j++)
//                System.out.print(' ');
//            while (globalStack.isEmpty() == false) { // покуда в общем стеке есть элементы
//                Node temp = (Node) globalStack.pop(); // берем следующий, при этом удаляя его из стека
//                if (temp != null) {
//                    System.out.print(temp.getValue()); // выводим его значение в консоли
//                    localStack.push(temp.getLeft()); // соохраняем в локальный стек, наследники текущего элемента
//                    localStack.push(temp.getRight());
//                    if (temp.getLeft() != null ||
//                            temp.getRight() != null)
//                        isRowEmpty = false;
//                }
//                else {
//                    System.out.print("__");// - если элемент пустой
//                    localStack.push(null);
//                    localStack.push(null);
//                }
//                for (int j = 0; j < gaps * 2 - 2; j++)
//                    System.out.print(' ');
//            }
//            System.out.println();
//            gaps /= 2;// при переходе на следующий уровень расстояние между элементами каждый раз уменьшается
//            while (localStack.isEmpty() == false)
//                globalStack.push(localStack.pop()); // перемещаем все элементы из локального стека в глобальный
//        }
//        System.out.println(separator);// подводим черту
//    }

}
