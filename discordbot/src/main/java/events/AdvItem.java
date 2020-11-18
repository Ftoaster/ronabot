package events;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import java.util.Calendar;




public class AdvItem extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String MessageSent = event.getMessage().getContentRaw();
        if(MessageSent.equalsIgnoreCase("!어드")){
            User user = event.getAuthor();

            Calendar cal = Calendar.getInstance();
            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
            String korDayOfWeek = "";
            switch (dayOfWeek) {
                case 1:
                    korDayOfWeek = "\r\n<:adv11:778216767897206784>\r\n<:adv12:778216777620127744>\r\n";
                    break;
                case 2:
                    korDayOfWeek = "\r\n<:adv21:778216791561732116>\r\n<:adv22:778216932537008148>\r\n";
                    break;
                case 3:
                    korDayOfWeek = ("\r\n<:adv31:778216748306137128>\r\n<:adv32:778216758208757762>\r\n");
                    break;
                case 4:
                    korDayOfWeek = "\r\n<:adv41:778216953076383786>\r\n";
                    break;
                case 5:
                    korDayOfWeek = "\r\n<:adv51:778216967579762728>\r\n<:adv52:778216976077815848>\r\n<:adv53:778216984437194782>\r\n";
                    break;
                case 6:
                    korDayOfWeek = "\r\n<:adv61:778216993215873026>\r\n";
                    break;
                case 7:
                    korDayOfWeek = "\r\n<:adv71:778217002221043743>\r\n<:adv72:778217012626456588>\r\n<:adv73:778217023011815485>\r\n";
                    break;
            }
            event.getChannel().sendMessage(user.getAsMention()+" 오늘의 어드밴스드 아이템은 ").queue();
            event.getChannel().sendMessage(korDayOfWeek).queue();
        }
    }
}