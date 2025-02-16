package com.clientGuideline.demo.repository;

import com.clientGuideline.demo.model.ClientGuideline;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientGuidelineRepository extends JpaRepository<ClientGuideline, Long> {

    List<ClientGuideline> findByServiceIdAndCustomerId(Long serviceId, Long customerId);
}
