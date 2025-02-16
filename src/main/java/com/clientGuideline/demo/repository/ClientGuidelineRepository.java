package com.clientGuideline.demo.repository;

import com.clientGuideline.demo.model.ClientGuideline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientGuidelineRepository extends JpaRepository<ClientGuideline, Long> {

    @Query("SELECT cg FROM ClientGuideline cg WHERE cg.serviceId = :serviceId or cg.serviceId = 0 and cg.customerId = :customerId or cg.customerId = 0")
    List<ClientGuideline> findByServiceIdAndCustomerId(Long serviceId, Long customerId);
}
