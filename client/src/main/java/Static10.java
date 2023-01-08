import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "[I")
    public static int[] anIntArray106;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "[I")
    public static int[] anIntArray107;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "[I")
    public static int[] anIntArray108;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "[I")
    public static int[] anIntArray109 = new int[5];

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "[I")
    public static int[] anIntArray110 = new int[5];

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "[I")
    public static int[] anIntArray111 = new int[5];

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "[I")
    public static int[] anIntArray112 = new int[5];

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "[I")
    public static int[] anIntArray113 = new int[5];

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
    public static void method243() {
        anIntArray107 = new int[32768];
        for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
            if (Math.random() > 0.5D) {
                anIntArray107[local6] = 1;
            } else {
                anIntArray107[local6] = -1;
            }
        }
        anIntArray108 = new int[32768];
        for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
            anIntArray108[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
        }
        anIntArray106 = new int[220500];
    }
}
