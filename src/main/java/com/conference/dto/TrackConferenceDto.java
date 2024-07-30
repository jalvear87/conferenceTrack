/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.dto;

import com.conference.entities.TrackConference;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Jose Alvear
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrackConferenceDto {
    
    private String nameTrack;
    private List<TrackConference> listTrackConference;
}
