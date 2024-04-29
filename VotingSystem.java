import java.util.ArrayList;
import java.util.HashMap;

class VotingSystem {
    private ArrayList<Candidate> candidates; // Stores the data of the candidates
    private HashMap<String, Integer> votes; // Stores the data of the voters

    public VotingSystem() {
        candidates = new ArrayList<>();
        votes = new HashMap<>();
    }

    public void displayCandidates() {
        // Display the list of candidates
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println((i + 1) + ". " + candidates.get(i).getName() + " - " + candidates.get(i).getPartyName());
        }
    }

    public void addCandidate(Candidate candidate) {
        // Add the candidate to the list of candidates
        candidates.add(candidate);
    }

    public boolean vote(String candidateName) {
        if (votes.containsKey(candidateName)) {
            votes.put(candidateName, votes.get(candidateName) + 1); // If candidate name id in the list then them vote
                                                                    // is increased
            System.out.println("Vote for " + candidateName + " is successfully recorded.");
            return false;
        } else {
            for (Candidate candidate : candidates) {
                if (candidate.getName().equals(candidateName)) {
                    votes.put(candidateName, 1); // If candidate name is not present in the list then its vote is set to
                                                 // 1
                    System.out.println("Vote for " + candidateName + " is successfully recorded.");
                    return false;
                }
            }
        }
        System.out.println("Candidate can't Found !!!, Please enter the valid candidate name of the candidate.");
        return true;
    }

    public void displayResults() {
        System.out.println("Voting Results :");
        for (String candidateName : votes.keySet()) {
            System.out.println(candidateName + " : gets the " + votes.get(candidateName) + " votes");
        }
    }
}