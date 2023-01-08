import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class GlShader {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    private int GL_FRAGMENT_SHADER;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "[I")
    private int[] anIntArray156;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "[I")
    private int[] anIntArray157;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Ljava/lang/String;")
    public String aString23;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "[B")
    public byte[] aByteArray4;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "[I")
    private int[] anIntArray158;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "[I")
    private int[] anIntArray159;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public int anInt513;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public int anInt514;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "Z")
    public boolean aBoolean118;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
    public boolean aBoolean119;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
    public boolean aBoolean120;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Z")
    public boolean aBoolean121;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "Z")
    private boolean aBoolean122;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "Z")
    public boolean aBoolean123;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public int anInt515;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public int anInt516;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "B")
    private byte aByte14;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "B")
    private byte aByte15;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "[Ljava/lang/String;")
    public String[] aStringArray8;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public int anInt517;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public int anInt518;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
    private boolean aBoolean124;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "Z")
    public boolean aBoolean125;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    private int anInt519;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    private int anInt520;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    private int anInt521;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    private int anInt522;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    private int anInt523;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    private int anInt524;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public int anInt525;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "Z")
    public boolean aBoolean126;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "Z")
    private boolean aBoolean127;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    private int anInt526;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "[I")
    public int[] anIntArray160;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public int anInt527;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public int anInt528;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
    private boolean aBoolean116 = false;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "B")
    private byte aByte13 = -70;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public int anInt512 = -1;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
    public void method289() {
        this.anIntArray156 = null;
        this.anIntArray157 = null;
        this.aString23 = null;
        this.aByteArray4 = null;
        this.anIntArray158 = null;
        this.anIntArray159 = null;
        this.anInt513 = 1;
        this.anInt514 = 1;
        this.aBoolean118 = true;
        this.aBoolean119 = true;
        this.aBoolean120 = false;
        this.aBoolean121 = false;
        this.aBoolean122 = false;
        this.aBoolean123 = false;
        this.anInt515 = -1;
        this.anInt516 = 16;
        this.aByte14 = 0;
        this.aByte15 = 0;
        this.aStringArray8 = null;
        this.anInt517 = -1;
        this.anInt518 = -1;
        this.aBoolean124 = false;
        this.aBoolean125 = true;
        this.anInt519 = 128;
        this.anInt520 = 128;
        this.anInt521 = 128;
        this.anInt525 = 0;
        this.anInt522 = 0;
        this.anInt523 = 0;
        this.anInt524 = 0;
        this.aBoolean126 = false;
        this.aBoolean127 = false;
        this.anInt526 = -1;
        this.anInt527 = -1;
        this.anInt528 = -1;
        this.anIntArray160 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!lb;I)V")
    public void method290(@OriginalArg(0) SecondaryParticleLinkedList arg0, @OriginalArg(1) int arg1) {
        try {
            @Pc(3) int local3 = -1;
            if (arg1 < 8 || arg1 > 8) {
                throw new NullPointerException();
            }
            while (true) {
                @Pc(24) int local24;
                @Pc(36) int local36;
                do {
                    while (true) {
                        @Pc(16) int local16 = arg0.method480();
                        if (local16 == 0) {
                            if (local3 == -1) {
                                this.aBoolean120 = false;
                                if (this.anIntArray156 != null && (this.anIntArray157 == null || this.anIntArray157[0] == 10)) {
                                    this.aBoolean120 = true;
                                }
                                if (this.aStringArray8 != null) {
                                    this.aBoolean120 = true;
                                }
                            }
                            if (this.aBoolean127) {
                                this.aBoolean118 = false;
                                this.aBoolean119 = false;
                            }
                            if (this.anInt526 == -1) {
                                this.anInt526 = this.aBoolean118 ? 1 : 0;
                                return;
                            }
                            return;
                        }
                        if (local16 == 1) {
                            local24 = arg0.method480();
                            break;
                        }
                        if (local16 == 2) {
                            this.aString23 = arg0.method487();
                        } else if (local16 == 3) {
                            this.aByteArray4 = arg0.method488((byte) 6);
                        } else if (local16 == 5) {
                            local24 = arg0.method480();
                            if (local24 > 0) {
                                this.anIntArray157 = null;
                                this.anIntArray156 = new int[local24];
                                for (local36 = 0; local36 < local24; local36++) {
                                    this.anIntArray156[local36] = arg0.method482();
                                }
                            }
                        } else if (local16 == 14) {
                            this.anInt513 = arg0.method480();
                        } else if (local16 == 15) {
                            this.anInt514 = arg0.method480();
                        } else if (local16 == 17) {
                            this.aBoolean118 = false;
                        } else if (local16 == 18) {
                            this.aBoolean119 = false;
                        } else if (local16 == 19) {
                            local3 = arg0.method480();
                            if (local3 == 1) {
                                this.aBoolean120 = true;
                            }
                        } else if (local16 == 21) {
                            this.aBoolean121 = true;
                        } else if (local16 == 22) {
                            this.aBoolean122 = true;
                        } else if (local16 == 23) {
                            this.aBoolean123 = true;
                        } else if (local16 == 24) {
                            this.anInt515 = arg0.method482();
                            if (this.anInt515 == 65535) {
                                this.anInt515 = -1;
                            }
                        } else if (local16 == 28) {
                            this.anInt516 = arg0.method480();
                        } else if (local16 == 29) {
                            this.aByte14 = arg0.method481();
                        } else if (local16 == 39) {
                            this.aByte15 = arg0.method481();
                        } else if (local16 >= 30 && local16 < 39) {
                            if (this.aStringArray8 == null) {
                                this.aStringArray8 = new String[5];
                            }
                            this.aStringArray8[local16 - 30] = arg0.method487();
                            if (this.aStringArray8[local16 - 30].equalsIgnoreCase("hidden")) {
                                this.aStringArray8[local16 - 30] = null;
                            }
                        } else if (local16 == 40) {
                            local24 = arg0.method480();
                            this.anIntArray158 = new int[local24];
                            this.anIntArray159 = new int[local24];
                            for (local36 = 0; local36 < local24; local36++) {
                                this.anIntArray158[local36] = arg0.method482();
                                this.anIntArray159[local36] = arg0.method482();
                            }
                        } else if (local16 == 60) {
                            this.anInt517 = arg0.method482();
                        } else if (local16 == 62) {
                            this.aBoolean124 = true;
                        } else if (local16 == 64) {
                            this.aBoolean125 = false;
                        } else if (local16 == 65) {
                            this.anInt519 = arg0.method482();
                        } else if (local16 == 66) {
                            this.anInt520 = arg0.method482();
                        } else if (local16 == 67) {
                            this.anInt521 = arg0.method482();
                        } else if (local16 == 68) {
                            this.anInt518 = arg0.method482();
                        } else if (local16 == 69) {
                            this.anInt525 = arg0.method480();
                        } else if (local16 == 70) {
                            this.anInt522 = arg0.method483();
                        } else if (local16 == 71) {
                            this.anInt523 = arg0.method483();
                        } else if (local16 == 72) {
                            this.anInt524 = arg0.method483();
                        } else if (local16 == 73) {
                            this.aBoolean126 = true;
                        } else if (local16 == 74) {
                            this.aBoolean127 = true;
                        } else if (local16 == 75) {
                            this.anInt526 = arg0.method480();
                        } else if (local16 == 77) {
                            this.anInt527 = arg0.method482();
                            if (this.anInt527 == 65535) {
                                this.anInt527 = -1;
                            }
                            this.anInt528 = arg0.method482();
                            if (this.anInt528 == 65535) {
                                this.anInt528 = -1;
                            }
                            local24 = arg0.method480();
                            this.anIntArray160 = new int[local24 + 1];
                            for (local36 = 0; local36 <= local24; local36++) {
                                this.anIntArray160[local36] = arg0.method482();
                                if (this.anIntArray160[local36] == 65535) {
                                    this.anIntArray160[local36] = -1;
                                }
                            }
                        }
                    }
                } while (local24 <= 0);
                this.anIntArray157 = new int[local24];
                this.anIntArray156 = new int[local24];
                for (local36 = 0; local36 < local24; local36++) {
                    this.anIntArray156[local36] = arg0.method482();
                    this.anIntArray157[local36] = arg0.method480();
                }
            }
        } catch (@Pc(529) RuntimeException local529) {
            signlink.reporterror("44886, " + arg0 + ", " + arg1 + ", " + local529.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
    public boolean method291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        try {
            if (arg0 < 3 || arg0 > 3) {
                this.aBoolean116 = !this.aBoolean116;
            }
            if (this.anIntArray157 != null) {
                for (@Pc(54) int local54 = 0; local54 < this.anIntArray157.length; local54++) {
                    if (this.anIntArray157[local54] == arg1) {
                        return Static11.method262(this.anIntArray156[local54] & 0xFFFF);
                    }
                }
                return true;
            } else if (this.anIntArray156 == null) {
                return true;
            } else if (arg1 == 10) {
                @Pc(30) boolean local30 = true;
                for (@Pc(32) int local32 = 0; local32 < this.anIntArray156.length; local32++) {
                    local30 &= Static11.method262(this.anIntArray156[local32] & 0xFFFF);
                }
                return local30;
            } else {
                return true;
            }
        } catch (@Pc(79) RuntimeException local79) {
            signlink.reporterror("63602, " + arg0 + ", " + arg1 + ", " + local79.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)Z")
    public boolean method292(@OriginalArg(0) int arg0) {
        try {
            if (this.anIntArray156 == null) {
                return true;
            }
            @Pc(6) boolean local6 = true;
            for (@Pc(8) int local8 = 0; local8 < this.anIntArray156.length; local8++) {
                local6 &= Static11.method262(this.anIntArray156[local8] & 0xFFFF);
            }
            if (arg0 != 2) {
                throw new NullPointerException();
            }
            return local6;
        } catch (@Pc(36) RuntimeException local36) {
            signlink.reporterror("10989, " + arg0 + ", " + local36.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!ub;)V")
    public void method293(@OriginalArg(0) int arg0, @OriginalArg(1) DisplayMode arg1) {
        try {
            if (this.anIntArray156 != null) {
                for (@Pc(7) int local7 = 0; local7 < this.anIntArray156.length; local7++) {
                    arg1.method650(0, 47179, this.anIntArray156[local7] & 0xFFFF);
                }
                while (arg0 >= 0) {
                    for (@Pc(29) int local29 = 1; local29 > 0; local29++) {
                    }
                }
            }
        } catch (@Pc(38) RuntimeException local38) {
            signlink.reporterror("2515, " + arg0 + ", " + arg1 + ", " + local38.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Lclient!eb;")
    public Sound method294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
        @Pc(6) Sound local6 = this.method295(arg6, arg0, true, arg1);
        if (local6 == null) {
            return null;
        }
        if (this.aBoolean121 || this.aBoolean122) {
            local6 = new Sound(this.aBoolean121, local6, (byte) 80, this.aBoolean122);
        }
        if (this.aBoolean121) {
            @Pc(39) int local39 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (@Pc(41) int local41 = 0; local41 < local6.anInt490; local41++) {
                @Pc(48) int local48 = local6.anIntArray118[local41];
                @Pc(53) int local53 = local6.anIntArray120[local41];
                @Pc(65) int local65 = arg2 + (arg3 - arg2) * (local48 + 64) / 128;
                @Pc(77) int local77 = arg5 + (arg4 - arg5) * (local48 + 64) / 128;
                @Pc(89) int local89 = local65 + (local77 - local65) * (local53 + 64) / 128;
                local6.anIntArray119[local41] += local89 - local39;
            }
            local6.method266(this.GL_FRAGMENT_SHADER);
        }
        return local6;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZI)Lclient!eb;")
    private Sound method295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
        try {
            @Pc(3) Sound local3 = null;
            @Pc(26) long local26;
            @Pc(50) boolean local50;
            @Pc(56) int local56;
            @Pc(170) Sound local170;
            if (this.anIntArray157 == null) {
                if (arg1 != 10) {
                    return null;
                }
                local26 = (long) ((this.anInt512 << 6) + arg3) + ((long) (arg0 + 1) << 32);
                @Pc(31) Sound local31 = (Sound) Static12.aGlModel5.method591(local26);
                if (local31 != null) {
                    return local31;
                }
                if (this.anIntArray156 == null) {
                    return null;
                }
                local50 = this.aBoolean124 ^ arg3 > 3;
                @Pc(54) int local54 = this.anIntArray156.length;
                for (local56 = 0; local56 < local54; local56++) {
                    @Pc(62) int local62 = this.anIntArray156[local56];
                    if (local50) {
                        local62 += 65536;
                    }
                    local3 = (Sound) Static12.aGlModel4.method591((long) local62);
                    if (local3 == null) {
                        local3 = Static11.method261(true, local62 & 0xFFFF);
                        if (local3 == null) {
                            return null;
                        }
                        if (local50) {
                            local3.method276((byte) -72);
                        }
                        Static12.aGlModel4.method592((long) local62, local3, 10514);
                    }
                    if (local54 > 1) {
                        Static12.aSoundArray1[local56] = local3;
                    }
                }
                if (local54 > 1) {
                    local3 = new Sound(local54, -314, Static12.aSoundArray1);
                }
            } else {
                @Pc(121) int local121 = -1;
                for (@Pc(123) int local123 = 0; local123 < this.anIntArray157.length; local123++) {
                    if (this.anIntArray157[local123] == arg1) {
                        local121 = local123;
                        break;
                    }
                }
                if (local121 == -1) {
                    return null;
                }
                local26 = (long) ((this.anInt512 << 6) + (local121 << 3) + arg3) + ((long) (arg0 + 1) << 32);
                local170 = (Sound) Static12.aGlModel5.method591(local26);
                if (local170 != null) {
                    return local170;
                }
                local56 = this.anIntArray156[local121];
                @Pc(189) boolean local189 = this.aBoolean124 ^ arg3 > 3;
                if (local189) {
                    local56 += 65536;
                }
                local3 = (Sound) Static12.aGlModel4.method591((long) local56);
                if (local3 == null) {
                    local3 = Static11.method261(true, local56 & 0xFFFF);
                    if (local3 == null) {
                        return null;
                    }
                    if (local189) {
                        local3.method276((byte) -72);
                    }
                    Static12.aGlModel4.method592((long) local56, local3, 10514);
                }
            }
            @Pc(238) boolean local238;
            if (this.anInt519 == 128 && this.anInt520 == 128 && this.anInt521 == 128) {
                local238 = false;
            } else {
                local238 = true;
            }
            if (this.anInt522 == 0 && this.anInt523 == 0 && this.anInt524 == 0) {
                local50 = false;
            } else {
                local50 = true;
            }
            local170 = new Sound(Static13.method306(arg0, 45733), arg3 == 0 && arg0 == -1 && !local238 && !local50, this.anIntArray158 == null, local3, 0);
            if (arg0 != -1) {
                local170.method268(true);
                local170.method269(true, arg0);
                local170.anIntArrayArray9 = null;
                local170.anIntArrayArray8 = null;
            }
            while (arg3-- > 0) {
                local170.method272((byte) -125);
            }
            if (this.anIntArray158 != null) {
                for (local56 = 0; local56 < this.anIntArray158.length; local56++) {
                    local170.method275(this.anIntArray158[local56], this.anIntArray159[local56]);
                }
            }
            if (local238) {
                local170.method277(this.anInt519, this.anInt521, -34245, this.anInt520);
            }
            if (local50) {
                local170.method274(this.anInt523, false, this.anInt524, this.anInt522);
            }
            local170.method278(this.aByte14 + 64, this.aByte15 * 5 + 768, -50, -10, -50, !this.aBoolean122);
            if (!arg2) {
                throw new NullPointerException();
            }
            if (this.anInt526 == 1) {
                local170.anInt502 = local170.anInt977;
            }
            Static12.aGlModel5.method592(local26, local170, 10514);
            return local170;
        } catch (@Pc(396) RuntimeException local396) {
            signlink.reporterror("60674, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local396.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Lclient!ec;")
    public GlShader method296(@OriginalArg(0) byte arg0) {
        try {
            @Pc(1) int local1 = -1;
            if (arg0 != this.aByte13) {
                Static12.aBoolean117 = !Static12.aBoolean117;
            }
            if (this.anInt527 != -1) {
                @Pc(20) PathingEntity local20 = Static27.aPathingEntityArray1[this.anInt527];
                @Pc(23) int local23 = local20.anInt846;
                @Pc(26) int local26 = local20.anInt847;
                @Pc(29) int local29 = local20.anInt848;
                @Pc(35) int local35 = client.anIntArray48[local29 - local26];
                local1 = Static12.aClient2.anIntArray50[local23] >> local26 & local35;
            } else if (this.anInt528 != -1) {
                local1 = Static12.aClient2.anIntArray50[this.anInt528];
            }
            return local1 < 0 || local1 >= this.anIntArray160.length || this.anIntArray160[local1] == -1 ? null : Static12.method288(this.anIntArray160[local1]);
        } catch (@Pc(78) RuntimeException local78) {
            signlink.reporterror("32940, " + arg0 + ", " + local78.toString());
            throw new RuntimeException();
        }
    }
}
