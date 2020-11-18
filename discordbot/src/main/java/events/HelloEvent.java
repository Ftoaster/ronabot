package events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelloEvent extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event){
        User user = event.getAuthor();
        TextChannel tc = event.getTextChannel();
        Message msg = event.getMessage();
        if(user.isBot()) return;
        if(msg.getContentRaw().equalsIgnoreCase("!안녕")){
            tc.sendMessage(user.getAsMention()+" 안녕! 나는 로나야. 디스코드에서 즐기는 마비라이프, 앞으로 잘 부탁해~\r\n내가 도와줄 수 있는 명령어가 궁금하다면 !로나 를 입력해 줘!").queue();
        }
    }
}
