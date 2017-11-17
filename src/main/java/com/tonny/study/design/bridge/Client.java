package com.tonny.study.design.bridge;

/**
 * Created by fengwei on 2017/11/17.
 */
public class Client
{
    public static void main(final String[] args)
    {
        final MovementImplementor fly = new FlyConcreteImplementor();
        final MovementImplementor jump = new JumpConcreteImplement();

        final Abstraction chick = new ChickRefinedAbstraction(fly);
        final Abstraction dog = new DogRefinedAbstraction(jump);

        chick.move();
        dog.move();
    }
}