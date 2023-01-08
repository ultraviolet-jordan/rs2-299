import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static15 {

    @OriginalMember(owner = "client!gc", name = "b", descriptor = "Lclient!client;")
    public static client aClient4;

    @OriginalMember(owner = "client!gc", name = "c", descriptor = "I")
    private static int anInt556;

    @OriginalMember(owner = "client!gc", name = "d", descriptor = "[I")
    private static int[] anIntArray169;

    @OriginalMember(owner = "client!gc", name = "e", descriptor = "Lclient!lb;")
    private static SecondaryParticleLinkedList aSecondaryParticleLinkedList6;

    @OriginalMember(owner = "client!gc", name = "f", descriptor = "[Lclient!gc;")
    private static Class13[] aClass13Array1;

    @OriginalMember(owner = "client!gc", name = "g", descriptor = "I")
    private static int anInt557;

    @OriginalMember(owner = "client!gc", name = "a", descriptor = "Z")
    private static boolean aBoolean138 = true;

    @OriginalMember(owner = "client!gc", name = "K", descriptor = "Lclient!s;")
    public static GlModel aGlModel6 = new GlModel(-739, 30);

    @OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!xb;)V")
    public static void method321(@OriginalArg(0) Class47 arg0) {
        aSecondaryParticleLinkedList6 = new SecondaryParticleLinkedList(arg0.method666("npc.dat", null), -26728);
        @Pc(19) SecondaryParticleLinkedList local19 = new SecondaryParticleLinkedList(arg0.method666("npc.idx", null), -26728);
        anInt556 = local19.method482();
        anIntArray169 = new int[anInt556];
        @Pc(27) int local27 = 2;
        for (@Pc(29) int local29 = 0; local29 < anInt556; local29++) {
            anIntArray169[local29] = local27;
            local27 += local19.method482();
        }
        aClass13Array1 = new Class13[20];
        for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
            aClass13Array1[local49] = new Class13();
        }
    }

    @OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)V")
    public static void method322(@OriginalArg(0) int arg0) {
        try {
            aGlModel6 = null;
            if (arg0 != 0) {
                aBoolean138 = !aBoolean138;
            }
            anIntArray169 = null;
            aClass13Array1 = null;
            aSecondaryParticleLinkedList6 = null;
        } catch (@Pc(17) RuntimeException local17) {
            signlink.reporterror("32822, " + arg0 + ", " + local17.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gc", name = "b", descriptor = "(I)Lclient!gc;")
    public static Class13 method323(@OriginalArg(0) int arg0) {
        for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
            if (aClass13Array1[local1].aLong23 == (long) arg0) {
                return aClass13Array1[local1];
            }
        }
        anInt557 = (anInt557 + 1) % 20;
        @Pc(33) Class13 local33 = aClass13Array1[anInt557] = new Class13();
        aSecondaryParticleLinkedList6.anInt742 = anIntArray169[arg0];
        local33.aLong23 = arg0;
        local33.method324(aSecondaryParticleLinkedList6, 8);
        return local33;
    }
}
