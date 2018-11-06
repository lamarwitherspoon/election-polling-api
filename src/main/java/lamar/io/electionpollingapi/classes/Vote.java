package lamar.io.electionpollingapi.classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Vote {

    public Vote(){


    }


    private Long id;

    private String options;

    public Vote(Long id, String options) {
        this.id = id;
        this.options = options;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id='" + id + '\'' +
                ", options='" + options + '\'' +
                '}';
    }
}
