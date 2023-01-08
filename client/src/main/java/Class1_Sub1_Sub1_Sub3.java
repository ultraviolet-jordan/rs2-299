import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public int anInt525;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public int anInt180;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!eb;")
    @Override
    protected Sound method676(@OriginalArg(0) int arg0) {
        try {
            if (arg0 >= 0) {
                throw new NullPointerException();
            }
            @Pc(11) ByteArray local11 = Static17.method361(this.anInt525);
            return local11.method365(this.anInt180);
        } catch (@Pc(17) RuntimeException local17) {
            signlink.reporterror("71492, " + arg0 + ", " + local17.toString());
            throw new RuntimeException();
        }
    }
}
