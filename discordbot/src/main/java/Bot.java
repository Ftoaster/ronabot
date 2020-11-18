import events.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {

    public static void main(String[] args) throws Exception {

        JDA jda = JDABuilder.createDefault("Nzc3ODY5Njg4OTY5MTAxMzUy.X7JtmQ.ViPZ6jL2bhppHP5s-HaonasJWMc").build();

        jda.addEventListener(new HelloEvent());
        jda.addEventListener(new madye());
        jda.addEventListener(new AdvItem());
        jda.addEventListener(new Help());
        jda.addEventListener(new veteran());

    }
}



