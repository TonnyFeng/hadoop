package com.tonny.study.design.strategy.duck;


import com.tonny.study.design.strategy.flybehavior.GoodFlyBehavior;
import com.tonny.study.design.strategy.quackbehavior.GaGaQuackBehavior;

public class GreenHeadDuck extends Duck {

	public GreenHeadDuck() {
		mFlyBehavior = new GoodFlyBehavior();
		mQuackBehavior = new GaGaQuackBehavior();
	}

	@Override
	public void display() {
		System.out.println("**GreenHead**");
	}

}