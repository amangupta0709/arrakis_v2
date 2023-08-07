package com.db.grad.javaapi.service;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Dogs;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class SecurityService {

    @Autowired
    SecurityRepository securityRepository;


    public Security saveSecurity(Security security )
    {
        return securityRepository.saveAndFlush(security);
    }
    public List<Security> getAllSecurities()
    {
        return securityRepository.findAll();
    }

    public List<Security> getAllSecuritiesByDate(Date start, Date end)
    {
        List<Security> filteredSecurities =  securityRepository.findAllByMaturityDateBetween(start,end);
//                .orElseThrow(() -> new ResourceNotFoundException("Security not found for this date range:: "));
        return filteredSecurities;
    }

    public Security findSecurityById(long id ) throws ResourceNotFoundException
    {
        Security  security = securityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Security not found for this id :: " + id));
        return security;
    }

    public Security updateSecurity( long id, Security newSecurityInfo) throws ResourceNotFoundException
    {
        Security securityToUpdate = securityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Security not found for this id :: " + id));

        securityToUpdate.setStatus(newSecurityInfo.getStatus());

        final Security updatedSecurity = securityRepository.save(securityToUpdate);

        return updatedSecurity;
    }


    public Security deleteSecurity( long id ) throws ResourceNotFoundException
    {
        Security security = securityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Security not found for this id :: " + id));

        securityRepository.delete(security);

        return security;
    }
}
