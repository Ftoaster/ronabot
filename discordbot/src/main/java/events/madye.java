package events;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class madye extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String MessageSent = event.getMessage().getContentRaw();
        User user = event.getAuthor();
        if(MessageSent.equalsIgnoreCase("!염도")){
            event.getChannel().sendMessage(user.getAsMention()+"염색하려구? 여기서 염색도우미를 받을 수 있어! http://ftoaster.com/Rona_Bot/madye-v0.0.3.zip").queue();
        }
    }
}