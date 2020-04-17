import org.cesecore.util.CryptoProviderTools;
import org.ejbca.core.protocol.ws.client.gen.*;

import javax.net.ssl.*;
import javax.xml.namespace.QName;
import java.net.URL;
import java.security.KeyStore;
import java.io.FileInputStream;
import java.util.List;


public class WSConnection {


    private boolean bConnected = false;
    private EjbcaWSService service = null;
    private EjbcaWS ejbcaraws = null;
    private Properties properties;
    public WSConnection() {
        this.properties = new Properties();
    }



    public void connect() throws Exception {
        if (bConnected) { return; }
        CryptoProviderTools.installBCProvider();

        System.setProperty("javax.net.ssl.keyStoreType",    properties.getKeyStoreType().getKeyStoreType());
        System.setProperty("javax.net.ssl.keyStore",properties.getKeyStoreUrl());
        System.setProperty("javax.net.ssl.keyStorePassword",properties.getKeyStorePassword());
        System.setProperty("javax.net.ssl.trustStore",properties.getTrustKeyStoreUrl());
        System.setProperty("javax.net.ssl.trustStorePassword",properties.getTrustKeyStorePassword());

        /*
        Provider tlsProvider = new TLSProvider();
        Security.addProvider(tlsProvider);
        Security.setProperty("ssl.TrustManagerFactory.algorithm", "AcceptAll");
        Security.setProperty("ssl.KeyManagerFactory.algorithm", "SunX509");
         */

        service = new EjbcaWSService(new URL(properties.getUrl()),properties.getQname());
        ejbcaraws = service.getEjbcaWSPort();
        System.out.println("Version: " + ejbcaraws.getEjbcaVersion());
        bConnected = true;
    }

    public void disconnect()
    {
        bConnected = false;
        ejbcaraws = null;
        service = null;
    }

    public EjbcaWS getEjbcaraws() {
        return ejbcaraws;
    }
}





