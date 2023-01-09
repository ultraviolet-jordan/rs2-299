import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static26 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Z")
	private static boolean aBoolean209;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	private static int anInt826;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[Lclient!pc;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!s;")
	public static Class40 aClass40_9 = new Class40(-739, 30);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method521(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg1.method666("spotanim.dat", null), -26728);
			anInt826 = local8.method482();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt826];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt826; local18++) {
				if (aClass33Array1[local18] == null) {
					aClass33Array1[local18] = new Class33();
				}
				aClass33Array1[local18].anInt827 = local18;
				aClass33Array1[local18].method522(local8, 8);
			}
			if (arg0 != 0) {
				aBoolean209 = !aBoolean209;
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("2768, " + arg0 + ", " + arg1 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}
}
