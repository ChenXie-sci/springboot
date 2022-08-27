package com.example.demo.services;

import com.example.demo.models.VisitorTModel;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.repositories.VisitorRepository;

@Service
public class VisitorService {
    private VisitorRepository visitorRepo;
    public VisitorService(VisitorRepository initialVisitorRepo){
        this.visitorRepo = initialVisitorRepo;

    }

    public List<VisitorTModel> showAllUser() {
        return visitorRepo.findAll();
    }

    public void createAVisitor(VisitorTModel newVisitor) {
        visitorRepo.save(newVisitor);
    }

    public VisitorTModel getByIdVisitor(Long id) {
        Optional<VisitorTModel> aVisitor = visitorRepo.findById(id);
        if(aVisitor.isPresent()) {
            return aVisitor.get();
        }
        return null;
    }

    public void updateAVisitor(VisitorTModel newVisitor) {
        visitorRepo.save(newVisitor);
    }

    public void deleteByID(Long id) {
        visitorRepo.deleteById(id);
    }

}
