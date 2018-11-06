package lamar.io.electionpollingapi.classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TotalVotesService {

    List<Poll> voters = new ArrayList<>(
            Arrays.asList(
                    new Poll(34534,"who are you voting for?"),
                    new Poll(27364,"who are you voting for ?")



            )
    );
    public List<Poll>getAllVoters(){
        return getAllVoters();
    }


}
