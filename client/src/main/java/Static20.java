import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static20 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private static int anInt712;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method462(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			if (arg0 == 0) {
				@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(arg1.method666("flo.dat", null), -26728);
				anInt712 = local11.method482();
				if (aClass21Array1 == null) {
					aClass21Array1 = new Class21[anInt712];
				}
				for (@Pc(21) int local21 = 0; local21 < anInt712; local21++) {
					if (aClass21Array1[local21] == null) {
						aClass21Array1[local21] = new Class21();
					}
					aClass21Array1[local21].method463(local11, 8);
				}
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("171, " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}
}
