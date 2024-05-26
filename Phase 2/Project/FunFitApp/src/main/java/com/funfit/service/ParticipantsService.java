package com.funfit.service;

import java.util.List;

import com.funfit.bean.Participants;
import com.funfit.dao.ParticipantsDao;

public class ParticipantsService {
	ParticipantsDao pd = new ParticipantsDao(); // new ParticipantsDao obj
	
	public String addParticipants(Participants participants) { // create addParticipants method
		if(pd.addParticipants(participants) > 0) {
			return "Participant details added successfully";
		} else {
			return "Participants details not added";
		}
	}
	public List<Participants> viewAllParticipants() {
		return pd.viewAllParticipants();
	}
	
	// Delete participants using the ID
		public String deleteParticipant(int pid) {
	        if (pd.deleteParticipant(pid) > 0) {
	            return "Participant deleted successfully";
	        } else {
	            return "Failed to delete participant";
	        }
	    }
}
