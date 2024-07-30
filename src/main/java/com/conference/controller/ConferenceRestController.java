/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.controller;

import com.conference.dto.TrackConferenceDto;
import com.conference.entities.Topics;
import com.conference.service.IConference;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.conference.entities.TrackConference;
import com.conference.exception.BussinesRuleException;
import java.net.UnknownHostException;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author Jose Alvear
 */
@Tag(name = "Conference API", description = "This API Rest service")
@RestController
@RequestMapping("/conference")
public class ConferenceRestController {
    
    @Autowired
    private IConference conference;
    
    @Operation(description = "Return all sessions of the day for the conference", summary ="Return 204 if no data found")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Success"),
    @ApiResponse(responseCode = "500", description = "Internal error")})
    @PostMapping
    public ResponseEntity<?> listTopicsConference(@RequestBody List<Topics> topics) throws BussinesRuleException, UnknownHostException{
        
        List<TrackConferenceDto> list = conference.sesionConference(topics);
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
    
}
