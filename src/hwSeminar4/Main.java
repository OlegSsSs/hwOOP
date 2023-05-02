package hwSeminar4;

public class Main {
    public static void main(String[] args) {
        Team <Swordman> team1 = new Team<>();
        team1.addWarriorToTeam(new Swordman("1 swordman", 100, new Sword(10)))
                .addWarriorToTeam(new Swordman("2 swordman", 80, new Sword(8),
                                    new Middleshield(20, 50)));

        for (Swordman swordman : team1) {
            System.out.println(swordman);
        }

        Team <Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("1 archer", 90, new Bow(12, 40)))
                .addWarriorToTeam(new Archer("2 archer", 100, new Bow(13, 35)));

        for (Archer person : team2) {
            System.out.println(person);
        }

        System.out.println(team1.maxTeamRange());
        System.out.println(team2.maxTeamRange());
        System.out.println(team1.minArmor());
        System.out.println(team2.minArmor());
    }


}
