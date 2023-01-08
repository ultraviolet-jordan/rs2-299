import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static12 {

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!client;")
    public static client aClient2;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    private static int anInt510;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "[I")
    private static int[] anIntArray155;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lclient!lb;")
    private static Buffer aSecondaryParticleLinkedList5;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "[Lclient!ec;")
    private static GlShader[] aGlShaderArray1;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    private static int anInt511;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Z")
    public static boolean aBoolean117 = true;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "[Lclient!eb;")
    public static Sound[] aSoundArray1 = new Sound[4];

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "Lclient!s;")
    public static GlModel aGlModel4 = new GlModel(-739, 500);

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "Lclient!s;")
    public static GlModel aGlModel5 = new GlModel(-739, 30);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!xb;)V")
    public static void method286(@OriginalArg(0) Class47 arg0) {
        aSecondaryParticleLinkedList5 = new Buffer(arg0.method666("loc.dat", null), -26728);
        @Pc(19) Buffer local19 = new Buffer(arg0.method666("loc.idx", null), -26728);
        anInt510 = local19.method482();
        anIntArray155 = new int[anInt510];
        @Pc(27) int local27 = 2;
        for (@Pc(29) int local29 = 0; local29 < anInt510; local29++) {
            anIntArray155[local29] = local27;
            local27 += local19.method482();
        }
        aGlShaderArray1 = new GlShader[20];
        for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
            aGlShaderArray1[local49] = new GlShader();
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method287(@OriginalArg(0) int arg0) {
        try {
            aGlModel4 = null;
            if (arg0 != 0) {
                aBoolean117 = !aBoolean117;
            }
            aGlModel5 = null;
            anIntArray155 = null;
            aGlShaderArray1 = null;
            aSecondaryParticleLinkedList5 = null;
        } catch (@Pc(19) RuntimeException local19) {
            signlink.reporterror("91067, " + arg0 + ", " + local19.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Lclient!ec;")
    public static GlShader method288(@OriginalArg(0) int arg0) {
        for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
            if (aGlShaderArray1[local1].anInt512 == arg0) {
                return aGlShaderArray1[local1];
            }
        }
        anInt511 = (anInt511 + 1) % 20;
        @Pc(27) GlShader local27 = aGlShaderArray1[anInt511];
        aSecondaryParticleLinkedList5.anInt742 = anIntArray155[arg0];
        local27.anInt512 = arg0;
        local27.method289();
        local27.method290(aSecondaryParticleLinkedList5, 8);
        return local27;
    }
}
