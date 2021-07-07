package com.tian.designcode.eventDriven.a_CommandDriven;

import com.tian.designcode.eventDriven.a_CommandDriven.testData.CreatePolicyCommand;
import com.tian.designcode.eventDriven.a_CommandDriven.testData.CreatePolicyResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

/**
 * @author David Tian
 * @desc
 * @since 2021-05-27 23:04
 */
@RestController
@RequiredArgsConstructor
public class App {

    private final Bus bus;

    @PostMapping
    public ResponseEntity<CreatePolicyResult> createPolicy(@RequestBody CreatePolicyCommand command) {
        return ok(bus.executeCommand(command));
    }

}
