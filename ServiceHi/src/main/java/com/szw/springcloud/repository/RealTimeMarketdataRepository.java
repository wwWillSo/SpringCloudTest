package com.szw.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.szw.springcloud.entity.RealTimeMarketdata;


@Repository
public interface RealTimeMarketdataRepository extends JpaRepository<RealTimeMarketdata, String>{
}
