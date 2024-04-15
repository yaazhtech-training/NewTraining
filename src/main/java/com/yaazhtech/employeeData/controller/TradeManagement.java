package com.yaazhtech.employeeData.controller;

import com.yaazhtech.employeeData.data.EmployeeData;
import com.yaazhtech.employeeData.data.TradeData;
import com.yaazhtech.employeeData.model.EmployeeInfo;
import com.yaazhtech.employeeData.model.TradeInfo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface TradeManagement {


    @PostMapping("/save")
    public String saveTradeData(@RequestBody TradeInfo tradeInfo);

    @GetMapping("/getAllTrade")//to retrieve all the list in the table
    public List<TradeData> getAllTrade();


    @GetMapping("/{id}")//retrieve based on id
    public TradeData getTradeId(@PathVariable Long id);


    @DeleteMapping("/{id}")
    public void deleteTradeId(@PathVariable Long id);


    @PutMapping("/{id}")
    public TradeData updateTrade(@PathVariable Long id, @RequestBody TradeData updateTrade);
}
