package com.db.grad.main.controller;


import com.db.grad.main.exception.ResourceNotFoundException;
import com.db.grad.main.model.Security;
import com.db.grad.main.projection.SecuritiesProjection;
import com.db.grad.main.service.SecurityService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Date;

import java.util.*;

@RestController
@RequestMapping("/api/security")
@CrossOrigin(origins = "*")
public class SecurityController {
    private SecurityService securityService;

    @Autowired
    public SecurityController(SecurityService ss) {
        securityService = ss;
    }

    @GetMapping("/")
    public List<SecuritiesProjection> getAllSecurities() {
        return securityService.getAllSecurities();
    }

    @GetMapping("/date")
    public List<Security> getSecurityByDate(@RequestParam Date start, @RequestParam Date end){
        return securityService.getAllSecuritiesByDate(start,end);
    }

    @PostMapping("/")
    public Security createSecurity(@Valid @RequestBody Security security) {
        return securityService.saveSecurity(security);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Security> getSecurityById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Security security = securityService.findSecurityById(id);
        return ResponseEntity.ok().body(security);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Security> updateSecurity(@PathVariable(value = "id") Long id,
                                                   @Valid @RequestBody Security newSecurityInfo) throws ResourceNotFoundException {

        final Security updatedSecurity = securityService.updateSecurity(id, newSecurityInfo);
        return ResponseEntity.ok(updatedSecurity);
    }




    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteSecurity(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Security security = securityService.deleteSecurity(id);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
