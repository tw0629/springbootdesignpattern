package com.tian.designcode.eventDriven.a_CommandDriven;

import com.tian.designcode.eventDriven.a_CommandDriven.command.Command;
import com.tian.designcode.eventDriven.a_CommandDriven.command.Query;

/**
 * @author David Tian
 * @desc
 * @since 2021-05-27 21:27
 */
public interface Bus {

    <R,C extends Command<R>> R executeCommand(C command);

    <R,Q extends Query<R>> R executeQuery(Q query);
}
