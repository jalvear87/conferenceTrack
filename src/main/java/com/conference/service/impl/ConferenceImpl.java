package com.conference.service.impl;

import com.conference.dto.TrackConferenceDto;
import com.conference.entities.Topics;
import com.conference.entities.TrackConference;
import com.conference.service.IConference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Alvear
 */

@Service
public class ConferenceImpl implements IConference{
    
    private int sumMorningMinutes = 0;
    private int sumAfternoonMinutes = 0;
    private int contTrack = 1;

    @Value("${morning.minutes}")
    private int morningMinutes;
    
    @Value("${afternoon.minutes}")
    private int afternoonMinutes;
    
    @Value("${time.lunch}")
    private int timeLunch;
    
    @Override
    public List<TrackConferenceDto> sesionConference(List<Topics> topic) {
        
        int TalkIndex;
        
        //Format hours
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:s a");
        
        //Dto response
        List<TrackConferenceDto> listTrackConferenceDto = new  ArrayList<TrackConferenceDto>();
        
        //List the Track conference
        List<TrackConference> listTrack = new ArrayList<TrackConference>();
        
        contTrack = 1;
        
        for (int topicIndex=0; topicIndex < topic.size(); topicIndex++){
            Calendar cal = new GregorianCalendar();
            
            //Inicialize values
            cal.set(Calendar.HOUR, 9);
            cal.set(Calendar.MINUTE, 0);        
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.AM_PM, Calendar.AM);            
            sumMorningMinutes = morningMinutes;
            sumAfternoonMinutes = afternoonMinutes;
            
            //DTO
            TrackConferenceDto trackConferenceDto = new TrackConferenceDto();
            trackConferenceDto.setNameTrack("Track: " + contTrack);
            trackConferenceDto.setListTrackConference(listTrack);
            listTrackConferenceDto.add(trackConferenceDto);
            contTrack ++;

            //Bucle for morning the sessions
            for (TalkIndex=topicIndex; TalkIndex < topic.size(); TalkIndex++){
                
                
                if(sumMorningMinutes >= topic.get(TalkIndex).getDuration() || sumMorningMinutes > 0){
                    sumMorningMinutes -= topic.get(TalkIndex).getDuration();
                    listTrack.add(loadObject(sdf.format(cal.getTime()), topic.get(TalkIndex).getTitle(), topic.get(TalkIndex).getDuration(), "AM"));
                    cal.add(Calendar.MINUTE, topic.get(TalkIndex).getDuration());
                }
                if(sumMorningMinutes <= 0 || sumMorningMinutes < topic.get(TalkIndex).getDuration()) { 
                    break; 
                }
            }
            
            //Time lunch the 60 minutes at 12:00:0 p. m.
            listTrack.add(loadObject("12:00:0 p. m.", "Time Lunch", timeLunch, "PM"));
            //Inicialize values  
            cal.add(Calendar.MINUTE, timeLunch);
            TalkIndex++;
            
            //Bucle for afternoon the sessions
            for(;TalkIndex < topic.size(); TalkIndex++) {
                // Get the combination of 240 and fill it
                if (sumAfternoonMinutes >= topic.get(TalkIndex).getDuration() || sumAfternoonMinutes > 0) {
                    sumAfternoonMinutes -= topic.get(TalkIndex).getDuration();
                    listTrack.add(loadObject(sdf.format(cal.getTime()), topic.get(TalkIndex).getTitle(), topic.get(TalkIndex).getDuration(), "PM"));
                    cal.add(Calendar.MINUTE, topic.get(TalkIndex).getDuration());
                }
                if (sumAfternoonMinutes < topic.get(TalkIndex).getDuration() || sumAfternoonMinutes <= 0)
                    break;
            }
            
            listTrack.add(loadObject("17:00:0 p. m.", "Networking Event", timeLunch, "PM"));
            //cal.add(Calendar.MINUTE, timeLunch);
            TalkIndex++;
        }
        return listTrackConferenceDto;
    }
    
    /*******
     * Return load object Track Conference
     * @param sessionTime
     * @param title
     * @param duration
     * @param formatTime
     * @return 
     */
    private TrackConference loadObject(String sessionTime, String title, int duration, String formatTime ) {
        return TrackConference.builder()
                .sessionTime(sessionTime)
                .titleSession(title)
                .durationSession(duration)
                .lightning(duration == 5 ? true : false)
                .formatTime(formatTime).build();
    }
}
