public class TeamSortTest {
    public static void main(String[] args) {
        TestMatchmaking8();
        TestMatchmaking6();
    }

    static void TestMatchmaking8() {
        int n = 8; // # of teams
        String[] Teams = new String[]{"1", "2", "3", "4", "8", "7", "6", "5"
        };
        TeamSort.Matchmaking(n, Teams);
    }

    static void TestMatchmaking6(){
        int n = 6; // # of teams
        String [] Teams = new String[]{ "101", "102", "103", "104", "105", "106"
        };
        TeamSort.Matchmaking(n, Teams);
    }
}
