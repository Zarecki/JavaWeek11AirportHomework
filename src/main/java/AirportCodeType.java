public enum AirportCodeType {

    ALBUQUERQUE("ABQ"),
    AMSTERDAM("AMS"),
    BERLIN("BER"),
    BUDAPEST("BUD"),
    EDINBURGH("EDI"),
    TOKYO("HND");





    private final String value;

    AirportCodeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
