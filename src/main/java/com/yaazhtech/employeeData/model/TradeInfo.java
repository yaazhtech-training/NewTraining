package com.yaazhtech.employeeData.model;

import lombok.Data;

@Data
public class TradeInfo {

    private Long id;
    private String companyName;
    private String high;
    private String low;
    private String open;
    private String close;
}
