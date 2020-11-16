import events.HelloEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {

    public static void main(String[] args) throws Exception{

        JDA jda = JDABuilder.createDefault("Nzc3ODY5Njg4OTY5MTAxMzUy.X7JtmQ.6Zznjo1C3yyMDZ-J3qIylQ5d-9s").build();

        jda.addEventListener(new HelloEvent());
    }

}
