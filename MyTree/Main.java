package com.company;
public class Main 
{
    public static void main(String[] args)
    {
        MyTree<Integer> myTree = new MyTree<>((a, b) -> a.getValue().toString().compareTo(b.getValue().toString()));
        Randomizer.randomInteger(myTree, 100);
        System.out.println(myTree.getLenght());
    }
}
