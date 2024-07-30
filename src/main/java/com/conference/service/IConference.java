/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.conference.service;

import com.conference.dto.TrackConferenceDto;
import com.conference.entities.Topics;
import java.util.List;

/**
 *
 * @author Jose Alvear
 */
public interface IConference {
    List<TrackConferenceDto> sesionConference(List<Topics> topic);
}
