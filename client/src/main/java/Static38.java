import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static38 {

    @OriginalMember(owner = "client!zb", name = "a", descriptor = "Z")
    private static boolean aBoolean247 = true;

    @OriginalMember(owner = "client!zb", name = "b", descriptor = "I")
    private static int anInt1027 = -31809;

    @OriginalMember(owner = "client!zb", name = "c", descriptor = "[C")
    private static char[] aCharArray3 = new char[100];

    @OriginalMember(owner = "client!zb", name = "d", descriptor = "Lclient!lb;")
    private static Buffer aSecondaryParticleLinkedList8 = new Buffer(new byte[100], -26728);

    @OriginalMember(owner = "client!zb", name = "e", descriptor = "[C")
    private static char[] aCharArray4 = new char[]{' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']'};

    @OriginalMember(owner = "client!zb", name = "a", descriptor = "(ILclient!lb;I)Ljava/lang/String;")
    public static String method683(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2) {
        try {
            @Pc(3) int local3 = 0;
            @Pc(5) int local5 = -1;
            @Pc(18) int local18;
            for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
                @Pc(12) int local12 = arg1.get1();
                local18 = local12 >> 4 & 0xF;
                if (local5 != -1) {
                    aCharArray3[local3++] = aCharArray4[(local5 << 4) + local18 - 195];
                    local5 = -1;
                } else if (local18 < 13) {
                    aCharArray3[local3++] = aCharArray4[local18];
                } else {
                    local5 = local18;
                }
                local18 = local12 & 0xF;
                if (local5 != -1) {
                    aCharArray3[local3++] = aCharArray4[(local5 << 4) + local18 - 195];
                    local5 = -1;
                } else if (local18 < 13) {
                    aCharArray3[local3++] = aCharArray4[local18];
                } else {
                    local5 = local18;
                }
            }
            if (arg2 < 9 || arg2 > 9) {
                aBoolean247 = !aBoolean247;
            }
            @Pc(108) boolean local108 = true;
            for (local18 = 0; local18 < local3; local18++) {
                @Pc(116) char local116 = aCharArray3[local18];
                if (local108 && local116 >= 'a' && local116 <= 'z') {
                    aCharArray3[local18] = (char) (aCharArray3[local18] - 32);
                    local108 = false;
                }
                if (local116 == '.' || local116 == '!' || local116 == '?') {
                    local108 = true;
                }
            }
            return new String(aCharArray3, 0, local3);
        } catch (@Pc(157) RuntimeException local157) {
            signlink.reporterror("3424, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local157.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!zb", name = "a", descriptor = "(Lclient!lb;Ljava/lang/String;Z)V")
    public static void method684(@OriginalArg(0) Buffer arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
        try {
            if (arg1.length() > 80) {
                arg1 = arg1.substring(0, 80);
            }
            arg1 = arg1.toLowerCase();
            @Pc(15) int local15 = -1;
            for (@Pc(17) int local17 = 0; local17 < arg1.length(); local17++) {
                @Pc(23) char local23 = arg1.charAt(local17);
                @Pc(25) int local25 = 0;
                for (@Pc(27) int local27 = 0; local27 < aCharArray4.length; local27++) {
                    if (local23 == aCharArray4[local27]) {
                        local25 = local27;
                        break;
                    }
                }
                if (local25 > 12) {
                    local25 += 195;
                }
                if (local15 == -1) {
                    if (local25 < 13) {
                        local15 = local25;
                    } else {
                        arg0.put1(local25);
                    }
                } else if (local25 < 13) {
                    arg0.put1((local15 << 4) + local25);
                    local15 = -1;
                } else {
                    arg0.put1((local15 << 4) + (local25 >> 4));
                    local15 = local25 & 0xF;
                }
            }
            if (arg2) {
                anInt1027 = -320;
            }
            if (local15 != -1) {
                arg0.put1(local15 << 4);
            }
        } catch (@Pc(108) RuntimeException local108) {
            signlink.reporterror("30011, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local108.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!zb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method685(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
        try {
            aSecondaryParticleLinkedList8.anInt742 = 0;
            method684(aSecondaryParticleLinkedList8, arg1, false);
            @Pc(11) int local11 = aSecondaryParticleLinkedList8.anInt742;
            while (arg0 >= 0) {
                for (@Pc(15) int local15 = 1; local15 > 0; local15++) {
                }
            }
            aSecondaryParticleLinkedList8.anInt742 = 0;
            return method683(local11, aSecondaryParticleLinkedList8, 9);
        } catch (@Pc(33) RuntimeException local33) {
            signlink.reporterror("18253, " + arg0 + ", " + arg1 + ", " + local33.toString());
            throw new RuntimeException();
        }
    }
}
