package LSP;

public abstract class MemberLSP {
    private final String nombre;
    public MemberLSP(String nombre) {
        this.nombre = nombre;
    }
    public String getnombre() {
        return nombre;
    }
    public abstract void joinTournament();
    //public abstract void organizeTournament(); ya no se usara en esta clase
}
