import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static32 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Z")
    private static boolean aBoolean223;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    private static int anInt932;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    private static int anInt934;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    private static int anInt935;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "[I")
    private static int[] anIntArray254;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "[[C")
    private static char[][] aCharArrayArray1;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "[[[B")
    private static byte[][][] aByteArrayArrayArray8;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "[[C")
    private static char[][] aCharArrayArray2;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "[[C")
    private static char[][] aCharArrayArray3;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "[I")
    private static int[] anIntArray255;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    private static int anInt930 = 35138;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    private static int anInt931 = 39405;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    private static int anInt933 = -20584;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "B")
    private static byte aByte30 = 9;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    private static int anInt936 = 9;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    private static int anInt937 = 633;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Z")
    private static boolean aBoolean224 = true;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "[Ljava/lang/String;")
    private static final String[] aStringArray13 = new String[]{"cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"};

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!xb;)V")
    public static void method594(@OriginalArg(0) Class47 arg0) {
        @Pc(10) Buffer local10 = new Buffer(arg0.method666("fragmentsenc.txt", null), -26728);
        @Pc(19) Buffer local19 = new Buffer(arg0.method666("badenc.txt", null), -26728);
        @Pc(28) Buffer local28 = new Buffer(arg0.method666("domainenc.txt", null), -26728);
        @Pc(37) Buffer local37 = new Buffer(arg0.method666("tldlist.txt", null), -26728);
        method595(local10, local19, local28, local37);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;Lclient!lb;Lclient!lb;Lclient!lb;)V")
    private static void method595(@OriginalArg(0) Buffer arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) Buffer arg3) {
        method597(arg1, anInt930);
        method598(arg2, 39405);
        method599(arg0, (byte) 22);
        method596(arg3, -385);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;I)V")
    private static void method596(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
        try {
            @Pc(4) int local4 = arg0.get4();
            aCharArrayArray3 = new char[local4][];
            anIntArray255 = new int[local4];
            for (@Pc(12) int local12 = 0; local12 < local4; local12++) {
                anIntArray255[local12] = arg0.get1();
                @Pc(23) char[] local23 = new char[arg0.get1()];
                for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
                    local23[local25] = (char) arg0.get1();
                }
                aCharArrayArray3[local12] = local23;
            }
            if (arg1 < 0) {
                ;
            }
        } catch (@Pc(50) RuntimeException local50) {
            signlink.reporterror("34857, " + arg0 + ", " + arg1 + ", " + local50.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!lb;I)V")
    private static void method597(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
        try {
            @Pc(2) int local2 = arg0.get4();
            if (arg1 != 35138) {
                anInt930 = -477;
            }
            aCharArrayArray1 = new char[local2][];
            aByteArrayArrayArray8 = new byte[local2][][];
            method600(aCharArrayArray1, aByteArrayArrayArray8, (byte) 80, arg0);
        } catch (@Pc(20) RuntimeException local20) {
            signlink.reporterror("13148, " + arg0 + ", " + arg1 + ", " + local20.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(Lclient!lb;I)V")
    private static void method598(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
        try {
            @Pc(2) int local2 = arg0.get4();
            if (arg1 == anInt931) {
                aCharArrayArray2 = new char[local2][];
                method601(arg0, anInt932, aCharArrayArray2);
            }
        } catch (@Pc(15) RuntimeException local15) {
            signlink.reporterror("76849, " + arg0 + ", " + arg1 + ", " + local15.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;B)V")
    private static void method599(@OriginalArg(0) Buffer arg0, @OriginalArg(1) byte arg1) {
        try {
            if (arg1 != 22) {
                aBoolean224 = !aBoolean224;
            }
            anIntArray254 = new int[arg0.get4()];
            for (@Pc(14) int local14 = 0; local14 < anIntArray254.length; local14++) {
                anIntArray254[local14] = arg0.get2();
            }
        } catch (@Pc(28) RuntimeException local28) {
            signlink.reporterror("57869, " + arg0 + ", " + arg1 + ", " + local28.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([[C[[[BBLclient!lb;)V")
    private static void method600(@OriginalArg(0) char[][] arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Buffer arg3) {
        try {
            for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
                @Pc(9) char[] local9 = new char[arg3.get1()];
                for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
                    local9[local11] = (char) arg3.get1();
                }
                arg0[local3] = local9;
                @Pc(33) byte[][] local33 = new byte[arg3.get1()][2];
                for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
                    local33[local35][0] = (byte) arg3.get1();
                    local33[local35][1] = (byte) arg3.get1();
                }
                if (local33.length > 0) {
                    arg1[local3] = local33;
                }
            }
            if (arg2 != 80) {
                anInt932 = 459;
            }
        } catch (@Pc(77) RuntimeException local77) {
            signlink.reporterror("38790, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local77.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lb;I[[C)V")
    private static void method601(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[][] arg2) {
        try {
            for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
                @Pc(9) char[] local9 = new char[arg0.get1()];
                for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
                    local9[local11] = (char) arg0.get1();
                }
                arg2[local3] = local9;
            }
            if (arg1 == 0) {
                ;
            }
        } catch (@Pc(37) RuntimeException local37) {
            signlink.reporterror("28080, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C)V")
    private static void method602(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
        try {
            @Pc(5) int local5;
            if (arg0 != 0) {
                for (local5 = 1; local5 > 0; local5++) {
                }
            }
            local5 = 0;
            for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
                if (method603(false, arg1[local14])) {
                    arg1[local5] = arg1[local14];
                } else {
                    arg1[local5] = ' ';
                }
                if (local5 == 0 || arg1[local5] != ' ' || arg1[local5 - 1] != ' ') {
                    local5++;
                }
            }
            for (@Pc(56) int local56 = local5; local56 < arg1.length; local56++) {
                arg1[local56] = ' ';
            }
        } catch (@Pc(69) RuntimeException local69) {
            signlink.reporterror("11597, " + arg0 + ", " + arg1 + ", " + local69.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZC)Z")
    private static boolean method603(@OriginalArg(0) boolean arg0, @OriginalArg(1) char arg1) {
        try {
            if (arg0) {
                throw new NullPointerException();
            }
            return arg1 >= ' ' && arg1 <= '\u007f' || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == '£' || arg1 == '€';
        } catch (@Pc(31) RuntimeException local31) {
            signlink.reporterror("57427, " + arg0 + ", " + arg1 + ", " + local31.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method604(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
        try {
            @Pc(3) long local3 = System.currentTimeMillis();
            @Pc(6) char[] local6 = arg1.toCharArray();
            method602(0, local6);
            @Pc(15) String local15 = (new String(local6)).trim();
            @Pc(19) char[] local19 = local15.toLowerCase().toCharArray();
            @Pc(22) String local22 = local15.toLowerCase();
            method612(local19, 6);
            method607(-20584, local19);
            method608(local19, (byte) -26);
            @Pc(35) int local35;
            if (arg0 >= 0) {
                for (local35 = 1; local35 > 0; local35++) {
                }
            }
            method621(local19, (byte) 53);
            for (local35 = 0; local35 < aStringArray13.length; local35++) {
                @Pc(55) int local55 = -1;
                while ((local55 = local22.indexOf(aStringArray13[local35], local55 + 1)) != -1) {
                    @Pc(62) char[] local62 = aStringArray13[local35].toCharArray();
                    for (@Pc(64) int local64 = 0; local64 < local62.length; local64++) {
                        local19[local64 + local55] = local62[local64];
                    }
                }
            }
            method605(local19, local15.toCharArray(), -542);
            method606(local19, (byte) -47);
            @Pc(106) long local106 = System.currentTimeMillis();
            return (new String(local19)).trim();
        } catch (@Pc(113) RuntimeException local113) {
            signlink.reporterror("57639, " + arg0 + ", " + arg1 + ", " + local113.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[CI)V")
    private static void method605(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
        try {
            for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
                if (arg0[local3] != '*' && method629(arg1[local3], true)) {
                    arg0[local3] = arg1[local3];
                }
            }
            if (arg2 >= 0) {
                ;
            }
        } catch (@Pc(34) RuntimeException local34) {
            signlink.reporterror("9039, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local34.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([CB)V")
    private static void method606(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
        try {
            @Pc(3) boolean local3 = true;
            if (arg1 == -47) {
                for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
                    @Pc(15) char local15 = arg0[local9];
                    if (!method626(-893, local15)) {
                        local3 = true;
                    } else if (local3) {
                        if (method628(local15, -932)) {
                            local3 = false;
                        }
                    } else if (method629(local15, true)) {
                        arg0[local9] = (char) (local15 + 'a' - 65);
                    }
                }
            }
        } catch (@Pc(53) RuntimeException local53) {
            signlink.reporterror("54618, " + arg0 + ", " + arg1 + ", " + local53.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I[C)V")
    private static void method607(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
        try {
            for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
                for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
                    method616(aCharArrayArray1[local10], arg1, aByteArrayArrayArray8[local10], -959);
                }
            }
            if (arg0 != anInt933) {
                anInt932 = -111;
            }
        } catch (@Pc(35) RuntimeException local35) {
            signlink.reporterror("85200, " + arg0 + ", " + arg1 + ", " + local35.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "([CB)V")
    private static void method608(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
        try {
            @Pc(3) char[] local3 = (char[]) arg0.clone();
            if (arg1 != -26) {
                anInt932 = -396;
            }
            @Pc(23) char[] local23 = new char[]{'(', 'a', ')'};
            method616(local23, local3, null, -959);
            @Pc(32) char[] local32 = (char[]) arg0.clone();
            @Pc(47) char[] local47 = new char[]{'d', 'o', 't'};
            method616(local47, local32, null, -959);
            for (@Pc(57) int local57 = aCharArrayArray2.length - 1; local57 >= 0; local57--) {
                method609(aCharArrayArray2[local57], local3, arg0, local32, -983);
            }
        } catch (@Pc(72) RuntimeException local72) {
            signlink.reporterror("52931, " + arg0 + ", " + arg1 + ", " + local72.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[C[C[CI)V")
    private static void method609(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) int arg4) {
        try {
            if (arg0.length <= arg2.length) {
                @Pc(9) boolean local9 = true;
                @Pc(13) int local13;
                if (arg4 >= 0) {
                    for (local13 = 1; local13 > 0; local13++) {
                    }
                }
                @Pc(28) int local28;
                for (local13 = 0; local13 <= arg2.length - arg0.length; local13 += local28) {
                    @Pc(24) int local24 = local13;
                    @Pc(26) int local26 = 0;
                    local28 = 1;
                    @Pc(32) boolean var9;
                    label61:
                    while (true) {
                        while (true) {
                            if (local24 >= arg2.length) {
                                break label61;
                            }
                            var9 = false;
                            @Pc(36) char local36 = arg2[local24];
                            @Pc(38) char local38 = 0;
                            if (local24 + 1 < arg2.length) {
                                local38 = arg2[local24 + 1];
                            }
                            @Pc(63) int local63;
                            if (local26 < arg0.length && (local63 = method618(local38, arg0[local26], -18503, local36)) > 0) {
                                local24 += local63;
                                local26++;
                            } else {
                                if (local26 == 0) {
                                    break label61;
                                }
                                @Pc(84) int local84;
                                if ((local84 = method618(local38, arg0[local26 - 1], -18503, local36)) > 0) {
                                    local24 += local84;
                                    if (local26 == 1) {
                                        local28++;
                                    }
                                } else {
                                    if (local26 >= arg0.length || !method624(anInt935, local36)) {
                                        break label61;
                                    }
                                    local24++;
                                }
                            }
                        }
                    }
                    if (local26 >= arg0.length) {
                        var9 = false;
                        @Pc(121) int local121 = method610(0, arg2, local13, arg1);
                        @Pc(129) int local129 = method611(arg2, false, local24 - 1, arg3);
                        if (local121 > 2 || local129 > 2) {
                            var9 = true;
                        }
                        if (var9) {
                            for (@Pc(141) int local141 = local13; local141 < local24; local141++) {
                                arg2[local141] = '*';
                            }
                        }
                    }
                }
            }
        } catch (@Pc(164) RuntimeException local164) {
            signlink.reporterror("71346, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local164.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CI[C)I")
    private static int method610(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3) {
        try {
            if (arg2 == 0) {
                return 2;
            }
            for (@Pc(9) int local9 = arg2 - 1; local9 >= 0 && method624(anInt935, arg1[local9]); local9--) {
                if (arg1[local9] == '@') {
                    return 3;
                }
            }
            @Pc(29) int local29 = 0;
            if (arg0 != 0) {
                aBoolean223 = !aBoolean223;
            }
            for (@Pc(41) int local41 = arg2 - 1; local41 >= 0 && method624(anInt935, arg3[local41]); local41--) {
                if (arg3[local41] == '*') {
                    local29++;
                }
            }
            if (local29 >= 3) {
                return 4;
            } else if (method624(anInt935, arg1[arg2 - 1])) {
                return 1;
            } else {
                return 0;
            }
        } catch (@Pc(77) RuntimeException local77) {
            signlink.reporterror("51260, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local77.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([CZI[C)I")
    private static int method611(@OriginalArg(0) char[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char[] arg3) {
        try {
            if (arg2 + 1 == arg0.length) {
                return 2;
            }
            @Pc(13) int local13 = arg2 + 1;
            while (true) {
                if (local13 < arg0.length && method624(anInt935, arg0[local13])) {
                    if (arg0[local13] != '.' && arg0[local13] != ',') {
                        local13++;
                        continue;
                    }
                    return 3;
                }
                if (arg1) {
                    return 0;
                }
                @Pc(44) int local44 = 0;
                for (@Pc(48) int local48 = arg2 + 1; local48 < arg0.length && method624(anInt935, arg3[local48]); local48++) {
                    if (arg3[local48] == '*') {
                        local44++;
                    }
                }
                if (local44 >= 3) {
                    return 4;
                }
                if (method624(anInt935, arg0[arg2 + 1])) {
                    return 1;
                }
                return 0;
            }
        } catch (@Pc(86) RuntimeException local86) {
            signlink.reporterror("46549, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local86.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([CI)V")
    private static void method612(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
        try {
            @Pc(3) char[] local3 = (char[]) arg0.clone();
            if (arg1 == 6) {
                @Pc(22) char[] local22 = new char[]{'d', 'o', 't'};
                method616(local22, local3, null, -959);
                @Pc(31) char[] local31 = (char[]) arg0.clone();
                @Pc(54) char[] local54 = new char[]{'s', 'l', 'a', 's', 'h'};
                method616(local54, local31, null, -959);
                for (@Pc(61) int local61 = 0; local61 < aCharArrayArray3.length; local61++) {
                    method613(false, aCharArrayArray3[local61], local31, local3, arg0, anIntArray255[local61]);
                }
            }
        } catch (@Pc(81) RuntimeException local81) {
            signlink.reporterror("6927, " + arg0 + ", " + arg1 + ", " + local81.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z[C[C[C[CI)V")
    private static void method613(@OriginalArg(0) boolean arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) char[] arg4, @OriginalArg(5) int arg5) {
        try {
            if (arg1.length <= arg4.length) {
                @Pc(9) boolean local9 = true;
                if (!arg0) {
                    @Pc(22) int local22;
                    for (@Pc(14) int local14 = 0; local14 <= arg4.length - arg1.length; local14 += local22) {
                        @Pc(18) int local18 = local14;
                        @Pc(20) int local20 = 0;
                        local22 = 1;
                        @Pc(26) boolean var10;
                        label124:
                        while (true) {
                            while (true) {
                                if (local18 >= arg4.length) {
                                    break label124;
                                }
                                var10 = false;
                                @Pc(30) char local30 = arg4[local18];
                                @Pc(32) char local32 = 0;
                                if (local18 + 1 < arg4.length) {
                                    local32 = arg4[local18 + 1];
                                }
                                @Pc(57) int local57;
                                if (local20 < arg1.length && (local57 = method618(local32, arg1[local20], -18503, local30)) > 0) {
                                    local18 += local57;
                                    local20++;
                                } else {
                                    if (local20 == 0) {
                                        break label124;
                                    }
                                    @Pc(78) int local78;
                                    if ((local78 = method618(local32, arg1[local20 - 1], -18503, local30)) > 0) {
                                        local18 += local78;
                                        if (local20 == 1) {
                                            local22++;
                                        }
                                    } else {
                                        if (local20 >= arg1.length || !method624(anInt935, local30)) {
                                            break label124;
                                        }
                                        local18++;
                                    }
                                }
                            }
                        }
                        if (local20 >= arg1.length) {
                            var10 = false;
                            @Pc(115) int local115 = method614(488, arg3, arg4, local14);
                            @Pc(123) int local123 = method615(anInt934, local18 - 1, arg2, arg4);
                            if (arg5 == 1 && local115 > 0 && local123 > 0) {
                                var10 = true;
                            }
                            if (arg5 == 2 && (local115 > 2 && local123 > 0 || local115 > 0 && local123 > 2)) {
                                var10 = true;
                            }
                            if (arg5 == 3 && local115 > 0 && local123 > 2) {
                                var10 = true;
                            }
                            @Pc(166) boolean local166;
                            if (arg5 == 3 && local115 > 2 && local123 > 0) {
                                local166 = true;
                            } else {
                                local166 = false;
                            }
                            if (var10) {
                                @Pc(173) int local173 = local14;
                                @Pc(177) int local177 = local18 - 1;
                                @Pc(185) boolean local185;
                                @Pc(189) int local189;
                                if (local115 > 2) {
                                    if (local115 == 4) {
                                        local185 = false;
                                        for (local189 = local14 - 1; local189 >= 0; local189--) {
                                            if (local185) {
                                                if (arg3[local189] != '*') {
                                                    break;
                                                }
                                                local173 = local189;
                                            } else if (arg3[local189] == '*') {
                                                local173 = local189;
                                                local185 = true;
                                            }
                                        }
                                    }
                                    local185 = false;
                                    for (local189 = local173 - 1; local189 >= 0; local189--) {
                                        if (local185) {
                                            if (method624(anInt935, arg4[local189])) {
                                                break;
                                            }
                                            local173 = local189;
                                        } else if (!method624(anInt935, arg4[local189])) {
                                            local185 = true;
                                            local173 = local189;
                                        }
                                    }
                                }
                                if (local123 > 2) {
                                    if (local123 == 4) {
                                        local185 = false;
                                        for (local189 = local177 + 1; local189 < arg4.length; local189++) {
                                            if (local185) {
                                                if (arg2[local189] != '*') {
                                                    break;
                                                }
                                                local177 = local189;
                                            } else if (arg2[local189] == '*') {
                                                local177 = local189;
                                                local185 = true;
                                            }
                                        }
                                    }
                                    local185 = false;
                                    for (local189 = local177 + 1; local189 < arg4.length; local189++) {
                                        if (local185) {
                                            if (method624(anInt935, arg4[local189])) {
                                                break;
                                            }
                                            local177 = local189;
                                        } else if (!method624(anInt935, arg4[local189])) {
                                            local185 = true;
                                            local177 = local189;
                                        }
                                    }
                                }
                                for (@Pc(323) int local323 = local173; local323 <= local177; local323++) {
                                    arg4[local323] = '*';
                                }
                            }
                        }
                    }
                }
            }
        } catch (@Pc(346) RuntimeException local346) {
            signlink.reporterror("35206, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local346.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[C[CI)I")
    private static int method614(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) int arg3) {
        try {
            if (arg0 <= 0) {
                return 3;
            } else if (arg3 == 0) {
                return 2;
            } else {
                @Pc(13) int local13 = arg3 - 1;
                while (true) {
                    if (local13 >= 0 && method624(anInt935, arg2[local13])) {
                        if (arg2[local13] != ',' && arg2[local13] != '.') {
                            local13--;
                            continue;
                        }
                        return 3;
                    }
                    @Pc(38) int local38 = 0;
                    for (@Pc(42) int local42 = arg3 - 1; local42 >= 0 && method624(anInt935, arg1[local42]); local42--) {
                        if (arg1[local42] == '*') {
                            local38++;
                        }
                    }
                    if (local38 >= 3) {
                        return 4;
                    }
                    if (method624(anInt935, arg2[arg3 - 1])) {
                        return 1;
                    }
                    return 0;
                }
            }
        } catch (@Pc(78) RuntimeException local78) {
            signlink.reporterror("62850, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[C[C)I")
    private static int method615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3) {
        try {
            if (arg1 + 1 == arg3.length) {
                return 2;
            }
            @Pc(13) int local13 = arg1 + 1;
            while (true) {
                if (local13 < arg3.length && method624(anInt935, arg3[local13])) {
                    if (arg3[local13] != '\\' && arg3[local13] != '/') {
                        local13++;
                        continue;
                    }
                    return 3;
                }
                if (arg0 != 0) {
                    aBoolean224 = !aBoolean224;
                }
                @Pc(48) int local48 = 0;
                for (@Pc(52) int local52 = arg1 + 1; local52 < arg3.length && method624(anInt935, arg2[local52]); local52++) {
                    if (arg2[local52] == '*') {
                        local48++;
                    }
                }
                if (local48 >= 5) {
                    return 4;
                }
                if (method624(anInt935, arg3[arg1 + 1])) {
                    return 1;
                }
                return 0;
            }
        } catch (@Pc(90) RuntimeException local90) {
            signlink.reporterror("62765, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local90.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([C[C[[BI)V")
    private static void method616(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3) {
        try {
            if (arg0.length <= arg1.length) {
                @Pc(9) boolean local9 = true;
                if (arg3 < 0) {
                    @Pc(24) int local24;
                    for (@Pc(14) int local14 = 0; local14 <= arg1.length - arg0.length; local14 += local24) {
                        @Pc(18) int local18 = local14;
                        @Pc(20) int local20 = 0;
                        @Pc(22) int local22 = 0;
                        local24 = 1;
                        @Pc(26) boolean local26 = false;
                        @Pc(28) boolean local28 = false;
                        @Pc(30) boolean local30 = false;
                        @Pc(34) boolean var12;
                        @Pc(38) char var13;
                        @Pc(40) char var14;
                        label168:
                        while (true) {
                            while (true) {
                                if (local18 >= arg1.length || local28 && local30) {
                                    break label168;
                                }
                                var12 = false;
                                var13 = arg1[local18];
                                var14 = '\u0000';
                                if (local18 + 1 < arg1.length) {
                                    var14 = arg1[local18 + 1];
                                }
                                @Pc(65) int local65;
                                if (local20 < arg0.length && (local65 = method619(var14, arg0[local20], 987, var13)) > 0) {
                                    if (local65 == 1 && method627(false, var13)) {
                                        local28 = true;
                                    }
                                    if (local65 == 2 && (method627(false, var13) || method627(false, var14))) {
                                        local28 = true;
                                    }
                                    local18 += local65;
                                    local20++;
                                } else {
                                    if (local20 == 0) {
                                        break label168;
                                    }
                                    @Pc(108) int local108;
                                    if ((local108 = method619(var14, arg0[local20 - 1], 987, var13)) > 0) {
                                        local18 += local108;
                                        if (local20 == 1) {
                                            local24++;
                                        }
                                    } else {
                                        if (local20 >= arg0.length || !method625(true, var13)) {
                                            break label168;
                                        }
                                        if (method624(anInt935, var13) && var13 != '\'') {
                                            local26 = true;
                                        }
                                        if (method627(false, var13)) {
                                            local30 = true;
                                        }
                                        local18++;
                                        local22++;
                                        if (local22 * 100 / (local18 - local14) > 90) {
                                            break label168;
                                        }
                                    }
                                }
                            }
                        }
                        if (local20 >= arg0.length && (!local28 || !local30)) {
                            var12 = true;
                            @Pc(269) int local269;
                            if (local26) {
                                @Pc(219) boolean local219 = false;
                                @Pc(221) boolean local221 = false;
                                if (local14 - 1 < 0 || method624(anInt935, arg1[local14 - 1]) && arg1[local14 - 1] != '\'') {
                                    local219 = true;
                                }
                                if (local18 >= arg1.length || method624(anInt935, arg1[local18]) && arg1[local18] != '\'') {
                                    local221 = true;
                                }
                                if (!local219 || !local221) {
                                    @Pc(265) boolean local265 = false;
                                    local269 = local14 - 2;
                                    if (local219) {
                                        local269 = local14;
                                    }
                                    while (!local265 && local269 < local18) {
                                        if (local269 >= 0 && (!method624(anInt935, arg1[local269]) || arg1[local269] == '\'')) {
                                            @Pc(291) char[] local291 = new char[3];
                                            @Pc(293) int local293;
                                            for (local293 = 0; local293 < 3 && local269 + local293 < arg1.length && (!method624(anInt935, arg1[local269 + local293]) || arg1[local269 + local293] == '\''); local293++) {
                                                local291[local293] = arg1[local269 + local293];
                                            }
                                            @Pc(331) boolean local331 = true;
                                            if (local293 == 0) {
                                                local331 = false;
                                            }
                                            if (local293 < 3 && local269 - 1 >= 0 && (!method624(anInt935, arg1[local269 - 1]) || arg1[local269 - 1] == '\'')) {
                                                local331 = false;
                                            }
                                            if (local331 && !method630(9, local291)) {
                                                local265 = true;
                                            }
                                        }
                                        local269++;
                                    }
                                    if (!local265) {
                                        var12 = false;
                                    }
                                }
                            } else {
                                var13 = ' ';
                                if (local14 - 1 >= 0) {
                                    var13 = arg1[local14 - 1];
                                }
                                var14 = ' ';
                                if (local18 < arg1.length) {
                                    var14 = arg1[local18];
                                }
                                @Pc(201) byte local201 = method620(var13, 0);
                                @Pc(205) byte local205 = method620(var14, 0);
                                if (arg2 != null && method617(local201, arg2, local205, -492)) {
                                    var12 = false;
                                }
                            }
                            if (var12) {
                                @Pc(381) int local381 = 0;
                                @Pc(383) int local383 = 0;
                                @Pc(385) int local385 = -1;
                                for (local269 = local14; local269 < local18; local269++) {
                                    if (method627(false, arg1[local269])) {
                                        local381++;
                                    } else if (method626(-893, arg1[local269])) {
                                        local383++;
                                        local385 = local269;
                                    }
                                }
                                if (local385 > -1) {
                                    local381 -= local18 - local385 - 1;
                                }
                                if (local381 <= local383) {
                                    for (@Pc(427) int local427 = local14; local427 < local18; local427++) {
                                        arg1[local427] = '*';
                                    }
                                } else {
                                    local24 = 1;
                                }
                            }
                        }
                    }
                }
            }
        } catch (@Pc(454) RuntimeException local454) {
            signlink.reporterror("6721, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local454.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[[BBI)Z")
    private static boolean method617(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
        try {
            @Pc(3) int local3 = 0;
            while (arg3 >= 0) {
                anInt933 = 209;
            }
            if (arg1[local3][0] == arg0 && arg1[local3][1] == arg2) {
                return true;
            }
            @Pc(30) int local30 = arg1.length - 1;
            if (arg1[local30][0] == arg0 && arg1[local30][1] == arg2) {
                return true;
            }
            do {
                @Pc(52) int local52 = (local3 + local30) / 2;
                if (arg1[local52][0] == arg0 && arg1[local52][1] == arg2) {
                    return true;
                }
                if (arg0 < arg1[local52][0] || arg0 == arg1[local52][0] && arg2 < arg1[local52][1]) {
                    local30 = local52;
                } else {
                    local3 = local52;
                }
            } while (local3 != local30 && local3 + 1 != local30);
            return false;
        } catch (@Pc(106) RuntimeException local106) {
            signlink.reporterror("71960, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local106.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(CCIC)I")
    private static int method618(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char arg3) {
        try {
            if (arg2 != -18503) {
                return anInt931;
            } else if (arg1 == arg3) {
                return 1;
            } else if (arg1 == 'o' && arg3 == '0') {
                return 1;
            } else if (arg1 == 'o' && arg3 == '(' && arg0 == ')') {
                return 2;
            } else if (arg1 == 'c' && (arg3 == '(' || arg3 == '<' || arg3 == '[')) {
                return 1;
            } else if (arg1 == 'e' && arg3 == '€') {
                return 1;
            } else if (arg1 == 's' && arg3 == '$') {
                return 1;
            } else if (arg1 == 'l' && arg3 == 'i') {
                return 1;
            } else {
                return 0;
            }
        } catch (@Pc(69) RuntimeException local69) {
            signlink.reporterror("37561, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local69.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(CCIC)I")
    private static int method619(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2, @OriginalArg(3) char arg3) {
        try {
            if (arg2 <= 0) {
                return 1;
            } else if (arg1 == arg3) {
                return 1;
            } else {
                if (arg1 >= 'a' && arg1 <= 'm') {
                    if (arg1 == 'a') {
                        if (arg3 != '4' && arg3 != '@' && arg3 != '^') {
                            if (arg3 == '/' && arg0 == '\\') {
                                return 2;
                            }
                            return 0;
                        }
                        return 1;
                    }
                    if (arg1 == 'b') {
                        if (arg3 != '6' && arg3 != '8') {
                            if ((arg3 != '1' || arg0 != '3') && (arg3 != 'i' || arg0 != '3')) {
                                return 0;
                            }
                            return 2;
                        }
                        return 1;
                    }
                    if (arg1 == 'c') {
                        if (arg3 != '(' && arg3 != '<' && arg3 != '{' && arg3 != '[') {
                            return 0;
                        }
                        return 1;
                    }
                    if (arg1 == 'd') {
                        if ((arg3 != '[' || arg0 != ')') && (arg3 != 'i' || arg0 != ')')) {
                            return 0;
                        }
                        return 2;
                    }
                    if (arg1 == 'e') {
                        if (arg3 != '3' && arg3 != '€') {
                            return 0;
                        }
                        return 1;
                    }
                    if (arg1 == 'f') {
                        if (arg3 == 'p' && arg0 == 'h') {
                            return 2;
                        }
                        if (arg3 == '£') {
                            return 1;
                        }
                        return 0;
                    }
                    if (arg1 == 'g') {
                        if (arg3 != '9' && arg3 != '6' && arg3 != 'q') {
                            return 0;
                        }
                        return 1;
                    }
                    if (arg1 == 'h') {
                        if (arg3 == '#') {
                            return 1;
                        }
                        return 0;
                    }
                    if (arg1 == 'i') {
                        if (arg3 != 'y' && arg3 != 'l' && arg3 != 'j' && arg3 != '1' && arg3 != '!' && arg3 != ':' && arg3 != ';' && arg3 != '|') {
                            return 0;
                        }
                        return 1;
                    }
                    if (arg1 == 'j') {
                        return 0;
                    }
                    if (arg1 == 'k') {
                        return 0;
                    }
                    if (arg1 == 'l') {
                        if (arg3 != '1' && arg3 != '|' && arg3 != 'i') {
                            return 0;
                        }
                        return 1;
                    }
                    if (arg1 == 'm') {
                        return 0;
                    }
                }
                if (arg1 >= 'n' && arg1 <= 'z') {
                    if (arg1 == 'n') {
                        return 0;
                    }
                    if (arg1 == 'o') {
                        if (arg3 != '0' && arg3 != '*') {
                            if ((arg3 != '(' || arg0 != ')') && (arg3 != '[' || arg0 != ']') && (arg3 != '{' || arg0 != '}') && (arg3 != '<' || arg0 != '>')) {
                                return 0;
                            }
                            return 2;
                        }
                        return 1;
                    }
                    if (arg1 == 'p') {
                        return 0;
                    }
                    if (arg1 == 'q') {
                        return 0;
                    }
                    if (arg1 == 'r') {
                        return 0;
                    }
                    if (arg1 == 's') {
                        if (arg3 != '5' && arg3 != 'z' && arg3 != '$' && arg3 != '2') {
                            return 0;
                        }
                        return 1;
                    }
                    if (arg1 == 't') {
                        if (arg3 != '7' && arg3 != '+') {
                            return 0;
                        }
                        return 1;
                    }
                    if (arg1 == 'u') {
                        if (arg3 == 'v') {
                            return 1;
                        }
                        if ((arg3 != '\\' || arg0 != '/') && (arg3 != '\\' || arg0 != '|') && (arg3 != '|' || arg0 != '/')) {
                            return 0;
                        }
                        return 2;
                    }
                    if (arg1 == 'v') {
                        if ((arg3 != '\\' || arg0 != '/') && (arg3 != '\\' || arg0 != '|') && (arg3 != '|' || arg0 != '/')) {
                            return 0;
                        }
                        return 2;
                    }
                    if (arg1 == 'w') {
                        if (arg3 == 'v' && arg0 == 'v') {
                            return 2;
                        }
                        return 0;
                    }
                    if (arg1 == 'x') {
                        if ((arg3 != ')' || arg0 != '(') && (arg3 != '}' || arg0 != '{') && (arg3 != ']' || arg0 != '[') && (arg3 != '>' || arg0 != '<')) {
                            return 0;
                        }
                        return 2;
                    }
                    if (arg1 == 'y') {
                        return 0;
                    }
                    if (arg1 == 'z') {
                        return 0;
                    }
                }
                if (arg1 >= '0' && arg1 <= '9') {
                    if (arg1 == '0') {
                        if (arg3 == 'o' || arg3 == 'O') {
                            return 1;
                        } else if ((arg3 != '(' || arg0 != ')') && (arg3 != '{' || arg0 != '}') && (arg3 != '[' || arg0 != ']')) {
                            return 0;
                        } else {
                            return 2;
                        }
                    } else if (arg1 == '1') {
                        return arg3 == 'l' ? 1 : 0;
                    } else {
                        return 0;
                    }
                } else if (arg1 == ',') {
                    return arg3 == '.' ? 1 : 0;
                } else if (arg1 == '.') {
                    return arg3 == ',' ? 1 : 0;
                } else if (arg1 == '!') {
                    return arg3 == 'i' ? 1 : 0;
                } else {
                    return 0;
                }
            }
        } catch (@Pc(512) RuntimeException local512) {
            signlink.reporterror("86145, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local512.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(CI)B")
    private static byte method620(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
        try {
            if (arg1 != 0) {
                aBoolean224 = !aBoolean224;
            }
            if (arg0 >= 'a' && arg0 <= 'z') {
                return (byte) (arg0 + 1 - 'a');
            } else if (arg0 == '\'') {
                return 28;
            } else if (arg0 >= '0' && arg0 <= '9') {
                return (byte) (arg0 + 29 - '0');
            } else {
                return 27;
            }
        } catch (@Pc(41) RuntimeException local41) {
            signlink.reporterror("65977, " + arg0 + ", " + arg1 + ", " + local41.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "([CB)V")
    private static void method621(@OriginalArg(0) char[] arg0, @OriginalArg(1) byte arg1) {
        try {
            @Pc(3) boolean local3 = false;
            @Pc(5) int local5 = 0;
            @Pc(7) int local7 = 0;
            @Pc(9) int local9 = 0;
            if (arg1 != 53) {
                anInt934 = -341;
            }
            while (true) {
                do {
                    @Pc(113) int local113;
                    if ((local113 = method622((byte) 9, arg0, local5)) == -1) {
                        return;
                    }
                    @Pc(18) boolean local18 = false;
                    for (@Pc(20) int local20 = local5; local20 >= 0 && local20 < local113 && !local18; local20++) {
                        if (!method624(anInt935, arg0[local20]) && !method625(true, arg0[local20])) {
                            local18 = true;
                        }
                    }
                    if (local18) {
                        local7 = 0;
                    }
                    if (local7 == 0) {
                        local9 = local113;
                    }
                    local5 = method623(local113, arg0, 0);
                    @Pc(59) int local59 = 0;
                    for (@Pc(61) int local61 = local113; local61 < local5; local61++) {
                        local59 = local59 * 10 + arg0[local61] - 48;
                    }
                    if (local59 <= 255 && local5 - local113 <= 8) {
                        local7++;
                    } else {
                        local7 = 0;
                    }
                } while (local7 != 4);
                for (@Pc(95) int local95 = local9; local95 < local5; local95++) {
                    arg0[local95] = '*';
                }
                local7 = 0;
            }
        } catch (@Pc(117) RuntimeException local117) {
            signlink.reporterror("62893, " + arg0 + ", " + arg1 + ", " + local117.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[CI)I")
    private static int method622(@OriginalArg(0) byte arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
        try {
            for (@Pc(3) int local3 = arg2; local3 < arg1.length && local3 >= 0; local3++) {
                if (arg1[local3] >= '0' && arg1[local3] <= '9') {
                    return local3;
                }
            }
            if (arg0 == aByte30) {
                @Pc(29) boolean local29 = false;
                return -1;
            } else {
                return 0;
            }
        } catch (@Pc(36) RuntimeException local36) {
            signlink.reporterror("63472, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local36.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[CI)I")
    private static int method623(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
        try {
            if (arg2 < 0 || arg2 > 0) {
                aBoolean223 = !aBoolean223;
            }
            @Pc(11) int local11 = arg0;
            while (true) {
                if (local11 < arg1.length && local11 >= 0) {
                    if (arg1[local11] >= '0' && arg1[local11] <= '9') {
                        local11++;
                        continue;
                    }
                    return local11;
                }
                return arg1.length;
            }
        } catch (@Pc(36) RuntimeException local36) {
            signlink.reporterror("81252, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local36.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IC)Z")
    private static boolean method624(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
        try {
            if (arg0 != 0) {
                throw new NullPointerException();
            }
            return !method626(-893, arg1) && !method627(false, arg1);
        } catch (@Pc(18) RuntimeException local18) {
            signlink.reporterror("8298, " + arg0 + ", " + arg1 + ", " + local18.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(ZC)Z")
    private static boolean method625(@OriginalArg(0) boolean arg0, @OriginalArg(1) char arg1) {
        try {
            if (!arg0) {
                for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
                }
            }
            if (arg1 >= 'a' && arg1 <= 'z') {
                return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
            } else {
                return true;
            }
        } catch (@Pc(36) RuntimeException local36) {
            signlink.reporterror("89891, " + arg0 + ", " + arg1 + ", " + local36.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IC)Z")
    private static boolean method626(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
        try {
            while (arg0 >= 0) {
                anInt934 = 116;
            }
            if (arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z') {
                return true;
            } else {
                return false;
            }
        } catch (@Pc(22) RuntimeException local22) {
            signlink.reporterror("33440, " + arg0 + ", " + arg1 + ", " + local22.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(ZC)Z")
    private static boolean method627(@OriginalArg(0) boolean arg0, @OriginalArg(1) char arg1) {
        try {
            if (arg0) {
                aBoolean224 = !aBoolean224;
            }
            return arg1 >= '0' && arg1 <= '9';
        } catch (@Pc(18) RuntimeException local18) {
            signlink.reporterror("46682, " + arg0 + ", " + arg1 + ", " + local18.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(CI)Z")
    private static boolean method628(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
        try {
            if (arg1 >= 0) {
                throw new NullPointerException();
            }
            return arg0 >= 'a' && arg0 <= 'z';
        } catch (@Pc(18) RuntimeException local18) {
            signlink.reporterror("55086, " + arg0 + ", " + arg1 + ", " + local18.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZ)Z")
    private static boolean method629(@OriginalArg(0) char arg0, @OriginalArg(1) boolean arg1) {
        try {
            if (!arg1) {
                throw new NullPointerException();
            }
            return arg0 >= 'A' && arg0 <= 'Z';
        } catch (@Pc(16) RuntimeException local16) {
            signlink.reporterror("94058, " + arg0 + ", " + arg1 + ", " + local16.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I[C)Z")
    private static boolean method630(@OriginalArg(0) int arg0, @OriginalArg(1) char[] arg1) {
        try {
            @Pc(3) boolean local3 = true;
            for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
                if (!method627(false, arg1[local5]) && arg1[local5] != '\u0000') {
                    local3 = false;
                }
            }
            if (local3) {
                return true;
            }
            @Pc(32) int local32 = method631(arg1, anInt937);
            @Pc(34) int local34 = 0;
            @Pc(39) int local39 = anIntArray254.length - 1;
            if (arg0 < anInt936 || arg0 > anInt936) {
                throw new NullPointerException();
            } else if (local32 == anIntArray254[local34] || local32 == anIntArray254[local39]) {
                return true;
            } else {
                do {
                    @Pc(67) int local67 = (local34 + local39) / 2;
                    if (local32 == anIntArray254[local67]) {
                        return true;
                    }
                    if (local32 < anIntArray254[local67]) {
                        local39 = local67;
                    } else {
                        local34 = local67;
                    }
                } while (local34 != local39 && local34 + 1 != local39);
                return false;
            }
        } catch (@Pc(96) RuntimeException local96) {
            signlink.reporterror("13370, " + arg0 + ", " + arg1 + ", " + local96.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "([CI)I")
    private static int method631(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
        try {
            if (arg0.length > 6) {
                return 0;
            }
            @Pc(9) int local9 = 0;
            for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
                @Pc(22) char local22 = arg0[arg0.length - local11 - 1];
                if (local22 >= 'a' && local22 <= 'z') {
                    local9 = local9 * 38 + local22 + 1 - 'a';
                } else if (local22 == '\'') {
                    local9 = local9 * 38 + 27;
                } else if (local22 >= '0' && local22 <= '9') {
                    local9 = local9 * 38 + local22 + 28 - '0';
                } else if (local22 != '\u0000') {
                    return 0;
                }
            }
            if (arg1 <= 0) {
                anInt937 = -415;
            }
            return local9;
        } catch (@Pc(85) RuntimeException local85) {
            signlink.reporterror("77769, " + arg0 + ", " + arg1 + ", " + local85.toString());
            throw new RuntimeException();
        }
    }
}
