package com.conference.service.impl;

import com.conference.dto.TrackConferenceDto;
import com.conference.entities.Topics;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Alvear
 */
public class ConferenceImplTest {
    
    public ConferenceImplTest() {
    }

    /**
     * Test of sesionConference method, of class ConferenceImpl.
     */
    @Test
    public void testSesionConference() {
        System.out.println("sesionConference");
        Topics t = new Topics("Test JUnit", 60);
        Topics t2 = new Topics("React native", 60);
        Topics t3 = new Topics("Java version error", 60);

        List<Topics> topic = new ArrayList<Topics>();
        topic.add(t);
        topic.add(t2);
        topic.add(t3);
        
        ConferenceImpl instance = new ConferenceImpl();
        List<TrackConferenceDto> expResult = null;
        List<TrackConferenceDto> result = instance.sesionConference(topic);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testSesionConferenceEquals() {
        System.out.println("sesionConference");
        Topics t = new Topics("Test JUnit", 60);
        Topics t2 = new Topics("React native", 60);
        Topics t3 = new Topics("Java version error", 60);

        List<Topics> topic = new ArrayList<Topics>();
        topic.add(t);
        topic.add(t2);
        topic.add(t3);
        
        List<Topics> topic2 = new ArrayList<Topics>();
        topic2.add(t);
        topic2.add(t2);
        topic2.add(t3);
        
        ConferenceImpl instance = new ConferenceImpl();
        List<TrackConferenceDto> expResult = instance.sesionConference(topic2);
        List<TrackConferenceDto> result = instance.sesionConference(topic);
        assertEquals(expResult, result);
    }
}
