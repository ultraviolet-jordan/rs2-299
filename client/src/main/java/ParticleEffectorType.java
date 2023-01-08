import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!dc")
public final class ParticleEffectorType {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!ac;")
    private TextureOpIrregularBricks aTextureOpIrregularBricks1;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!ac;")
    private TextureOpIrregularBricks aTextureOpIrregularBricks2;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!ac;")
    private TextureOpIrregularBricks aTextureOpIrregularBricks3;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!ac;")
    private TextureOpIrregularBricks aTextureOpIrregularBricks4;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!ac;")
    private TextureOpIrregularBricks aTextureOpIrregularBricks5;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!ac;")
    private TextureOpIrregularBricks aTextureOpIrregularBricks6;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!ac;")
    private TextureOpIrregularBricks aTextureOpIrregularBricks7;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Lclient!ac;")
    private TextureOpIrregularBricks aTextureOpIrregularBricks8;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    private int anInt902;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Lclient!bc;")
    private PostProcessor aPostProcessor1;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Lclient!ac;")
    private TextureOpIrregularBricks aTextureOpIrregularBricks9;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public int anInt906;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    private int anInt478 = 168;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
    private int[] anIntArray103 = new int[5];

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
    private int[] anIntArray104 = new int[5];

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "[I")
    private int[] anIntArray105 = new int[5];

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    private int anInt903 = 100;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public int anInt905 = 500;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I")
    public int[] method244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
            Static10.anIntArray106[local3] = 0;
        }
        if (arg1 < 10) {
            return Static10.anIntArray106;
        }
        @Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
        this.aTextureOpIrregularBricks1.method44(true);
        this.aTextureOpIrregularBricks2.method44(true);
        @Pc(36) int local36 = 0;
        @Pc(38) int local38 = 0;
        @Pc(40) int local40 = 0;
        if (this.aTextureOpIrregularBricks3 != null) {
            this.aTextureOpIrregularBricks3.method44(true);
            this.aTextureOpIrregularBricks4.method44(true);
            local36 = (int) ((double) (this.aTextureOpIrregularBricks3.anInt145 - this.aTextureOpIrregularBricks3.anInt144) * 32.768D / local26);
            local38 = (int) ((double) this.aTextureOpIrregularBricks3.anInt144 * 32.768D / local26);
        }
        @Pc(77) int local77 = 0;
        @Pc(79) int local79 = 0;
        @Pc(81) int local81 = 0;
        if (this.aTextureOpIrregularBricks5 != null) {
            this.aTextureOpIrregularBricks5.method44(true);
            this.aTextureOpIrregularBricks6.method44(true);
            local77 = (int) ((double) (this.aTextureOpIrregularBricks5.anInt145 - this.aTextureOpIrregularBricks5.anInt144) * 32.768D / local26);
            local79 = (int) ((double) this.aTextureOpIrregularBricks5.anInt144 * 32.768D / local26);
        }
        for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
            if (this.anIntArray103[local118] != 0) {
                Static10.anIntArray109[local118] = 0;
                Static10.anIntArray110[local118] = (int) ((double) this.anIntArray105[local118] * local26);
                Static10.anIntArray111[local118] = (this.anIntArray103[local118] << 14) / 100;
                Static10.anIntArray112[local118] = (int) ((double) (this.aTextureOpIrregularBricks1.anInt145 - this.aTextureOpIrregularBricks1.anInt144) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray104[local118]) / local26);
                Static10.anIntArray113[local118] = (int) ((double) this.aTextureOpIrregularBricks1.anInt144 * 32.768D / local26);
            }
        }
        @Pc(201) int local201;
        @Pc(207) int local207;
        @Pc(216) int local216;
        @Pc(222) int local222;
        for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
            local201 = this.aTextureOpIrregularBricks1.method45(-45088, arg0);
            local207 = this.aTextureOpIrregularBricks2.method45(-45088, arg0);
            if (this.aTextureOpIrregularBricks3 != null) {
                local216 = this.aTextureOpIrregularBricks3.method45(-45088, arg0);
                local222 = this.aTextureOpIrregularBricks4.method45(-45088, arg0);
                local201 += this.method245(this.aTextureOpIrregularBricks3.anInt146, -377, local40, local222) >> 1;
                local40 += (local216 * local36 >> 16) + local38;
            }
            if (this.aTextureOpIrregularBricks5 != null) {
                local216 = this.aTextureOpIrregularBricks5.method45(-45088, arg0);
                local222 = this.aTextureOpIrregularBricks6.method45(-45088, arg0);
                local207 = local207 * ((this.method245(this.aTextureOpIrregularBricks5.anInt146, -377, local81, local222) >> 1) + 32768) >> 15;
                local81 += (local216 * local77 >> 16) + local79;
            }
            for (local216 = 0; local216 < 5; local216++) {
                if (this.anIntArray103[local216] != 0) {
                    local222 = local193 + Static10.anIntArray110[local216];
                    if (local222 < arg0) {
                        Static10.anIntArray106[local222] += this.method245(this.aTextureOpIrregularBricks1.anInt146, -377, Static10.anIntArray109[local216], local207 * Static10.anIntArray111[local216] >> 15);
                        Static10.anIntArray109[local216] += (local201 * Static10.anIntArray112[local216] >> 16) + Static10.anIntArray113[local216];
                    }
                }
            }
        }
        @Pc(379) int local379;
        @Pc(385) int local385;
        if (this.aTextureOpIrregularBricks7 != null) {
            this.aTextureOpIrregularBricks7.method44(true);
            this.aTextureOpIrregularBricks8.method44(true);
            local201 = 0;
            @Pc(367) boolean local367 = false;
            @Pc(369) boolean local369 = true;
            for (local222 = 0; local222 < arg0; local222++) {
                local379 = this.aTextureOpIrregularBricks7.method45(-45088, arg0);
                local385 = this.aTextureOpIrregularBricks8.method45(-45088, arg0);
                if (local369) {
                    local207 = this.aTextureOpIrregularBricks7.anInt144 + ((this.aTextureOpIrregularBricks7.anInt145 - this.aTextureOpIrregularBricks7.anInt144) * local379 >> 8);
                } else {
                    local207 = this.aTextureOpIrregularBricks7.anInt144 + ((this.aTextureOpIrregularBricks7.anInt145 - this.aTextureOpIrregularBricks7.anInt144) * local385 >> 8);
                }
                local201 += 256;
                if (local201 >= local207) {
                    local201 = 0;
                    local369 = !local369;
                }
                if (local369) {
                    Static10.anIntArray106[local222] = 0;
                }
            }
        }
        if (this.anInt902 > 0 && this.anInt903 > 0) {
            local201 = (int) ((double) this.anInt902 * local26);
            for (local207 = local201; local207 < arg0; local207++) {
                Static10.anIntArray106[local207] += Static10.anIntArray106[local207 - local201] * this.anInt903 / 100;
            }
        }
        if (this.aPostProcessor1.anIntArray18[0] > 0 || this.aPostProcessor1.anIntArray18[1] > 0) {
            this.aTextureOpIrregularBricks9.method44(true);
            local201 = this.aTextureOpIrregularBricks9.method45(-45088, arg0 + 1);
            local207 = this.aPostProcessor1.method54((float) local201 / 65536.0F, 0, false);
            local216 = this.aPostProcessor1.method54((float) local201 / 65536.0F, 1, false);
            if (arg0 >= local207 + local216) {
                local222 = 0;
                local379 = local216;
                if (local216 > arg0 - local207) {
                    local379 = arg0 - local207;
                }
                @Pc(559) int local559;
                @Pc(590) int local590;
                while (local222 < local379) {
                    local385 = (int) ((long) Static10.anIntArray106[local222 + local207] * (long) Static5.anInt169 >> 16);
                    for (local559 = 0; local559 < local207; local559++) {
                        local385 += (int) ((long) Static10.anIntArray106[local222 + local207 - local559 - 1] * (long) Static5.anIntArrayArray1[0][local559] >> 16);
                    }
                    for (local590 = 0; local590 < local222; local590++) {
                        local385 -= (int) ((long) Static10.anIntArray106[local222 - local590 - 1] * (long) Static5.anIntArrayArray1[1][local590] >> 16);
                    }
                    Static10.anIntArray106[local222] = local385;
                    local201 = this.aTextureOpIrregularBricks9.method45(-45088, arg0 + 1);
                    local222++;
                }
                @Pc(635) short local635 = 128;
                local379 = local635;
                while (true) {
                    if (local379 > arg0 - local207) {
                        local379 = arg0 - local207;
                    }
                    @Pc(694) int local694;
                    while (local222 < local379) {
                        local559 = (int) ((long) Static10.anIntArray106[local222 + local207] * (long) Static5.anInt169 >> 16);
                        for (local590 = 0; local590 < local207; local590++) {
                            local559 += (int) ((long) Static10.anIntArray106[local222 + local207 - local590 - 1] * (long) Static5.anIntArrayArray1[0][local590] >> 16);
                        }
                        for (local694 = 0; local694 < local216; local694++) {
                            local559 -= (int) ((long) Static10.anIntArray106[local222 - local694 - 1] * (long) Static5.anIntArrayArray1[1][local694] >> 16);
                        }
                        Static10.anIntArray106[local222] = local559;
                        local201 = this.aTextureOpIrregularBricks9.method45(-45088, arg0 + 1);
                        local222++;
                    }
                    if (local222 >= arg0 - local207) {
                        while (local222 < arg0) {
                            local559 = 0;
                            for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
                                local559 += (int) ((long) Static10.anIntArray106[local222 + local207 - local590 - 1] * (long) Static5.anIntArrayArray1[0][local590] >> 16);
                            }
                            for (local694 = 0; local694 < local216; local694++) {
                                local559 -= (int) ((long) Static10.anIntArray106[local222 - local694 - 1] * (long) Static5.anIntArrayArray1[1][local694] >> 16);
                            }
                            Static10.anIntArray106[local222] = local559;
                            this.aTextureOpIrregularBricks9.method45(-45088, arg0 + 1);
                            local222++;
                        }
                        break;
                    }
                    local207 = this.aPostProcessor1.method54((float) local201 / 65536.0F, 0, false);
                    local216 = this.aPostProcessor1.method54((float) local201 / 65536.0F, 1, false);
                    local379 += local635;
                }
            }
        }
        for (local201 = 0; local201 < arg0; local201++) {
            if (Static10.anIntArray106[local201] < -32768) {
                Static10.anIntArray106[local201] = -32768;
            }
            if (Static10.anIntArray106[local201] > 32767) {
                Static10.anIntArray106[local201] = 32767;
            }
        }
        return Static10.anIntArray106;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)I")
    private int method245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            if (arg1 >= 0) {
                return this.anInt478;
            } else if (arg0 == 1) {
                return (arg2 & 0x7FFF) < 16384 ? arg3 : -arg3;
            } else if (arg0 == 2) {
                return Static10.anIntArray108[arg2 & 0x7FFF] * arg3 >> 14;
            } else if (arg0 == 3) {
                return ((arg2 & 0x7FFF) * arg3 >> 14) - arg3;
            } else if (arg0 == 4) {
                return Static10.anIntArray107[arg2 / 2607 & 0x7FFF] * arg3;
            } else {
                return 0;
            }
        } catch (@Pc(61) RuntimeException local61) {
            signlink.reporterror("25434, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local61.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!lb;I)V")
    public void method246(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
        try {
            this.aTextureOpIrregularBricks1 = new TextureOpIrregularBricks();
            this.aTextureOpIrregularBricks1.method42(arg0, 8);
            this.aTextureOpIrregularBricks2 = new TextureOpIrregularBricks();
            this.aTextureOpIrregularBricks2.method42(arg0, 8);
            @Pc(24) int local24 = arg0.method480();
            if (arg1 != 8) {
                this.anInt478 = -416;
            }
            if (local24 != 0) {
                arg0.anInt742--;
                this.aTextureOpIrregularBricks3 = new TextureOpIrregularBricks();
                this.aTextureOpIrregularBricks3.method42(arg0, 8);
                this.aTextureOpIrregularBricks4 = new TextureOpIrregularBricks();
                this.aTextureOpIrregularBricks4.method42(arg0, 8);
            }
            local24 = arg0.method480();
            if (local24 != 0) {
                arg0.anInt742--;
                this.aTextureOpIrregularBricks5 = new TextureOpIrregularBricks();
                this.aTextureOpIrregularBricks5.method42(arg0, 8);
                this.aTextureOpIrregularBricks6 = new TextureOpIrregularBricks();
                this.aTextureOpIrregularBricks6.method42(arg0, 8);
            }
            local24 = arg0.method480();
            if (local24 != 0) {
                arg0.anInt742--;
                this.aTextureOpIrregularBricks7 = new TextureOpIrregularBricks();
                this.aTextureOpIrregularBricks7.method42(arg0, 8);
                this.aTextureOpIrregularBricks8 = new TextureOpIrregularBricks();
                this.aTextureOpIrregularBricks8.method42(arg0, 8);
            }
            for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
                @Pc(133) int local133 = arg0.method494();
                if (local133 == 0) {
                    break;
                }
                this.anIntArray103[local122] = local133;
                this.anIntArray104[local122] = arg0.method493();
                this.anIntArray105[local122] = arg0.method494();
            }
            this.anInt902 = arg0.method494();
            this.anInt903 = arg0.method494();
            this.anInt905 = arg0.method482();
            this.anInt906 = arg0.method482();
            this.aPostProcessor1 = new PostProcessor();
            this.aTextureOpIrregularBricks9 = new TextureOpIrregularBricks();
            this.aPostProcessor1.method55(this.aTextureOpIrregularBricks9, 39196, arg0);
        } catch (@Pc(191) RuntimeException local191) {
            signlink.reporterror("84688, " + arg0 + ", " + arg1 + ", " + local191.toString());
            throw new RuntimeException();
        }
    }
}
