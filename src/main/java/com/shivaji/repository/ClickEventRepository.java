package com.shivaji.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivaji.model.ClickEvent;
import com.shivaji.model.UrlMapping;

@Repository
public interface ClickEventRepository extends JpaRepository<ClickEvent, Long>{
	List<ClickEvent> findByUrlMappingAndClickDateBetween(UrlMapping mapping, LocalDateTime startSate, LocalDateTime endDate);
	List<ClickEvent> findByUrlMappingInAndClickDateBetween(List<UrlMapping> urlMappings, LocalDateTime startDate, LocalDateTime endDate);
}