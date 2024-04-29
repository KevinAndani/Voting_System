class Candidate {
    private String name;
    private String party_name;

    public Candidate(String name, String party_name) {
        this.name = name;
        this.party_name = party_name;
    }

    public String getName() {
        return name;
    }

    public String getPartyName() {
        return party_name;
    }
}