package com.tonny.study.design.strategy;

/**
 * Created by fengwei on 2017/11/9.
 */
public class MemberContext {
    private MemberStrategy memberStrategy = null;

    public MemberContext(final MemberStrategy memberStrategy)
    {
        this.memberStrategy = memberStrategy;
    }

    public double discount()
    {
        if( null != memberStrategy) {
            return this.memberStrategy.discount();
        }else {
            System.out.println( " 策略行为没有设置 " );
            return 0;
        }
    }
}
