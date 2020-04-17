import javax.xml.namespace.QName;

public class Properties {

    private final String keyStoreUrl = "C:/Users/Dababi/Documents/superadmin.p12";
    private final String keyStorePassword = "redhat123";
    private final KeyStoreType keyStoreType = KeyStoreType.PKCS12;
    private final String trustKeyStoreUrl = "C:/Users/Dababi/Documents/truststore.jks";
    private final String trustKeyStorePassword = "redhat123";
    private final KeyStoreType trustKeyStoreType = KeyStoreType.JKS;
    private final String url = "https://192.168.20.221:8443/ejbca/ejbcaws/ejbcaws?wsdl";
    private final QName qname = new QName("http://ws.protocol.core.ejbca.org/", "EjbcaWSService");

    public String getKeyStoreUrl() {
        return keyStoreUrl;
    }

    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    public KeyStoreType getKeyStoreType() {
        return keyStoreType;
    }

    public String getTrustKeyStoreUrl() {
        return trustKeyStoreUrl;
    }

    public String getTrustKeyStorePassword() {
        return trustKeyStorePassword;
    }

    public KeyStoreType getTrustKeyStoreType() {
        return trustKeyStoreType;
    }

    public String getUrl() {
        return url;
    }

    public QName getQname() {
        return qname;
    }
}
