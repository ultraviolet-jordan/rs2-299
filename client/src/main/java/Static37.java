import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static37 {

    @OriginalMember(owner = "client!yb", name = "a", descriptor = "Z")
    private static boolean aBoolean238 = true;

    @OriginalMember(owner = "client!yb", name = "b", descriptor = "Z")
    private static boolean aBoolean239 = true;

    @OriginalMember(owner = "client!yb", name = "c", descriptor = "Z")
    private static boolean aBoolean240 = true;

    @OriginalMember(owner = "client!yb", name = "d", descriptor = "B")
    private static byte aByte33 = -88;

    @OriginalMember(owner = "client!yb", name = "e", descriptor = "I")
    private static int anInt975 = 663;

    @OriginalMember(owner = "client!yb", name = "f", descriptor = "[C")
    private static final char[] aCharArray2 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    @OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method667(@OriginalArg(0) String arg0) {
        @Pc(3) long local3 = 0L;
        for (@Pc(5) int local5 = 0; local5 < arg0.length() && local5 < 12; local5++) {
            @Pc(11) char local11 = arg0.charAt(local5);
            local3 *= 37L;
            if (local11 >= 'A' && local11 <= 'Z') {
                local3 += local11 + 1 - 65;
            } else if (local11 >= 'a' && local11 <= 'z') {
                local3 += local11 + 1 - 97;
            } else if (local11 >= '0' && local11 <= '9') {
                local3 += local11 + 27 - 48;
            }
        }
        while (local3 % 37L == 0L && local3 != 0L) {
            local3 /= 37L;
        }
        return local3;
    }

    @OriginalMember(owner = "client!yb", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static String method668(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
        try {
            if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
                return "invalid_name";
            } else if (arg1 % 37L == 0L) {
                return "invalid_name";
            } else {
                @Pc(19) int local19 = 0;
                if (arg0 != 0) {
                    throw new NullPointerException();
                }
                @Pc(28) char[] local28 = new char[12];
                while (arg1 != 0L) {
                    @Pc(32) long local32 = arg1;
                    arg1 /= 37L;
                    local28[11 - local19++] = aCharArray2[(int) (local32 - arg1 * 37L)];
                }
                return new String(local28, 12 - local19, local19);
            }
        } catch (@Pc(64) RuntimeException local64) {
            signlink.reporterror("7249, " + arg0 + ", " + arg1 + ", " + local64.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!yb", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static long method669(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
        try {
            @Pc(4) String local4 = arg1.toUpperCase();
            @Pc(6) long local6 = 0L;
            @Pc(10) int local10;
            if (arg0 != 0) {
                for (local10 = 1; local10 > 0; local10++) {
                }
            }
            for (local10 = 0; local10 < local4.length(); local10++) {
                local6 = local6 * 61L + (long) local4.charAt(local10) - 32L;
                local6 = local6 + (local6 >> 56) & 0xFFFFFFFFFFFFFFL;
            }
            return local6;
        } catch (@Pc(46) RuntimeException local46) {
            signlink.reporterror("96215, " + arg0 + ", " + arg1 + ", " + local46.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!yb", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static String method670(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
        try {
            if (!arg1) {
                for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
                }
            }
            return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
        } catch (@Pc(42) RuntimeException local42) {
            signlink.reporterror("25356, " + arg0 + ", " + arg1 + ", " + local42.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!yb", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method671(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
        try {
            @Pc(3) int local3 = 92 / arg0;
            if (arg1.length() <= 0) {
                return arg1;
            }
            @Pc(9) char[] local9 = arg1.toCharArray();
            for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
                if (local9[local11] == '_') {
                    local9[local11] = ' ';
                    if (local11 + 1 < local9.length && local9[local11 + 1] >= 'a' && local9[local11 + 1] <= 'z') {
                        local9[local11 + 1] = (char) (local9[local11 + 1] + 'A' - 97);
                    }
                }
            }
            if (local9[0] >= 'a' && local9[0] <= 'z') {
                local9[0] = (char) (local9[0] + 'A' - 97);
            }
            return new String(local9);
        } catch (@Pc(91) RuntimeException local91) {
            signlink.reporterror("22098, " + arg0 + ", " + arg1 + ", " + local91.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method672(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
        try {
            if (arg1 >= 0) {
                for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
                }
            }
            @Pc(14) StringBuffer local14 = new StringBuffer();
            for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
                local14.append("*");
            }
            return local14.toString();
        } catch (@Pc(31) RuntimeException local31) {
            signlink.reporterror("56098, " + arg0 + ", " + arg1 + ", " + local31.toString());
            throw new RuntimeException();
        }
    }
}
