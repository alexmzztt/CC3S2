package LSP;

public class VipMemberLSP extends MemberLSP implements Organize {
    public VipMemberLSP(String nombre) {
        super(nombre);
    }

    @Override
    public void joinTournament() {
        System.out.println(getnombre() + "se puede unir a un torneo");
    }

    @Override
    public void organizeTournament() {
        System.out.println(getnombre() + "puede organizar un torneo");
    }
}