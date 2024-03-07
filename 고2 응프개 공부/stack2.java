package stack1;

import java.util.EmptyStackException;

class Stack<T> {
	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	private Node<T> top;

	public T pop() { //stack에서 데이터 빼기
		if (top == null) {
			throw new EmptyStackException(); //만약 top이 없다면 예외처리를 한다
		}
		
		T item = top.data; //item에 top의 data를 저장하고
		top = top.next; //top은 top의 다음으로 넘어가서 하나가 없어지고
		return item; //뽑은 데이터를 return한다
	}
	
	public void push(T item) { //stack에서 데이터 넣기
		Node<T> t = new Node<T>(item); //노드를 t로 선언하고 노드(넣을 데이터)로 선언한다
		t.next = top; //이전 데이터로 저장
		top = t; //top은 t로 새롭게 이동
	}
	
	public T peek() { //stack에서 맨 위에 있는 것을 확인
		if (top == null) {
			throw new EmptyStackException(); //만약 top의 data가 없다면 예외처리
		}
		return top.data; //top의 data를 return한다
	}
	
	public boolean isEmpty() { //stack의 데이터들이 비어있는지 체크
		return top == null; //top은 null값임을 return한다
	}
}

public class stack2 {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1); //stack에 1 데이터 넣기
		s.push(2); //stack에 2 데이터 넣기
		s.push(3); //stack에 3 데이터 넣기
		s.push(4); //stack에 4 데이터 넣기
		System.out.println(s.pop()); //stack에서 맨 위 데이터 빼기
		System.out.println(s.pop()); //stack에서 맨 위 데이터 빼기
		System.out.println(s.peek()); //stack에서 맨 위 데이터 확인
		System.out.println(s.pop()); //stack에서 맨 위 데이터 빼기
		System.out.println(s.isEmpty()); //stack이 비어있는지 확인
		System.out.println(s.pop()); //stack에서 맨 위 데이터 빼기
		System.out.println(s.isEmpty()); //stack이 비어있는지 확인
		
		
	}
}
