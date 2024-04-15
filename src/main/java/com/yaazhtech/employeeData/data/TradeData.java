package com.yaazhtech.employeeData.data;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="joanna")
public class TradeData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)

    private Long id;
    private String companyName;
    private String high;
    private String low;
    private String open;
    private String close;
}
