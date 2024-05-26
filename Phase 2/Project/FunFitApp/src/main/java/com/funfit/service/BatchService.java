package com.funfit.service;

import java.util.List;

import com.funfit.bean.Batch;
import com.funfit.dao.BatchDao;

public class BatchService {
	
	BatchDao db = new BatchDao(); //create BatchDao obj
	public String addBatch(Batch batch) {
		if(db.addBatch(batch) > 0) {
			return "Batch details added";
		} else {
			return "Batch details not added";
		}
		
	}
	
	public List<Batch> viewAllBatch() {
		return db.viewAllBatches();
	}
	
	// Delete batches using the ID
	public String deleteBatch(int bid) {
        if (db.deleteBatch(bid) > 0) {
            return "Batch deleted successfully";
        } else {
            return "Failed to delete batch";
        }
    }

}
