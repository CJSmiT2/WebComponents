package ua.org.smit.webcomponents.system.messages;

import java.util.ArrayList;
import ua.org.smit.commontlx.model.text.Text;
import ua.org.smit.commontlx.model.time.CreatedTime;

/**
 *
 * @author smit
 */
public class SystemMessagesService {

    private final ArrayList<SystemMessage> messages = new ArrayList<>();
    private final int LIMIT = 1000;

    public void add(SystemMessage.Type type, String text, String httpSession) {

        clear();

        messages.add(
                new SystemMessage(
                        type,
                        new Text(text),
                        new CreatedTime(),
                        httpSession));
    }

    public ArrayList<SystemMessage> getAndRemove(String httpSession) {
        ArrayList<SystemMessage> founded = new ArrayList<>();
        messages.forEach((message) -> {
            founded.add(message);
        });

        messages.removeAll(founded);

        return founded;
    }

    public void add(SystemMessage message) {
        clear();
        messages.add(message);
    }

    private void clear() {
        if (messages.size() > LIMIT) {
            messages.clear();
        }
    }

}
