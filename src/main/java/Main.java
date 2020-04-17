import org.cesecore.util.CertTools;
import org.cesecore.util.CryptoProviderTools;
import org.cesecore.util.provider.TLSProvider;
import org.ejbca.core.protocol.ws.client.gen.EjbcaWS;
import org.ejbca.core.protocol.ws.client.gen.EjbcaWSService;
import org.ejbca.core.protocol.ws.client.gen.NameAndId;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Provider;
import java.security.Security;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
       Tests tests = new Tests();
        tests.getAvailableCAs();
        List<NameAndId> ls = tests.getAvailableCAs();
        ls.forEach(l -> System.out.println(l.getName()));


    }

}
