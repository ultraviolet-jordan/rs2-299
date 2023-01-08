import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static21 {

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    private static int anInt744;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    private static int anInt745;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    private static int anInt746;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int anInt741 = 663;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "[I")
    public static final int[] anIntArray220 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "Lclient!ob;")
    private static FrameBuffer aFrameBuffer4 = new FrameBuffer(6);

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "Lclient!ob;")
    private static FrameBuffer aFrameBuffer5 = new FrameBuffer(6);

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "Lclient!ob;")
    private static FrameBuffer aFrameBuffer6 = new FrameBuffer(6);

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "[C")
    private static char[] aCharArray1 = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)Lclient!lb;")
    public static SecondaryParticleLinkedList method468(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
        try {
            @Pc(3) FrameBuffer local3 = aFrameBuffer5;
            synchronized (aFrameBuffer5) {
                @Pc(7) SecondaryParticleLinkedList local7 = null;
                if (arg0 == 0 && anInt744 > 0) {
                    anInt744--;
                    local7 = (SecondaryParticleLinkedList) aFrameBuffer4.method510();
                } else if (arg0 == 1 && anInt745 > 0) {
                    anInt745--;
                    local7 = (SecondaryParticleLinkedList) aFrameBuffer5.method510();
                } else if (arg0 == 2 && anInt746 > 0) {
                    anInt746--;
                    local7 = (SecondaryParticleLinkedList) aFrameBuffer6.method510();
                }
                if (local7 != null) {
                    local7.anInt742 = 0;
                    return local7;
                }
            }
            if (arg1) {
                anInt741 = -68;
            }
            @Pc(73) SecondaryParticleLinkedList local73 = new SecondaryParticleLinkedList(true);
            local73.anInt742 = 0;
            if (arg0 == 0) {
                local73.aByteArray9 = new byte[100];
            } else if (arg0 == 1) {
                local73.aByteArray9 = new byte[5000];
            } else {
                local73.aByteArray9 = new byte[30000];
            }
            return local73;
        } catch (@Pc(100) RuntimeException local100) {
            signlink.reporterror("78377, " + arg0 + ", " + arg1 + ", " + local100.toString());
            throw new RuntimeException();
        }
    }
}
