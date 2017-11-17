package com.tonny.study.design.bridge;

/**
 * Created by fengwei on 2017/11/17.
 */
public class FlyConcreteImplementor extends MovementImplementor
{
    @Override
    public void move()
    {
        System.out.println(" Fly!!! ");
    }
}
