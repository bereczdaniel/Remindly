package com.blanyal.remindme;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReminderTest {
    Reminder reminder;

    final private String title = "Test title";
    final private String date = "2017-05-04";
    final private String time = "12:00";
    final private String repeatType = "Minute";
    private String active = "True";

    @Before
    public void setUp() throws Exception {
        reminder = new Reminder(0, title, date, time, "", "", repeatType, active);
    }

    @Test
    public void getTitle() throws Exception {
        assertEquals(title, reminder.getTitle());
    }

    @Test
    public void setTitle() throws Exception {
        String otherTitle = "Another title";
        reminder.setTitle(otherTitle);
        assertEquals(otherTitle, reminder.getTitle());
    }

    @Test
    public void getDate() throws Exception {
        assertEquals(date, reminder.getDate());
    }

    @Test
    public void setDate() throws Exception {
        String otherDate = "2042-05-04";
        reminder.setDate(otherDate);
        assertEquals(otherDate, reminder.getDate());
    }

    @Test
    public void getTime() throws Exception {
        assertEquals(time, reminder.getTime());
    }

    @Test
    public void setTime() throws Exception {
        String otherTime = "14:39";
        reminder.setTime(otherTime);
        assertEquals(otherTime, reminder.getTime());
    }

    @Test
    public void getRepeatType() throws Exception {
        assertEquals(repeatType, reminder.getRepeatType());
    }

    @Test
    public void setRepeatType() throws Exception {
        String otherRepeatType = "Minute";
        reminder.setRepeatType(otherRepeatType);
        assertEquals(otherRepeatType, reminder.getRepeatType());
    }

}