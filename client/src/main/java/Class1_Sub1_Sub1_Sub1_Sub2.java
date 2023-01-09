import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!z", name = "tb", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!z", name = "ub", descriptor = "Lclient!gc;")
	public Class13 aClass13_2;

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "Z")
	private boolean aBoolean246 = true;

	@OriginalMember(owner = "client!z", name = "sb", descriptor = "B")
	private byte aByte35 = -84;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass13_2 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub1_Sub5 local8 = this.method682(false);
			if (local8 == null) {
				return null;
			}
			super.anInt1020 = local8.anInt977;
			while (arg0 >= 0) {
				this.aBoolean246 = !this.aBoolean246;
			}
			if (super.anInt1007 != -1 && super.anInt1008 != -1) {
				@Pc(41) Class33 local41 = Static26.aClass33Array1[super.anInt1007];
				@Pc(44) Class1_Sub1_Sub1_Sub5 local44 = local41.method523();
				if (local44 != null) {
					@Pc(53) int local53 = local41.aClass27_2.anIntArray225[super.anInt1008];
					@Pc(64) Class1_Sub1_Sub1_Sub5 local64 = new Class1_Sub1_Sub1_Sub5(Static13.method306(local53, 45733), false, true, local44, 0);
					local64.method274(-super.anInt1011, false, 0, 0);
					local64.method268(true);
					local64.method269(true, local53);
					local64.anIntArrayArray9 = null;
					local64.anIntArrayArray8 = null;
					if (local41.anInt830 != 128 || local41.anInt831 != 128) {
						local64.method277(local41.anInt830, local41.anInt830, -34245, local41.anInt831);
					}
					local64.method278(local41.anInt833 + 64, local41.anInt834 + 850, -30, -50, -30, true);
					@Pc(127) Class1_Sub1_Sub1_Sub5[] local127 = new Class1_Sub1_Sub1_Sub5[] { local8, local64 };
					local8 = new Class1_Sub1_Sub1_Sub5(2, local127, (byte) 80, true);
				}
			}
			if (this.aClass13_2.aByte16 == 1) {
				local8.aBoolean114 = true;
			}
			return local8;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("82060, " + arg0 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method682(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(14) int local14;
			if (super.anInt1002 >= 0 && super.anInt1005 == 0) {
				local14 = Static24.aClass27Array1[super.anInt1002].anIntArray225[super.anInt1003];
				@Pc(16) int local16 = -1;
				if (super.anInt999 >= 0 && super.anInt999 != super.anInt983) {
					local16 = Static24.aClass27Array1[super.anInt999].anIntArray225[super.anInt1000];
				}
				return this.aClass13_2.method325(local16, Static24.aClass27Array1[super.anInt1002].anIntArray228, local14, false);
			}
			local14 = -1;
			if (arg0) {
				this.anInt1026 = 89;
			}
			if (super.anInt999 >= 0) {
				local14 = Static24.aClass27Array1[super.anInt999].anIntArray225[super.anInt1000];
			}
			return this.aClass13_2.method325(-1, null, local14, false);
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("44859, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method680(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != this.aByte35) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			return this.aClass13_2 != null;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("18349, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}
}
