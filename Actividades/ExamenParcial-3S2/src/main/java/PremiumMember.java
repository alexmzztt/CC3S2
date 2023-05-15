public class PremiumMember extends Member {
    public PremiumMember(String nombre) {
        super(nombre);
    }
    @Override
    public void joinTournament() {
        System.out.println(".....");
    }

    @Override
    public void organizeTournament() {
        System.out.println("...");
    }

}
