package com.tian.designcode.eventDriven.a_CommandDriven.handler;

import com.tian.designcode.eventDriven.a_CommandDriven.command.Command;

/**
 * @author David Tian
 * @desc
 * @since 2021-05-27 21:32
 */
public interface CommandHandler<R,C extends Command<R>> {

    R handle(C command);
}
