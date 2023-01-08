import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static30 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    private static int anInt888;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[Lclient!rc;")
    public static Class39[] aClass39Array1;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "[I")
    public static int[] anIntArray247;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!xb;)V")
    public static void method589(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
        try {
            @Pc(8) SecondaryParticleLinkedList local8 = new SecondaryParticleLinkedList(arg1.method666("varp.dat", null), -26728);
            NpcList.size = 0;
            if (arg0 == 0) {
                anInt888 = local8.method482();
                if (aClass39Array1 == null) {
                    aClass39Array1 = new Class39[anInt888];
                }
                if (anIntArray247 == null) {
                    anIntArray247 = new int[anInt888];
                }
                for (@Pc(28) int local28 = 0; local28 < anInt888; local28++) {
                    if (aClass39Array1[local28] == null) {
                        aClass39Array1[local28] = new Class39();
                    }
                    aClass39Array1[local28].method590(local28, 39196, local8);
                }
                if (local8.anInt742 != local8.aByteArray9.length) {
                    System.out.println("varptype load mismatch");
                }
            }
        } catch (@Pc(62) RuntimeException local62) {
            signlink.reporterror("88054, " + arg0 + ", " + arg1 + ", " + local62.toString());
            throw new RuntimeException();
        }
    }
}
