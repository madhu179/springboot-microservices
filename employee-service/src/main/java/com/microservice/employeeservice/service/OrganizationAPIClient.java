package com.microservice.employeeservice.service;

import com.microservice.employeeservice.dto.OrganizationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="organization-service")
public interface OrganizationAPIClient {

    @GetMapping("api/organizations/{code}")
    OrganizationDto getOrganization(@PathVariable("code") String organizationCode);
}
