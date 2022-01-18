

import java.util.ArrayList;
import java.util.List;

public class FlashCard {

    private String question;
    private List<String> options;
    private String answer;

    public FlashCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public String getAnswer() {
        return answer;
    }

    // method for adding in guessing options when doing the quiz for each
    // card. this can be done in a randomized fashion.
    public void addOption(String option) {
        if(null!=option){
           if(null==options){
               options=new ArrayList<>();
           }
            for (String option1 : options) {
                if(option1.equalsIgnoreCase(option)){
                    throw new RuntimeException("Option already exist");
                }
            }
            options.add(option);
        }
    }
}
