package com.db.grad.main.controller;

import com.db.grad.main.exception.ResourceNotFoundException;
import com.db.grad.main.model.Security;
import com.db.grad.main.model.Trade;
import com.db.grad.main.projection.TradeProjection;
import com.db.grad.main.service.SecurityService;
import com.db.grad.main.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/trade")
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:8080"})
public class TradeController {

   private TradeService tradeService;
   private SecurityService securityService;

    @Autowired
    public TradeController(TradeService ts,SecurityService ss) {
        securityService =ss;
        tradeService = ts;
    }

    @GetMapping("/")
    public List<TradeProjection> getAllTrades() {
        return tradeService.getAllTradesFiltered();
    }

    @PostMapping("/")
    public Trade createTrade(@Valid @RequestBody Trade trade) {
        return tradeService.saveTrade(trade);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TradeProjection> getTradeById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        TradeProjection trade = tradeService.findTradeById(id);
        return ResponseEntity.ok().body(trade);
    }

    @GetMapping("/{TradeId}/security")
    public ResponseEntity<Security> getSecurityByTradeId(@PathVariable(value = "TradeId") Long id)
            throws ResourceNotFoundException {
        Security security = tradeService.getSecurityByTradeId(id);
        return ResponseEntity.ok().body(security);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Trade> updateTradeById(@PathVariable(value = "id") Long id, @Valid @RequestBody Trade newTradeInfo)
            throws ResourceNotFoundException {
        Trade trade = tradeService.updateTrade(id,newTradeInfo);
        return ResponseEntity.ok().body(trade);
    }
}


