package com.tonny.study.design.bridge;

/**
 * Created by fengwei on 2017/11/17.
 */
public class DogRefinedAbstraction extends Abstraction
{
    public DogRefinedAbstraction(final MovementImplementor implementor)
    {
        super(implementor);
    }

    @Override
    public void move()
    {
        System.out.print("dogs");
        super.move();
    }
}
