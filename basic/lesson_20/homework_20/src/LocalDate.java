import java.time.LocalDate;

public class Vater {
    private String name;
    private LocalDate birthDate;

    public void Voter(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public boolean isEligibleToVote() {
        LocalDate today = LocalDate.now();
        LocalDate votingAgeDate = birthDate.plusYears(18);
        return today.isAfter(votingAgeDate) || today.isEqual(votingAgeDate);
    }

    public static <Voter> void main(String[] args) {
        // Создаем экземпляр избирателя
        Voter voter = new Voter("Иванов Иван Иванович", LocalDate.of(2000, 5, 10));

        // Проверяем, может ли избиратель голосовать
        if (voter.isEligibleToVote()) {
            System.out.println(voter.getName() + " может проголосовать.");
        } else {
            System.out.println(voter.getName() + " не может проголосовать.");
        }
    }
}
