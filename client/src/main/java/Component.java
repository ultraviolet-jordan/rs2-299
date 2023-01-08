import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Component {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void removeSoft(@OriginalArg(0) int arg0) {
        try {
            @Pc(5) int local5 = Static14.anInt695 * Static14.anInt696;
            @Pc(10) int local10;
            if (arg0 != 7) {
                for (local10 = 1; local10 > 0; local10++) {
                }
            }
            for (local10 = 0; local10 < local5; local10++) {
                Static14.anIntArray213[local10] = 0;
            }
        } catch (@Pc(29) RuntimeException local29) {
            signlink.reporterror("75218, " + arg0 + ", " + local29.toString());
            throw new RuntimeException();
        }
    }
}
