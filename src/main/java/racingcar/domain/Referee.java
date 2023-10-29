package racingcar.domain;

import java.util.List;

public class Referee {
    public void printWinner(List<String> winner){
        String winners  = new String();
        int totalWinnerNumber = winner.size();
        for(String name : winner){
            winners += name;
            if(totalWinnerNumber > 1){
                winners +=",";
                totalWinnerNumber--;
            }
        }
        System.out.print("최종 우승자 : ");
        System.out.println(winners);
    }
}
