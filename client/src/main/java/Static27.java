import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static27 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	private static int anInt845;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "[Lclient!qc;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method527(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg1.method666("varbit.dat", null), -26728);
			anInt845 = local10.method482();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt845];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt845; local20++) {
				if (aClass36Array1[local20] == null) {
					aClass36Array1[local20] = new Class36();
				}
				aClass36Array1[local20].method528(local20, 39196, local10);
				if (aClass36Array1[local20].aBoolean212) {
					Static30.aClass39Array1[aClass36Array1[local20].anInt846].aBoolean220 = true;
				}
			}
			if (arg0 != 0) {
				for (@Pc(60) int local60 = 1; local60 > 0; local60++) {
				}
			}
			if (local10.anInt742 != local10.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("75512, " + arg0 + ", " + arg1 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}
}
