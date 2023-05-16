package LSP;

public class VipMemberLSP extends MemberLSP implements Organize {
    public VipMemberLSP(String nombre) {
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