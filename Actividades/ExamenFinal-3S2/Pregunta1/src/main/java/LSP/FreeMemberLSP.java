package LSP;

public class FreeMemberLSP extends MemberLSP {
    public FreeMemberLSP(String nombre) {
        super(nombre);
    }
    @Override
    public void joinTournament() {
        System.out.println(getnombre() + "se ha unido a un torneo");
    }
    //Este método rompe LSP
    /*@Override
    public void organizeTournament() {
        System.out.println("...");
    }*/
}
