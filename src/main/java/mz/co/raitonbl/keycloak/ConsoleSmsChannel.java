package mz.co.raitonbl.keycloak;

import com.raitonbl.keycloak.channel.SmsChannel;

public class ConsoleSmsChannel implements SmsChannel {

    private static final String SEPARATOR = "---------------------------------------------";

    @Override
    public void send(String destination, String message) {
        send(new String[]{destination}, message);
    }

    @Override
    public void send(String[] destination, String message) {

        if (destination == null || message == null) {
            return;
        }

        for (String dest : destination) {
            if (dest != null) {
                System.out.println("\n" + SEPARATOR + "\ndestination:" + dest + "\nmessage:" + message + "\n" + SEPARATOR);
            }
        }

    }

    @Override
    public void close() {
        //DO NOTHING
    }

}
