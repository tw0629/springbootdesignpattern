package com.tian.designcode.eventDriven.a_CommandDriven.testData;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

/**
 * @author David Tian
 * @desc
 * @since 2021-05-27 23:04
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreatePolicyResult {

    private UUID policyId;

    private String policyNumber;

}
