package LSP;

public class PremiumMemberLSP extends MemberLSP implements Organize {
    public PremiumMemberLSP(String nombre) {
        super(nombre);
    }

    @Override
    public void joinTournament() {
        System.out.println(getnombre() + "se ha unido a un torneo");
    }

    @Override
    public void organizeTournament() {
        System.out.println(getnombre() + "ha organizado un torneo");
    }
}