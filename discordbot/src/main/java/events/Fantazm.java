package events;

import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Fantazm extends ListenerAdapter {
    private static final String CONNECT_URL ="https://lute.fantazm.net/today_mission";

    public static String todayveteran() throws Exception {
        Document document = Jsoup.connect(CONNECT_URL).get();
        Elements dg = document.select("#btothetop > div.row > div.col-md-9 > div:nth-child(2) > table > tbody > tr");
        return dg.text();
    }
}