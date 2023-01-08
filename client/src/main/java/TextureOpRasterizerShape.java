import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class TextureOpRasterizerShape {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int fillColor;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
    private int[] anIntArray221;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    private int outlineWidth = 10514;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    private int anInt749 = 9;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public int anInt751 = -1;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
    private int[] anIntArray222 = new int[6];

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
    private int[] anIntArray223 = new int[6];

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
    private int[] anIntArray224 = new int[]{-1, -1, -1, -1, -1};

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
    public boolean aBoolean192 = false;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!lb;I)V")
    public void method497(@OriginalArg(0) SecondaryParticleLinkedList arg0, @OriginalArg(1) int arg1) {
        try {
            if (arg1 < 8 || arg1 > 8) {
                this.outlineWidth = 20;
            }
            while (true) {
                while (true) {
                    @Pc(13) int local13 = arg0.method480();
                    if (local13 == 0) {
                        return;
                    }
                    if (local13 == 1) {
                        this.anInt751 = arg0.method480();
                    } else if (local13 == 2) {
                        @Pc(31) int local31 = arg0.method480();
                        this.anIntArray221 = new int[local31];
                        for (@Pc(37) int local37 = 0; local37 < local31; local37++) {
                            this.anIntArray221[local37] = arg0.method482();
                        }
                    } else if (local13 == 3) {
                        this.aBoolean192 = true;
                    } else if (local13 >= 40 && local13 < 50) {
                        this.anIntArray222[local13 - 40] = arg0.method482();
                    } else if (local13 >= 50 && local13 < 60) {
                        this.anIntArray223[local13 - 50] = arg0.method482();
                    } else if (local13 >= 60 && local13 < 70) {
                        this.anIntArray224[local13 - 60] = arg0.method482();
                    } else {
                        System.out.println("Error unrecognised config code: " + local13);
                    }
                }
            }
        } catch (@Pc(118) RuntimeException local118) {
            signlink.reporterror("46723, " + arg0 + ", " + arg1 + ", " + local118.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Z")
    public boolean method498(@OriginalArg(0) byte arg0) {
        try {
            if (this.anIntArray221 == null) {
                return true;
            }
            @Pc(6) boolean local6 = true;
            if (arg0 != -41) {
                throw new NullPointerException();
            }
            for (@Pc(15) int local15 = 0; local15 < this.anIntArray221.length; local15++) {
                if (!Static11.method262(this.anIntArray221[local15])) {
                    local6 = false;
                }
            }
            return local6;
        } catch (@Pc(34) RuntimeException local34) {
            signlink.reporterror("44477, " + arg0 + ", " + local34.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Lclient!eb;")
    public Sound method499(@OriginalArg(0) int arg0) {
        try {
            if (arg0 >= 0) {
                this.outlineWidth = -326;
            }
            if (this.anIntArray221 == null) {
                return null;
            }
            @Pc(16) Sound[] local16 = new Sound[this.anIntArray221.length];
            for (@Pc(18) int local18 = 0; local18 < this.anIntArray221.length; local18++) {
                local16[local18] = Static11.method261(true, this.anIntArray221[local18]);
            }
            @Pc(43) Sound local43;
            if (local16.length == 1) {
                local43 = local16[0];
            } else {
                local43 = new Sound(local16.length, -314, local16);
            }
            for (@Pc(55) int local55 = 0; local55 < 6 && this.anIntArray222[local55] != 0; local55++) {
                local43.method275(this.anIntArray222[local55], this.anIntArray223[local55]);
            }
            return local43;
        } catch (@Pc(79) RuntimeException local79) {
            signlink.reporterror("63212, " + arg0 + ", " + local79.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Z")
    public boolean method500(@OriginalArg(0) int arg0) {
        try {
            if (arg0 <= 0) {
                throw new NullPointerException();
            }
            @Pc(7) boolean local7 = true;
            for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
                if (this.anIntArray224[local9] != -1 && !Static11.method262(this.anIntArray224[local9])) {
                    local7 = false;
                }
            }
            return local7;
        } catch (@Pc(32) RuntimeException local32) {
            signlink.reporterror("67395, " + arg0 + ", " + local32.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)Lclient!eb;")
    public Sound method501(@OriginalArg(0) int arg0) {
        try {
            @Pc(4) Sound[] local4 = new Sound[5];
            @Pc(6) int local6 = 0;
            for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
                if (this.anIntArray224[local8] != -1) {
                    local4[local6++] = Static11.method261(true, this.anIntArray224[local8]);
                }
            }
            if (arg0 != this.anInt749) {
                this.anInt749 = -438;
            }
            @Pc(44) Sound local44 = new Sound(local6, -314, local4);
            for (@Pc(46) int local46 = 0; local46 < 6 && this.anIntArray222[local46] != 0; local46++) {
                local44.method275(this.anIntArray222[local46], this.anIntArray223[local46]);
            }
            return local44;
        } catch (@Pc(70) RuntimeException local70) {
            signlink.reporterror("5248, " + arg0 + ", " + local70.toString());
            throw new RuntimeException();
        }
    }
}
