import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static7 {

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[B")
    public static byte[] aByteArray1;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!lb;")
    public static Buffer aSecondaryParticleLinkedList1;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Z")
    private static boolean aBoolean36 = true;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "[Lclient!cc;")
    private static SoftLruHashTable[] aSoftLruHashTableArray1 = new SoftLruHashTable[5000];

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
    public static int[] anIntArray29 = new int[5000];

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!lb;)V")
    public static void method78(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
        try {
            aByteArray1 = new byte[441000];
            if (arg0 != 0) {
                aBoolean36 = !aBoolean36;
            }
            aSecondaryParticleLinkedList1 = new Buffer(aByteArray1, -26728);
            Static10.method243();
            while (true) {
                @Pc(20) int local20 = arg1.method482();
                if (local20 == 65535) {
                    return;
                }
                aSoftLruHashTableArray1[local20] = new SoftLruHashTable(-374);
                aSoftLruHashTableArray1[local20].method80(arg1, 8);
                anIntArray29[local20] = aSoftLruHashTableArray1[local20].method81(-36823);
            }
        } catch (@Pc(47) RuntimeException local47) {
            signlink.reporterror("12708, " + arg0 + ", " + arg1 + ", " + local47.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZII)Lclient!lb;")
    public static Buffer method79(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        try {
            if (!arg0) {
                for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
                }
            }
            if (aSoftLruHashTableArray1[arg2] == null) {
                return null;
            } else {
                @Pc(16) SoftLruHashTable local16 = aSoftLruHashTableArray1[arg2];
                return local16.method82(arg1, -33430);
            }
        } catch (@Pc(24) RuntimeException local24) {
            signlink.reporterror("4092, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local24.toString());
            throw new RuntimeException();
        }
    }
}
