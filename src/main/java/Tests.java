import org.ejbca.core.protocol.ws.client.gen.*;
import java.util.List;

public class Tests {
    private WSConnection ws;

    public Tests() {
        ws = new WSConnection();

    }

    List<NameAndId> getEndEntityProfiles() throws Exception
    {
        ws.connect();
        try
        {
            return ws.getEjbcaraws().getAuthorizedEndEntityProfiles();
        }
        catch (AuthorizationDeniedException_Exception e)
        {
            ws.disconnect();
            e.printStackTrace();
            throw e;
        }
        catch (EjbcaException_Exception e)
        {
            ws.disconnect();
            e.printStackTrace();
            throw e;
        }
    }

    List<NameAndId> getAvailableCertificateProfiles(int idEndEntityProfile)
            throws Exception
    {
        ws.connect();

        try
        {
            return ws.getEjbcaraws()
                    .getAvailableCertificateProfiles(idEndEntityProfile);
        }
        catch (AuthorizationDeniedException_Exception e)
        {
             ws.disconnect();

            e.printStackTrace();

            throw e;
        }
        catch (EjbcaException_Exception e)
        {
             ws.disconnect();

            e.printStackTrace();

            throw e;
        }
    }

    List<NameAndId> getAvailableCAs() throws Exception
    {
        ws.connect();

        try
        {
            return ws.getEjbcaraws().getAvailableCAs();
        }
        catch (AuthorizationDeniedException_Exception e)
        {
             ws.disconnect();

//			e.printStackTrace();

            throw e;
        }
        catch (EjbcaException_Exception e)
        {
             ws.disconnect();

//			e.printStackTrace();

            throw e;
        }
    }

    List<NameAndId> getAvailableCAsInProfile(int idEndEntityProfile)
            throws Exception
    {
        ws.connect();

        try
        {
            return ws.getEjbcaraws().getAvailableCAsInProfile(idEndEntityProfile);
        }
        catch (AuthorizationDeniedException_Exception e)
        {
             ws.disconnect();

            e.printStackTrace();

            throw e;
        }
        catch (EjbcaException_Exception e)
        {
             ws.disconnect();

            e.printStackTrace();

            throw e;
        }
    }

    // Use explicit package name for KeyStore instead of import here because we
    // also use java.security.KeyStore elsewhere in this file.
    KeyStore softTokenRequest(
            UserDataVOWS userData, String hardTokenSN,
            String keyspec, String keyalg) throws Exception
    {
        ws.connect();

        try
        {
            return ws.getEjbcaraws().softTokenRequest(userData, hardTokenSN, keyspec,
                    keyalg);
        }
        catch (EjbcaException_Exception e)
        {
             ws.disconnect();

            e.printStackTrace();

            throw e;
        }
        catch (Exception e)
        {
            e.printStackTrace();

            throw e;
        }
    }

    CertificateResponse certificateRequest(UserDataVOWS userData,
                                           String requestData, int requestType,
                                           String hardTokenSN, String responseType)
            throws Exception
    {
        ws.connect();

        try
        {
            return ws.getEjbcaraws().certificateRequest(userData, requestData,
                    requestType, hardTokenSN, responseType);
        }
        catch (Exception e)
        {
            e.printStackTrace();

            throw e;
        }
    }

    void editUser(UserDataVOWS userdata) throws Exception
    {
        ws.connect();

        try
        {
            ws.getEjbcaraws().editUser(userdata);
        }
        catch (Exception e)
        {
            e.printStackTrace();

            throw e;
        }
    }

    // Use explicit package name for KeyStore instead of import here because we
    // also use java.security.KeyStore elsewhere in this file.
    KeyStore pkcs12Req(
            String username, String password,
            String hardTokenSN, String keyspec,
            String keyalg) throws Exception
    {
        ws.connect();

        try
        {
            return ws.getEjbcaraws().pkcs12Req(username, password, hardTokenSN,
                    keyspec, keyalg);
        }
        catch (Exception e)
        {
            e.printStackTrace();

            throw e;
        }
    }

    List<UserDataVOWS> findUser(UserMatch usermatch) throws Exception
    {
        ws.connect();

        try
        {
            return ws.getEjbcaraws().findUser(usermatch);
        }
        catch (Exception e)
        {
            e.printStackTrace();

            throw e;
        }
    }

    List<Certificate> findCerts(String username,
                                boolean onlyValid) throws Exception
    {
        ws.connect();

        try
        {
            return ws.getEjbcaraws().findCerts(username, onlyValid);
        }
        catch (Exception e)
        {
            e.printStackTrace();

            throw e;
        }
    }

    RevokeStatus checkRevokationStatus(String issuerDN,
                                       String certificateSN) throws Exception
    {
        ws.connect();

        try
        {
            return ws.getEjbcaraws().checkRevokationStatus(issuerDN, certificateSN);
        }
        catch (Exception e)
        {
            e.printStackTrace();

            throw e;
        }
    }

    void revokeUser(String username, int reason, boolean deleteUser)
            throws Exception
    {
        ws.connect();

        try
        {
            ws.getEjbcaraws().revokeUser(username, reason, deleteUser);
        }
        catch (Exception e)
        {
            e.printStackTrace();

            throw e;
        }
    }

    void revokeCert(String issuerDN, String certificateSN,
                    int reason) throws Exception
    {
        ws.connect();

        try
        {
            ws.getEjbcaraws().revokeCert(issuerDN, certificateSN, reason);
        }
        catch (Exception e)
        {
            e.printStackTrace();

            throw e;
        }
    }






}
