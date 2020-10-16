package com.company;
import java.util.Collection;
import java.util.Iterator;

public class MyTree<T> implements Collection<T> {
    class Node<T>
    {
        private T value;
        private Node<T> left;
        private Node<T> right;

        public Node(T value)
        {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public T getValue()
        {
            return value;
        }

        public Node<T> getRight()
        {
            return right;
        }

        public Node<T> getLeft()
        {
            return left;
        }

        public void setValue(T value)
        {
            this.value = value;
        }

        public void setRight(Node<T> right)
        {
            this.right = right;
        }

        public void setLeft(Node<T> left)
        {
            this.left = left;
        }
        public boolean hasRight()
        {
            if (this.right != null)
                return true;
            return false;
        }
        public boolean hasLeft()
        {
            if (this.left != null)
                return true;
            return false;
        }
    }

    private Node<T> root;
    private long lenght;
    private Comparable comparable;

    public MyTree(Comparable compare)
    {
        this.comparable = compare;
        this.root = null;
        this .lenght = 0;
    }
    
    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public long getLenght() {
        return lenght;
    }

    public void setLenght(long lenght) {
        this.lenght = lenght;
    }

    @Override
    public int size() {

        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean add(T t) 
    {
        Node<T> node = new Node<>(t);
        if (this.root == null)
        {
            this.root = node;
            this.lenght++;
            return true;
        }
        Node<T> iter = this.root;
        while (true)
        {
            if (this.comparable.compare(iter, node) == 0)
            {
                return false;
            }
            else if (this.comparable.compare(node, iter) > 0)
            {
                if (iter.hasRight())
                {
                    iter = iter.getRight();
                }
                else 
                {
                    iter.setRight(node);
                    this.lenght++;
                    return true;
                }
            }
            else
            {
                if (iter.hasLeft())
                {
                    iter = iter.getLeft();
                }
                else
                {
                    iter.setLeft(node);
                    this.lenght++;
                    return true;
                }
            }
        }
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }
}
