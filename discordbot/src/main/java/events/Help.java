package events;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Help extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String MessageSent = event.getMessage().getContentRaw();
        if(MessageSent.equalsIgnoreCase("!로나")){
            User user = event.getAuthor();
            event.getChannel().sendMessage(user.getAsMention()+" 도움이 필요하구나?\r\n !어드 = 오늘의 어드밴스드 아이템\r\n !베테랑 = 오늘의 베테랑 던전\r\n !염도 = 염색도우미 다운로드 링크\r\n 더 많은 도움을 주고 싶어! ").queue();
        }
    }
}
