package com.cognizant.mentor.service;

import java.util.List;
import java.util.Optional;

import com.cognizant.mentor.model.TrainingDetails;


public interface TrainingRepository {
    public List<TrainingDetails> getAllCustomers();
    public List<TrainingDetails> getCompletedTrainings();
    public Iterable<TrainingDetails> findAll();
    public TrainingDetails save(TrainingDetails trainingDetails);
    public Optional<TrainingDetails> findById(long id);
    public void findCompletedTrainings(String string); 

}
