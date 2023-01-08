import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!r")
public final class SecondaryParticleNode {

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    private int anInt857;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    private int anInt858;

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
    private int anInt881;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    private int anInt851 = -36824;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    private int anInt852 = -172;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "B")
    private byte aByte27 = 7;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "B")
    private byte aByte28 = 5;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Z")
    private boolean aBoolean213 = false;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Z")
    private boolean aBoolean214 = false;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    private int anInt853 = 18835;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "[Lclient!p;")
    private Npc[] aNpcArray1 = new Npc[5000];

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "[I")
    private int[] anIntArray245 = new int[10000];

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "[I")
    private int[] anIntArray246 = new int[10000];

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "[[I")
    private int[][] anIntArrayArray19 = new int[][]{new int[16], {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};

    @OriginalMember(owner = "client!r", name = "jb", descriptor = "[[I")
    private int[][] anIntArrayArray20 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    private int anInt854;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    private int anInt855;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    private int iterator;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "[[[Lclient!v;")
    private IntNode[][][] anIntNodeArrayArrayArray1;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "[[[I")
    private int[][][] anIntArrayArrayArray7;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "[[[I")
    private int[][][] anIntArrayArrayArray6;

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(II[[[III)V")
    public SecondaryParticleNode(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
        try {
            this.anInt854 = arg3;
            this.anInt855 = arg4;
            this.iterator = arg1;
            this.anIntNodeArrayArrayArray1 = new IntNode[arg3][arg4][arg1];
            if (arg0 < 3 || arg0 > 3) {
                for (@Pc(840) int local840 = 1; local840 > 0; local840++) {
                }
            }
            this.anIntArrayArrayArray7 = new int[arg3][arg4 + 1][arg1 + 1];
            this.anIntArrayArrayArray6 = arg2;
            this.method530(this.anInt851);
        } catch (@Pc(870) RuntimeException local870) {
            signlink.reporterror("87673, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local870.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public void method530(@OriginalArg(0) int arg0) {
        try {
            @Pc(7) int local7;
            @Pc(11) int local11;
            for (@Pc(3) int local3 = 0; local3 < this.anInt854; local3++) {
                for (local7 = 0; local7 < this.anInt855; local7++) {
                    for (local11 = 0; local11 < this.iterator; local11++) {
                        this.anIntNodeArrayArrayArray1[local3][local7][local11] = null;
                    }
                }
            }
            for (local7 = 0; local7 < Static28.anInt879; local7++) {
                for (local11 = 0; local11 < Static28.anIntArray236[local7]; local11++) {
                    Static28.anIsaacRandomArrayArray1[local7][local11] = null;
                }
                Static28.anIntArray236[local7] = 0;
            }
            for (local11 = 0; local11 < this.anInt858; local11++) {
                this.aNpcArray1[local11] = null;
            }
            this.anInt858 = 0;
            if (arg0 != -36824) {
                this.anInt851 = -296;
            }
            for (@Pc(90) int local90 = 0; local90 < Static28.aNpcArray2.length; local90++) {
                Static28.aNpcArray2[local90] = null;
            }
        } catch (@Pc(103) RuntimeException local103) {
            signlink.reporterror("35738, " + arg0 + ", " + local103.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    public void method531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        try {
            @Pc(5) int local5 = 17 / arg0;
            this.anInt857 = arg1;
            for (@Pc(10) int local10 = 0; local10 < this.anInt855; local10++) {
                for (@Pc(14) int local14 = 0; local14 < this.iterator; local14++) {
                    this.anIntNodeArrayArrayArray1[arg1][local10][local14] = new IntNode(arg1, local10, local14);
                }
            }
        } catch (@Pc(42) RuntimeException local42) {
            signlink.reporterror("40348, " + arg0 + ", " + arg1 + ", " + local42.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)V")
    public void method532(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
        try {
            @Pc(10) IntNode local10 = this.anIntNodeArrayArrayArray1[0][arg2][arg0];
            @Pc(15) int local15;
            if (arg1 != 79) {
                for (local15 = 1; local15 > 0; local15++) {
                }
            }
            for (local15 = 0; local15 < 3; local15++) {
                @Pc(44) IntNode local44 = this.anIntNodeArrayArrayArray1[local15][arg2][arg0] = this.anIntNodeArrayArrayArray1[local15 + 1][arg2][arg0];
                if (local44 != null) {
                    local44.anInt957--;
                    for (@Pc(54) int local54 = 0; local54 < local44.anInt961; local54++) {
                        @Pc(61) Npc local61 = local44.aNpcArray3[local54];
                        if ((local61.anInt824 >> 29 & 0x3) == 2 && local61.anInt818 == arg2 && local61.anInt820 == arg0) {
                            local61.anInt813--;
                        }
                    }
                }
            }
            if (this.anIntNodeArrayArrayArray1[0][arg2][arg0] == null) {
                this.anIntNodeArrayArrayArray1[0][arg2][arg0] = new IntNode(0, arg2, arg0);
            }
            this.anIntNodeArrayArrayArray1[0][arg2][arg0].anIntNode1 = local10;
            this.anIntNodeArrayArrayArray1[3][arg2][arg0] = null;
        } catch (@Pc(136) RuntimeException local136) {
            signlink.reporterror("34238, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local136.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public void method534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        @Pc(8) IntNode local8 = this.anIntNodeArrayArrayArray1[arg0][arg1][arg2];
        if (local8 != null) {
            this.anIntNodeArrayArrayArray1[arg0][arg1][arg2].anInt963 = arg3;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
        @Pc(14) SpotAnim local14;
        @Pc(16) int local16;
        if (arg3 == 0) {
            local14 = new SpotAnim(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (local16 = arg0; local16 >= 0; local16--) {
                if (this.anIntNodeArrayArrayArray1[local16][arg1][arg2] == null) {
                    this.anIntNodeArrayArrayArray1[local16][arg1][arg2] = new IntNode(local16, arg1, arg2);
                }
            }
            this.anIntNodeArrayArrayArray1[arg0][arg1][arg2].aSpotAnim1 = local14;
        } else if (arg3 == 1) {
            local14 = new SpotAnim(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (local16 = arg0; local16 >= 0; local16--) {
                if (this.anIntNodeArrayArrayArray1[local16][arg1][arg2] == null) {
                    this.anIntNodeArrayArrayArray1[local16][arg1][arg2] = new IntNode(local16, arg1, arg2);
                }
            }
            this.anIntNodeArrayArrayArray1[arg0][arg1][arg2].aSpotAnim1 = local14;
        } else {
            @Pc(145) Class16 local145 = new Class16(arg17, true, arg5, arg11, arg10, arg6, arg16, arg1, arg4, arg8, arg2, arg18, arg7, arg15, arg12, arg9, arg19, arg13, arg14, arg3);
            for (local16 = arg0; local16 >= 0; local16--) {
                if (this.anIntNodeArrayArrayArray1[local16][arg1][arg2] == null) {
                    this.anIntNodeArrayArrayArray1[local16][arg1][arg2] = new IntNode(local16, arg1, arg2);
                }
            }
            this.anIntNodeArrayArrayArray1[arg0][arg1][arg2].aClass16_1 = local145;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIBIILclient!x;II)V")
    public void method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
        try {
            if (arg5 != null) {
                @Pc(6) ByteArrayNode local6 = new ByteArrayNode();
                if (arg0 < 8 || arg0 > 8) {
                    this.anInt853 = -141;
                }
                local6.aClass1_Sub1_Sub1_2 = arg5;
                local6.anInt659 = arg6 * 128 + 64;
                local6.anInt660 = arg4 * 128 + 64;
                local6.anInt658 = arg7;
                local6.anInt661 = arg3;
                local6.aByte22 = arg2;
                if (this.anIntNodeArrayArrayArray1[arg1][arg6][arg4] == null) {
                    this.anIntNodeArrayArrayArray1[arg1][arg6][arg4] = new IntNode(arg1, arg6, arg4);
                }
                this.anIntNodeArrayArrayArray1[arg1][arg6][arg4].aByteArrayNode1 = local6;
            }
        } catch (@Pc(76) RuntimeException local76) {
            signlink.reporterror("37214, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local76.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZILclient!x;IIILclient!x;Lclient!x;I)V")
    public void method537(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub1 arg6, @OriginalArg(7) Class1_Sub1_Sub1 arg7, @OriginalArg(8) int arg8) {
        try {
            @Pc(3) Class20 local3 = new Class20();
            local3.aClass1_Sub1_Sub1_3 = arg7;
            local3.anInt689 = arg1 * 128 + 64;
            local3.anInt690 = arg8 * 128 + 64;
            local3.anInt688 = arg5;
            local3.anInt691 = arg4;
            local3.aClass1_Sub1_Sub1_4 = arg6;
            local3.aClass1_Sub1_Sub1_5 = arg2;
            @Pc(34) int local34 = 0;
            @Pc(43) IntNode local43 = this.anIntNodeArrayArrayArray1[arg3][arg1][arg8];
            if (local43 != null) {
                for (@Pc(47) int local47 = 0; local47 < local43.anInt961; local47++) {
                    if (local43.aNpcArray3[local47].aClass1_Sub1_Sub1_6 instanceof Sound) {
                        @Pc(64) int local64 = ((Sound) local43.aNpcArray3[local47].aClass1_Sub1_Sub1_6).anInt502;
                        if (local64 > local34) {
                            local34 = local64;
                        }
                    }
                }
            }
            local3.anInt692 = local34;
            if (this.anIntNodeArrayArrayArray1[arg3][arg1][arg8] == null) {
                this.anIntNodeArrayArrayArray1[arg3][arg1][arg8] = new IntNode(arg3, arg1, arg8);
            }
            this.anIntNodeArrayArrayArray1[arg3][arg1][arg8].aClass20_1 = local3;
            if (arg0) {
                ;
            }
        } catch (@Pc(114) RuntimeException local114) {
            signlink.reporterror("30676, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local114.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!x;Lclient!x;IIIIIIIIB)V")
    public void method538(@OriginalArg(0) Class1_Sub1_Sub1 arg0, @OriginalArg(1) Class1_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte arg10) {
        try {
            if (arg1 != null || arg0 != null) {
                @Pc(10) UnlitMaterialRenderer local10 = new UnlitMaterialRenderer();
                local10.anInt840 = arg3;
                local10.aByte26 = arg10;
                local10.anInt836 = arg8 * 128 + 64;
                while (arg2 >= 0) {
                    this.aBoolean214 = !this.aBoolean214;
                }
                local10.anInt837 = arg5 * 128 + 64;
                local10.anInt835 = arg4;
                local10.aClass1_Sub1_Sub1_7 = arg1;
                local10.aClass1_Sub1_Sub1_8 = arg0;
                local10.anInt838 = arg6;
                local10.anInt839 = arg7;
                for (@Pc(59) int local59 = arg9; local59 >= 0; local59--) {
                    if (this.anIntNodeArrayArrayArray1[local59][arg8][arg5] == null) {
                        this.anIntNodeArrayArrayArray1[local59][arg8][arg5] = new IntNode(local59, arg8, arg5);
                    }
                }
                this.anIntNodeArrayArrayArray1[arg9][arg8][arg5].anUnlitMaterialRenderer1 = local10;
            }
        } catch (@Pc(99) RuntimeException local99) {
            signlink.reporterror("51619, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local99.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!x;IIIIBIIBIII)V")
    public void method539(@OriginalArg(0) Class1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
        try {
            if (arg0 != null) {
                @Pc(6) Envelope local6 = new Envelope();
                local6.nextTime = arg11;
                local6.aByte17 = arg8;
                local6.maxInterval = arg10 * 128 + arg9 + 64;
                local6.minInterval = arg7 * 128 + arg2 + 64;
                local6.anInt575 = arg1;
                local6.aClass1_Sub1_Sub1_1 = arg0;
                if (arg5 != 49) {
                    this.anInt853 = -233;
                }
                local6.anInt578 = arg6;
                local6.wavetable = arg3;
                for (@Pc(50) int local50 = arg4; local50 >= 0; local50--) {
                    if (this.anIntNodeArrayArrayArray1[local50][arg10][arg7] == null) {
                        this.anIntNodeArrayArrayArray1[local50][arg10][arg7] = new IntNode(local50, arg10, arg7);
                    }
                }
                this.anIntNodeArrayArrayArray1[arg4][arg10][arg7].anEnvelope1 = local6;
            }
        } catch (@Pc(90) RuntimeException local90) {
            signlink.reporterror("53694, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local90.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIBIIBLclient!x;)Z")
    public boolean method540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) Class1_Sub1_Sub1 arg10) {
        try {
            if (arg10 == null) {
                return true;
            }
            @Pc(11) int local11 = arg7 * 128 + arg8 * 64;
            @Pc(19) int local19 = arg2 * 128 + arg0 * 64;
            if (arg9 != this.aByte27) {
                throw new NullPointerException();
            }
            @Pc(25) boolean local25 = false;
            return this.method543(arg1, arg7, arg2, arg8, arg0, local11, local19, arg4, arg10, arg5, false, arg3, arg6);
        } catch (@Pc(48) RuntimeException local48) {
            signlink.reporterror("49124, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local48.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!x;IIIIIIBZI)Z")
    public boolean method541(@OriginalArg(0) Class1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
        try {
            if (arg0 == null) {
                return true;
            }
            @Pc(7) int local7 = arg1 - arg4;
            @Pc(11) int local11 = arg5 - arg4;
            @Pc(15) int local15 = arg1 + arg4;
            @Pc(19) int local19 = arg5 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    local19 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    local15 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    local11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    local7 -= 128;
                }
            }
            local7 /= 128;
            if (arg7 != 54) {
                this.aBoolean213 = !this.aBoolean213;
            }
            local11 /= 128;
            local15 /= 128;
            local19 /= 128;
            return this.method543(arg2, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg5, arg3, arg0, arg6, true, arg9, (byte) 0);
        } catch (@Pc(101) RuntimeException local101) {
            signlink.reporterror("88882, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local101.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIIIILclient!x;IIIIII)Z")
    public boolean method542(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
        try {
            if (arg1 != 4) {
                for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
                }
            }
            return arg6 == null ? true : this.method543(arg3, arg2, arg12, arg4 + 1 - arg2, arg0 - arg12 + 1, arg11, arg5, arg10, arg6, arg8, true, arg7, (byte) 0);
        } catch (@Pc(38) RuntimeException local38) {
            signlink.reporterror("23801, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + arg12 + ", " + local38.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIILclient!x;IZIB)Z")
    private boolean method543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12) {
        for (@Pc(3) int local3 = arg1; local3 < arg1 + arg3; local3++) {
            for (@Pc(7) int local7 = arg2; local7 < arg2 + arg4; local7++) {
                if (local3 < 0 || local7 < 0 || local3 >= this.anInt855 || local7 >= this.iterator) {
                    return false;
                }
                @Pc(32) IntNode local32 = this.anIntNodeArrayArrayArray1[arg0][local3][local7];
                if (local32 != null && local32.anInt961 >= 5) {
                    return false;
                }
            }
        }
        @Pc(56) Npc local56 = new Npc();
        local56.anInt824 = arg11;
        local56.aByte25 = arg12;
        local56.anInt813 = arg0;
        local56.anInt815 = arg5;
        local56.anInt816 = arg6;
        local56.anInt814 = arg7;
        local56.aClass1_Sub1_Sub1_6 = arg8;
        local56.anInt817 = arg9;
        local56.anInt818 = arg1;
        local56.anInt820 = arg2;
        local56.anInt819 = arg1 + arg3 - 1;
        local56.anInt821 = arg2 + arg4 - 1;
        for (@Pc(102) int local102 = arg1; local102 < arg1 + arg3; local102++) {
            for (@Pc(106) int local106 = arg2; local106 < arg2 + arg4; local106++) {
                @Pc(110) int local110 = 0;
                if (local102 > arg1) {
                    local110++;
                }
                if (local102 < arg1 + arg3 - 1) {
                    local110 += 4;
                }
                if (local106 > arg2) {
                    local110 += 8;
                }
                if (local106 < arg2 + arg4 - 1) {
                    local110 += 2;
                }
                for (@Pc(136) int local136 = arg0; local136 >= 0; local136--) {
                    if (this.anIntNodeArrayArrayArray1[local136][local102][local106] == null) {
                        this.anIntNodeArrayArrayArray1[local136][local102][local106] = new IntNode(local136, local102, local106);
                    }
                }
                @Pc(173) IntNode local173 = this.anIntNodeArrayArrayArray1[arg0][local102][local106];
                local173.aNpcArray3[local173.anInt961] = local56;
                local173.anIntArray621[local173.anInt961] = local110;
                local173.anInt962 |= local110;
                local173.anInt961++;
            }
        }
        if (arg10) {
            this.aNpcArray1[this.anInt858++] = local56;
        }
        return true;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public void method544(@OriginalArg(0) boolean arg0) {
        try {
            for (@Pc(1) int local1 = 0; local1 < this.anInt858; local1++) {
                @Pc(8) Npc local8 = this.aNpcArray1[local1];
                this.method545(local8, 8);
                this.aNpcArray1[local1] = null;
            }
            this.anInt858 = 0;
            if (arg0) {
                this.anInt851 = -474;
            }
        } catch (@Pc(32) RuntimeException local32) {
            signlink.reporterror("36445, " + arg0 + ", " + local32.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!p;I)V")
    private void method545(@OriginalArg(0) Npc arg0, @OriginalArg(1) int arg1) {
        try {
            for (@Pc(4) int local4 = arg0.anInt818; local4 <= arg0.anInt819; local4++) {
                for (@Pc(9) int local9 = arg0.anInt820; local9 <= arg0.anInt821; local9++) {
                    @Pc(21) IntNode local21 = this.anIntNodeArrayArrayArray1[arg0.anInt813][local4][local9];
                    if (local21 != null) {
                        @Pc(41) int local41;
                        for (@Pc(25) int local25 = 0; local25 < local21.anInt961; local25++) {
                            if (local21.aNpcArray3[local25] == arg0) {
                                local21.anInt961--;
                                for (local41 = local25; local41 < local21.anInt961; local41++) {
                                    local21.aNpcArray3[local41] = local21.aNpcArray3[local41 + 1];
                                    local21.anIntArray621[local41] = local21.anIntArray621[local41 + 1];
                                }
                                local21.aNpcArray3[local21.anInt961] = null;
                                break;
                            }
                        }
                        local21.anInt962 = 0;
                        for (local41 = 0; local41 < local21.anInt961; local41++) {
                            local21.anInt962 |= local21.anIntArray621[local41];
                        }
                    }
                }
            }
            if (arg1 < 8 || arg1 > 8) {
                ;
            }
        } catch (@Pc(120) RuntimeException local120) {
            signlink.reporterror("78313, " + arg0 + ", " + arg1 + ", " + local120.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIBII)V")
    public void method546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
        try {
            @Pc(8) IntNode local8 = this.anIntNodeArrayArrayArray1[arg0][arg4][arg3];
            if (local8 != null) {
                @Pc(14) Envelope local14 = local8.anEnvelope1;
                if (local14 != null) {
                    @Pc(23) int local23 = arg4 * 128 + 64;
                    @Pc(29) int local29 = arg3 * 128 + 64;
                    local14.maxInterval = local23 + (local14.maxInterval - local23) * arg1 / 16;
                    if (arg2 == 9) {
                        local14.minInterval = local29 + (local14.minInterval - local29) * arg1 / 16;
                    }
                }
            }
        } catch (@Pc(59) RuntimeException local59) {
            signlink.reporterror("82229, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local59.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIII)V")
    public void method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            if (arg0 <= 0) {
                this.anInt852 = 472;
            }
            @Pc(13) IntNode local13 = this.anIntNodeArrayArrayArray1[arg3][arg1][arg2];
            if (local13 != null) {
                local13.anUnlitMaterialRenderer1 = null;
            }
        } catch (@Pc(21) RuntimeException local21) {
            signlink.reporterror("86898, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local21.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZI)V")
    public void method548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
        try {
            if (!arg2) {
                this.anInt851 = -460;
            }
            @Pc(13) IntNode local13 = this.anIntNodeArrayArrayArray1[arg1][arg3][arg0];
            if (local13 != null) {
                local13.anEnvelope1 = null;
            }
        } catch (@Pc(21) RuntimeException local21) {
            signlink.reporterror("77505, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local21.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(IIII)V")
    public void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            @Pc(8) IntNode local8 = this.anIntNodeArrayArrayArray1[arg2][arg3][arg0];
            if (arg1 < 2 || arg1 > 2) {
                this.aBoolean213 = !this.aBoolean213;
            }
            if (local8 != null) {
                for (@Pc(27) int local27 = 0; local27 < local8.anInt961; local27++) {
                    @Pc(34) Npc local34 = local8.aNpcArray3[local27];
                    if ((local34.anInt824 >> 29 & 0x3) == 2 && local34.anInt818 == arg3 && local34.anInt820 == arg0) {
                        this.method545(local34, 8);
                        return;
                    }
                }
            }
        } catch (@Pc(62) RuntimeException local62) {
            signlink.reporterror("25684, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(IIII)V")
    public void method550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            @Pc(8) IntNode local8 = this.anIntNodeArrayArrayArray1[arg2][arg3][arg1];
            if (local8 != null) {
                local8.aByteArrayNode1 = null;
                @Pc(18) int local18 = 49 / arg0;
            }
        } catch (@Pc(20) RuntimeException local20) {
            signlink.reporterror("3687, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local20.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
    public void method551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(8) IntNode local8 = this.anIntNodeArrayArrayArray1[arg0][arg1][arg2];
        if (local8 != null) {
            local8.aClass20_1 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIII)Lclient!q;")
    public UnlitMaterialRenderer method552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            @Pc(8) IntNode local8 = this.anIntNodeArrayArrayArray1[arg0][arg2][arg3];
            @Pc(12) int local12 = 25 / arg1;
            return local8 == null ? null : local8.anUnlitMaterialRenderer1;
        } catch (@Pc(20) RuntimeException local20) {
            signlink.reporterror("28821, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local20.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(IIII)Lclient!h;")
    public Envelope method553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            if (arg0 != -38749) {
                for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
                }
            }
            @Pc(18) IntNode local18 = this.anIntNodeArrayArrayArray1[arg2][arg1][arg3];
            return local18 == null ? null : local18.anEnvelope1;
        } catch (@Pc(26) RuntimeException local26) {
            signlink.reporterror("37847, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local26.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(IIII)Lclient!p;")
    public Npc method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            if (arg2 >= 0) {
                throw new NullPointerException();
            }
            @Pc(18) IntNode local18 = this.anIntNodeArrayArrayArray1[arg1][arg3][arg0];
            if (local18 == null) {
                return null;
            }
            for (@Pc(24) int local24 = 0; local24 < local18.anInt961; local24++) {
                @Pc(31) Npc local31 = local18.aNpcArray3[local24];
                if ((local31.anInt824 >> 29 & 0x3) == 2 && local31.anInt818 == arg3 && local31.anInt820 == arg0) {
                    return local31;
                }
            }
            return null;
        } catch (@Pc(57) RuntimeException local57) {
            signlink.reporterror("30372, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local57.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)Lclient!j;")
    public ByteArrayNode method555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            if (arg1 != 3) {
                for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
                }
            }
            @Pc(18) IntNode local18 = this.anIntNodeArrayArrayArray1[arg0][arg3][arg2];
            return local18 == null || local18.aByteArrayNode1 == null ? null : local18.aByteArrayNode1;
        } catch (@Pc(29) RuntimeException local29) {
            signlink.reporterror("55613, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local29.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(III)I")
    public int method556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(8) IntNode local8 = this.anIntNodeArrayArrayArray1[arg0][arg1][arg2];
        return local8 == null || local8.anUnlitMaterialRenderer1 == null ? 0 : local8.anUnlitMaterialRenderer1.anInt840;
    }

    @OriginalMember(owner = "client!r", name = "i", descriptor = "(IIII)I")
    public int method557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            @Pc(8) IntNode local8 = this.anIntNodeArrayArrayArray1[arg1][arg3][arg2];
            if (arg0 < 9 || arg0 > 9) {
                this.aBoolean214 = !this.aBoolean214;
            }
            return local8 == null || local8.anEnvelope1 == null ? 0 : local8.anEnvelope1.nextTime;
        } catch (@Pc(34) RuntimeException local34) {
            signlink.reporterror("58837, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local34.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(III)I")
    public int method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(8) IntNode local8 = this.anIntNodeArrayArrayArray1[arg0][arg1][arg2];
        if (local8 == null) {
            return 0;
        }
        for (@Pc(14) int local14 = 0; local14 < local8.anInt961; local14++) {
            @Pc(21) Npc local21 = local8.aNpcArray3[local14];
            if ((local21.anInt824 >> 29 & 0x3) == 2 && local21.anInt818 == arg1 && local21.anInt820 == arg2) {
                return local21.anInt824;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(III)I")
    public int method559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(8) IntNode local8 = this.anIntNodeArrayArrayArray1[arg0][arg1][arg2];
        return local8 == null || local8.aByteArrayNode1 == null ? 0 : local8.aByteArrayNode1.anInt661;
    }

    @OriginalMember(owner = "client!r", name = "j", descriptor = "(IIII)I")
    public int method560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        @Pc(8) IntNode local8 = this.anIntNodeArrayArrayArray1[arg0][arg1][arg2];
        if (local8 == null) {
            return -1;
        } else if (local8.anUnlitMaterialRenderer1 != null && local8.anUnlitMaterialRenderer1.anInt840 == arg3) {
            return local8.anUnlitMaterialRenderer1.aByte26 & 0xFF;
        } else if (local8.anEnvelope1 != null && local8.anEnvelope1.nextTime == arg3) {
            return local8.anEnvelope1.aByte17 & 0xFF;
        } else if (local8.aByteArrayNode1 != null && local8.aByteArrayNode1.anInt661 == arg3) {
            return local8.aByteArrayNode1.aByte22 & 0xFF;
        } else {
            for (@Pc(56) int local56 = 0; local56 < local8.anInt961; local56++) {
                if (local8.aNpcArray3[local56].anInt824 == arg3) {
                    return local8.aNpcArray3[local56].aByte25 & 0xFF;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
    public void method561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
        try {
            if (arg3 >= 0) {
                this.anInt853 = -57;
            }
            @Pc(21) int local21 = (int) Math.sqrt((double) (arg4 * arg4 + arg5 * arg5 + arg2 * arg2));
            @Pc(27) int local27 = arg0 * local21 >> 8;
            for (@Pc(29) int local29 = 0; local29 < this.anInt854; local29++) {
                for (@Pc(33) int local33 = 0; local33 < this.anInt855; local33++) {
                    for (@Pc(37) int local37 = 0; local37 < this.iterator; local37++) {
                        @Pc(48) IntNode local48 = this.anIntNodeArrayArrayArray1[local29][local33][local37];
                        if (local48 != null) {
                            @Pc(53) UnlitMaterialRenderer local53 = local48.anUnlitMaterialRenderer1;
                            if (local53 != null && local53.aClass1_Sub1_Sub1_7 != null && local53.aClass1_Sub1_Sub1_7.aGlIndexedSpriteArray10 != null) {
                                this.method563(local29, local33, (Sound) local53.aClass1_Sub1_Sub1_7, local37, 1, 1, (byte) 1);
                                if (local53.aClass1_Sub1_Sub1_8 != null && local53.aClass1_Sub1_Sub1_8.aGlIndexedSpriteArray10 != null) {
                                    this.method563(local29, local33, (Sound) local53.aClass1_Sub1_Sub1_8, local37, 1, 1, (byte) 1);
                                    this.method564((Sound) local53.aClass1_Sub1_Sub1_7, (Sound) local53.aClass1_Sub1_Sub1_8, 0, 0, 0, false);
                                    ((Sound) local53.aClass1_Sub1_Sub1_8).method279(arg1, local27, arg4, arg5, arg2);
                                }
                                ((Sound) local53.aClass1_Sub1_Sub1_7).method279(arg1, local27, arg4, arg5, arg2);
                            }
                            for (@Pc(123) int local123 = 0; local123 < local48.anInt961; local123++) {
                                @Pc(130) Npc local130 = local48.aNpcArray3[local123];
                                if (local130 != null && local130.aClass1_Sub1_Sub1_6 != null && local130.aClass1_Sub1_Sub1_6.aGlIndexedSpriteArray10 != null) {
                                    this.method563(local29, local33, (Sound) local130.aClass1_Sub1_Sub1_6, local37, local130.anInt821 + 1 - local130.anInt820, local130.anInt819 - local130.anInt818 + 1, (byte) 1);
                                    ((Sound) local130.aClass1_Sub1_Sub1_6).method279(arg1, local27, arg4, arg5, arg2);
                                }
                            }
                            @Pc(179) ByteArrayNode local179 = local48.aByteArrayNode1;
                            if (local179 != null && local179.aClass1_Sub1_Sub1_2.aGlIndexedSpriteArray10 != null) {
                                this.method562(this.aByte28, local37, (Sound) local179.aClass1_Sub1_Sub1_2, local33, local29);
                                ((Sound) local179.aClass1_Sub1_Sub1_2).method279(arg1, local27, arg4, arg5, arg2);
                            }
                        }
                    }
                }
            }
        } catch (@Pc(221) RuntimeException local221) {
            signlink.reporterror("34735, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local221.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BILclient!eb;II)V")
    private void method562(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Sound arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
        try {
            if (arg0 == this.aByte28) {
                @Pc(5) boolean local5 = false;
                @Pc(23) IntNode local23;
                if (arg3 < this.anInt855) {
                    local23 = this.anIntNodeArrayArrayArray1[arg4][arg3 + 1][arg1];
                    if (local23 != null && local23.aByteArrayNode1 != null && local23.aByteArrayNode1.aClass1_Sub1_Sub1_2.aGlIndexedSpriteArray10 != null) {
                        this.method564(arg2, (Sound) local23.aByteArrayNode1.aClass1_Sub1_Sub1_2, 128, 0, 0, true);
                    }
                }
                if (arg1 < this.anInt855) {
                    local23 = this.anIntNodeArrayArrayArray1[arg4][arg3][arg1 + 1];
                    if (local23 != null && local23.aByteArrayNode1 != null && local23.aByteArrayNode1.aClass1_Sub1_Sub1_2.aGlIndexedSpriteArray10 != null) {
                        this.method564(arg2, (Sound) local23.aByteArrayNode1.aClass1_Sub1_Sub1_2, 0, 0, 128, true);
                    }
                }
                if (arg3 < this.anInt855 && arg1 < this.iterator) {
                    local23 = this.anIntNodeArrayArrayArray1[arg4][arg3 + 1][arg1 + 1];
                    if (local23 != null && local23.aByteArrayNode1 != null && local23.aByteArrayNode1.aClass1_Sub1_Sub1_2.aGlIndexedSpriteArray10 != null) {
                        this.method564(arg2, (Sound) local23.aByteArrayNode1.aClass1_Sub1_Sub1_2, 128, 0, 128, true);
                    }
                }
                if (arg3 < this.anInt855 && arg1 > 0) {
                    local23 = this.anIntNodeArrayArrayArray1[arg4][arg3 + 1][arg1 - 1];
                    if (local23 != null && local23.aByteArrayNode1 != null && local23.aByteArrayNode1.aClass1_Sub1_Sub1_2.aGlIndexedSpriteArray10 != null) {
                        this.method564(arg2, (Sound) local23.aByteArrayNode1.aClass1_Sub1_Sub1_2, 128, 0, -128, true);
                        return;
                    }
                }
            }
        } catch (@Pc(164) RuntimeException local164) {
            signlink.reporterror("16648, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local164.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!eb;IIIB)V")
    private void method563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Sound arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
        try {
            @Pc(3) boolean local3 = true;
            @Pc(5) int local5 = arg1;
            @Pc(9) int local9 = arg1 + arg5;
            @Pc(13) int local13 = arg3 - 1;
            @Pc(17) int local17 = arg3 + arg4;
            if (arg6 == 1) {
                @Pc(22) boolean local22 = false;
            } else {
                this.aBoolean213 = !this.aBoolean213;
            }
            for (@Pc(34) int local34 = arg0; local34 <= arg0 + 1; local34++) {
                if (local34 != this.anInt854) {
                    for (@Pc(42) int local42 = local5; local42 <= local9; local42++) {
                        if (local42 >= 0 && local42 < this.anInt855) {
                            for (@Pc(53) int local53 = local13; local53 <= local17; local53++) {
                                if (local53 >= 0 && local53 < this.iterator && (!local3 || local42 >= local9 || local53 >= local17 || local53 < arg3 && local42 != arg1)) {
                                    @Pc(86) IntNode local86 = this.anIntNodeArrayArrayArray1[local34][local42][local53];
                                    if (local86 != null) {
                                        @Pc(180) int local180 = (this.anIntArrayArrayArray6[local34][local42][local53] + this.anIntArrayArrayArray6[local34][local42 + 1][local53] + this.anIntArrayArrayArray6[local34][local42][local53 + 1] + this.anIntArrayArrayArray6[local34][local42 + 1][local53 + 1]) / 4 - (this.anIntArrayArrayArray6[arg0][arg1][arg3] + this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3] + this.anIntArrayArrayArray6[arg0][arg1][arg3 + 1] + this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3 + 1]) / 4;
                                        @Pc(183) UnlitMaterialRenderer local183 = local86.anUnlitMaterialRenderer1;
                                        if (local183 != null && local183.aClass1_Sub1_Sub1_7 != null && local183.aClass1_Sub1_Sub1_7.aGlIndexedSpriteArray10 != null) {
                                            this.method564(arg2, (Sound) local183.aClass1_Sub1_Sub1_7, (local42 - arg1) * 128 + (1 - arg5) * 64, local180, (local53 - arg3) * 128 + (1 - arg4) * 64, local3);
                                        }
                                        if (local183 != null && local183.aClass1_Sub1_Sub1_8 != null && local183.aClass1_Sub1_Sub1_8.aGlIndexedSpriteArray10 != null) {
                                            this.method564(arg2, (Sound) local183.aClass1_Sub1_Sub1_8, (local42 - arg1) * 128 + (1 - arg5) * 64, local180, (local53 - arg3) * 128 + (1 - arg4) * 64, local3);
                                        }
                                        for (@Pc(263) int local263 = 0; local263 < local86.anInt961; local263++) {
                                            @Pc(270) Npc local270 = local86.aNpcArray3[local263];
                                            if (local270 != null && local270.aClass1_Sub1_Sub1_6 != null && local270.aClass1_Sub1_Sub1_6.aGlIndexedSpriteArray10 != null) {
                                                @Pc(287) int local287 = local270.anInt819 + 1 - local270.anInt818;
                                                @Pc(295) int local295 = local270.anInt821 + 1 - local270.anInt820;
                                                this.method564(arg2, (Sound) local270.aClass1_Sub1_Sub1_6, (local270.anInt818 - arg1) * 128 + (local287 - arg5) * 64, local180, (local270.anInt820 - arg3) * 128 + (local295 - arg4) * 64, local3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    local5--;
                    local3 = false;
                }
            }
        } catch (@Pc(351) RuntimeException local351) {
            signlink.reporterror("83265, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local351.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!eb;Lclient!eb;IIIZ)V")
    private void method564(@OriginalArg(0) Sound arg0, @OriginalArg(1) Sound arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
        this.anInt881++;
        @Pc(9) int local9 = 0;
        @Pc(12) int[] local12 = arg1.anIntArray118;
        @Pc(15) int local15 = arg1.anInt490;
        for (@Pc(17) int local17 = 0; local17 < arg0.anInt490; local17++) {
            @Pc(24) GlIndexedSprite local24 = arg0.aGlIndexedSpriteArray10[local17];
            @Pc(29) GlIndexedSprite local29 = arg0.aGlIndexedSpriteArray8[local17];
            if (local29.anInt779 != 0) {
                @Pc(39) int local39 = arg0.anIntArray119[local17] - arg3;
                if (local39 <= arg1.anInt499) {
                    @Pc(50) int local50 = arg0.anIntArray118[local17] - arg2;
                    if (local50 >= arg1.anInt494 && local50 <= arg1.anInt495) {
                        @Pc(66) int local66 = arg0.anIntArray120[local17] - arg4;
                        if (local66 >= arg1.anInt497 && local66 <= arg1.anInt496) {
                            for (@Pc(77) int local77 = 0; local77 < local15; local77++) {
                                @Pc(84) GlIndexedSprite local84 = arg1.aGlIndexedSpriteArray10[local77];
                                @Pc(89) GlIndexedSprite local89 = arg1.aGlIndexedSpriteArray8[local77];
                                if (local50 == local12[local77] && local66 == arg1.anIntArray120[local77] && local39 == arg1.anIntArray119[local77] && local89.anInt779 != 0) {
                                    local24.anInt776 += local89.anInt776;
                                    local24.anInt777 += local89.anInt777;
                                    local24.anInt778 += local89.anInt778;
                                    local24.anInt779 += local89.anInt779;
                                    local84.anInt776 += local29.anInt776;
                                    local84.anInt777 += local29.anInt777;
                                    local84.anInt778 += local29.anInt778;
                                    local84.anInt779 += local29.anInt779;
                                    local9++;
                                    this.anIntArray245[local17] = this.anInt881;
                                    this.anIntArray246[local77] = this.anInt881;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (local9 < 3 || !arg5) {
            return;
        }
        for (@Pc(195) int local195 = 0; local195 < arg0.anInt491; local195++) {
            if (this.anIntArray245[arg0.anIntArray121[local195]] == this.anInt881 && this.anIntArray245[arg0.anIntArray122[local195]] == this.anInt881 && this.anIntArray245[arg0.anIntArray123[local195]] == this.anInt881) {
                arg0.anIntArray127[local195] = -1;
            }
        }
        for (@Pc(239) int local239 = 0; local239 < arg1.anInt491; local239++) {
            if (this.anIntArray246[arg1.anIntArray121[local239]] == this.anInt881 && this.anIntArray246[arg1.anIntArray122[local239]] == this.anInt881 && this.anIntArray246[arg1.anIntArray123[local239]] == this.anInt881) {
                arg1.anIntArray127[local239] = -1;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIIII)V")
    public void method565(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
        @Pc(10) IntNode local10 = this.anIntNodeArrayArrayArray1[arg3][arg4][arg5];
        if (local10 == null) {
            return;
        }
        @Pc(16) SpotAnim local16 = local10.aSpotAnim1;
        @Pc(26) int local26;
        if (local16 != null) {
            @Pc(21) int local21 = local16.anInt809;
            if (local21 != 0) {
                for (local26 = 0; local26 < 4; local26++) {
                    arg0[arg1] = local21;
                    arg0[arg1 + 1] = local21;
                    arg0[arg1 + 2] = local21;
                    arg0[arg1 + 3] = local21;
                    arg1 += arg2;
                }
            }
            return;
        }
        @Pc(62) Class16 local62 = local10.aClass16_1;
        if (local62 == null) {
            return;
        }
        local26 = local62.anInt631;
        @Pc(71) int local71 = local62.anInt632;
        @Pc(74) int local74 = local62.anInt633;
        @Pc(77) int local77 = local62.anInt634;
        @Pc(82) int[] local82 = this.anIntArrayArray19[local26];
        @Pc(87) int[] local87 = this.anIntArrayArray20[local71];
        @Pc(89) int local89 = 0;
        @Pc(93) int local93;
        if (local74 != 0) {
            for (local93 = 0; local93 < 4; local93++) {
                arg0[arg1] = local82[local87[local89++]] == 0 ? local74 : local77;
                arg0[arg1 + 1] = local82[local87[local89++]] == 0 ? local74 : local77;
                arg0[arg1 + 2] = local82[local87[local89++]] == 0 ? local74 : local77;
                arg0[arg1 + 3] = local82[local87[local89++]] == 0 ? local74 : local77;
                arg1 += arg2;
            }
            return;
        }
        for (local93 = 0; local93 < 4; local93++) {
            if (local82[local87[local89++]] != 0) {
                arg0[arg1] = local77;
            }
            if (local82[local87[local89++]] != 0) {
                arg0[arg1 + 1] = local77;
            }
            if (local82[local87[local89++]] != 0) {
                arg0[arg1 + 2] = local77;
            }
            if (local82[local87[local89++]] != 0) {
                arg0[arg1 + 3] = local77;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(III)V")
    public void method568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        try {
            Static28.aBoolean216 = true;
            Static28.anInt875 = arg2;
            Static28.anInt876 = arg0;
            Static28.anInt877 = -1;
            Static28.anInt878 = -1;
            if (arg1 != 0) {
                for (@Pc(13) int local13 = 1; local13 > 0; local13++) {
                }
            }
        } catch (@Pc(20) RuntimeException local20) {
            signlink.reporterror("99782, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local20.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
    public void method569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
        try {
            if (arg0 < 0) {
                arg0 = 0;
            } else if (arg0 >= this.anInt855 * 128) {
                arg0 = this.anInt855 * 128 - 1;
            }
            if (arg3 < 0) {
                arg3 = 0;
            } else if (arg3 >= this.iterator * 128) {
                arg3 = this.iterator * 128 - 1;
            }
            Static28.anInt861++;
            Static28.anInt871 = Static11.anIntArray151[arg2];
            Static28.anInt872 = Static11.anIntArray152[arg2];
            Static28.anInt873 = Static11.anIntArray151[arg4];
            Static28.anInt874 = Static11.anIntArray152[arg4];
            Static28.aBooleanArrayArray1 = Static28.aBooleanArrayArrayArrayArray1[(arg2 - 128) / 32][arg4 / 64];
            Static28.anInt868 = arg0;
            Static28.anInt869 = arg6;
            Static28.anInt870 = arg3;
            Static28.anInt866 = arg0 / 128;
            Static28.anInt867 = arg3 / 128;
            Static28.anInt860 = arg5;
            Static28.anInt862 = Static28.anInt866 - 25;
            if (Static28.anInt862 < 0) {
                Static28.anInt862 = 0;
            }
            Static28.anInt864 = Static28.anInt867 - 25;
            if (Static28.anInt864 < 0) {
                Static28.anInt864 = 0;
            }
            Static28.anInt863 = Static28.anInt866 + 25;
            if (Static28.anInt863 > this.anInt855) {
                Static28.anInt863 = this.anInt855;
            }
            Static28.anInt865 = Static28.anInt867 + 25;
            if (Static28.anInt865 > this.iterator) {
                Static28.anInt865 = this.iterator;
            }
            this.method575((byte) 22);
            Static28.anInt859 = 0;
            @Pc(142) int local142;
            @Pc(146) int local146;
            for (@Pc(133) int local133 = this.anInt857; local133 < this.anInt854; local133++) {
                @Pc(140) IntNode[][] local140 = this.anIntNodeArrayArrayArray1[local133];
                for (local142 = Static28.anInt862; local142 < Static28.anInt863; local142++) {
                    for (local146 = Static28.anInt864; local146 < Static28.anInt865; local146++) {
                        @Pc(154) IntNode local154 = local140[local142][local146];
                        if (local154 != null) {
                            if (local154.anInt963 <= arg5 && (Static28.aBooleanArrayArray1[local142 + 25 - Static28.anInt866][local146 + 25 - Static28.anInt867] || this.anIntArrayArrayArray6[local133][local142][local146] - arg6 >= 2000)) {
                                local154.aBoolean232 = true;
                                local154.aBoolean233 = true;
                                if (local154.anInt961 > 0) {
                                    local154.aBoolean234 = true;
                                } else {
                                    local154.aBoolean234 = false;
                                }
                                Static28.anInt859++;
                            } else {
                                local154.aBoolean232 = false;
                                local154.aBoolean233 = false;
                                local154.anInt964 = 0;
                            }
                        }
                    }
                }
            }
            if (arg1 == 7) {
                @Pc(257) int local257;
                @Pc(265) int local265;
                @Pc(271) int local271;
                @Pc(275) int local275;
                @Pc(253) int local253;
                for (@Pc(238) int local238 = this.anInt857; local238 < this.anInt854; local238++) {
                    @Pc(245) IntNode[][] local245 = this.anIntNodeArrayArrayArray1[local238];
                    for (local146 = -25; local146 <= 0; local146++) {
                        local253 = Static28.anInt866 + local146;
                        local257 = Static28.anInt866 - local146;
                        if (local253 >= Static28.anInt862 || local257 < Static28.anInt863) {
                            for (local265 = -25; local265 <= 0; local265++) {
                                local271 = Static28.anInt867 + local265;
                                local275 = Static28.anInt867 - local265;
                                @Pc(287) IntNode local287;
                                if (local253 >= Static28.anInt862) {
                                    if (local271 >= Static28.anInt864) {
                                        local287 = local245[local253][local271];
                                        if (local287 != null && local287.aBoolean232) {
                                            this.method570(local287, true);
                                        }
                                    }
                                    if (local275 < Static28.anInt865) {
                                        local287 = local245[local253][local275];
                                        if (local287 != null && local287.aBoolean232) {
                                            this.method570(local287, true);
                                        }
                                    }
                                }
                                if (local257 < Static28.anInt863) {
                                    if (local271 >= Static28.anInt864) {
                                        local287 = local245[local257][local271];
                                        if (local287 != null && local287.aBoolean232) {
                                            this.method570(local287, true);
                                        }
                                    }
                                    if (local275 < Static28.anInt865) {
                                        local287 = local245[local257][local275];
                                        if (local287 != null && local287.aBoolean232) {
                                            this.method570(local287, true);
                                        }
                                    }
                                }
                                if (Static28.anInt859 == 0) {
                                    Static28.aBoolean216 = false;
                                    return;
                                }
                            }
                        }
                    }
                }
                for (local142 = this.anInt857; local142 < this.anInt854; local142++) {
                    @Pc(379) IntNode[][] local379 = this.anIntNodeArrayArrayArray1[local142];
                    for (local253 = -25; local253 <= 0; local253++) {
                        local257 = Static28.anInt866 + local253;
                        local265 = Static28.anInt866 - local253;
                        if (local257 >= Static28.anInt862 || local265 < Static28.anInt863) {
                            for (local271 = -25; local271 <= 0; local271++) {
                                local275 = Static28.anInt867 + local271;
                                @Pc(409) int local409 = Static28.anInt867 - local271;
                                @Pc(421) IntNode local421;
                                if (local257 >= Static28.anInt862) {
                                    if (local275 >= Static28.anInt864) {
                                        local421 = local379[local257][local275];
                                        if (local421 != null && local421.aBoolean232) {
                                            this.method570(local421, false);
                                        }
                                    }
                                    if (local409 < Static28.anInt865) {
                                        local421 = local379[local257][local409];
                                        if (local421 != null && local421.aBoolean232) {
                                            this.method570(local421, false);
                                        }
                                    }
                                }
                                if (local265 < Static28.anInt863) {
                                    if (local275 >= Static28.anInt864) {
                                        local421 = local379[local265][local275];
                                        if (local421 != null && local421.aBoolean232) {
                                            this.method570(local421, false);
                                        }
                                    }
                                    if (local409 < Static28.anInt865) {
                                        local421 = local379[local265][local409];
                                        if (local421 != null && local421.aBoolean232) {
                                            this.method570(local421, false);
                                        }
                                    }
                                }
                                if (Static28.anInt859 == 0) {
                                    Static28.aBoolean216 = false;
                                    return;
                                }
                            }
                        }
                    }
                }
                Static28.aBoolean216 = false;
            }
        } catch (@Pc(507) RuntimeException local507) {
            signlink.reporterror("67582, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local507.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!v;Z)V")
    private void method570(@OriginalArg(0) IntNode arg0, @OriginalArg(1) boolean arg1) {
        Static28.aFrameBuffer7.method508(arg0);
        while (true) {
            @Pc(8) IntNode local8;
            @Pc(17) int local17;
            @Pc(20) int local20;
            @Pc(23) int local23;
            @Pc(26) int local26;
            @Pc(31) IntNode[][] local31;
            @Pc(49) IntNode local49;
            @Pc(253) int local253;
            @Pc(590) int local590;
            @Pc(595) int local595;
            @Pc(600) int local600;
            @Pc(603) int local603;
            @Pc(612) int local612;
            @Pc(954) UnlitMaterialRenderer local954;
            @Pc(1135) int local1135;
            @Pc(1014) int local1014;
            do {
                do {
                    do {
                        do {
                            do {
                                do {
                                    while (true) {
                                        @Pc(260) Npc var12;
                                        @Pc(625) int var19;
                                        @Pc(340) int var23;
                                        @Pc(292) boolean var24;
                                        @Pc(837) IntNode var35;
                                        while (true) {
                                            do {
                                                local8 = (IntNode) Static28.aFrameBuffer7.method510();
                                                if (local8 == null) {
                                                    return;
                                                }
                                            } while (!local8.aBoolean233);
                                            local17 = local8.anInt958;
                                            local20 = local8.anInt959;
                                            local23 = local8.anInt957;
                                            local26 = local8.anInt960;
                                            local31 = this.anIntNodeArrayArrayArray1[local23];
                                            if (!local8.aBoolean232) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (local23 > 0) {
                                                    local49 = this.anIntNodeArrayArrayArray1[local23 - 1][local17][local20];
                                                    if (local49 != null && local49.aBoolean233) {
                                                        continue;
                                                    }
                                                }
                                                if (local17 <= Static28.anInt866 && local17 > Static28.anInt862) {
                                                    local49 = local31[local17 - 1][local20];
                                                    if (local49 != null && local49.aBoolean233 && (local49.aBoolean232 || (local8.anInt962 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (local17 >= Static28.anInt866 && local17 < Static28.anInt863 - 1) {
                                                    local49 = local31[local17 + 1][local20];
                                                    if (local49 != null && local49.aBoolean233 && (local49.aBoolean232 || (local8.anInt962 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (local20 <= Static28.anInt867 && local20 > Static28.anInt864) {
                                                    local49 = local31[local17][local20 - 1];
                                                    if (local49 != null && local49.aBoolean233 && (local49.aBoolean232 || (local8.anInt962 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (local20 >= Static28.anInt867 && local20 < Static28.anInt865 - 1) {
                                                    local49 = local31[local17][local20 + 1];
                                                    if (local49 != null && local49.aBoolean233 && (local49.aBoolean232 || (local8.anInt962 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            local8.aBoolean232 = false;
                                            if (local8.anIntNode1 != null) {
                                                local49 = local8.anIntNode1;
                                                if (local49.aSpotAnim1 == null) {
                                                    if (local49.aClass16_1 != null && !this.method576(0, local17, local20)) {
                                                        this.method572(local17, local20, local49.aClass16_1, Static28.anInt874, Static28.anInt872, 785, Static28.anInt871, Static28.anInt873);
                                                    }
                                                } else if (!this.method576(0, local17, local20)) {
                                                    this.method571(local49.aSpotAnim1, 0, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local17, local20);
                                                }
                                                @Pc(227) UnlitMaterialRenderer local227 = local49.anUnlitMaterialRenderer1;
                                                if (local227 != null) {
                                                    local227.aClass1_Sub1_Sub1_7.method675(0, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local227.anInt836 - Static28.anInt868, local227.anInt835 - Static28.anInt869, local227.anInt837 - Static28.anInt870, local227.anInt840);
                                                }
                                                for (local253 = 0; local253 < local49.anInt961; local253++) {
                                                    var12 = local49.aNpcArray3[local253];
                                                    if (var12 != null) {
                                                        var12.aClass1_Sub1_Sub1_6.method675(var12.anInt817, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, var12.anInt815 - Static28.anInt868, var12.anInt814 - Static28.anInt869, var12.anInt816 - Static28.anInt870, var12.anInt824);
                                                    }
                                                }
                                            }
                                            var24 = false;
                                            if (local8.aSpotAnim1 == null) {
                                                if (local8.aClass16_1 != null && !this.method576(local26, local17, local20)) {
                                                    var24 = true;
                                                    this.method572(local17, local20, local8.aClass16_1, Static28.anInt874, Static28.anInt872, 785, Static28.anInt871, Static28.anInt873);
                                                }
                                            } else if (!this.method576(local26, local17, local20)) {
                                                var24 = true;
                                                this.method571(local8.aSpotAnim1, local26, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local17, local20);
                                            }
                                            var23 = 0;
                                            local253 = 0;
                                            @Pc(345) UnlitMaterialRenderer local345 = local8.anUnlitMaterialRenderer1;
                                            @Pc(348) Envelope local348 = local8.anEnvelope1;
                                            if (local345 != null || local348 != null) {
                                                if (Static28.anInt866 == local17) {
                                                    var23++;
                                                } else if (Static28.anInt866 < local17) {
                                                    var23 += 2;
                                                }
                                                if (Static28.anInt867 == local20) {
                                                    var23 += 3;
                                                } else if (Static28.anInt867 > local20) {
                                                    var23 += 6;
                                                }
                                                local253 = Static28.anIntArray237[var23];
                                                local8.anInt967 = Static28.anIntArray239[var23];
                                            }
                                            if (local345 != null) {
                                                if ((local345.anInt838 & Static28.anIntArray238[var23]) == 0) {
                                                    local8.anInt964 = 0;
                                                } else if (local345.anInt838 == 16) {
                                                    local8.anInt964 = 3;
                                                    local8.anInt965 = Static28.anIntArray240[var23];
                                                    local8.anInt966 = 3 - local8.anInt965;
                                                } else if (local345.anInt838 == 32) {
                                                    local8.anInt964 = 6;
                                                    local8.anInt965 = Static28.anIntArray241[var23];
                                                    local8.anInt966 = 6 - local8.anInt965;
                                                } else if (local345.anInt838 == 64) {
                                                    local8.anInt964 = 12;
                                                    local8.anInt965 = Static28.anIntArray242[var23];
                                                    local8.anInt966 = 12 - local8.anInt965;
                                                } else {
                                                    local8.anInt964 = 9;
                                                    local8.anInt965 = Static28.anIntArray243[var23];
                                                    local8.anInt966 = 9 - local8.anInt965;
                                                }
                                                if ((local345.anInt838 & local253) != 0 && !this.method577(local26, local17, local20, local345.anInt838)) {
                                                    local345.aClass1_Sub1_Sub1_7.method675(0, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local345.anInt836 - Static28.anInt868, local345.anInt835 - Static28.anInt869, local345.anInt837 - Static28.anInt870, local345.anInt840);
                                                }
                                                if ((local345.anInt839 & local253) != 0 && !this.method577(local26, local17, local20, local345.anInt839)) {
                                                    local345.aClass1_Sub1_Sub1_8.method675(0, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local345.anInt836 - Static28.anInt868, local345.anInt835 - Static28.anInt869, local345.anInt837 - Static28.anInt870, local345.anInt840);
                                                }
                                            }
                                            if (local348 != null && !this.method578(local26, local17, local20, local348.aClass1_Sub1_Sub1_1.anInt977)) {
                                                if ((local348.anInt578 & local253) != 0) {
                                                    local348.aClass1_Sub1_Sub1_1.method675(local348.wavetable, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local348.maxInterval - Static28.anInt868, local348.anInt575 - Static28.anInt869, local348.minInterval - Static28.anInt870, local348.nextTime);
                                                } else if ((local348.anInt578 & 0x300) != 0) {
                                                    local590 = local348.maxInterval - Static28.anInt868;
                                                    local595 = local348.anInt575 - Static28.anInt869;
                                                    local600 = local348.minInterval - Static28.anInt870;
                                                    local603 = local348.wavetable;
                                                    if (local603 == 1 || local603 == 2) {
                                                        local612 = -local590;
                                                    } else {
                                                        local612 = local590;
                                                    }
                                                    if (local603 == 2 || local603 == 3) {
                                                        var19 = -local600;
                                                    } else {
                                                        var19 = local600;
                                                    }
                                                    @Pc(643) int local643;
                                                    @Pc(649) int local649;
                                                    if ((local348.anInt578 & 0x100) != 0 && var19 < local612) {
                                                        local643 = local590 + Static28.anIntArray232[local603];
                                                        local649 = local600 + Static28.anIntArray233[local603];
                                                        local348.aClass1_Sub1_Sub1_1.method675(local603 * 512 + 256, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local643, local595, local649, local348.nextTime);
                                                    }
                                                    if ((local348.anInt578 & 0x200) != 0 && var19 > local612) {
                                                        local643 = local590 + Static28.anIntArray234[local603];
                                                        local649 = local600 + Static28.anIntArray235[local603];
                                                        local348.aClass1_Sub1_Sub1_1.method675(local603 * 512 + 1280 & 0x7FF, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local643, local595, local649, local348.nextTime);
                                                    }
                                                }
                                            }
                                            if (var24) {
                                                @Pc(710) ByteArrayNode local710 = local8.aByteArrayNode1;
                                                if (local710 != null) {
                                                    local710.aClass1_Sub1_Sub1_2.method675(0, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local710.anInt659 - Static28.anInt868, local710.anInt658 - Static28.anInt869, local710.anInt660 - Static28.anInt870, local710.anInt661);
                                                }
                                                @Pc(737) Class20 local737 = local8.aClass20_1;
                                                if (local737 != null && local737.anInt692 == 0) {
                                                    if (local737.aClass1_Sub1_Sub1_4 != null) {
                                                        local737.aClass1_Sub1_Sub1_4.method675(0, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local737.anInt689 - Static28.anInt868, local737.anInt688 - Static28.anInt869, local737.anInt690 - Static28.anInt870, local737.anInt691);
                                                    }
                                                    if (local737.aClass1_Sub1_Sub1_5 != null) {
                                                        local737.aClass1_Sub1_Sub1_5.method675(0, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local737.anInt689 - Static28.anInt868, local737.anInt688 - Static28.anInt869, local737.anInt690 - Static28.anInt870, local737.anInt691);
                                                    }
                                                    if (local737.aClass1_Sub1_Sub1_3 != null) {
                                                        local737.aClass1_Sub1_Sub1_3.method675(0, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local737.anInt689 - Static28.anInt868, local737.anInt688 - Static28.anInt869, local737.anInt690 - Static28.anInt870, local737.anInt691);
                                                    }
                                                }
                                            }
                                            local590 = local8.anInt962;
                                            if (local590 != 0) {
                                                if (local17 < Static28.anInt866 && (local590 & 0x4) != 0) {
                                                    var35 = local31[local17 + 1][local20];
                                                    if (var35 != null && var35.aBoolean233) {
                                                        Static28.aFrameBuffer7.method508(var35);
                                                    }
                                                }
                                                if (local20 < Static28.anInt867 && (local590 & 0x2) != 0) {
                                                    var35 = local31[local17][local20 + 1];
                                                    if (var35 != null && var35.aBoolean233) {
                                                        Static28.aFrameBuffer7.method508(var35);
                                                    }
                                                }
                                                if (local17 > Static28.anInt866 && (local590 & 0x1) != 0) {
                                                    var35 = local31[local17 - 1][local20];
                                                    if (var35 != null && var35.aBoolean233) {
                                                        Static28.aFrameBuffer7.method508(var35);
                                                    }
                                                }
                                                if (local20 > Static28.anInt867 && (local590 & 0x8) != 0) {
                                                    var35 = local31[local17][local20 - 1];
                                                    if (var35 != null && var35.aBoolean233) {
                                                        Static28.aFrameBuffer7.method508(var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (local8.anInt964 != 0) {
                                            var24 = true;
                                            for (var23 = 0; var23 < local8.anInt961; var23++) {
                                                if (local8.aNpcArray3[var23].anInt823 != Static28.anInt861 && (local8.anIntArray621[var23] & local8.anInt964) == local8.anInt965) {
                                                    var24 = false;
                                                    break;
                                                }
                                            }
                                            if (var24) {
                                                local954 = local8.anUnlitMaterialRenderer1;
                                                if (!this.method577(local26, local17, local20, local954.anInt838)) {
                                                    local954.aClass1_Sub1_Sub1_7.method675(0, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local954.anInt836 - Static28.anInt868, local954.anInt835 - Static28.anInt869, local954.anInt837 - Static28.anInt870, local954.anInt840);
                                                }
                                                local8.anInt964 = 0;
                                            }
                                        }
                                        if (!local8.aBoolean234) {
                                            break;
                                        }
                                        try {
                                            @Pc(993) int local993 = local8.anInt961;
                                            local8.aBoolean234 = false;
                                            var23 = 0;
                                            label559:
                                            for (local253 = 0; local253 < local993; local253++) {
                                                var12 = local8.aNpcArray3[local253];
                                                if (var12.anInt823 != Static28.anInt861) {
                                                    for (local1014 = var12.anInt818; local1014 <= var12.anInt819; local1014++) {
                                                        for (local590 = var12.anInt820; local590 <= var12.anInt821; local590++) {
                                                            var35 = local31[local1014][local590];
                                                            if (var35.aBoolean232) {
                                                                local8.aBoolean234 = true;
                                                                continue label559;
                                                            }
                                                            if (var35.anInt964 != 0) {
                                                                local600 = 0;
                                                                if (local1014 > var12.anInt818) {
                                                                    local600++;
                                                                }
                                                                if (local1014 < var12.anInt819) {
                                                                    local600 += 4;
                                                                }
                                                                if (local590 > var12.anInt820) {
                                                                    local600 += 8;
                                                                }
                                                                if (local590 < var12.anInt821) {
                                                                    local600 += 2;
                                                                }
                                                                if ((local600 & var35.anInt964) == local8.anInt966) {
                                                                    local8.aBoolean234 = true;
                                                                    continue label559;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    Static28.aNpcArray2[var23++] = var12;
                                                    local590 = Static28.anInt866 - var12.anInt818;
                                                    local595 = var12.anInt819 - Static28.anInt866;
                                                    if (local595 > local590) {
                                                        local590 = local595;
                                                    }
                                                    local600 = Static28.anInt867 - var12.anInt820;
                                                    local603 = var12.anInt821 - Static28.anInt867;
                                                    if (local603 > local600) {
                                                        var12.anInt822 = local590 + local603;
                                                    } else {
                                                        var12.anInt822 = local590 + local600;
                                                    }
                                                }
                                            }
                                            while (var23 > 0) {
                                                local1135 = -50;
                                                local1014 = -1;
                                                @Pc(1145) Npc local1145;
                                                for (local590 = 0; local590 < var23; local590++) {
                                                    local1145 = Static28.aNpcArray2[local590];
                                                    if (local1145.anInt823 != Static28.anInt861) {
                                                        if (local1145.anInt822 > local1135) {
                                                            local1135 = local1145.anInt822;
                                                            local1014 = local590;
                                                        } else if (local1145.anInt822 == local1135) {
                                                            local600 = local1145.anInt815 - Static28.anInt868;
                                                            local603 = local1145.anInt816 - Static28.anInt870;
                                                            local612 = Static28.aNpcArray2[local1014].anInt815 - Static28.anInt868;
                                                            var19 = Static28.aNpcArray2[local1014].anInt816 - Static28.anInt870;
                                                            if (local600 * local600 + local603 * local603 > local612 * local612 + var19 * var19) {
                                                                local1014 = local590;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (local1014 == -1) {
                                                    break;
                                                }
                                                local1145 = Static28.aNpcArray2[local1014];
                                                local1145.anInt823 = Static28.anInt861;
                                                if (!this.method579(local26, local1145.anInt818, local1145.anInt819, local1145.anInt820, local1145.anInt821, local1145.aClass1_Sub1_Sub1_6.anInt977)) {
                                                    local1145.aClass1_Sub1_Sub1_6.method675(local1145.anInt817, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local1145.anInt815 - Static28.anInt868, local1145.anInt814 - Static28.anInt869, local1145.anInt816 - Static28.anInt870, local1145.anInt824);
                                                }
                                                for (local600 = local1145.anInt818; local600 <= local1145.anInt819; local600++) {
                                                    for (local603 = local1145.anInt820; local603 <= local1145.anInt821; local603++) {
                                                        @Pc(1273) IntNode local1273 = local31[local600][local603];
                                                        if (local1273.anInt964 != 0) {
                                                            Static28.aFrameBuffer7.method508(local1273);
                                                        } else if ((local600 != local17 || local603 != local20) && local1273.aBoolean233) {
                                                            Static28.aFrameBuffer7.method508(local1273);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!local8.aBoolean234) {
                                                break;
                                            }
                                        } catch (@Pc(1310) Exception local1310) {
                                            local8.aBoolean234 = false;
                                            break;
                                        }
                                    }
                                } while (!local8.aBoolean233);
                            } while (local8.anInt964 != 0);
                            if (local17 > Static28.anInt866 || local17 <= Static28.anInt862) {
                                break;
                            }
                            local49 = local31[local17 - 1][local20];
                        } while (local49 != null && local49.aBoolean233);
                        if (local17 < Static28.anInt866 || local17 >= Static28.anInt863 - 1) {
                            break;
                        }
                        local49 = local31[local17 + 1][local20];
                    } while (local49 != null && local49.aBoolean233);
                    if (local20 > Static28.anInt867 || local20 <= Static28.anInt864) {
                        break;
                    }
                    local49 = local31[local17][local20 - 1];
                } while (local49 != null && local49.aBoolean233);
                if (local20 < Static28.anInt867 || local20 >= Static28.anInt865 - 1) {
                    break;
                }
                local49 = local31[local17][local20 + 1];
            } while (local49 != null && local49.aBoolean233);
            local8.aBoolean233 = false;
            Static28.anInt859--;
            @Pc(1414) Class20 local1414 = local8.aClass20_1;
            if (local1414 != null && local1414.anInt692 != 0) {
                if (local1414.aClass1_Sub1_Sub1_4 != null) {
                    local1414.aClass1_Sub1_Sub1_4.method675(0, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local1414.anInt689 - Static28.anInt868, local1414.anInt688 - Static28.anInt869 - local1414.anInt692, local1414.anInt690 - Static28.anInt870, local1414.anInt691);
                }
                if (local1414.aClass1_Sub1_Sub1_5 != null) {
                    local1414.aClass1_Sub1_Sub1_5.method675(0, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local1414.anInt689 - Static28.anInt868, local1414.anInt688 - Static28.anInt869 - local1414.anInt692, local1414.anInt690 - Static28.anInt870, local1414.anInt691);
                }
                if (local1414.aClass1_Sub1_Sub1_3 != null) {
                    local1414.aClass1_Sub1_Sub1_3.method675(0, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local1414.anInt689 - Static28.anInt868, local1414.anInt688 - Static28.anInt869 - local1414.anInt692, local1414.anInt690 - Static28.anInt870, local1414.anInt691);
                }
            }
            if (local8.anInt967 != 0) {
                @Pc(1509) Envelope local1509 = local8.anEnvelope1;
                if (local1509 != null && !this.method578(local26, local17, local20, local1509.aClass1_Sub1_Sub1_1.anInt977)) {
                    if ((local1509.anInt578 & local8.anInt967) != 0) {
                        local1509.aClass1_Sub1_Sub1_1.method675(local1509.wavetable, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local1509.maxInterval - Static28.anInt868, local1509.anInt575 - Static28.anInt869, local1509.minInterval - Static28.anInt870, local1509.nextTime);
                    } else if ((local1509.anInt578 & 0x300) != 0) {
                        local253 = local1509.maxInterval - Static28.anInt868;
                        local1135 = local1509.anInt575 - Static28.anInt869;
                        local1014 = local1509.minInterval - Static28.anInt870;
                        local590 = local1509.wavetable;
                        if (local590 == 1 || local590 == 2) {
                            local595 = -local253;
                        } else {
                            local595 = local253;
                        }
                        if (local590 == 2 || local590 == 3) {
                            local600 = -local1014;
                        } else {
                            local600 = local1014;
                        }
                        if ((local1509.anInt578 & 0x100) != 0 && local600 >= local595) {
                            local603 = local253 + Static28.anIntArray232[local590];
                            local612 = local1014 + Static28.anIntArray233[local590];
                            local1509.aClass1_Sub1_Sub1_1.method675(local590 * 512 + 256, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local603, local1135, local612, local1509.nextTime);
                        }
                        if ((local1509.anInt578 & 0x200) != 0 && local600 <= local595) {
                            local603 = local253 + Static28.anIntArray234[local590];
                            local612 = local1014 + Static28.anIntArray235[local590];
                            local1509.aClass1_Sub1_Sub1_1.method675(local590 * 512 + 1280 & 0x7FF, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local603, local1135, local612, local1509.nextTime);
                        }
                    }
                }
                local954 = local8.anUnlitMaterialRenderer1;
                if (local954 != null) {
                    if ((local954.anInt839 & local8.anInt967) != 0 && !this.method577(local26, local17, local20, local954.anInt839)) {
                        local954.aClass1_Sub1_Sub1_8.method675(0, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local954.anInt836 - Static28.anInt868, local954.anInt835 - Static28.anInt869, local954.anInt837 - Static28.anInt870, local954.anInt840);
                    }
                    if ((local954.anInt838 & local8.anInt967) != 0 && !this.method577(local26, local17, local20, local954.anInt838)) {
                        local954.aClass1_Sub1_Sub1_7.method675(0, Static28.anInt871, Static28.anInt872, Static28.anInt873, Static28.anInt874, local954.anInt836 - Static28.anInt868, local954.anInt835 - Static28.anInt869, local954.anInt837 - Static28.anInt870, local954.anInt840);
                    }
                }
            }
            @Pc(1770) IntNode local1770;
            if (local23 < this.anInt854 - 1) {
                local1770 = this.anIntNodeArrayArrayArray1[local23 + 1][local17][local20];
                if (local1770 != null && local1770.aBoolean233) {
                    Static28.aFrameBuffer7.method508(local1770);
                }
            }
            if (local17 < Static28.anInt866) {
                local1770 = local31[local17 + 1][local20];
                if (local1770 != null && local1770.aBoolean233) {
                    Static28.aFrameBuffer7.method508(local1770);
                }
            }
            if (local20 < Static28.anInt867) {
                local1770 = local31[local17][local20 + 1];
                if (local1770 != null && local1770.aBoolean233) {
                    Static28.aFrameBuffer7.method508(local1770);
                }
            }
            if (local17 > Static28.anInt866) {
                local1770 = local31[local17 - 1][local20];
                if (local1770 != null && local1770.aBoolean233) {
                    Static28.aFrameBuffer7.method508(local1770);
                }
            }
            if (local20 > Static28.anInt867) {
                local1770 = local31[local17][local20 - 1];
                if (local1770 != null && local1770.aBoolean233) {
                    Static28.aFrameBuffer7.method508(local1770);
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!o;IIIIIII)V")
    private void method571(@OriginalArg(0) SpotAnim arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
        @Pc(8) int local8;
        @Pc(9) int local9 = local8 = (arg6 << 7) - Static28.anInt868;
        @Pc(16) int local16;
        @Pc(17) int local17 = local16 = (arg7 << 7) - Static28.anInt870;
        @Pc(22) int local22;
        @Pc(23) int local23 = local22 = local9 + 128;
        @Pc(28) int local28;
        @Pc(29) int local29 = local28 = local17 + 128;
        @Pc(40) int local40 = this.anIntArrayArrayArray6[arg1][arg6][arg7] - Static28.anInt869;
        @Pc(53) int local53 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7] - Static28.anInt869;
        @Pc(68) int local68 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7 + 1] - Static28.anInt869;
        @Pc(81) int local81 = this.anIntArrayArrayArray6[arg1][arg6][arg7 + 1] - Static28.anInt869;
        @Pc(91) int local91 = local17 * arg4 + local9 * arg5 >> 16;
        @Pc(101) int local101 = local17 * arg5 - local9 * arg4 >> 16;
        @Pc(103) int local103 = local91;
        @Pc(113) int local113 = local40 * arg3 - local101 * arg2 >> 16;
        @Pc(123) int local123 = local40 * arg2 + local101 * arg3 >> 16;
        @Pc(125) int local125 = local113;
        if (local123 < 50) {
            return;
        }
        local91 = local16 * arg4 + local23 * arg5 >> 16;
        @Pc(149) int local149 = local16 * arg5 - local23 * arg4 >> 16;
        local23 = local91;
        local91 = local53 * arg3 - local149 * arg2 >> 16;
        @Pc(171) int local171 = local53 * arg2 + local149 * arg3 >> 16;
        local53 = local91;
        if (local171 < 50) {
            return;
        }
        local91 = local29 * arg4 + local22 * arg5 >> 16;
        local29 = local29 * arg5 - local22 * arg4 >> 16;
        @Pc(199) int local199 = local91;
        local91 = local68 * arg3 - local29 * arg2 >> 16;
        local29 = local68 * arg2 + local29 * arg3 >> 16;
        local68 = local91;
        if (local29 < 50) {
            return;
        }
        local91 = local28 * arg4 + local8 * arg5 >> 16;
        @Pc(245) int local245 = local28 * arg5 - local8 * arg4 >> 16;
        @Pc(247) int local247 = local91;
        local91 = local81 * arg3 - local245 * arg2 >> 16;
        @Pc(267) int local267 = local81 * arg2 + local245 * arg3 >> 16;
        if (local267 < 50) {
            return;
        }
        @Pc(281) int local281 = Static16.anInt595 + (local103 << 9) / local123;
        @Pc(289) int local289 = Static16.anInt596 + (local125 << 9) / local123;
        @Pc(297) int local297 = Static16.anInt595 + (local23 << 9) / local171;
        @Pc(305) int local305 = Static16.anInt596 + (local53 << 9) / local171;
        @Pc(313) int local313 = Static16.anInt595 + (local199 << 9) / local29;
        @Pc(321) int local321 = Static16.anInt596 + (local68 << 9) / local29;
        @Pc(329) int local329 = Static16.anInt595 + (local247 << 9) / local267;
        @Pc(337) int local337 = Static16.anInt596 + (local91 << 9) / local267;
        Static16.anInt594 = 0;
        @Pc(476) int local476;
        if ((local313 - local329) * (local305 - local337) - (local321 - local337) * (local297 - local329) > 0) {
            Static16.aBoolean147 = false;
            if (local313 < 0 || local329 < 0 || local297 < 0 || local313 > Static14.anInt701 || local329 > Static14.anInt701 || local297 > Static14.anInt701) {
                Static16.aBoolean147 = true;
            }
            if (Static28.aBoolean216 && this.method574(Static28.anInt875, Static28.anInt876, local321, local337, local305, local313, local329, local297)) {
                Static28.anInt877 = arg6;
                Static28.anInt878 = arg7;
            }
            if (arg0.anInt808 == -1) {
                if (arg0.anInt806 != 12345678) {
                    Static16.method353(local321, local337, local305, local313, local329, local297, arg0.anInt806, arg0.anInt807, arg0.anInt805);
                }
            } else if (Static28.aBoolean215) {
                local476 = Static28.anIntArray244[arg0.anInt808];
                Static16.method353(local321, local337, local305, local313, local329, local297, this.method573(local476, arg0.anInt806, false), this.method573(local476, arg0.anInt807, false), this.method573(local476, arg0.anInt805, false));
            } else if (arg0.aBoolean206) {
                Static16.method357(local321, local337, local305, local313, local329, local297, arg0.anInt806, arg0.anInt807, arg0.anInt805, local103, local23, local247, local125, local53, local91, local123, local171, local267, arg0.anInt808);
            } else {
                Static16.method357(local321, local337, local305, local313, local329, local297, arg0.anInt806, arg0.anInt807, arg0.anInt805, local199, local247, local23, local68, local91, local53, local29, local267, local171, arg0.anInt808);
            }
        }
        if ((local281 - local297) * (local337 - local305) - (local289 - local305) * (local329 - local297) <= 0) {
            return;
        }
        Static16.aBoolean147 = false;
        if (local281 < 0 || local297 < 0 || local329 < 0 || local281 > Static14.anInt701 || local297 > Static14.anInt701 || local329 > Static14.anInt701) {
            Static16.aBoolean147 = true;
        }
        if (Static28.aBoolean216 && this.method574(Static28.anInt875, Static28.anInt876, local289, local305, local337, local281, local297, local329)) {
            Static28.anInt877 = arg6;
            Static28.anInt878 = arg7;
        }
        if (arg0.anInt808 != -1) {
            if (!Static28.aBoolean215) {
                Static16.method357(local289, local305, local337, local281, local297, local329, arg0.anInt804, arg0.anInt805, arg0.anInt807, local103, local23, local247, local125, local53, local91, local123, local171, local267, arg0.anInt808);
                return;
            }
            local476 = Static28.anIntArray244[arg0.anInt808];
            Static16.method353(local289, local305, local337, local281, local297, local329, this.method573(local476, arg0.anInt804, false), this.method573(local476, arg0.anInt805, false), this.method573(local476, arg0.anInt807, false));
        } else if (arg0.anInt804 != 12345678) {
            Static16.method353(local289, local305, local337, local281, local297, local329, arg0.anInt804, arg0.anInt805, arg0.anInt807);
            return;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!i;IIIII)V")
    private void method572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
        try {
            @Pc(5) int local5 = 13 / arg5;
            @Pc(9) int local9 = arg2.anIntArray189.length;
            @Pc(20) int local20;
            @Pc(27) int local27;
            @Pc(34) int local34;
            @Pc(44) int local44;
            for (@Pc(11) int local11 = 0; local11 < local9; local11++) {
                local20 = arg2.anIntArray189[local11] - Static28.anInt868;
                local27 = arg2.anIntArray190[local11] - Static28.anInt869;
                local34 = arg2.anIntArray191[local11] - Static28.anInt870;
                local44 = local34 * arg7 + local20 * arg3 >> 16;
                @Pc(54) int local54 = local34 * arg3 - local20 * arg7 >> 16;
                @Pc(66) int local66 = local27 * arg4 - local54 * arg6 >> 16;
                @Pc(76) int local76 = local27 * arg6 + local54 * arg4 >> 16;
                if (local76 < 50) {
                    return;
                }
                if (arg2.anIntArray198 != null) {
                    Static18.anIntArray201[local11] = local44;
                    Static18.anIntArray202[local11] = local66;
                    Static18.anIntArray203[local11] = local76;
                }
                Static18.anIntArray199[local11] = Static16.anInt595 + (local44 << 9) / local76;
                Static18.anIntArray200[local11] = Static16.anInt596 + (local66 << 9) / local76;
            }
            Static16.anInt594 = 0;
            local9 = arg2.anIntArray195.length;
            for (local20 = 0; local20 < local9; local20++) {
                local27 = arg2.anIntArray195[local20];
                local34 = arg2.anIntArray196[local20];
                local44 = arg2.anIntArray197[local20];
                @Pc(150) int local150 = Static18.anIntArray199[local27];
                @Pc(154) int local154 = Static18.anIntArray199[local34];
                @Pc(158) int local158 = Static18.anIntArray199[local44];
                @Pc(162) int local162 = Static18.anIntArray200[local27];
                @Pc(166) int local166 = Static18.anIntArray200[local34];
                @Pc(170) int local170 = Static18.anIntArray200[local44];
                if ((local150 - local154) * (local170 - local166) - (local162 - local166) * (local158 - local154) > 0) {
                    Static16.aBoolean147 = false;
                    if (local150 < 0 || local154 < 0 || local158 < 0 || local150 > Static14.anInt701 || local154 > Static14.anInt701 || local158 > Static14.anInt701) {
                        Static16.aBoolean147 = true;
                    }
                    if (Static28.aBoolean216 && this.method574(Static28.anInt875, Static28.anInt876, local162, local166, local170, local150, local154, local158)) {
                        Static28.anInt877 = arg0;
                        Static28.anInt878 = arg1;
                    }
                    if (arg2.anIntArray198 == null || arg2.anIntArray198[local20] == -1) {
                        if (arg2.anIntArray192[local20] != 12345678) {
                            Static16.method353(local162, local166, local170, local150, local154, local158, arg2.anIntArray192[local20], arg2.anIntArray193[local20], arg2.anIntArray194[local20]);
                        }
                    } else if (Static28.aBoolean215) {
                        @Pc(374) int local374 = Static28.anIntArray244[arg2.anIntArray198[local20]];
                        Static16.method353(local162, local166, local170, local150, local154, local158, this.method573(local374, arg2.anIntArray192[local20], false), this.method573(local374, arg2.anIntArray193[local20], false), this.method573(local374, arg2.anIntArray194[local20], false));
                    } else if (arg2.aBoolean155) {
                        Static16.method357(local162, local166, local170, local150, local154, local158, arg2.anIntArray192[local20], arg2.anIntArray193[local20], arg2.anIntArray194[local20], Static18.anIntArray201[0], Static18.anIntArray201[1], Static18.anIntArray201[3], Static18.anIntArray202[0], Static18.anIntArray202[1], Static18.anIntArray202[3], Static18.anIntArray203[0], Static18.anIntArray203[1], Static18.anIntArray203[3], arg2.anIntArray198[local20]);
                    } else {
                        Static16.method357(local162, local166, local170, local150, local154, local158, arg2.anIntArray192[local20], arg2.anIntArray193[local20], arg2.anIntArray194[local20], Static18.anIntArray201[local27], Static18.anIntArray201[local34], Static18.anIntArray201[local44], Static18.anIntArray202[local27], Static18.anIntArray202[local34], Static18.anIntArray202[local44], Static18.anIntArray203[local27], Static18.anIntArray203[local34], Static18.anIntArray203[local44], arg2.anIntArray198[local20]);
                    }
                }
            }
        } catch (@Pc(411) RuntimeException local411) {
            signlink.reporterror("80413, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local411.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)I")
    private int method573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
        try {
            @Pc(3) int local3 = 127 - arg1;
            if (arg2) {
                this.aBoolean214 = !this.aBoolean214;
            }
            arg1 = local3 * (arg0 & 0x7F) / 160;
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return (arg0 & 0xFF80) + arg1;
        } catch (@Pc(40) RuntimeException local40) {
            signlink.reporterror("12031, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIII)Z")
    private boolean method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            @Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            @Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            @Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return local59 * local91 > 0 && local91 * local75 > 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    private void method575(@OriginalArg(0) byte arg0) {
        try {
            @Pc(5) int local5 = Static28.anIntArray236[Static28.anInt860];
            @Pc(9) IsaacRandom[] local9 = Static28.anIsaacRandomArrayArray1[Static28.anInt860];
            Static28.anInt880 = 0;
            if (arg0 == 22) {
                for (@Pc(17) int local17 = 0; local17 < local5; local17++) {
                    @Pc(23) IsaacRandom local23 = local9[local17];
                    @Pc(34) int local34;
                    @Pc(47) int local47;
                    @Pc(58) int local58;
                    @Pc(88) int local88;
                    @Pc(65) boolean local65;
                    if (local23.c == 1) {
                        local34 = local23.anInt752 + 25 - Static28.anInt866;
                        if (local34 >= 0 && local34 <= 50) {
                            local47 = local23.anInt754 + 25 - Static28.anInt867;
                            if (local47 < 0) {
                                local47 = 0;
                            }
                            local58 = local23.anInt755 + 25 - Static28.anInt867;
                            if (local58 > 50) {
                                local58 = 50;
                            }
                            local65 = false;
                            while (local47 <= local58) {
                                if (Static28.aBooleanArrayArray1[local34][local47++]) {
                                    local65 = true;
                                    break;
                                }
                            }
                            if (local65) {
                                local88 = Static28.anInt868 - local23.y;
                                if (local88 > 32) {
                                    local23.a = 1;
                                } else {
                                    if (local88 >= -32) {
                                        continue;
                                    }
                                    local23.a = 2;
                                    local88 = -local88;
                                }
                                local23.anInt766 = (local23.anInt759 - Static28.anInt870 << 8) / local88;
                                local23.anInt767 = (local23.anInt760 - Static28.anInt870 << 8) / local88;
                                local23.anInt768 = (local23.anInt761 - Static28.anInt869 << 8) / local88;
                                local23.anInt769 = (local23.anInt762 - Static28.anInt869 << 8) / local88;
                                Static28.anIsaacRandomArray1[Static28.anInt880++] = local23;
                            }
                        }
                    } else if (local23.c == 2) {
                        local34 = local23.anInt754 + 25 - Static28.anInt867;
                        if (local34 >= 0 && local34 <= 50) {
                            local47 = local23.anInt752 + 25 - Static28.anInt866;
                            if (local47 < 0) {
                                local47 = 0;
                            }
                            local58 = local23.count + 25 - Static28.anInt866;
                            if (local58 > 50) {
                                local58 = 50;
                            }
                            local65 = false;
                            while (local47 <= local58) {
                                if (Static28.aBooleanArrayArray1[local47++][local34]) {
                                    local65 = true;
                                    break;
                                }
                            }
                            if (local65) {
                                local88 = Static28.anInt870 - local23.anInt759;
                                if (local88 > 32) {
                                    local23.a = 3;
                                } else {
                                    if (local88 >= -32) {
                                        continue;
                                    }
                                    local23.a = 4;
                                    local88 = -local88;
                                }
                                local23.anInt764 = (local23.y - Static28.anInt868 << 8) / local88;
                                local23.anInt765 = (local23.b - Static28.anInt868 << 8) / local88;
                                local23.anInt768 = (local23.anInt761 - Static28.anInt869 << 8) / local88;
                                local23.anInt769 = (local23.anInt762 - Static28.anInt869 << 8) / local88;
                                Static28.anIsaacRandomArray1[Static28.anInt880++] = local23;
                            }
                        }
                    } else if (local23.c == 4) {
                        local34 = local23.anInt761 - Static28.anInt869;
                        if (local34 > 128) {
                            local47 = local23.anInt754 + 25 - Static28.anInt867;
                            if (local47 < 0) {
                                local47 = 0;
                            }
                            local58 = local23.anInt755 + 25 - Static28.anInt867;
                            if (local58 > 50) {
                                local58 = 50;
                            }
                            if (local47 <= local58) {
                                @Pc(334) int local334 = local23.anInt752 + 25 - Static28.anInt866;
                                if (local334 < 0) {
                                    local334 = 0;
                                }
                                local88 = local23.count + 25 - Static28.anInt866;
                                if (local88 > 50) {
                                    local88 = 50;
                                }
                                @Pc(352) boolean local352 = false;
                                label149:
                                for (@Pc(354) int local354 = local334; local354 <= local88; local354++) {
                                    for (@Pc(358) int local358 = local47; local358 <= local58; local358++) {
                                        if (Static28.aBooleanArrayArray1[local354][local358]) {
                                            local352 = true;
                                            break label149;
                                        }
                                    }
                                }
                                if (local352) {
                                    local23.a = 5;
                                    local23.anInt764 = (local23.y - Static28.anInt868 << 8) / local34;
                                    local23.anInt765 = (local23.b - Static28.anInt868 << 8) / local34;
                                    local23.anInt766 = (local23.anInt759 - Static28.anInt870 << 8) / local34;
                                    local23.anInt767 = (local23.anInt760 - Static28.anInt870 << 8) / local34;
                                    Static28.anIsaacRandomArray1[Static28.anInt880++] = local23;
                                }
                            }
                        }
                    }
                }
            }
        } catch (@Pc(438) RuntimeException local438) {
            signlink.reporterror("65169, " + arg0 + ", " + local438.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(III)Z")
    private boolean method576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(8) int local8 = this.anIntArrayArrayArray7[arg0][arg1][arg2];
        if (local8 == -Static28.anInt861) {
            return false;
        } else if (local8 == Static28.anInt861) {
            return true;
        } else {
            @Pc(23) int local23 = arg1 << 7;
            @Pc(27) int local27 = arg2 << 7;
            if (this.method580(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2], local27 + 1) && this.method580(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2], local27 + 1) && this.method580(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method580(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
                this.anIntArrayArrayArray7[arg0][arg1][arg2] = Static28.anInt861;
                return true;
            } else {
                this.anIntArrayArrayArray7[arg0][arg1][arg2] = -Static28.anInt861;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "k", descriptor = "(IIII)Z")
    private boolean method577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        if (!this.method576(arg0, arg1, arg2)) {
            return false;
        }
        @Pc(11) int local11 = arg1 << 7;
        @Pc(15) int local15 = arg2 << 7;
        @Pc(26) int local26 = this.anIntArrayArrayArray6[arg0][arg1][arg2] - 1;
        @Pc(30) int local30 = local26 - 120;
        @Pc(34) int local34 = local26 - 230;
        @Pc(38) int local38 = local26 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (local11 > Static28.anInt868) {
                    if (!this.method580(local11, local26, local15)) {
                        return false;
                    }
                    if (!this.method580(local11, local26, local15 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method580(local11, local30, local15)) {
                        return false;
                    }
                    if (!this.method580(local11, local30, local15 + 128)) {
                        return false;
                    }
                }
                if (!this.method580(local11, local34, local15)) {
                    return false;
                }
                if (!this.method580(local11, local34, local15 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (local15 < Static28.anInt870) {
                    if (!this.method580(local11, local26, local15 + 128)) {
                        return false;
                    }
                    if (!this.method580(local11 + 128, local26, local15 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method580(local11, local30, local15 + 128)) {
                        return false;
                    }
                    if (!this.method580(local11 + 128, local30, local15 + 128)) {
                        return false;
                    }
                }
                if (!this.method580(local11, local34, local15 + 128)) {
                    return false;
                }
                if (!this.method580(local11 + 128, local34, local15 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (local11 < Static28.anInt868) {
                    if (!this.method580(local11 + 128, local26, local15)) {
                        return false;
                    }
                    if (!this.method580(local11 + 128, local26, local15 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method580(local11 + 128, local30, local15)) {
                        return false;
                    }
                    if (!this.method580(local11 + 128, local30, local15 + 128)) {
                        return false;
                    }
                }
                if (!this.method580(local11 + 128, local34, local15)) {
                    return false;
                }
                if (!this.method580(local11 + 128, local34, local15 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (local15 > Static28.anInt870) {
                    if (!this.method580(local11, local26, local15)) {
                        return false;
                    }
                    if (!this.method580(local11 + 128, local26, local15)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!this.method580(local11, local30, local15)) {
                        return false;
                    }
                    if (!this.method580(local11 + 128, local30, local15)) {
                        return false;
                    }
                }
                if (!this.method580(local11, local34, local15)) {
                    return false;
                }
                if (!this.method580(local11 + 128, local34, local15)) {
                    return false;
                }
                return true;
            }
        }
        if (!this.method580(local11 + 64, local38, local15 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return this.method580(local11, local34, local15 + 128);
        } else if (arg3 == 32) {
            return this.method580(local11 + 128, local34, local15 + 128);
        } else if (arg3 == 64) {
            return this.method580(local11 + 128, local34, local15);
        } else if (arg3 == 128) {
            return this.method580(local11, local34, local15);
        } else {
            System.out.println("Warning unsupported wall type");
            return true;
        }
    }

    @OriginalMember(owner = "client!r", name = "l", descriptor = "(IIII)Z")
    private boolean method578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        if (this.method576(arg0, arg1, arg2)) {
            @Pc(11) int local11 = arg1 << 7;
            @Pc(15) int local15 = arg2 << 7;
            return this.method580(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2] - arg3, local15 + 1) && this.method580(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method580(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method580(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)Z")
    private boolean method579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
        @Pc(19) int local19;
        @Pc(23) int local23;
        if (arg1 != arg2 || arg3 != arg4) {
            for (local19 = arg1; local19 <= arg2; local19++) {
                for (local23 = arg3; local23 <= arg4; local23++) {
                    if (this.anIntArrayArrayArray7[arg0][local19][local23] == -Static28.anInt861) {
                        return false;
                    }
                }
            }
            local23 = (arg1 << 7) + 1;
            @Pc(160) int local160 = (arg3 << 7) + 2;
            @Pc(171) int local171 = this.anIntArrayArrayArray6[arg0][arg1][arg3] - arg5;
            if (!this.method580(local23, local171, local160)) {
                return false;
            }
            @Pc(185) int local185 = (arg2 << 7) - 1;
            if (!this.method580(local185, local171, local160)) {
                return false;
            }
            @Pc(199) int local199 = (arg4 << 7) - 1;
            if (!this.method580(local23, local171, local199)) {
                return false;
            } else if (this.method580(local185, local171, local199)) {
                return true;
            } else {
                return false;
            }
        } else if (this.method576(arg0, arg1, arg3)) {
            local19 = arg1 << 7;
            local23 = arg3 << 7;
            return this.method580(local19 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3] - arg5, local23 + 1) && this.method580(local19 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3] - arg5, local23 + 1) && this.method580(local19 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3 + 1] - arg5, local23 + 128 - 1) && this.method580(local19 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3 + 1] - arg5, local23 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(III)Z")
    private boolean method580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        for (@Pc(1) int local1 = 0; local1 < Static28.anInt880; local1++) {
            @Pc(7) IsaacRandom local7 = Static28.anIsaacRandomArray1[local1];
            @Pc(16) int local16;
            @Pc(28) int local28;
            @Pc(38) int local38;
            @Pc(48) int local48;
            @Pc(58) int local58;
            if (local7.a == 1) {
                local16 = local7.y - arg0;
                if (local16 > 0) {
                    local28 = local7.anInt759 + (local7.anInt766 * local16 >> 8);
                    local38 = local7.anInt760 + (local7.anInt767 * local16 >> 8);
                    local48 = local7.anInt761 + (local7.anInt768 * local16 >> 8);
                    local58 = local7.anInt762 + (local7.anInt769 * local16 >> 8);
                    if (arg2 >= local28 && arg2 <= local38 && arg1 >= local48 && arg1 <= local58) {
                        return true;
                    }
                }
            } else if (local7.a == 2) {
                local16 = arg0 - local7.y;
                if (local16 > 0) {
                    local28 = local7.anInt759 + (local7.anInt766 * local16 >> 8);
                    local38 = local7.anInt760 + (local7.anInt767 * local16 >> 8);
                    local48 = local7.anInt761 + (local7.anInt768 * local16 >> 8);
                    local58 = local7.anInt762 + (local7.anInt769 * local16 >> 8);
                    if (arg2 >= local28 && arg2 <= local38 && arg1 >= local48 && arg1 <= local58) {
                        return true;
                    }
                }
            } else if (local7.a == 3) {
                local16 = local7.anInt759 - arg2;
                if (local16 > 0) {
                    local28 = local7.y + (local7.anInt764 * local16 >> 8);
                    local38 = local7.b + (local7.anInt765 * local16 >> 8);
                    local48 = local7.anInt761 + (local7.anInt768 * local16 >> 8);
                    local58 = local7.anInt762 + (local7.anInt769 * local16 >> 8);
                    if (arg0 >= local28 && arg0 <= local38 && arg1 >= local48 && arg1 <= local58) {
                        return true;
                    }
                }
            } else if (local7.a == 4) {
                local16 = arg2 - local7.anInt759;
                if (local16 > 0) {
                    local28 = local7.y + (local7.anInt764 * local16 >> 8);
                    local38 = local7.b + (local7.anInt765 * local16 >> 8);
                    local48 = local7.anInt761 + (local7.anInt768 * local16 >> 8);
                    local58 = local7.anInt762 + (local7.anInt769 * local16 >> 8);
                    if (arg0 >= local28 && arg0 <= local38 && arg1 >= local48 && arg1 <= local58) {
                        return true;
                    }
                }
            } else if (local7.a == 5) {
                local16 = arg1 - local7.anInt761;
                if (local16 > 0) {
                    local28 = local7.y + (local7.anInt764 * local16 >> 8);
                    local38 = local7.b + (local7.anInt765 * local16 >> 8);
                    local48 = local7.anInt759 + (local7.anInt766 * local16 >> 8);
                    local58 = local7.anInt760 + (local7.anInt767 * local16 >> 8);
                    if (arg0 >= local28 && arg0 <= local38 && arg2 >= local48 && arg2 <= local58) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
