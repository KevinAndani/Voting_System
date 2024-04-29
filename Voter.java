// Define a class to hold voter information
class Voter {
    private String name;
    private int age;
    private int id;
    private String address;
    private String candidate_name;

    public boolean setVoterName(String name) {
        int i, count;
        for (i = 0, count = 0; i < name.length(); i++) {
            if ((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) >= 'a' && name.charAt(i) <= 'z')
                    || name.charAt(i) == ' ') {
                count++;
            }
        }
        if (count == name.length()) {
            this.name = name;
            return false;
        } else {
            System.out.println("Please Enter the valid name in proper format !!!");
            return true;
        }
    }

    public boolean setVoterAge(int age) {
        if (age > 18 && age < 100) {
            this.age = age;
            return false;
        } else {
            System.out.println("Age is Invalid !!!");
            return true;
        }
    }

    public boolean setVoterId(int id) {
        if (id > 0 && id < 1000000) {
            this.id = id;
            return false;
        } else {
            System.out.println("Please enter the valid ID !!!");
            return true;
        }
    }

    public boolean setVoterAddress(String address) {
        int i, count;
        for (i = 0, count = 0; i < address.length(); i++) {
            if ((address.charAt(i) >= 'A' && address.charAt(i) <= 'Z')
                    || (address.charAt(i) >= 'a' && address.charAt(i) <= 'z') || address.charAt(i) == ' '
                    || address.charAt(i) == ',' || address.charAt(i) == '.') {
                count++;
            }
        }
        if (count == address.length()) {
            this.address = address;
            return false;
        } else {
            System.out.println("Please Enter the valid address in proper format !!!");
            return true;
        }
    }

    public boolean setVoterCandidateName(String candidate_name) {
        int i, count;
        for (i = 0, count = 0; i < candidate_name.length(); i++) {
            if ((candidate_name.charAt(i) >= 'A' && candidate_name.charAt(i) <= 'Z')
                    || (candidate_name.charAt(i) >= 'a' && candidate_name.charAt(i) <= 'z')
                    || candidate_name.charAt(i) == ' ') {
                count++;
            }
        }
        if (count == candidate_name.length()) {
            this.candidate_name = candidate_name;
            return false;
        } else {
            System.out.println(count + " Please Enter the valid candidate name in proper format !!!");
            return true;
        }
    }

    public String getVoterName() {
        return this.name;
    }

    public int getVoterAge() {
        return this.age;
    }

    public int getVoterId() {
        return this.id;
    }

    public String getVoterAddress() {
        return this.address;
    }

    public String getVoterCandidateName() {
        return this.candidate_name;
    }
}
