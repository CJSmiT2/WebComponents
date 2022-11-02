package ua.org.smit.webcomponents.system.messages;

import ua.org.smit.commontlx.model.text.Text;
import ua.org.smit.commontlx.model.time.CreatedTime;

/**
 *
 * @author smit
 */
public class SystemMessage {

    private final Type type;
    private final Text text;
    private final CreatedTime createdTime;
    private final String session;

    public SystemMessage(Type type, Text text, CreatedTime createdTime, String session) {
        this.type = type;
        this.text = text;
        this.createdTime = createdTime;
        this.session = session;
    }

    public SystemMessage(Type type, String text, String sessionId) {
        this.type = type;
        this.text = new Text(text);
        this.createdTime = new CreatedTime();
        this.session = sessionId;
    }

    public Type getType() {
        return type;
    }

    public Text getText() {
        return text;
    }

    public CreatedTime getCreatedTime() {
        return createdTime;
    }

    public String getSession() {
        return session;
    }

    public enum Type {
        INFO, WARNIND, ERROR
    }
}
