import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class IntNode extends ModelParticleEffector {

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Lclient!o;")
    public SpotAnim aSpotAnim1;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lclient!i;")
    public Class16 aClass16_1;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Lclient!q;")
    public UnlitMaterialRenderer anUnlitMaterialRenderer1;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Lclient!h;")
    public Envelope anEnvelope1;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lclient!j;")
    public ByteArrayNode aByteArrayNode1;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Lclient!k;")
    public Class20 aClass20_1;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public int anInt961;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public int anInt962;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public int anInt963;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "Z")
    public boolean aBoolean232;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "Z")
    public boolean aBoolean233;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "Z")
    public boolean aBoolean234;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public int anInt964;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public int anInt965;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public int anInt966;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public int anInt967;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "Lclient!v;")
    public IntNode anIntNode1;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    private int anInt956 = -753;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Z")
    private boolean aBoolean231 = true;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "[Lclient!p;")
    public Npc[] aNpcArray3 = new Npc[5];

    @OriginalMember(owner = "client!v", name = "s", descriptor = "[I")
    public int[] anIntArray621 = new int[5];

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public int anInt957;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public int anInt960;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public int anInt958;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public int anInt959;

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(III)V")
    public IntNode(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        this.anInt960 = this.anInt957 = arg0;
        this.anInt958 = arg1;
        this.anInt959 = arg2;
    }
}
