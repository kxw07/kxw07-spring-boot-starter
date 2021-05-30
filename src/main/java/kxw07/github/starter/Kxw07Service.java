package kxw07.github.starter;

import lombok.ToString;

@ToString
public class Kxw07Service {
    private final String host;
    private final int port;

    public Kxw07Service(Kxw07Properties kxw07Properties) {
        this.host = kxw07Properties.getHost();
        this.port = kxw07Properties.getPort();
    }
}
