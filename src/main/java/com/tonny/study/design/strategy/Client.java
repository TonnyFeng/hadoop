package com.tonny.study.design.strategy;

/**
 * Created by fengwei on 2017/11/9.
 */
public class Client {
    public static void main(final String[] args)
    {
        final MemberStrategy strategy = new PrimaryMember();
        final MemberContext memberContext = new MemberContext(strategy);
        System.out.println("primary member discount:" + memberContext.discount());

        final MemberStrategy strategy1 = new IntermediateMember();
        final MemberContext memberContext1 = new MemberContext(strategy1);
        System.out.println("intermediate member discount:" + memberContext1.discount());

        final MemberStrategy strategy2 = new AdvancedMember();
        final MemberContext memberContext2 = new MemberContext(strategy2);
        System.out.println("advanced member discount:" + memberContext2.discount());
    }
}
