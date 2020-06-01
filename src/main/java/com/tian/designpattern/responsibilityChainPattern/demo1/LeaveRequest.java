package com.tian.designpattern.responsibilityChainPattern.demo1;

import lombok.*;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-18 19:21
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeaveRequest {
    /**天数*/
    private int leaveDays;

    /**姓名*/
    private String name;
}

