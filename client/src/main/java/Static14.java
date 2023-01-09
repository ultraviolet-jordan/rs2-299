import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static14 {

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
	public static int anInt695;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	public static int anInt696;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public static int anInt697;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public static int anInt698;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public static int anInt699;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public static int anInt700;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt701;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt702;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	public static int anInt703;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Z")
	private static boolean aBoolean177 = true;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private static int anInt693 = 3;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Z")
	private static boolean aBoolean178 = true;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	private static int anInt694 = -636;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([IIII)V")
	public static void method434(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			anIntArray213 = arg0;
			anInt695 = arg2;
			anInt696 = arg1;
			method436(0, arg2, 0, (byte) 2, arg1);
			@Pc(15) int local15 = 16 / arg3;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("25479, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method435(@OriginalArg(0) boolean arg0) {
		try {
			anInt699 = 0;
			anInt697 = 0;
			if (!arg0) {
				aBoolean177 = !aBoolean177;
			}
			anInt700 = anInt695;
			anInt698 = anInt696;
			anInt701 = anInt700 - 1;
			anInt702 = anInt700 / 2;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("412, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIBI)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg1 > anInt695) {
				arg1 = anInt695;
			}
			if (arg4 > anInt696) {
				arg4 = anInt696;
			}
			anInt699 = arg0;
			anInt697 = arg2;
			anInt700 = arg1;
			if (arg3 != 2) {
				for (@Pc(28) int local28 = 1; local28 > 0; local28++) {
				}
			}
			anInt698 = arg4;
			anInt701 = anInt700 - 1;
			anInt702 = anInt700 / 2;
			anInt703 = anInt698 / 2;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("99294, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method437(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int local5 = anInt695 * anInt696;
			@Pc(10) int local10;
			if (arg0 != 7) {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
			for (local10 = 0; local10 < local5; local10++) {
				anIntArray213[local10] = 0;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("75218, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIZI)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg3 < anInt699) {
				arg0 -= anInt699 - arg3;
				arg3 = anInt699;
			}
			if (arg1 < anInt697) {
				arg2 -= anInt697 - arg1;
				arg1 = anInt697;
			}
			if (arg3 + arg0 > anInt700) {
				arg0 = anInt700 - arg3;
			}
			if (arg1 + arg2 > anInt698) {
				arg2 = anInt698 - arg1;
			}
			@Pc(45) int local45 = 256 - arg4;
			if (!arg5) {
				@Pc(56) int local56 = (arg6 >> 16 & 0xFF) * arg4;
				@Pc(64) int local64 = (arg6 >> 8 & 0xFF) * arg4;
				@Pc(70) int local70 = (arg6 & 0xFF) * arg4;
				@Pc(74) int local74 = anInt695 - arg0;
				@Pc(80) int local80 = arg3 + arg1 * anInt695;
				for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
					for (@Pc(87) int local87 = -arg0; local87 < 0; local87++) {
						@Pc(99) int local99 = (anIntArray213[local80] >> 16 & 0xFF) * local45;
						@Pc(109) int local109 = (anIntArray213[local80] >> 8 & 0xFF) * local45;
						@Pc(117) int local117 = (anIntArray213[local80] & 0xFF) * local45;
						@Pc(139) int local139 = (local56 + local99 >> 8 << 16) + (local64 + local109 >> 8 << 8) + (local70 + local117 >> 8);
						anIntArray213[local80++] = local139;
					}
					local80 += local74;
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("31231, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIZII)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (!arg3) {
				if (arg5 < anInt699) {
					arg4 -= anInt699 - arg5;
					arg5 = anInt699;
				}
				if (arg0 < anInt697) {
					arg1 -= anInt697 - arg0;
					arg0 = anInt697;
				}
				if (arg5 + arg4 > anInt700) {
					arg4 = anInt700 - arg5;
				}
				if (arg0 + arg1 > anInt698) {
					arg1 = anInt698 - arg0;
				}
				@Pc(48) int local48 = anInt695 - arg4;
				@Pc(54) int local54 = arg5 + arg0 * anInt695;
				for (@Pc(57) int local57 = -arg1; local57 < 0; local57++) {
					for (@Pc(62) int local62 = -arg4; local62 < 0; local62++) {
						anIntArray213[local54++] = arg2;
					}
					local54 += local48;
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("5998, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
	public static void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method442(arg1, 5, arg0, arg4, arg2);
			method442(arg1 + arg5 - 1, 5, arg0, arg4, arg2);
			method444(arg4, arg5, arg0, 11, arg1);
			if (arg3 <= 0) {
				anInt693 = -479;
			}
			method444(arg4, arg5, arg0 + arg2 - 1, 11, arg1);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("22477, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZIIII)V")
	public static void method441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			method443(arg1, arg5, arg0, arg6, arg3, (byte) 53);
			method443(arg1 + arg4 - 1, arg5, arg0, arg6, arg3, (byte) 53);
			if (arg2 && arg4 >= 3) {
				method445(true, arg5, arg0, arg1 + 1, arg4 - 2, arg3);
				method445(true, arg5 + arg6 - 1, arg0, arg1 + 1, arg4 - 2, arg3);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("75515, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 >= anInt697 && arg0 < anInt698) {
				if (arg2 < anInt699) {
					arg4 -= anInt699 - arg2;
					arg2 = anInt699;
				}
				if (arg2 + arg4 > anInt700) {
					arg4 = anInt700 - arg2;
				}
				@Pc(32) int local32 = arg2 + arg0 * anInt695;
				if (arg1 != 5) {
					anInt694 = -297;
				}
				for (@Pc(39) int local39 = 0; local39 < arg4; local39++) {
					anIntArray213[local32 + local39] = arg3;
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("10463, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIB)V")
	private static void method443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		try {
			if (arg0 >= anInt697 && arg0 < anInt698) {
				if (arg1 < anInt699) {
					arg3 -= anInt699 - arg1;
					arg1 = anInt699;
				}
				if (arg1 + arg3 > anInt700) {
					arg3 = anInt700 - arg1;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(38) int local38 = (arg2 >> 16 & 0xFF) * arg4;
				@Pc(46) int local46 = (arg2 >> 8 & 0xFF) * arg4;
				@Pc(52) int local52 = (arg2 & 0xFF) * arg4;
				@Pc(58) int local58 = arg1 + arg0 * anInt695;
				if (arg5 != 53) {
					anInt694 = -358;
				}
				for (@Pc(65) int local65 = 0; local65 < arg3; local65++) {
					@Pc(77) int local77 = (anIntArray213[local58] >> 16 & 0xFF) * local30;
					@Pc(87) int local87 = (anIntArray213[local58] >> 8 & 0xFF) * local30;
					@Pc(95) int local95 = (anIntArray213[local58] & 0xFF) * local30;
					@Pc(117) int local117 = (local38 + local77 >> 8 << 16) + (local46 + local87 >> 8 << 8) + (local52 + local95 >> 8);
					anIntArray213[local58++] = local117;
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("1989, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIII)V")
	public static void method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 >= anInt699 && arg2 < anInt700) {
				if (arg4 < anInt697) {
					arg1 -= anInt697 - arg4;
					arg4 = anInt697;
				}
				if (arg4 + arg1 > anInt698) {
					arg1 = anInt698 - arg4;
				}
				@Pc(32) int local32 = arg2 + arg4 * anInt695;
				if (arg3 <= 0) {
					aBoolean177 = !aBoolean177;
				}
				for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
					anIntArray213[local32 + local42 * anInt695] = arg0;
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("31159, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIIIII)V")
	private static void method445(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg1 >= anInt699 && arg1 < anInt700) {
				if (arg3 < anInt697) {
					arg4 -= anInt697 - arg3;
					arg3 = anInt697;
				}
				if (arg3 + arg4 > anInt698) {
					arg4 = anInt698 - arg3;
				}
				@Pc(30) int local30 = 256 - arg5;
				@Pc(38) int local38 = (arg2 >> 16 & 0xFF) * arg5;
				@Pc(46) int local46 = (arg2 >> 8 & 0xFF) * arg5;
				@Pc(52) int local52 = (arg2 & 0xFF) * arg5;
				@Pc(58) int local58 = arg1 + arg3 * anInt695;
				for (@Pc(60) int local60 = 0; local60 < arg4; local60++) {
					@Pc(72) int local72 = (anIntArray213[local58] >> 16 & 0xFF) * local30;
					@Pc(82) int local82 = (anIntArray213[local58] >> 8 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray213[local58] & 0xFF) * local30;
					@Pc(112) int local112 = (local38 + local72 >> 8 << 16) + (local46 + local82 >> 8 << 8) + (local52 + local90 >> 8);
					anIntArray213[local58] = local112;
					local58 += anInt695;
				}
				if (arg0) {
					;
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("30496, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}
}
