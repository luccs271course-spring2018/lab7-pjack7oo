package edu.luc.cs271.linkedstack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // done why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    Node<E> tempNode = top;
    top = new Node<>(obj);
    top.next = tempNode;

    return obj;
  }

  @Override
  public E peek() {
    if (top != null) {
      return top.data;
    }
    else {
      throw new NoSuchElementException();
    }
  }

  @Override
  public E pop() {
    if(top != null) {
      Node<E> tempNode = top;
      top = top.next;
      return tempNode.data;
    }else
      throw new NoSuchElementException();

  }

  @Override
  public boolean isEmpty() {
    if (top == null)
      return true;

    return false;
  }

  @Override
  public List<E> asList() {
    final ArrayList<E> result = new ArrayList<>();
    populateList(top, result); // done replace null with the right reference
    return result;
  }

  private void populateList(final Node<E> curr, final List<E> result) {
    // done recursively populate the list in the desired order
    if(curr == null) {

    }
    else {
      result.add(curr.data);
      populateList(curr.next,result);
    }
  }

  @Override
  public List<E> asFifoList() {
    final ArrayList<E> result = new ArrayList<>();
    populateFifoList(top, result); // done replace null with the right reference
    return result;
  }

  private void populateFifoList(final Node<E> curr, final List<E> result) {
    // done recursively populate the list in the desired order
    if(curr == null) {

    }
    else {
      result.add(0,curr.data);
      populateFifoList(curr.next,result);
    }
  }
}
