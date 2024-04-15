package com.yaazhtech.employeeData.controller;

import com.yaazhtech.employeeData.data.EmployeeData;
import com.yaazhtech.employeeData.data.TradeData;
import com.yaazhtech.employeeData.model.EmployeeInfo;
import com.yaazhtech.employeeData.model.TradeInfo;
import com.yaazhtech.employeeData.repository.EmployeeRepo;
import com.yaazhtech.employeeData.repository.TradeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class TradeController implements TradeManagement {

    @Autowired
    TradeRepo tradeRepo;


    @Override
    public String saveTradeData(TradeInfo tradeInfo) {

        TradeData tradeData=new TradeData();
        tradeData.setId(tradeInfo.getId());
        tradeData.setCompanyName(tradeInfo.getCompanyName());
        tradeData.setOpen(tradeInfo.getOpen());
        tradeData.setClose(tradeInfo.getClose());
        tradeData.setHigh(tradeInfo.getHigh());
        tradeData.setLow(tradeInfo.getLow());
        return "Trade data is saved successfully";
    }

    @Override
    public List<TradeData> getAllTrade() {
        return tradeRepo.findAll();
    }

    @Override
    public TradeData getTradeId(Long id) {
        return tradeRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteTradeId(Long id) {tradeRepo.deleteById(id);

    }

    @Override
    public TradeData updateTrade(Long id, TradeData updateTrade) {

        TradeData existingTrade = tradeRepo.findById(id).orElse(null);
        if(existingTrade!=null)
        {
            existingTrade.setOpen(updateTrade.getOpen());
            existingTrade.setLow(updateTrade.getLow());
        }
        return tradeRepo.save(existingTrade);
    }
}
