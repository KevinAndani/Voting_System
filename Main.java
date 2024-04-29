import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.addCandidate(new Candidate("Arvind Kejriwal", "Aam Aadmi Party"));
        votingSystem.addCandidate(new Candidate("Rahul Gandhi", "Indian National Congress"));
        votingSystem.addCandidate(new Candidate("Narendra Modi", "Bharatiya Janata Party"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Display Candidates\n2. Vote\n3. Display Results\n4. Exit");
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                    votingSystem.displayCandidates();
                    break;
                case 2:
                    votingSystem.displayCandidates();
                    Voter voter = new Voter(); // Creating the object of Voter to store the voter data
                    boolean returning = true;

                    // Setting the voter name
                    while (returning) {
                        System.out.print("Enter your name : ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        returning = voter.setVoterName(name);
                    }

                    // Setting the voter age
                    returning = true;
                    while (returning) {
                        System.out.print("Enter your age : ");
                        int age = scanner.nextInt();
                        returning = voter.setVoterAge(age);
                    }

                    // Setting the voter ID
                    returning = true;
                    while (returning) {
                        System.out.print("Enter your ID : ");
                        int id = scanner.nextInt();
                        returning = voter.setVoterId(id);
                    }

                    // Setting the address of the voter
                    returning = true;
                    while (returning) {
                        System.out.println("Enter your address : ");
                        scanner.nextLine();
                        String address = scanner.nextLine();
                        returning = voter.setVoterAddress(address);
                    }

                    // Setting the candidate name
                    returning = true;
                    while (returning) {
                        System.out.print("Enter the name of the candidate you want to vote for : ");
                        // scanner.nextLine();
                        String candidateName = scanner.nextLine();
                        returning = voter.setVoterCandidateName(candidateName);
                        returning = votingSystem.vote(candidateName);
                    }

                    Csv csv = new Csv();
                    csv.saveVoterData(voter.getVoterName(), voter.getVoterAge(), voter.getVoterId(),
                            voter.getVoterAddress(), voter.getVoterCandidateName());
                    break;
                case 3:
                    System.out.println("Enter the password for showing the result : ");
                    int password = scanner.nextInt();
                    if (password == 1234) {
                        votingSystem.displayResults();
                    } else {
                        System.out.println("Wrong password. Please try again.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}