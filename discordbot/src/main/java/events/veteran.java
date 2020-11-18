package events;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class veteran extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event) {
        String MessageSent = event.getMessage().getContentRaw();
        User user = event.getAuthor();
        Fantazm fantazm = new Fantazm();
        String today = null;
        try {
            today = fantazm.todayveteran();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(MessageSent.equalsIgnoreCase("!베테랑")){
            event.getChannel().sendMessage(user.getAsMention()+" 오늘의 베테랑 던전은~ "+today+"던전이에요~").queue();
        }
    }
}