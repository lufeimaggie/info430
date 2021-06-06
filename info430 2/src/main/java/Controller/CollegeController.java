package Controller;

import Entity.College;
import Entity.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CollegeController {
    @Autowired
    private CollegeRepository collegeRepository;

    @GetMapping
    public List<College> getColleges() {
        return collegeRepository.findAll();
    }

}
