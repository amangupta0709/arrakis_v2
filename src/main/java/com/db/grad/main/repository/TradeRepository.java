package com.db.grad.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.grad.main.model.Trade;
import org.springframework.stereotype.Repository;

//import java.sql.Date;
import java.util.List;

@Repository
public interface TradeRepository extends JpaRepository<Trade,Long> {

    List<Trade> findAllTradesById(long id);
}
