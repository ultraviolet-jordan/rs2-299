import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static9 {

	@OriginalMember(owner = "client!d", name = "c", descriptor = "I")
	public static int anInt428;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "[Lclient!d;")
	public static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!d", name = "pb", descriptor = "Lclient!s;")
	private static Class40 aClass40_3;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Z")
	private static boolean aBoolean90 = true;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Z")
	private static boolean aBoolean91 = true;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "I")
	private static int anInt429 = -753;

	@OriginalMember(owner = "client!d", name = "ob", descriptor = "Lclient!s;")
	public static Class40 aClass40_2 = new Class40(-739, 30);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLclient!xb;Lclient!xb;[Lclient!kb;)V")
	public static void method231(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) Class1_Sub1_Sub2_Sub4[] arg3) {
		try {
			if (arg0) {
				aClass40_3 = new Class40(-739, 50000);
				@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg2.method666("data", null), -26728);
				@Pc(21) int local21 = -1;
				@Pc(24) int local24 = local19.method482();
				aClass6Array1 = new Class6[local24];
				while (true) {
					@Pc(49) Class6 local49;
					do {
						if (local19.anInt742 >= local19.aByteArray9.length) {
							aClass40_3 = null;
							return;
						}
						@Pc(32) int local32 = local19.method482();
						if (local32 == 65535) {
							local21 = local19.method482();
							local32 = local19.method482();
						}
						local49 = aClass6Array1[local32] = new Class6();
						local49.anInt432 = local32;
						local49.anInt433 = local21;
						local49.anInt434 = local19.method480();
						local49.anInt435 = local19.method480();
						local49.anInt436 = local19.method482();
						local49.anInt437 = local19.method482();
						local49.anInt438 = local19.method482();
						local49.aByte10 = (byte) local19.method480();
						local49.anInt441 = local19.method480();
						if (local49.anInt441 == 0) {
							local49.anInt441 = -1;
						} else {
							local49.anInt441 = (local49.anInt441 - 1 << 8) + local19.method480();
						}
						@Pc(106) int local106 = local19.method480();
						@Pc(118) int local118;
						if (local106 > 0) {
							local49.anIntArray96 = new int[local106];
							local49.anIntArray97 = new int[local106];
							for (local118 = 0; local118 < local106; local118++) {
								local49.anIntArray96[local118] = local19.method480();
								local49.anIntArray97[local118] = local19.method482();
							}
						}
						local118 = local19.method480();
						@Pc(147) int local147;
						@Pc(152) int local152;
						if (local118 > 0) {
							local49.anIntArrayArray7 = new int[local118][];
							for (local147 = 0; local147 < local118; local147++) {
								local152 = local19.method482();
								local49.anIntArrayArray7[local147] = new int[local152];
								for (@Pc(160) int local160 = 0; local160 < local152; local160++) {
									local49.anIntArrayArray7[local147][local160] = local19.method482();
								}
							}
						}
						if (local49.anInt434 == 0) {
							local49.anInt442 = local19.method482();
							local49.aBoolean92 = local19.method480() == 1;
							local147 = local19.method482();
							local49.anIntArray98 = new int[local147];
							local49.anIntArray99 = new int[local147];
							local49.anIntArray100 = new int[local147];
							for (local152 = 0; local152 < local147; local152++) {
								local49.anIntArray98[local152] = local19.method482();
								local49.anIntArray99[local152] = local19.method483();
								local49.anIntArray100[local152] = local19.method483();
							}
						}
						if (local49.anInt434 == 1) {
							local49.anInt444 = local19.method482();
							local49.aBoolean93 = local19.method480() == 1;
						}
						if (local49.anInt434 == 2) {
							local49.anIntArray94 = new int[local49.anInt437 * local49.anInt438];
							local49.anIntArray95 = new int[local49.anInt437 * local49.anInt438];
							local49.aBoolean94 = local19.method480() == 1;
							local49.aBoolean95 = local19.method480() == 1;
							local49.aBoolean96 = local19.method480() == 1;
							local49.aBoolean97 = local19.method480() == 1;
							local49.anInt445 = local19.method480();
							local49.anInt446 = local19.method480();
							local49.anIntArray101 = new int[20];
							local49.anIntArray102 = new int[20];
							local49.aClass1_Sub1_Sub2_Sub2Array8 = new Class1_Sub1_Sub2_Sub2[20];
							for (local147 = 0; local147 < 20; local147++) {
								local152 = local19.method480();
								if (local152 == 1) {
									local49.anIntArray101[local147] = local19.method483();
									local49.anIntArray102[local147] = local19.method483();
									@Pc(353) String local353 = local19.method487();
									if (arg1 != null && local353.length() > 0) {
										@Pc(362) int local362 = local353.lastIndexOf(",");
										local49.aClass1_Sub1_Sub2_Sub2Array8[local147] = method236(-753, arg1, Integer.parseInt(local353.substring(local362 + 1)), local353.substring(0, local362));
									}
								}
							}
							local49.aStringArray7 = new String[5];
							for (local152 = 0; local152 < 5; local152++) {
								local49.aStringArray7[local152] = local19.method487();
								if (local49.aStringArray7[local152].length() == 0) {
									local49.aStringArray7[local152] = null;
								}
							}
						}
						if (local49.anInt434 == 3) {
							local49.aBoolean98 = local19.method480() == 1;
						}
						if (local49.anInt434 == 4 || local49.anInt434 == 1) {
							local49.aBoolean99 = local19.method480() == 1;
							local147 = local19.method480();
							if (arg3 != null) {
								local49.aClass1_Sub1_Sub2_Sub4_5 = arg3[local147];
							}
							local49.aBoolean100 = local19.method480() == 1;
						}
						if (local49.anInt434 == 4) {
							local49.aString18 = local19.method487();
							local49.aString19 = local19.method487();
						}
						if (local49.anInt434 == 1 || local49.anInt434 == 3 || local49.anInt434 == 4) {
							local49.anInt447 = local19.method485();
						}
						if (local49.anInt434 == 3 || local49.anInt434 == 4) {
							local49.anInt448 = local19.method485();
							local49.anInt449 = local19.method485();
							local49.anInt450 = local19.method485();
						}
						if (local49.anInt434 == 5) {
							@Pc(516) String local516 = local19.method487();
							if (arg1 != null && local516.length() > 0) {
								local152 = local516.lastIndexOf(",");
								local49.aClass1_Sub1_Sub2_Sub2_14 = method236(-753, arg1, Integer.parseInt(local516.substring(local152 + 1)), local516.substring(0, local152));
							}
							local516 = local19.method487();
							if (arg1 != null && local516.length() > 0) {
								local152 = local516.lastIndexOf(",");
								local49.aClass1_Sub1_Sub2_Sub2_15 = method236(-753, arg1, Integer.parseInt(local516.substring(local152 + 1)), local516.substring(0, local152));
							}
						}
						if (local49.anInt434 == 6) {
							local32 = local19.method480();
							if (local32 != 0) {
								local49.anInt451 = 1;
								local49.anInt452 = (local32 - 1 << 8) + local19.method480();
							}
							local32 = local19.method480();
							if (local32 != 0) {
								local49.anInt453 = 1;
								local49.anInt454 = (local32 - 1 << 8) + local19.method480();
							}
							local32 = local19.method480();
							if (local32 == 0) {
								local49.anInt455 = -1;
							} else {
								local49.anInt455 = (local32 - 1 << 8) + local19.method480();
							}
							local32 = local19.method480();
							if (local32 == 0) {
								local49.anInt456 = -1;
							} else {
								local49.anInt456 = (local32 - 1 << 8) + local19.method480();
							}
							local49.anInt457 = local19.method482();
							local49.anInt458 = local19.method482();
							local49.anInt459 = local19.method482();
						}
						if (local49.anInt434 == 7) {
							local49.anIntArray94 = new int[local49.anInt437 * local49.anInt438];
							local49.anIntArray95 = new int[local49.anInt437 * local49.anInt438];
							local49.aBoolean99 = local19.method480() == 1;
							local147 = local19.method480();
							if (arg3 != null) {
								local49.aClass1_Sub1_Sub2_Sub4_5 = arg3[local147];
							}
							local49.aBoolean100 = local19.method480() == 1;
							local49.anInt447 = local19.method485();
							local49.anInt445 = local19.method483();
							local49.anInt446 = local19.method483();
							local49.aBoolean95 = local19.method480() == 1;
							local49.aStringArray7 = new String[5];
							for (local152 = 0; local152 < 5; local152++) {
								local49.aStringArray7[local152] = local19.method487();
								if (local49.aStringArray7[local152].length() == 0) {
									local49.aStringArray7[local152] = null;
								}
							}
						}
						if (local49.anInt435 == 2 || local49.anInt434 == 2) {
							local49.aString20 = local19.method487();
							local49.aString21 = local19.method487();
							local49.anInt460 = local19.method482();
						}
					} while (local49.anInt435 != 1 && local49.anInt435 != 4 && local49.anInt435 != 5 && local49.anInt435 != 6);
					local49.aString22 = local19.method487();
					if (local49.aString22.length() == 0) {
						if (local49.anInt435 == 1) {
							local49.aString22 = "Ok";
						}
						if (local49.anInt435 == 4) {
							local49.aString22 = "Select";
						}
						if (local49.anInt435 == 5) {
							local49.aString22 = "Select";
						}
						if (local49.anInt435 == 6) {
							local49.aString22 = "Continue";
						}
					}
				}
			}
		} catch (@Pc(839) RuntimeException local839) {
			signlink.reporterror("47426, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local839.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBILclient!eb;)V")
	public static void method235(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub1_Sub5 arg3) {
		try {
			aClass40_2.method593();
			if (arg1 != -94) {
				aBoolean90 = !aBoolean90;
			}
			if (arg3 != null && arg2 != 4) {
				aClass40_2.method592((long) ((arg2 << 16) + arg0), arg3, 10514);
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("9216, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!xb;ILjava/lang/String;)Lclient!ib;")
	private static Class1_Sub1_Sub2_Sub2 method236(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(8) long local8 = (Static37.method669(0, arg3) << 8) + (long) arg2;
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = (Class1_Sub1_Sub2_Sub2) aClass40_3.method591(local8);
			while (arg0 >= 0) {
				anInt428 = 363;
			}
			if (local13 != null) {
				return local13;
			}
			try {
				local13 = new Class1_Sub1_Sub2_Sub2(arg1, arg3, arg2);
				aClass40_3.method592(local8, local13, 10514);
				return local13;
			} catch (@Pc(37) Exception local37) {
				return null;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("81444, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}
}
