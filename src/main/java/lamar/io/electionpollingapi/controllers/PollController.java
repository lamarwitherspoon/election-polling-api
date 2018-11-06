package lamar.io.electionpollingapi.controllers;

import lamar.io.electionpollingapi.classes.Poll;
import lamar.io.electionpollingapi.classes.TotalVotesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PollController {

    private TotalVotesService totalVotesService;

    @RequestMapping(value = "/vote", method = RequestMethod.GET)
    public List<Poll> getVoters() {
        return totalVotesService.getAllVoters();
    }

    public  void addVoter(Poll vote){

      

    }

}
