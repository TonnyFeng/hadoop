package com.tonny.study.design.strategy.flybehavior;



public class	BadFlyBehavior implements FlyBehavior
{
	@Override
	public void fly() {
		System.out.println("--BadFly--");
	}
}
