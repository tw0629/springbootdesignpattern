package com.tian.designcode.eventDriven.a_CommandDriven.testData;

import com.tian.designcode.eventDriven.a_CommandDriven.handler.CommandHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author David Tian
 * @desc
 * @since 2021-05-27 23:06
 */
@Component
@RequiredArgsConstructor
public class CreatePolicyHandler implements CommandHandler<CreatePolicyResult, CreatePolicyCommand> {

    // private final XXXRepository xxxRepository

    @Override
    public CreatePolicyResult handle(CreatePolicyCommand command) {

        // 1 process logic
        // 2 operate xxxRepository

        return new CreatePolicyResult(UUID.randomUUID(), "1");
    }
}