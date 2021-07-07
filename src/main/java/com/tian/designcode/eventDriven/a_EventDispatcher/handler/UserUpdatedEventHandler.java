package com.tian.designcode.eventDriven.a_EventDispatcher.handler;

/**
 * @author David Tian
 * @desc
 * @since 2021-05-27 20:36
 */

import com.tian.designcode.eventDriven.a_EventDispatcher.event.UserUpdatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handles the {@link UserUpdatedEvent} message.
 */
public class UserUpdatedEventHandler implements Handler<UserUpdatedEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserUpdatedEventHandler.class);

    @Override
    public void onEvent(UserUpdatedEvent event) {
        LOGGER.info("User '{}' has been Updated!", event.getUser().getUsername());
    }
}
