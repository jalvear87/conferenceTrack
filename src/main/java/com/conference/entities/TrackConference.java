/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.entities;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Jose Alvear
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrackConference {
   
    //Declaration of variables
    private String titleSession;
    private String sessionTime;
    private int durationSession;
    private String formatTime;
    private boolean lightning;
}
