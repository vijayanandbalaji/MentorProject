package com.cognizant.mentor.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.mentor.model.TrainingDetails;
import com.cognizant.mentor.service.TrainingRepository;

@CrossOrigin(origins = "http://localhost:4201")
@RestController
@RequestMapping("/api")
public class TrainingController {
       
       @Autowired
       TrainingRepository trainingRepository;
       
       @GetMapping("/trainings")
       public List<TrainingDetails> getAllCustomers() {
              System.out.println("Get all Customers...");
        
              List<TrainingDetails> trainingDetails = new ArrayList<>();
              
              trainingRepository.findAll().forEach(trainingDetails::add);

              return trainingDetails;
       }
       
       
       @PostMapping(value = "/trainings/create")
       public TrainingDetails postCustomer(@RequestBody TrainingDetails trainingDetails) {
                   
              TrainingDetails _training = trainingRepository.save(trainingDetails);
              return _training;
       }
       
       @GetMapping("/propose/{id}")
       public ResponseEntity<TrainingDetails> updateTrainingDetails(@PathVariable("id") long id, @RequestBody TrainingDetails training) {
              
              System.out.println("inside propose");
              System.out.println("Update TrainingDetails with id = " + id + "...");

              Optional<TrainingDetails> trainingdata = trainingRepository.findById(id);

              if (trainingdata.isPresent()) {
                     TrainingDetails _training = trainingdata.get();
                     _training.setStatus("proposed");
                     return new ResponseEntity<>(trainingRepository.save(_training), HttpStatus.OK);
              } else {
                     return new ResponseEntity<>(HttpStatus.NOT_FOUND);
              }
       }

@GetMapping("/approve/{id}")
public ResponseEntity<TrainingDetails> updateTrainingDetailstatus(@PathVariable("id") long id, @RequestBody TrainingDetails training) {
       System.out.println("inside approve");
       System.out.println("Update TrainingDetails with ID = " + id + "...");

       Optional<TrainingDetails> trainingdata = trainingRepository.findById(id);

       if (trainingdata.isPresent()) {
              TrainingDetails _training = trainingdata.get();
              _training.setStatus("approved");
              return new ResponseEntity<>(trainingRepository.save(_training), HttpStatus.OK);
       } else {
              return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
}      
@GetMapping("/trainingsCompleted")
public List<TrainingDetails> getCompletedTrainings() {
       
    
       List<TrainingDetails> trainingDetails = (List<TrainingDetails>) new TrainingDetails();
       
       trainingRepository.findCompletedTrainings("completed");

       return trainingDetails;
}

}
