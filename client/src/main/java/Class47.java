import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class47 {

    @OriginalMember(owner = "client!xb", name = "c", descriptor = "[B")
    private byte[] aByteArray21;

    @OriginalMember(owner = "client!xb", name = "d", descriptor = "I")
    private int anInt974;

    @OriginalMember(owner = "client!xb", name = "e", descriptor = "[I")
    private int[] anIntArray265;

    @OriginalMember(owner = "client!xb", name = "f", descriptor = "[I")
    private int[] anIntArray266;

    @OriginalMember(owner = "client!xb", name = "g", descriptor = "[I")
    private int[] anIntArray267;

    @OriginalMember(owner = "client!xb", name = "h", descriptor = "[I")
    private int[] anIntArray268;

    @OriginalMember(owner = "client!xb", name = "i", descriptor = "Z")
    private boolean aBoolean237;

    @OriginalMember(owner = "client!xb", name = "a", descriptor = "Z")
    private boolean aBoolean235 = false;

    @OriginalMember(owner = "client!xb", name = "b", descriptor = "Z")
    private boolean aBoolean236 = true;

    @OriginalMember(owner = "client!xb", name = "<init>", descriptor = "(I[B)V")
    public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
        try {
            if (arg0 != 20025) {
                for (@Pc(12) int local12 = 1; local12 > 0; local12++) {
                }
            }
            this.method665(arg1, -40537);
        } catch (@Pc(23) RuntimeException local23) {
            signlink.reporterror("29215, " + arg0 + ", " + arg1 + ", " + local23.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!xb", name = "a", descriptor = "([BI)V")
    private void method665(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
        try {
            @Pc(7) Buffer local7 = new Buffer(arg0, -26728);
            @Pc(10) int local10 = local7.method484();
            @Pc(13) int local13 = local7.method484();
            if (local13 == local10) {
                this.aByteArray21 = arg0;
                this.aBoolean237 = false;
            } else {
                @Pc(19) byte[] local19 = new byte[local10];
                Static29.method581(local19, local10, arg0, local13, 6);
                this.aByteArray21 = local19;
                local7 = new Buffer(this.aByteArray21, -26728);
                this.aBoolean237 = true;
            }
            this.anInt974 = local7.method482();
            @Pc(56) int local56;
            if (arg1 != -40537) {
                for (local56 = 1; local56 > 0; local56++) {
                }
            }
            this.anIntArray265 = new int[this.anInt974];
            this.anIntArray266 = new int[this.anInt974];
            this.anIntArray267 = new int[this.anInt974];
            this.anIntArray268 = new int[this.anInt974];
            local56 = local7.anInt742 + this.anInt974 * 10;
            for (@Pc(91) int local91 = 0; local91 < this.anInt974; local91++) {
                this.anIntArray265[local91] = local7.method485();
                this.anIntArray266[local91] = local7.method484();
                this.anIntArray267[local91] = local7.method484();
                this.anIntArray268[local91] = local56;
                local56 += this.anIntArray267[local91];
            }
        } catch (@Pc(130) RuntimeException local130) {
            signlink.reporterror("57284, " + arg0 + ", " + arg1 + ", " + local130.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method666(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
        @Pc(3) int local3 = 0;
        @Pc(6) String local6 = arg0.toUpperCase();
        for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
            local3 = local3 * 61 + local6.charAt(local8) - 32;
        }
        for (@Pc(27) int local27 = 0; local27 < this.anInt974; local27++) {
            if (this.anIntArray265[local27] == local3) {
                if (arg1 == null) {
                    arg1 = new byte[this.anIntArray266[local27]];
                }
                if (this.aBoolean237) {
                    for (@Pc(67) int local67 = 0; local67 < this.anIntArray266[local27]; local67++) {
                        arg1[local67] = this.aByteArray21[this.anIntArray268[local27] + local67];
                    }
                } else {
                    Static29.method581(arg1, this.anIntArray266[local27], this.aByteArray21, this.anIntArray267[local27], this.anIntArray268[local27]);
                }
                return arg1;
            }
        }
        return null;
    }
}
