import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "tb", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ab", name = "vb", descriptor = "I")
	private int anInt126;

	@OriginalMember(owner = "client!ab", name = "wb", descriptor = "I")
	public int anInt127;

	@OriginalMember(owner = "client!ab", name = "zb", descriptor = "I")
	public int anInt128;

	@OriginalMember(owner = "client!ab", name = "Ab", descriptor = "I")
	public int anInt129;

	@OriginalMember(owner = "client!ab", name = "Bb", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ab", name = "Cb", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!ab", name = "Db", descriptor = "I")
	public int anInt131;

	@OriginalMember(owner = "client!ab", name = "Eb", descriptor = "I")
	public int anInt132;

	@OriginalMember(owner = "client!ab", name = "Fb", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!ab", name = "Gb", descriptor = "I")
	public int anInt134;

	@OriginalMember(owner = "client!ab", name = "Hb", descriptor = "I")
	public int anInt135;

	@OriginalMember(owner = "client!ab", name = "Ib", descriptor = "Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ab", name = "Jb", descriptor = "I")
	public int anInt136;

	@OriginalMember(owner = "client!ab", name = "Kb", descriptor = "I")
	public int anInt137;

	@OriginalMember(owner = "client!ab", name = "Lb", descriptor = "I")
	public int anInt138;

	@OriginalMember(owner = "client!ab", name = "Mb", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!ab", name = "Pb", descriptor = "Lclient!gc;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "Qb", descriptor = "I")
	public int anInt140;

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "Z")
	private boolean aBoolean23 = true;

	@OriginalMember(owner = "client!ab", name = "sb", descriptor = "B")
	private byte aByte3 = -84;

	@OriginalMember(owner = "client!ab", name = "ub", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ab", name = "xb", descriptor = "[I")
	public int[] anIntArray13 = new int[12];

	@OriginalMember(owner = "client!ab", name = "yb", descriptor = "[I")
	public int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!ab", name = "Nb", descriptor = "Z")
	public boolean aBoolean25 = false;

	@OriginalMember(owner = "client!ab", name = "Ob", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!lb;)V")
	public void method39(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.anInt742 = 0;
			this.anInt126 = arg1.method480();
			this.anInt127 = arg1.method480();
			this.aClass13_1 = null;
			this.anInt140 = 0;
			@Pc(25) int local25;
			@Pc(37) int local37;
			@Pc(84) int local84;
			for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
				local25 = arg1.method480();
				if (local25 == 0) {
					this.anIntArray13[local20] = 0;
				} else {
					local37 = arg1.method480();
					this.anIntArray13[local20] = (local25 << 8) + local37;
					if (local20 == 0 && this.anIntArray13[0] == 65535) {
						this.aClass13_1 = Static15.method323(arg1.method482());
						break;
					}
					if (this.anIntArray13[local20] >= 512 && this.anIntArray13[local20] - 512 < Static17.anInt601) {
						local84 = Static17.method361(this.anIntArray13[local20] - 512).anInt630;
						if (local84 != 0) {
							this.anInt140 = local84;
						}
					}
				}
			}
			for (local25 = 0; local25 < 5; local25++) {
				local37 = arg1.method480();
				if (local37 < 0 || local37 >= Static8.anIntArrayArray3[local25].length) {
					local37 = 0;
				}
				this.anIntArray14[local25] = local37;
			}
			super.anInt983 = arg1.method482();
			if (super.anInt983 == 65535) {
				super.anInt983 = -1;
			}
			super.anInt984 = arg1.method482();
			if (super.anInt984 == 65535) {
				super.anInt984 = -1;
			}
			super.anInt985 = arg1.method482();
			if (super.anInt985 == 65535) {
				super.anInt985 = -1;
			}
			super.anInt986 = arg1.method482();
			if (super.anInt986 == 65535) {
				super.anInt986 = -1;
			}
			super.anInt987 = arg1.method482();
			if (super.anInt987 == 65535) {
				super.anInt987 = -1;
			}
			super.anInt988 = arg1.method482();
			if (super.anInt988 == 65535) {
				super.anInt988 = -1;
			}
			super.anInt989 = arg1.method482();
			if (super.anInt989 == 65535) {
				super.anInt989 = -1;
			}
			this.aString3 = Static37.method671(943, Static37.method668(0, arg1.method486(0)));
			this.anInt128 = arg1.method480();
			this.anInt129 = arg1.method482();
			this.aBoolean24 = true;
			this.aLong8 = 0L;
			for (local37 = 0; local37 < 12; local37++) {
				this.aLong8 <<= 0x4;
				if (this.anIntArray13[local37] >= 256) {
					this.aLong8 += this.anIntArray13[local37] - 256;
				}
			}
			if (this.anIntArray13[0] >= 256) {
				this.aLong8 += this.anIntArray13[0] - 256 >> 4;
			}
			if (this.anIntArray13[1] >= 256) {
				this.aLong8 += this.anIntArray13[1] - 256 >> 8;
			}
			for (local84 = 0; local84 < 5; local84++) {
				this.aLong8 <<= 0x3;
				this.aLong8 += this.anIntArray14[local84];
			}
			this.aLong8 <<= 0x1;
			this.aLong8 += this.anInt126;
			if (arg0 > 0) {
				;
			}
		} catch (@Pc(333) RuntimeException local333) {
			signlink.reporterror("45462, " + arg0 + ", " + arg1 + ", " + local333.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean24) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.method40(false);
			if (local10 == null) {
				return null;
			}
			super.anInt1020 = local10.anInt977;
			local10.aBoolean114 = true;
			if (arg0 >= 0) {
				throw new NullPointerException();
			} else if (this.aBoolean25) {
				return local10;
			} else {
				if (super.anInt1007 != -1 && super.anInt1008 != -1) {
					@Pc(47) Class33 local47 = Static26.aClass33Array1[super.anInt1007];
					@Pc(50) Class1_Sub1_Sub1_Sub5 local50 = local47.method523();
					if (local50 != null) {
						@Pc(64) Class1_Sub1_Sub1_Sub5 local64 = new Class1_Sub1_Sub1_Sub5(Static13.method306(super.anInt1008, 45733), false, true, local50, 0);
						local64.method274(-super.anInt1011, false, 0, 0);
						local64.method268(true);
						local64.method269(true, local47.aClass27_2.anIntArray225[super.anInt1008]);
						local64.anIntArrayArray9 = null;
						local64.anIntArrayArray8 = null;
						if (local47.anInt830 != 128 || local47.anInt831 != 128) {
							local64.method277(local47.anInt830, local47.anInt830, -34245, local47.anInt831);
						}
						local64.method278(local47.anInt833 + 64, local47.anInt834 + 850, -30, -50, -30, true);
						@Pc(132) Class1_Sub1_Sub1_Sub5[] local132 = new Class1_Sub1_Sub1_Sub5[] { local10, local64 };
						local10 = new Class1_Sub1_Sub1_Sub5(2, local132, (byte) 80, true);
					}
				}
				if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
					if (Static8.anInt297 >= this.anInt132) {
						this.aClass1_Sub1_Sub1_Sub5_1 = null;
					}
					if (Static8.anInt297 >= this.anInt131 && Static8.anInt297 < this.anInt132) {
						@Pc(161) Class1_Sub1_Sub1_Sub5 local161 = this.aClass1_Sub1_Sub1_Sub5_1;
						local161.method274(this.anInt134 - this.anInt130, false, this.anInt135 - super.anInt980, this.anInt133 - super.anInt979);
						if (super.anInt1021 == 512) {
							local161.method272((byte) -125);
							local161.method272((byte) -125);
							local161.method272((byte) -125);
						} else if (super.anInt1021 == 1024) {
							local161.method272((byte) -125);
							local161.method272((byte) -125);
						} else if (super.anInt1021 == 1536) {
							local161.method272((byte) -125);
						}
						@Pc(224) Class1_Sub1_Sub1_Sub5[] local224 = new Class1_Sub1_Sub1_Sub5[] { local10, local161 };
						local10 = new Class1_Sub1_Sub1_Sub5(2, local224, (byte) 80, true);
						if (super.anInt1021 == 512) {
							local161.method272((byte) -125);
						} else if (super.anInt1021 == 1024) {
							local161.method272((byte) -125);
							local161.method272((byte) -125);
						} else if (super.anInt1021 == 1536) {
							local161.method272((byte) -125);
							local161.method272((byte) -125);
							local161.method272((byte) -125);
						}
						local161.method274(this.anInt130 - this.anInt134, false, super.anInt980 - this.anInt135, super.anInt979 - this.anInt133);
					}
				}
				local10.aBoolean114 = true;
				return local10;
			}
		} catch (@Pc(290) RuntimeException local290) {
			signlink.reporterror("35011, " + arg0 + ", " + local290.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method40(@OriginalArg(0) boolean arg0) {
		try {
			if (this.aClass13_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt1002 >= 0 && super.anInt1005 == 0) {
					local6 = Static24.aClass27Array1[super.anInt1002].anIntArray225[super.anInt1003];
				} else if (super.anInt999 >= 0) {
					local6 = Static24.aClass27Array1[super.anInt999].anIntArray225[super.anInt1000];
				}
				return this.aClass13_1.method325(-1, null, local6, false);
			}
			@Pc(48) long local48 = this.aLong8;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (arg0) {
				for (@Pc(60) int local60 = 1; local60 > 0; local60++) {
				}
			}
			if (super.anInt1002 >= 0 && super.anInt1005 == 0) {
				@Pc(76) Class27 local76 = Static24.aClass27Array1[super.anInt1002];
				local50 = local76.anIntArray225[super.anInt1003];
				if (super.anInt999 >= 0 && super.anInt999 != super.anInt983) {
					local52 = Static24.aClass27Array1[super.anInt999].anIntArray225[super.anInt1000];
				}
				if (local76.anInt797 >= 0) {
					local54 = local76.anInt797;
					local48 += local54 - this.anIntArray13[5] << 8;
				}
				if (local76.anInt798 >= 0) {
					local56 = local76.anInt798;
					local48 += local56 - this.anIntArray13[3] << 16;
				}
			} else if (super.anInt999 >= 0) {
				local50 = Static24.aClass27Array1[super.anInt999].anIntArray225[super.anInt1000];
			}
			@Pc(154) Class1_Sub1_Sub1_Sub5 local154 = (Class1_Sub1_Sub1_Sub5) Static2.aClass40_1.method591(local48);
			@Pc(160) int local160;
			@Pc(167) int local167;
			if (local154 == null) {
				@Pc(158) boolean local158 = false;
				for (local160 = 0; local160 < 12; local160++) {
					local167 = this.anIntArray13[local160];
					if (local56 >= 0 && local160 == 3) {
						local167 = local56;
					}
					if (local54 >= 0 && local160 == 5) {
						local167 = local54;
					}
					if (local167 >= 256 && local167 < 512 && !Static22.aClass23Array1[local167 - 256].method498((byte) -41)) {
						local158 = true;
					}
					if (local167 >= 512 && !Static17.method361(local167 - 512).method368(this.anInt126, (byte) -59)) {
						local158 = true;
					}
				}
				if (local158) {
					if (this.aLong9 != -1L) {
						local154 = (Class1_Sub1_Sub1_Sub5) Static2.aClass40_1.method591(this.aLong9);
					}
					if (local154 == null) {
						return null;
					}
				}
			}
			if (local154 == null) {
				@Pc(237) Class1_Sub1_Sub1_Sub5[] local237 = new Class1_Sub1_Sub1_Sub5[12];
				local160 = 0;
				@Pc(248) int local248;
				for (local167 = 0; local167 < 12; local167++) {
					local248 = this.anIntArray13[local167];
					if (local56 >= 0 && local167 == 3) {
						local248 = local56;
					}
					if (local54 >= 0 && local167 == 5) {
						local248 = local54;
					}
					@Pc(276) Class1_Sub1_Sub1_Sub5 local276;
					if (local248 >= 256 && local248 < 512) {
						local276 = Static22.aClass23Array1[local248 - 256].method499(-514);
						if (local276 != null) {
							local237[local160++] = local276;
						}
					}
					if (local248 >= 512) {
						local276 = Static17.method361(local248 - 512).method369(false, this.anInt126);
						if (local276 != null) {
							local237[local160++] = local276;
						}
					}
				}
				local154 = new Class1_Sub1_Sub1_Sub5(local160, -314, local237);
				for (local248 = 0; local248 < 5; local248++) {
					if (this.anIntArray14[local248] != 0) {
						local154.method275(Static8.anIntArrayArray3[local248][0], Static8.anIntArrayArray3[local248][this.anIntArray14[local248]]);
						if (local248 == 1) {
							local154.method275(Static8.anIntArray58[0], Static8.anIntArray58[this.anIntArray14[local248]]);
						}
					}
				}
				local154.method268(true);
				local154.method278(64, 850, -30, -50, -30, true);
				Static2.aClass40_1.method592(local48, local154, 10514);
				this.aLong9 = local48;
			}
			if (this.aBoolean25) {
				return local154;
			}
			@Pc(381) Class1_Sub1_Sub1_Sub5 local381 = Static11.aClass1_Sub1_Sub1_Sub5_2;
			local381.method263(local154, false, Static13.method306(local50, 45733) & Static13.method306(local52, 45733));
			if (local50 != -1 && local52 != -1) {
				local381.method270(-13288, local52, local50, Static24.aClass27Array1[super.anInt1002].anIntArray228);
			} else if (local50 != -1) {
				local381.method269(true, local50);
			}
			local381.method265(-246);
			local381.anIntArrayArray9 = null;
			local381.anIntArrayArray8 = null;
			return local381;
		} catch (@Pc(429) RuntimeException local429) {
			signlink.reporterror("31078, " + arg0 + ", " + local429.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method41(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean24) {
				return null;
			} else if (this.aClass13_1 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray13[local18];
					if (local25 >= 256 && local25 < 512 && !Static22.aClass23Array1[local25 - 256].method500(875)) {
						local16 = true;
					}
					if (local25 >= 512 && !Static17.method361(local25 - 512).method370((byte) -50, this.anInt126)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class1_Sub1_Sub1_Sub5[] local66 = new Class1_Sub1_Sub1_Sub5[12];
				@Pc(68) int local68 = 0;
				for (@Pc(70) int local70 = 0; local70 < 12; local70++) {
					@Pc(77) int local77 = this.anIntArray13[local70];
					@Pc(91) Class1_Sub1_Sub1_Sub5 local91;
					if (local77 >= 256 && local77 < 512) {
						local91 = Static22.aClass23Array1[local77 - 256].method501(9);
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
					if (local77 >= 512) {
						local91 = Static17.method361(local77 - 512).method371(this.anInt126, false);
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
				}
				@Pc(128) Class1_Sub1_Sub1_Sub5 local128 = new Class1_Sub1_Sub1_Sub5(local68, -314, local66);
				for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
					if (this.anIntArray14[local130] != 0) {
						local128.method275(Static8.anIntArrayArray3[local130][0], Static8.anIntArrayArray3[local130][this.anIntArray14[local130]]);
						if (local130 == 1) {
							local128.method275(Static8.anIntArray58[0], Static8.anIntArray58[this.anIntArray14[local130]]);
						}
					}
				}
				if (arg0 != 0) {
					this.aBoolean23 = !this.aBoolean23;
				}
				return local128;
			} else {
				return this.aClass13_1.method326(-205);
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("75918, " + arg0 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method680(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != this.aByte3) {
				this.aBoolean23 = !this.aBoolean23;
			}
			return this.aBoolean24;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("31032, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}
}
