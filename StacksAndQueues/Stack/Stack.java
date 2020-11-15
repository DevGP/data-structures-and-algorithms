package StacksAndQueues.Stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {

  private List<Integer> list;

  /**
   * Constructor for the Stack
   */
  public Stack() {
    this.list = new ArrayList<>();
  }

  /**
   * Pushes an item into the stack
   * 
   * @param item : The element to be pushed into the stack
   */
  public void push(int item) {
    this.list.add(item);
  }

  /**
   * Returns and removes the topmost item from the stack
   * 
   * @return An integer value containing the top most item from the stack after
   *         removing it
   */
  public int pop() {
    return this.list.remove(this.list.size() - 1);
  }

  /**
   * Returns the topmost item from the stack
   * 
   * @return An integer value containing the top most item from the stack
   */
  public int peek() {
    return this.list.get(this.list.size() - 1);
  }

  /**
   * Returns true if the stack is empty, otherwise false
   * 
   * @return A boolean value determining if the stack is empty or not
   */
  public boolean isEmpty() {
    return this.list.isEmpty();
  }

  /**
   * The current size of the stack
   * 
   * @return A boolean value containing the current size of the stack
   */
  public int size() {
    return this.list.size();
  }

  @Override
  public String toString() {
    return this.list.toString();
  }
}