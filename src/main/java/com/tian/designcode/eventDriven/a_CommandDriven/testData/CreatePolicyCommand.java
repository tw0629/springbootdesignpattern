package com.tian.designcode.eventDriven.a_CommandDriven.testData;

import com.tian.designcode.eventDriven.a_CommandDriven.command.Command;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * @author David Tian
 * @desc
 * @since 2021-05-27 23:03
 */
@Getter
@Setter
public class CreatePolicyCommand implements Command<CreatePolicyResult> {

    private String offerNumber;

    private LocalDate purchaseDate;

    private LocalDate policyStartDate;

}
