package com.tonny.study.design.strategy.oo;

public class StoneDuck extends Duck {

	@Override
	public void display() {
		System.out.println("**StoneDuck**");
	}

	@Override
	public void Quack() {
		System.out.println("~~no gaga~~");
	}
	@Override
	public void swim() {
		System.out.println("~~no swim~~");
	}
	@Override
	public void Fly() {
		System.out.println("~~no fly~~");
	}
}
