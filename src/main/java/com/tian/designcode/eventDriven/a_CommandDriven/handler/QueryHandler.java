package com.tian.designcode.eventDriven.a_CommandDriven.handler;

import com.tian.designcode.eventDriven.a_CommandDriven.command.Query;

/**
 * @author David Tian
 * @desc
 * @since 2021-05-27 21:33
 */
public interface QueryHandler<R,Q extends Query<R>> {

    R handle(Q query);
}
