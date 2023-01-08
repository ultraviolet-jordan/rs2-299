import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class ParamType {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Z")
    private boolean aBoolean171 = true;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    private int anInt681 = -16342;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    private int anInt682 = -510;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Z")
    private boolean aBoolean172 = true;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "B")
    private byte aByte23 = 9;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Z")
    private boolean aBoolean173 = false;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    private int anInt683 = 465;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Z")
    private boolean aBoolean174 = true;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    private int anInt684;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    private int anInt685;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    private int anInt686;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    private int anInt687;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "[[I")
    public int[][] anIntArrayArray18;

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(III)V")
    public ParamType(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        try {
            this.anInt684 = 0;
            this.anInt685 = 0;
            this.anInt686 = arg0;
            this.anInt687 = arg2;
            this.anIntArrayArray18 = new int[this.anInt686][this.anInt687];
            this.method420(this.anInt681);
            if (arg1 != -20259) {
                for (@Pc(55) int local55 = 1; local55 > 0; local55++) {
                }
            }
        } catch (@Pc(68) RuntimeException local68) {
            signlink.reporterror("88375, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local68.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public void method420(@OriginalArg(0) int arg0) {
        try {
            if (arg0 != -16342) {
                this.aBoolean171 = !this.aBoolean171;
            }
            for (@Pc(14) int local14 = 0; local14 < this.anInt686; local14++) {
                for (@Pc(18) int local18 = 0; local18 < this.anInt687; local18++) {
                    if (local14 == 0 || local18 == 0 || local14 == this.anInt686 - 1 || local18 == this.anInt687 - 1) {
                        this.anIntArrayArray18[local14][local18] = 16777215;
                    } else {
                        this.anIntArrayArray18[local14][local18] = 0;
                    }
                }
            }
        } catch (@Pc(64) RuntimeException local64) {
            signlink.reporterror("80987, " + arg0 + ", " + local64.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZI)V")
    public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
        try {
            while (arg1 >= 0) {
                for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
                }
            }
            @Pc(17) int local17 = arg0 - this.anInt684;
            @Pc(22) int local22 = arg3 - this.anInt685;
            if (arg5 == 0) {
                if (arg2 == 0) {
                    this.method424(local17, local22, 128);
                    this.method424(local17 - 1, local22, 8);
                }
                if (arg2 == 1) {
                    this.method424(local17, local22, 2);
                    this.method424(local17, local22 + 1, 32);
                }
                if (arg2 == 2) {
                    this.method424(local17, local22, 8);
                    this.method424(local17 + 1, local22, 128);
                }
                if (arg2 == 3) {
                    this.method424(local17, local22, 32);
                    this.method424(local17, local22 - 1, 2);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg2 == 0) {
                    this.method424(local17, local22, 1);
                    this.method424(local17 - 1, local22 + 1, 16);
                }
                if (arg2 == 1) {
                    this.method424(local17, local22, 4);
                    this.method424(local17 + 1, local22 + 1, 64);
                }
                if (arg2 == 2) {
                    this.method424(local17, local22, 16);
                    this.method424(local17 + 1, local22 - 1, 1);
                }
                if (arg2 == 3) {
                    this.method424(local17, local22, 64);
                    this.method424(local17 - 1, local22 - 1, 4);
                }
            }
            if (arg5 == 2) {
                if (arg2 == 0) {
                    this.method424(local17, local22, 130);
                    this.method424(local17 - 1, local22, 8);
                    this.method424(local17, local22 + 1, 32);
                }
                if (arg2 == 1) {
                    this.method424(local17, local22, 10);
                    this.method424(local17, local22 + 1, 32);
                    this.method424(local17 + 1, local22, 128);
                }
                if (arg2 == 2) {
                    this.method424(local17, local22, 40);
                    this.method424(local17 + 1, local22, 128);
                    this.method424(local17, local22 - 1, 2);
                }
                if (arg2 == 3) {
                    this.method424(local17, local22, 160);
                    this.method424(local17, local22 - 1, 2);
                    this.method424(local17 - 1, local22, 8);
                }
            }
            if (arg4) {
                if (arg5 == 0) {
                    if (arg2 == 0) {
                        this.method424(local17, local22, 65536);
                        this.method424(local17 - 1, local22, 4096);
                    }
                    if (arg2 == 1) {
                        this.method424(local17, local22, 1024);
                        this.method424(local17, local22 + 1, 16384);
                    }
                    if (arg2 == 2) {
                        this.method424(local17, local22, 4096);
                        this.method424(local17 + 1, local22, 65536);
                    }
                    if (arg2 == 3) {
                        this.method424(local17, local22, 16384);
                        this.method424(local17, local22 - 1, 1024);
                    }
                }
                if (arg5 == 1 || arg5 == 3) {
                    if (arg2 == 0) {
                        this.method424(local17, local22, 512);
                        this.method424(local17 - 1, local22 + 1, 8192);
                    }
                    if (arg2 == 1) {
                        this.method424(local17, local22, 2048);
                        this.method424(local17 + 1, local22 + 1, 32768);
                    }
                    if (arg2 == 2) {
                        this.method424(local17, local22, 8192);
                        this.method424(local17 + 1, local22 - 1, 512);
                    }
                    if (arg2 == 3) {
                        this.method424(local17, local22, 32768);
                        this.method424(local17 - 1, local22 - 1, 2048);
                    }
                }
                if (arg5 == 2) {
                    if (arg2 == 0) {
                        this.method424(local17, local22, 66560);
                        this.method424(local17 - 1, local22, 4096);
                        this.method424(local17, local22 + 1, 16384);
                    }
                    if (arg2 == 1) {
                        this.method424(local17, local22, 5120);
                        this.method424(local17, local22 + 1, 16384);
                        this.method424(local17 + 1, local22, 65536);
                    }
                    if (arg2 == 2) {
                        this.method424(local17, local22, 20480);
                        this.method424(local17 + 1, local22, 65536);
                        this.method424(local17, local22 - 1, 1024);
                    }
                    if (arg2 == 3) {
                        this.method424(local17, local22, 81920);
                        this.method424(local17, local22 - 1, 1024);
                        this.method424(local17 - 1, local22, 4096);
                        return;
                    }
                }
            }
        } catch (@Pc(474) RuntimeException local474) {
            signlink.reporterror("53952, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local474.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZIIII)V")
    public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
        try {
            @Pc(3) int local3 = 256;
            @Pc(7) int local7;
            if (arg6 != 0) {
                for (local7 = 1; local7 > 0; local7++) {
                }
            }
            if (arg2) {
                local3 += 131072;
            }
            @Pc(23) int local23 = arg4 - this.anInt684;
            @Pc(28) int local28 = arg3 - this.anInt685;
            if (arg5 == 1 || arg5 == 3) {
                local7 = arg0;
                arg0 = arg1;
                arg1 = local7;
            }
            for (local7 = local23; local7 < local23 + arg0; local7++) {
                if (local7 >= 0 && local7 < this.anInt686) {
                    for (@Pc(52) int local52 = local28; local52 < local28 + arg1; local52++) {
                        if (local52 >= 0 && local52 < this.anInt687) {
                            this.method424(local7, local52, local3);
                        }
                    }
                }
            }
        } catch (@Pc(79) RuntimeException local79) {
            signlink.reporterror("15235, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local79.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZ)V")
    public void method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
        try {
            @Pc(4) int local4 = arg1 - this.anInt684;
            if (!arg2) {
                for (@Pc(8) int local8 = 1; local8 > 0; local8++) {
                }
            }
            @Pc(18) int local18 = arg0 - this.anInt685;
            this.anIntArrayArray18[local4][local18] |= 0x200000;
        } catch (@Pc(30) RuntimeException local30) {
            signlink.reporterror("66421, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    private void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        this.anIntArrayArray18[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZZIII)V")
    public void method425(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
        try {
            @Pc(4) int local4 = arg0 - this.anInt684;
            @Pc(9) int local9 = arg4 - this.anInt685;
            if (arg1) {
                this.aBoolean172 = !this.aBoolean172;
            }
            if (arg3 == 0) {
                if (arg5 == 0) {
                    this.method427(128, false, local4, local9);
                    this.method427(8, false, local4 - 1, local9);
                }
                if (arg5 == 1) {
                    this.method427(2, false, local4, local9);
                    this.method427(32, false, local4, local9 + 1);
                }
                if (arg5 == 2) {
                    this.method427(8, false, local4, local9);
                    this.method427(128, false, local4 + 1, local9);
                }
                if (arg5 == 3) {
                    this.method427(32, false, local4, local9);
                    this.method427(2, false, local4, local9 - 1);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg5 == 0) {
                    this.method427(1, false, local4, local9);
                    this.method427(16, false, local4 - 1, local9 + 1);
                }
                if (arg5 == 1) {
                    this.method427(4, false, local4, local9);
                    this.method427(64, false, local4 + 1, local9 + 1);
                }
                if (arg5 == 2) {
                    this.method427(16, false, local4, local9);
                    this.method427(1, false, local4 + 1, local9 - 1);
                }
                if (arg5 == 3) {
                    this.method427(64, false, local4, local9);
                    this.method427(4, false, local4 - 1, local9 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    this.method427(130, false, local4, local9);
                    this.method427(8, false, local4 - 1, local9);
                    this.method427(32, false, local4, local9 + 1);
                }
                if (arg5 == 1) {
                    this.method427(10, false, local4, local9);
                    this.method427(32, false, local4, local9 + 1);
                    this.method427(128, false, local4 + 1, local9);
                }
                if (arg5 == 2) {
                    this.method427(40, false, local4, local9);
                    this.method427(128, false, local4 + 1, local9);
                    this.method427(2, false, local4, local9 - 1);
                }
                if (arg5 == 3) {
                    this.method427(160, false, local4, local9);
                    this.method427(2, false, local4, local9 - 1);
                    this.method427(8, false, local4 - 1, local9);
                }
            }
            if (arg2) {
                if (arg3 == 0) {
                    if (arg5 == 0) {
                        this.method427(65536, false, local4, local9);
                        this.method427(4096, false, local4 - 1, local9);
                    }
                    if (arg5 == 1) {
                        this.method427(1024, false, local4, local9);
                        this.method427(16384, false, local4, local9 + 1);
                    }
                    if (arg5 == 2) {
                        this.method427(4096, false, local4, local9);
                        this.method427(65536, false, local4 + 1, local9);
                    }
                    if (arg5 == 3) {
                        this.method427(16384, false, local4, local9);
                        this.method427(1024, false, local4, local9 - 1);
                    }
                }
                if (arg3 == 1 || arg3 == 3) {
                    if (arg5 == 0) {
                        this.method427(512, false, local4, local9);
                        this.method427(8192, false, local4 - 1, local9 + 1);
                    }
                    if (arg5 == 1) {
                        this.method427(2048, false, local4, local9);
                        this.method427(32768, false, local4 + 1, local9 + 1);
                    }
                    if (arg5 == 2) {
                        this.method427(8192, false, local4, local9);
                        this.method427(512, false, local4 + 1, local9 - 1);
                    }
                    if (arg5 == 3) {
                        this.method427(32768, false, local4, local9);
                        this.method427(2048, false, local4 - 1, local9 - 1);
                    }
                }
                if (arg3 == 2) {
                    if (arg5 == 0) {
                        this.method427(66560, false, local4, local9);
                        this.method427(4096, false, local4 - 1, local9);
                        this.method427(16384, false, local4, local9 + 1);
                    }
                    if (arg5 == 1) {
                        this.method427(5120, false, local4, local9);
                        this.method427(16384, false, local4, local9 + 1);
                        this.method427(65536, false, local4 + 1, local9);
                    }
                    if (arg5 == 2) {
                        this.method427(20480, false, local4, local9);
                        this.method427(65536, false, local4 + 1, local9);
                        this.method427(1024, false, local4, local9 - 1);
                    }
                    if (arg5 == 3) {
                        this.method427(81920, false, local4, local9);
                        this.method427(1024, false, local4, local9 - 1);
                        this.method427(4096, false, local4 - 1, local9);
                        return;
                    }
                }
            }
        } catch (@Pc(527) RuntimeException local527) {
            signlink.reporterror("21320, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local527.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIIIIII)V")
    public void method426(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
        try {
            if (arg5 == 5) {
                @Pc(7) int local7 = 256;
                if (arg0) {
                    local7 += 131072;
                }
                @Pc(18) int local18 = arg2 - this.anInt684;
                @Pc(23) int local23 = arg3 - this.anInt685;
                @Pc(31) int local31;
                if (arg1 == 1 || arg1 == 3) {
                    local31 = arg6;
                    arg6 = arg4;
                    arg4 = local31;
                }
                for (local31 = local18; local31 < local18 + arg6; local31++) {
                    if (local31 >= 0 && local31 < this.anInt686) {
                        for (@Pc(47) int local47 = local23; local47 < local23 + arg4; local47++) {
                            if (local47 >= 0 && local47 < this.anInt687) {
                                this.method427(local7, false, local31, local47);
                            }
                        }
                    }
                }
            }
        } catch (@Pc(75) RuntimeException local75) {
            signlink.reporterror("10453, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local75.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZII)V")
    private void method427(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            if (!arg1) {
                this.anIntArrayArray18[arg2][arg3] &= 16777215 - arg0;
            }
        } catch (@Pc(16) RuntimeException local16) {
            signlink.reporterror("78003, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local16.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIZ)V")
    public void method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
        try {
            @Pc(4) int local4 = arg1 - this.anInt684;
            @Pc(9) int local9 = arg0 - this.anInt685;
            if (!arg2) {
                this.anIntArrayArray18[local4][local9] &= 0xDFFFFF;
            }
        } catch (@Pc(24) RuntimeException local24) {
            signlink.reporterror("15426, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local24.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
    public boolean method429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
        try {
            if (arg1 == arg0 && arg3 == arg2) {
                return true;
            }
            @Pc(12) int local12 = arg1 - this.anInt684;
            @Pc(17) int local17 = arg3 - this.anInt685;
            if (arg4 != 7843) {
                for (@Pc(22) int local22 = 1; local22 > 0; local22++) {
                }
            }
            @Pc(32) int local32 = arg0 - this.anInt684;
            @Pc(37) int local37 = arg2 - this.anInt685;
            if (arg5 == 0) {
                if (arg6 == 0) {
                    if (local12 == local32 - 1 && local17 == local37) {
                        return true;
                    }
                    if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
                        return true;
                    }
                    if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (local12 == local32 && local17 == local37 + 1) {
                        return true;
                    }
                    if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
                        return true;
                    }
                    if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (local12 == local32 + 1 && local17 == local37) {
                        return true;
                    }
                    if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
                        return true;
                    }
                    if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (local12 == local32 && local17 == local37 - 1) {
                        return true;
                    }
                    if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
                        return true;
                    }
                    if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg6 == 0) {
                    if (local12 == local32 - 1 && local17 == local37) {
                        return true;
                    }
                    if (local12 == local32 && local17 == local37 + 1) {
                        return true;
                    }
                    if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
                        return true;
                    }
                    if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
                        return true;
                    }
                    if (local12 == local32 && local17 == local37 + 1) {
                        return true;
                    }
                    if (local12 == local32 + 1 && local17 == local37) {
                        return true;
                    }
                    if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
                        return true;
                    }
                    if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
                        return true;
                    }
                    if (local12 == local32 + 1 && local17 == local37) {
                        return true;
                    }
                    if (local12 == local32 && local17 == local37 - 1) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (local12 == local32 - 1 && local17 == local37) {
                        return true;
                    }
                    if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
                        return true;
                    }
                    if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
                        return true;
                    }
                    if (local12 == local32 && local17 == local37 - 1) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
                    return true;
                }
                if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
                    return true;
                }
                if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
                    return true;
                }
                if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        } catch (@Pc(570) RuntimeException local570) {
            signlink.reporterror("72677, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local570.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIIIIII)Z")
    public boolean method430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
        try {
            if (arg5 == arg4 && arg3 == arg0) {
                return true;
            }
            @Pc(12) int local12 = arg5 - this.anInt684;
            @Pc(17) int local17 = arg3 - this.anInt685;
            if (arg1 != 0) {
                for (@Pc(21) int local21 = 1; local21 > 0; local21++) {
                }
            }
            @Pc(31) int local31 = arg4 - this.anInt684;
            @Pc(36) int local36 = arg0 - this.anInt685;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (local12 == local31 + 1 && local17 == local36 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
                        return true;
                    }
                    if (local12 == local31 && local17 == local36 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (local12 == local31 - 1 && local17 == local36 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
                        return true;
                    }
                    if (local12 == local31 && local17 == local36 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (local12 == local31 - 1 && local17 == local36 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
                        return true;
                    }
                    if (local12 == local31 && local17 == local36 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (local12 == local31 + 1 && local17 == local36 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
                        return true;
                    }
                    if (local12 == local31 && local17 == local36 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (local12 == local31 && local17 == local36 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
                    return true;
                }
                if (local12 == local31 && local17 == local36 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
                    return true;
                }
                if (local12 == local31 - 1 && local17 == local36 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
                    return true;
                }
                if (local12 == local31 + 1 && local17 == local36 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        } catch (@Pc(296) RuntimeException local296) {
            signlink.reporterror("97358, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local296.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIZI)Z")
    public boolean method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7) {
        try {
            if (!arg6) {
                throw new NullPointerException();
            }
            @Pc(11) int local11 = arg0 + arg3 - 1;
            @Pc(17) int local17 = arg4 + arg5 - 1;
            if (arg7 >= arg0 && arg7 <= local11 && arg2 >= arg4 && arg2 <= local17) {
                return true;
            } else if (arg7 == arg0 - 1 && arg2 >= arg4 && arg2 <= local17 && (this.anIntArrayArray18[arg7 - this.anInt684][arg2 - this.anInt685] & 0x8) == 0 && (arg1 & 0x8) == 0) {
                return true;
            } else if (arg7 == local11 + 1 && arg2 >= arg4 && arg2 <= local17 && (this.anIntArrayArray18[arg7 - this.anInt684][arg2 - this.anInt685] & 0x80) == 0 && (arg1 & 0x2) == 0) {
                return true;
            } else if (arg2 == arg4 - 1 && arg7 >= arg0 && arg7 <= local11 && (this.anIntArrayArray18[arg7 - this.anInt684][arg2 - this.anInt685] & 0x2) == 0 && (arg1 & 0x4) == 0) {
                return true;
            } else {
                return arg2 == local17 + 1 && arg7 >= arg0 && arg7 <= local11 && (this.anIntArrayArray18[arg7 - this.anInt684][arg2 - this.anInt685] & 0x20) == 0 && (arg1 & 0x1) == 0;
            }
        } catch (@Pc(162) RuntimeException local162) {
            signlink.reporterror("28245, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local162.toString());
            throw new RuntimeException();
        }
    }
}
