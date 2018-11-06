package lamar.io.electionpollingapi.classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Poll {

        private Long id;

        private String questions;


public Poll(int i, String questions){


}
        
        
        public Poll(Long id, String questions){
            
            this.id=id;
            this.questions=questions;
        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getquestions() {
        return questions;
    }

    public void setquestions(String questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Poll{" +
                "id=" + id +
                ", questions='" + questions + '\'' +
                '}';
    }
}
