import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static24 {

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "[Lclient!nc;")
    public static Class27[] aClass27Array1;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!xb;)V")
    public static void method505(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
        try {
            @Pc(10) Buffer local10 = new Buffer(arg1.method666("seq.dat", null), -26728);
            @Pc(14) int local14;
            if (arg0 != 0) {
                for (local14 = 1; local14 > 0; local14++) {
                }
            }
            BufferPool.mediumBufferCount = local10.method482();
            if (aClass27Array1 == null) {
                aClass27Array1 = new Class27[BufferPool.mediumBufferCount];
            }
            for (local14 = 0; local14 < BufferPool.mediumBufferCount; local14++) {
                if (aClass27Array1[local14] == null) {
                    aClass27Array1[local14] = new Class27();
                }
                aClass27Array1[local14].method507(local10, 8);
            }
        } catch (@Pc(53) RuntimeException local53) {
            signlink.reporterror("29147, " + arg0 + ", " + arg1 + ", " + local53.toString());
            throw new RuntimeException();
        }
    }
}
