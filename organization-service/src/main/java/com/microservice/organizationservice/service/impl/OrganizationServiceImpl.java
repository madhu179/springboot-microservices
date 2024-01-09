package com.microservice.organizationservice.service.impl;

import com.microservice.organizationservice.dto.OrganizationDTO;
import com.microservice.organizationservice.entity.Organization;
import com.microservice.organizationservice.mapper.OrganizationMapper;
import com.microservice.organizationservice.repository.OrganizationRepository;
import com.microservice.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDTO saveOrganization(OrganizationDTO organizationDTO) {

        // convert OrganizationDTO into Organization jpa entity
        Organization organization = OrganizationMapper.mapToOrganization(organizationDTO);

        Organization savedOrganization = organizationRepository.save(organization);

        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDTO getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }

}
