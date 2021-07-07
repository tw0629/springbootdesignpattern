package com.tian.designcode.eventDriven.a_EventDispatcher.handler;

/**
 * @author David Tian
 * @desc
 * @since 2021-05-27 20:13
 */

import com.tian.designcode.eventDriven.a_EventDispatcher.event.UserCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handles the {@link UserCreatedEvent} message.
 */
public class UserCreatedEventHandler implements Handler<UserCreatedEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserCreatedEventHandler.class);

    @Override
    public void onEvent(UserCreatedEvent event) {
        LOGGER.info("User '{}' has been Created!", event.getUser().getUsername());
    }

}