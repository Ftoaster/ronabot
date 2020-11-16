package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelloEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String MessageSent = event.getMessage().getContentRaw();
        if(MessageSent.equalsIgnoreCase("!안녕")){
            event.getChannel().sendMessage("안녕! 나는 로나야. 디스코드에서 즐기는 마비라이프, 앞으로 잘 부탁해~").queue();
        }
    }
}
