package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Dogs;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.service.DogsService;
import com.db.grad.javaapi.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:8080"})
public class SecurityController {

   private SecurityService securityService;

    @Autowired
    public SecurityController(SecurityService ss) {
        securityService = ss;
    }

    @GetMapping("/securities")
    public List<Security> getAllSecurities() {
        return securityService.getAllSecurities();
    }
    @GetMapping("/securities/date")
    public List<Security> getSecurityByDate(@RequestParam Date start, @RequestParam Date end){
        return securityService.getAllSecuritiesByDate(start,end);
    }
    @PostMapping("/securities")
    public Security createSecurity(@Valid @RequestBody Security security) {
        return securityService.saveSecurity(security);
    }

    @GetMapping("/securities/{id}")
    public ResponseEntity<Security> getSecurityById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Security security = securityService.findSecurityById(id);
        return ResponseEntity.ok().body(security);
    }

    @PutMapping("/securities/{id}")
    public ResponseEntity<Security> updateSecurity(@PathVariable(value = "id") Long id,
                                          @Valid @RequestBody Security newSecurityInfo) throws ResourceNotFoundException {

        final Security updatedSecurity = securityService.updateSecurity(id, newSecurityInfo);
        return ResponseEntity.ok(updatedSecurity);
    }




    @DeleteMapping("/securities/{id}")
    public Map<String, Boolean> deleteDog(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Security security = securityService.deleteSecurity(id);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}


