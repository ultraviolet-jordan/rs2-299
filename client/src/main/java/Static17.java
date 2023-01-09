import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static17 {

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
	public static int anInt601;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
	private static int[] anIntArray184;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_7;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "[Lclient!hc;")
	private static Class15[] aClass15Array1;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	private static int anInt602;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	private static int anInt600 = 18835;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Z")
	public static boolean aBoolean152 = true;

	@OriginalMember(owner = "client!hc", name = "X", descriptor = "Lclient!s;")
	public static Class40 aClass40_7 = new Class40(-739, 50);

	@OriginalMember(owner = "client!hc", name = "Y", descriptor = "Lclient!s;")
	public static Class40 aClass40_8 = new Class40(-739, 100);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method359(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_7 = new Class1_Sub1_Sub3(arg0.method666("obj.dat", null), -26728);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method666("obj.idx", null), -26728);
		anInt601 = local19.method482();
		anIntArray184 = new int[anInt601];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt601; local29++) {
			anIntArray184[local29] = local27;
			local27 += local19.method482();
		}
		aClass15Array1 = new Class15[10];
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			aClass15Array1[local49] = new Class15();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method360(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				// aBoolean150 = true; Dead code.
			}
			aClass40_7 = null;
			aClass40_8 = null;
			anIntArray184 = null;
			aClass15Array1 = null;
			aClass1_Sub1_Sub3_7 = null;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("10336, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Lclient!hc;")
	public static Class15 method361(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass15Array1[local1].anInt603 == arg0) {
				return aClass15Array1[local1];
			}
		}
		anInt602 = (anInt602 + 1) % 10;
		@Pc(27) Class15 local27 = aClass15Array1[anInt602];
		aClass1_Sub1_Sub3_7.anInt742 = anIntArray184[arg0];
		local27.anInt603 = arg0;
		local27.method362();
		local27.method363(aClass1_Sub1_Sub3_7, 8);
		if (local27.anInt624 != -1) {
			local27.method364(-653);
		}
		if (!aBoolean152 && local27.aBoolean154) {
			local27.aString25 = "Members Object";
			local27.aByteArray6 = "Login to a members' server to use this object.".getBytes();
			local27.aStringArray10 = null;
			local27.aStringArray11 = null;
			local27.anInt630 = 0;
		}
		return local27;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)Lclient!ib;")
	public static Class1_Sub1_Sub2_Sub2 method367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(9) Class1_Sub1_Sub2_Sub2 local9;
			if (arg2 == 0) {
				local9 = (Class1_Sub1_Sub2_Sub2) aClass40_8.method591((long) arg3);
				if (local9 != null && local9.anInt657 != arg0 && local9.anInt657 != -1) {
					local9.method673();
					local9 = null;
				}
				if (local9 != null) {
					return local9;
				}
			}
			@Pc(30) Class15 local30 = method361(arg3);
			if (arg1 != 18835) {
				throw new NullPointerException();
			}
			if (local30.anIntArray187 == null) {
				arg0 = -1;
			}
			if (arg0 > 1) {
				@Pc(47) int local47 = -1;
				for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
					if (arg0 >= local30.anIntArray188[local49] && local30.anIntArray188[local49] != 0) {
						local47 = local30.anIntArray187[local49];
					}
				}
				if (local47 != -1) {
					local30 = method361(local47);
				}
			}
			@Pc(81) Class1_Sub1_Sub1_Sub5 local81 = local30.method365(1);
			if (local81 == null) {
				return null;
			}
			@Pc(87) Class1_Sub1_Sub2_Sub2 local87 = null;
			if (local30.anInt624 != -1) {
				local87 = method367(10, anInt600, -1, local30.anInt623);
				if (local87 == null) {
					return null;
				}
			}
			local9 = new Class1_Sub1_Sub2_Sub2(32, 32);
			@Pc(110) int local110 = Static16.anInt595;
			@Pc(112) int local112 = Static16.anInt596;
			@Pc(114) int[] local114 = Static16.anIntArray180;
			@Pc(116) int[] local116 = Static14.anIntArray213;
			@Pc(118) int local118 = Static14.anInt695;
			@Pc(120) int local120 = Static14.anInt696;
			@Pc(122) int local122 = Static14.anInt699;
			@Pc(124) int local124 = Static14.anInt700;
			@Pc(126) int local126 = Static14.anInt697;
			@Pc(128) int local128 = Static14.anInt698;
			Static16.aBoolean149 = false;
			Static14.method434(local9.anIntArray208, 32, 32, 234);
			Static14.method439(0, 32, 0, false, 32, 0);
			Static16.method343(3);
			@Pc(148) int local148 = local30.anInt605;
			if (arg2 == -1) {
				local148 = (int) ((double) local148 * 1.5D);
			}
			if (arg2 > 0) {
				local148 = (int) ((double) local148 * 1.04D);
			}
			@Pc(174) int local174 = Class1_Sub1_Sub2_Sub1.anIntArray178[local30.anInt606] * local148 >> 16;
			@Pc(183) int local183 = Class1_Sub1_Sub2_Sub1.anIntArray179[local30.anInt606] * local148 >> 16;
			local81.method281(0, local30.anInt607, local30.anInt608, local30.anInt606, local30.anInt609, local174 + local81.anInt977 / 2 + local30.anInt610, local183 + local30.anInt610);
			for (@Pc(209) int local209 = 31; local209 >= 0; local209--) {
				for (local183 = 31; local183 >= 0; local183--) {
					if (local9.anIntArray208[local209 + local183 * 32] == 0) {
						if (local209 > 0 && local9.anIntArray208[local209 + local183 * 32 - 1] > 1) {
							local9.anIntArray208[local209 + local183 * 32] = 1;
						} else if (local183 > 0 && local9.anIntArray208[local209 + (local183 - 1) * 32] > 1) {
							local9.anIntArray208[local209 + local183 * 32] = 1;
						} else if (local209 < 31 && local9.anIntArray208[local209 + local183 * 32 + 1] > 1) {
							local9.anIntArray208[local209 + local183 * 32] = 1;
						} else if (local183 < 31 && local9.anIntArray208[local209 + (local183 + 1) * 32] > 1) {
							local9.anIntArray208[local209 + local183 * 32] = 1;
						}
					}
				}
			}
			@Pc(334) int local334;
			if (arg2 > 0) {
				for (local334 = 31; local334 >= 0; local334--) {
					for (local183 = 31; local183 >= 0; local183--) {
						if (local9.anIntArray208[local334 + local183 * 32] == 0) {
							if (local334 > 0 && local9.anIntArray208[local334 + local183 * 32 - 1] == 1) {
								local9.anIntArray208[local334 + local183 * 32] = arg2;
							} else if (local183 > 0 && local9.anIntArray208[local334 + (local183 - 1) * 32] == 1) {
								local9.anIntArray208[local334 + local183 * 32] = arg2;
							} else if (local334 < 31 && local9.anIntArray208[local334 + local183 * 32 + 1] == 1) {
								local9.anIntArray208[local334 + local183 * 32] = arg2;
							} else if (local183 < 31 && local9.anIntArray208[local334 + (local183 + 1) * 32] == 1) {
								local9.anIntArray208[local334 + local183 * 32] = arg2;
							}
						}
					}
				}
			} else if (arg2 == 0) {
				for (local334 = 31; local334 >= 0; local334--) {
					for (local183 = 31; local183 >= 0; local183--) {
						if (local9.anIntArray208[local334 + local183 * 32] == 0 && local334 > 0 && local183 > 0 && local9.anIntArray208[local334 + (local183 - 1) * 32 - 1] > 0) {
							local9.anIntArray208[local334 + local183 * 32] = 3153952;
						}
					}
				}
			}
			if (local30.anInt624 != -1) {
				local334 = local87.anInt656;
				@Pc(518) int local518 = local87.anInt657;
				local87.anInt656 = 32;
				local87.anInt657 = 32;
				local87.method391(0, 0, 37651);
				local87.anInt656 = local334;
				local87.anInt657 = local518;
			}
			if (arg2 == 0) {
				aClass40_8.method592((long) arg3, local9, 10514);
			}
			Static14.method434(local116, local120, local118, 234);
			Static14.method436(local122, local124, local126, (byte) 2, local128);
			Static16.anInt595 = local110;
			Static16.anInt596 = local112;
			Static16.anIntArray180 = local114;
			Static16.aBoolean149 = true;
			if (local30.aBoolean153) {
				local9.anInt656 = 33;
			} else {
				local9.anInt656 = 32;
			}
			local9.anInt657 = arg0;
			return local9;
		} catch (@Pc(579) RuntimeException local579) {
			signlink.reporterror("39436, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local579.toString());
			throw new RuntimeException();
		}
	}
}
