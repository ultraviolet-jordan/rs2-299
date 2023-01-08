import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static6 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int anInt170;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int anInt172;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    private static int anInt171 = -504;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
    public static boolean aBoolean32 = true;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
    public static final int[] anIntArray25 = new int[]{1, 2, 4, 8};

    @OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
    public static final int[] anIntArray26 = new int[]{16, 32, 64, 128};

    @OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
    public static final int[] anIntArray27 = new int[]{1, 0, -1, 0};

    @OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
    public static final int[] anIntArray28 = new int[]{0, -1, 0, 1};

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public static int anInt175 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    public static int anInt176 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[B)Z")
    public static boolean method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
        try {
            @Pc(3) boolean local3 = true;
            @Pc(9) Buffer local9 = new Buffer(arg3, -26728);
            if (arg0 != 21991) {
                throw new NullPointerException();
            }
            @Pc(18) int local18 = -1;
            label57:
            while (true) {
                @Pc(21) int local21 = local9.method494();
                if (local21 == 0) {
                    return local3;
                }
                local18 += local21;
                @Pc(29) int local29 = 0;
                @Pc(31) boolean local31 = false;
                while (true) {
                    @Pc(36) int local36;
                    while (!local31) {
                        local36 = local9.method494();
                        if (local36 == 0) {
                            continue label57;
                        }
                        local29 += local36 - 1;
                        @Pc(58) int local58 = local29 & 0x3F;
                        @Pc(64) int local64 = local29 >> 6 & 0x3F;
                        @Pc(69) int local69 = local9.method480() >> 2;
                        @Pc(73) int local73 = local64 + arg1;
                        @Pc(77) int local77 = local58 + arg2;
                        if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
                            @Pc(90) GlShader local90 = Static12.method288(local18);
                            if (local69 != 22 || !aBoolean32 || local90.aBoolean120 || local90.aBoolean126) {
                                local3 &= local90.method292(2);
                                local31 = true;
                            }
                        }
                    }
                    local36 = local9.method494();
                    if (local36 == 0) {
                        break;
                    }
                    local9.method480();
                }
            }
        } catch (@Pc(116) RuntimeException local116) {
            signlink.reporterror("15820, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local116.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!lb;Lclient!ub;B)V")
    public static void method59(@OriginalArg(0) Buffer arg0, @OriginalArg(1) DisplayMode arg1, @OriginalArg(2) byte arg2) {
        try {
            if (arg2 != -75) {
                anInt170 = 109;
            }
            @Pc(8) int local8 = -1;
            while (true) {
                @Pc(11) int local11 = arg0.method494();
                if (local11 == 0) {
                    return;
                }
                local8 += local11;
                @Pc(20) GlShader local20 = Static12.method288(local8);
                local20.method293(anInt171, arg1);
                while (true) {
                    @Pc(27) int local27 = arg0.method494();
                    if (local27 == 0) {
                        break;
                    }
                    arg0.method480();
                }
            }
        } catch (@Pc(38) RuntimeException local38) {
            signlink.reporterror("84763, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local38.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
    public static int method64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        @Pc(32) int local32 = method65(arg0 + 45365, arg1 + 91923, 4) + (method65(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method65(arg0, arg1, 1) - 128 >> 2) - 128;
        local32 = (int) ((double) local32 * 0.3D) + 35;
        if (local32 < 10) {
            local32 = 10;
        } else if (local32 > 60) {
            local32 = 60;
        }
        return local32;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
    private static int method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(3) int local3 = arg0 / arg2;
        @Pc(9) int local9 = arg0 & arg2 - 1;
        @Pc(13) int local13 = arg1 / arg2;
        @Pc(19) int local19 = arg1 & arg2 - 1;
        @Pc(23) int local23 = method67(local3, local13);
        @Pc(29) int local29 = method67(local3 + 1, local13);
        @Pc(35) int local35 = method67(local3, local13 + 1);
        @Pc(43) int local43 = method67(local3 + 1, local13 + 1);
        @Pc(49) int local49 = method66(local23, local29, local9, arg2);
        @Pc(55) int local55 = method66(local35, local43, local9, arg2);
        return method66(local49, local55, local19, arg2);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)I")
    private static int method66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        @Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub1.anIntArray179[arg2 * 1024 / arg3] >> 1;
        return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
    private static int method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        @Pc(31) int local31 = method68(arg0 - 1, arg1 - 1) + method68(arg0 + 1, arg1 - 1) + method68(arg0 - 1, arg1 + 1) + method68(arg0 + 1, arg1 + 1);
        @Pc(55) int local55 = method68(arg0 - 1, arg1) + method68(arg0 + 1, arg1) + method68(arg0, arg1 - 1) + method68(arg0, arg1 + 1);
        @Pc(59) int local59 = method68(arg0, arg1);
        return local31 / 16 + local55 / 8 + local59 / 4;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
    private static int method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        @Pc(5) int local5 = arg0 + arg1 * 57;
        @Pc(11) int local11 = local5 << 13 ^ local5;
        @Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
        return local25 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(III)Z")
    public static boolean method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        try {
            if (arg1 < 4 || arg1 > 4) {
                throw new NullPointerException();
            }
            @Pc(12) GlShader local12 = Static12.method288(arg0);
            if (arg2 == 11) {
                arg2 = 10;
            }
            if (arg2 >= 5 && arg2 <= 8) {
                arg2 = 4;
            }
            return local12.method291(3, arg2);
        } catch (@Pc(31) RuntimeException local31) {
            signlink.reporterror("43233, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[[[ILclient!jc;IILclient!r;III)V")
    public static void method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) ParamType arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) SecondaryParticleNode arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
        try {
            @Pc(9) int local9 = arg3[arg0][arg9][arg6];
            @Pc(19) int local19 = arg3[arg0][arg9 + 1][arg6];
            @Pc(31) int local31 = arg3[arg0][arg9 + 1][arg6 + 1];
            @Pc(41) int local41 = arg3[arg0][arg9][arg6 + 1];
            @Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
            @Pc(54) GlShader local54 = Static12.method288(arg2);
            @Pc(66) int local66 = arg9 + (arg6 << 7) + (arg2 << 14) + 1073741824;
            if (!local54.aBoolean120) {
                local66 += Integer.MIN_VALUE;
            }
            @Pc(80) byte local80 = (byte) ((arg5 << 6) + arg10);
            if (arg8 == 8) {
                @Pc(104) Class1_Sub1_Sub1 local104;
                if (arg10 == 22) {
                    if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
                        local104 = local54.method294(22, arg5, local9, local19, local31, local41, -1);
                    } else {
                        local104 = new ProjAnimNode(local41, true, 22, 0, local9, local19, local31, arg5, arg2, local54.anInt515);
                    }
                    arg7.method536(8, arg1, local80, local66, arg6, local104, arg9, local51);
                    if (local54.aBoolean118 && local54.aBoolean120) {
                        arg4.method423(arg6, arg9, true);
                    }
                } else {
                    @Pc(200) int local200;
                    if (arg10 == 10 || arg10 == 11) {
                        if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
                            local104 = local54.method294(10, arg5, local9, local19, local31, local41, -1);
                        } else {
                            local104 = new ProjAnimNode(local41, true, 10, 0, local9, local19, local31, arg5, arg2, local54.anInt515);
                        }
                        if (local104 != null) {
                            @Pc(187) int local187 = 0;
                            if (arg10 == 11) {
                                local187 += 256;
                            }
                            @Pc(203) int local203;
                            if (arg5 == 1 || arg5 == 3) {
                                local200 = local54.anInt514;
                                local203 = local54.anInt513;
                            } else {
                                local200 = local54.anInt513;
                                local203 = local54.anInt514;
                            }
                            arg7.method540(local203, arg1, arg6, local66, local51, local187, local80, arg9, local200, (byte) 7, local104);
                        }
                        if (local54.aBoolean118) {
                            arg4.method422(local54.anInt513, local54.anInt514, local54.aBoolean119, arg6, arg9, arg5, 0);
                        }
                    } else if (arg10 >= 12) {
                        if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
                            local104 = local54.method294(arg10, arg5, local9, local19, local31, local41, -1);
                        } else {
                            local104 = new ProjAnimNode(local41, true, arg10, 0, local9, local19, local31, arg5, arg2, local54.anInt515);
                        }
                        arg7.method540(1, arg1, arg6, local66, local51, 0, local80, arg9, 1, (byte) 7, local104);
                        if (local54.aBoolean118) {
                            arg4.method422(local54.anInt513, local54.anInt514, local54.aBoolean119, arg6, arg9, arg5, 0);
                        }
                    } else if (arg10 == 0) {
                        if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
                            local104 = local54.method294(0, arg5, local9, local19, local31, local41, -1);
                        } else {
                            local104 = new ProjAnimNode(local41, true, 0, 0, local9, local19, local31, arg5, arg2, local54.anInt515);
                        }
                        arg7.method538(null, local104, -172, local66, local51, arg6, anIntArray25[arg5], 0, arg9, arg1, local80);
                        if (local54.aBoolean118) {
                            arg4.method421(arg9, -784, arg5, arg6, local54.aBoolean119, arg10);
                        }
                    } else if (arg10 == 1) {
                        if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
                            local104 = local54.method294(1, arg5, local9, local19, local31, local41, -1);
                        } else {
                            local104 = new ProjAnimNode(local41, true, 1, 0, local9, local19, local31, arg5, arg2, local54.anInt515);
                        }
                        arg7.method538(null, local104, -172, local66, local51, arg6, anIntArray26[arg5], 0, arg9, arg1, local80);
                        if (local54.aBoolean118) {
                            arg4.method421(arg9, -784, arg5, arg6, local54.aBoolean119, arg10);
                        }
                    } else {
                        @Pc(446) int local446;
                        @Pc(475) Class1_Sub1_Sub1 local475;
                        if (arg10 == 2) {
                            local446 = arg5 + 1 & 0x3;
                            @Pc(465) Class1_Sub1_Sub1 local465;
                            if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
                                local465 = local54.method294(2, arg5 + 4, local9, local19, local31, local41, -1);
                                local475 = local54.method294(2, local446, local9, local19, local31, local41, -1);
                            } else {
                                local465 = new ProjAnimNode(local41, true, 2, 0, local9, local19, local31, arg5 + 4, arg2, local54.anInt515);
                                local475 = new ProjAnimNode(local41, true, 2, 0, local9, local19, local31, local446, arg2, local54.anInt515);
                            }
                            arg7.method538(local475, local465, -172, local66, local51, arg6, anIntArray25[arg5], anIntArray25[local446], arg9, arg1, local80);
                            if (local54.aBoolean118) {
                                arg4.method421(arg9, -784, arg5, arg6, local54.aBoolean119, arg10);
                            }
                        } else if (arg10 == 3) {
                            if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
                                local104 = local54.method294(3, arg5, local9, local19, local31, local41, -1);
                            } else {
                                local104 = new ProjAnimNode(local41, true, 3, 0, local9, local19, local31, arg5, arg2, local54.anInt515);
                            }
                            arg7.method538(null, local104, -172, local66, local51, arg6, anIntArray26[arg5], 0, arg9, arg1, local80);
                            if (local54.aBoolean118) {
                                arg4.method421(arg9, -784, arg5, arg6, local54.aBoolean119, arg10);
                            }
                        } else if (arg10 == 9) {
                            if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
                                local104 = local54.method294(arg10, arg5, local9, local19, local31, local41, -1);
                            } else {
                                local104 = new ProjAnimNode(local41, true, arg10, 0, local9, local19, local31, arg5, arg2, local54.anInt515);
                            }
                            arg7.method540(1, arg1, arg6, local66, local51, 0, local80, arg9, 1, (byte) 7, local104);
                            if (local54.aBoolean118) {
                                arg4.method422(local54.anInt513, local54.anInt514, local54.aBoolean119, arg6, arg9, arg5, 0);
                            }
                        } else {
                            if (local54.aBoolean121) {
                                if (arg5 == 1) {
                                    local446 = local41;
                                    local41 = local31;
                                    local31 = local19;
                                    local19 = local9;
                                    local9 = local446;
                                } else if (arg5 == 2) {
                                    local446 = local41;
                                    local41 = local19;
                                    local19 = local446;
                                    local446 = local31;
                                    local31 = local9;
                                    local9 = local446;
                                } else if (arg5 == 3) {
                                    local446 = local41;
                                    local41 = local9;
                                    local9 = local19;
                                    local19 = local31;
                                    local31 = local446;
                                }
                            }
                            if (arg10 == 4) {
                                if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
                                    local104 = local54.method294(4, 0, local9, local19, local31, local41, -1);
                                } else {
                                    local104 = new ProjAnimNode(local41, true, 4, 0, local9, local19, local31, 0, arg2, local54.anInt515);
                                }
                                arg7.method539(local104, local51, 0, arg5 * 512, arg1, (byte) 49, anIntArray25[arg5], arg6, local80, 0, arg9, local66);
                            } else if (arg10 == 5) {
                                local446 = 16;
                                local200 = arg7.method556(arg1, arg9, arg6);
                                if (local200 > 0) {
                                    local446 = Static12.method288(local200 >> 14 & 0x7FFF).anInt516;
                                }
                                if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
                                    local475 = local54.method294(4, 0, local9, local19, local31, local41, -1);
                                } else {
                                    local475 = new ProjAnimNode(local41, true, 4, 0, local9, local19, local31, 0, arg2, local54.anInt515);
                                }
                                arg7.method539(local475, local51, anIntArray28[arg5] * local446, arg5 * 512, arg1, (byte) 49, anIntArray25[arg5], arg6, local80, anIntArray27[arg5] * local446, arg9, local66);
                            } else if (arg10 == 6) {
                                if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
                                    local104 = local54.method294(4, 0, local9, local19, local31, local41, -1);
                                } else {
                                    local104 = new ProjAnimNode(local41, true, 4, 0, local9, local19, local31, 0, arg2, local54.anInt515);
                                }
                                arg7.method539(local104, local51, 0, arg5, arg1, (byte) 49, 256, arg6, local80, 0, arg9, local66);
                            } else if (arg10 == 7) {
                                if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
                                    local104 = local54.method294(4, 0, local9, local19, local31, local41, -1);
                                } else {
                                    local104 = new ProjAnimNode(local41, true, 4, 0, local9, local19, local31, 0, arg2, local54.anInt515);
                                }
                                arg7.method539(local104, local51, 0, arg5, arg1, (byte) 49, 512, arg6, local80, 0, arg9, local66);
                            } else if (arg10 == 8) {
                                if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
                                    local104 = local54.method294(4, 0, local9, local19, local31, local41, -1);
                                } else {
                                    local104 = new ProjAnimNode(local41, true, 4, 0, local9, local19, local31, 0, arg2, local54.anInt515);
                                }
                                arg7.method539(local104, local51, 0, arg5, arg1, (byte) 49, 768, arg6, local80, 0, arg9, local66);
                            }
                        }
                    }
                }
            }
        } catch (@Pc(1014) RuntimeException local1014) {
            signlink.reporterror("99529, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1014.toString());
            throw new RuntimeException();
        }
    }
}
