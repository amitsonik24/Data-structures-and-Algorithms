package com.algorithms.main;

public class LIFOStackNode<E> {

	private E content;
	private E reference;
	LIFOStackNode(E content, E reference){
		this.content=content;
		this.reference=reference;
	}
	public E getContent() {
		return content;
	}
	public void setContent(E content) {
		this.content = content;
	}
	public E getReference() {
		return reference;
	}
	public void setReference(E reference) {
		this.reference = reference;
	}
	
	
}
