import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class1_Sub1_Sub2_Sub1 extends World {

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "[I")
    public static int[] anIntArray176 = new int[512];

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "[I")
    public static int[] anIntArray177 = new int[2048];

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "[I")
    public static int[] anIntArray178 = new int[2048];

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "[I")
    public static int[] anIntArray179 = new int[2048];

    static {
        for (@Pc(21) int local21 = 1; local21 < 512; local21++) {
            anIntArray176[local21] = 32768 / local21;
        }
        for (@Pc(34) int local34 = 1; local34 < 2048; local34++) {
            anIntArray177[local34] = 65536 / local34;
        }
        for (@Pc(47) int local47 = 0; local47 < 2048; local47++) {
            anIntArray178[local47] = (int) (Math.sin((double) local47 * 0.0030679615D) * 65536.0D);
            anIntArray179[local47] = (int) (Math.cos((double) local47 * 0.0030679615D) * 65536.0D);
        }
    }
}
