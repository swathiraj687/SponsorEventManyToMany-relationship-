/*
 * You can use the following import statements
 *
 * import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 * 
 * import javax.persistence.*;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.eventmanagementsystem.model;

import javax.persistence.*;

import com.example.eventmanagementsystem.model.Sponsor;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
@Table(name = "event")
public class Event {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventId;
    @Column(name = "eventname")
    private String eventName;
    @Column(name = "date")
    private String date;
    @ManyToMany(mappedBy = "events")
    private List<Sponsor> sponsors = new ArrayList<>();

    public Event() {
    }

    public Event(int eventId, String eventName, String date, List<Sponsor> sponsors) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.date = date;
        this.sponsors = sponsors;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void setSponsors(List<Sponsor> sponsors) {
        this.sponsors = sponsors;
    }
}
