package LSP;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MemberLSP> miembros = List.of(
                new PremiumMemberLSP("Abejita Azul"),
                new VipMemberLSP("Kaperucita Feliz"),
                new FreeMemberLSP("Inspectora Motita")

        );
        for (MemberLSP miembro : miembros) {
            miembro.joinTournament();
            System.out.println();

        }

        List<Organize> member = List.of(
                new PremiumMemberLSP("Abejita Azul"),
                new VipMemberLSP("Kaperucita Feliz")
        );

        for (Organize member : members) {
            member.organizeTournament();
            System.out.println();

        }



    }


}