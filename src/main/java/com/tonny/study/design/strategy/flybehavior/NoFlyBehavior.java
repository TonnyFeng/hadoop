package com.tonny.study.design.strategy.flybehavior;


public class	NoFlyBehavior implements FlyBehavior
{
	@Override
	public void fly() {
		System.out.println("--NoFly--");
	}
}
