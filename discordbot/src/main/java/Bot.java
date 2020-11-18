import events.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {

    public static void main(String[] args) throws Exception {

        JDA jda = JDABuilder.createDefault("충현이한테 물어보기").build();

        jda.addEventListener(new HelloEvent());
        jda.addEventListener(new madye());
        jda.addEventListener(new AdvItem());
        jda.addEventListener(new Help());
        jda.addEventListener(new veteran());

    }
}



