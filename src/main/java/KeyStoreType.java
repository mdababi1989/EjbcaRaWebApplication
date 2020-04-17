    public enum KeyStoreType {
        JKS("JKS"),
        PKCS12("PKCS12");

        private String keyStoreType;

        KeyStoreType(String keyStoreType) {
            this.keyStoreType = keyStoreType;
        }

        public String getKeyStoreType() {
            return keyStoreType;
        }
    }
