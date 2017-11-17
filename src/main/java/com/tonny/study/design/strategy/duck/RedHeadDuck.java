package com.tonny.study.design.strategy.duck;


import com.tonny.study.design.strategy.flybehavior.BadFlyBehavior;
import com.tonny.study.design.strategy.quackbehavior.GeGeQuackBehavior;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		mFlyBehavior = new BadFlyBehavior();
		mQuackBehavior = new GeGeQuackBehavior();
	}

	@Override
	public void display() {
		System.out.println("**RedHead**");
	}

}
