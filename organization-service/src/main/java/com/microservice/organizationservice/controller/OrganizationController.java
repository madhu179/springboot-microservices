package com.microservice.organizationservice.controller;

import com.microservice.organizationservice.dto.OrganizationDTO;
import com.microservice.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/organizations/")
@AllArgsConstructor
public class OrganizationController {

    private OrganizationService organizationService;

    // Build Save Organization REST API
    @PostMapping
    public ResponseEntity<OrganizationDTO> saveOrganization(@RequestBody OrganizationDTO organizationDTO){
        OrganizationDTO savedOrganization = organizationService.saveOrganization(organizationDTO);
        return new ResponseEntity<>(savedOrganization, HttpStatus.CREATED);
    }

    // Build Get Organization by Code REST API
    @GetMapping("{code}")
    public ResponseEntity<OrganizationDTO> getOrganization(@PathVariable("code") String organizationCode){
        OrganizationDTO organizationDTO = organizationService.getOrganizationByCode(organizationCode);
        return ResponseEntity.ok(organizationDTO);
    }

}
