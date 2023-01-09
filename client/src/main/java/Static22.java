import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static22 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt750;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method496(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg1.method666("idk.dat", null), -26728);
			@Pc(14) int local14;
			if (arg0 != 0) {
				for (local14 = 1; local14 > 0; local14++) {
				}
			}
			anInt750 = local10.method482();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt750];
			}
			for (local14 = 0; local14 < anInt750; local14++) {
				if (aClass23Array1[local14] == null) {
					aClass23Array1[local14] = new Class23();
				}
				aClass23Array1[local14].method497(local10, 8);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("93076, " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}
}
