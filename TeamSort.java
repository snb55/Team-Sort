public class TeamSort {

    //if(n != Teams.length()){
    //System.out.println("Invalid Input");
    //boolean classInv() Teams[].size==n

    public static void Matchmaking(int n, String[] Teams) {

        String[] currentTeams = Teams;

        for (int round = 1; round < n; round++) {//reordering array
            System.out.println("Round " + round + ":");
            if (round != 1) {

                String[] oldTeams = currentTeams.clone();
                currentTeams[1] = oldTeams[n / 2];

                for (int i = 2; i < n / 2; i++) {//first 2 iterations
                    currentTeams[i] = oldTeams[i - 1];
                }
                for (int i = n / 2; i < n-1; i++) {
                    currentTeams[i] = oldTeams[i + 1];
                }
                currentTeams[n - 1] = oldTeams[n / 2 - 1];
            }

                for (int i = 0; i < n / 2; i++) {//prints out current matchmaking
                    String TeamA = currentTeams[i];
                    String TeamB = currentTeams[i + n / 2];
                    System.out.println(TeamA + " vs " + TeamB);
                }
        }
    }
}
