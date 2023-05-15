import java.util.List;

public abstract class Member {
    private final String nombre;
    public Member(String nombre) {
        this.nombre = nombre;
    }
    public abstract void joinTournament();
    public abstract void organizeTournament();

    List<Object> members= List.of(
            new PremiumMember("Abejita Azul"),
            new VipMember("Kaperucita Feliz"),
            new FreeMember("Inspectora Motita")
    );
}