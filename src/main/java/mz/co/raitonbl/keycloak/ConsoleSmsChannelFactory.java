package mz.co.raitonbl.keycloak;

import com.raitonbl.keycloak.channel.SmsChannel;
import com.raitonbl.keycloak.channel.SmsChannelFactory;
import org.keycloak.Config;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class ConsoleSmsChannelFactory implements SmsChannelFactory {

    private static final SmsChannel SINGLETON = new ConsoleSmsChannel();

    @Override
    public SmsChannel create(KeycloakSession keycloakSession) {
        return SINGLETON;
    }

    @Override
    public void init(Config.Scope scope) {
        // DO NOTHING
    }

    @Override
    public void postInit(KeycloakSessionFactory keycloakSessionFactory) {
        // DO NOTHING
    }

    @Override
    public void close() {
        // DO NOTHING
    }

    @Override
    public String getId() {
        return "console";
    }

}
