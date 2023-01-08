import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

    @OriginalMember(owner = "client!gc", name = "i", descriptor = "Ljava/lang/String;")
    public String aString24;

    @OriginalMember(owner = "client!gc", name = "j", descriptor = "[B")
    public byte[] aByteArray5;

    @OriginalMember(owner = "client!gc", name = "l", descriptor = "[I")
    private int[] anIntArray170;

    @OriginalMember(owner = "client!gc", name = "m", descriptor = "[I")
    private int[] anIntArray171;

    @OriginalMember(owner = "client!gc", name = "s", descriptor = "[I")
    private int[] anIntArray172;

    @OriginalMember(owner = "client!gc", name = "t", descriptor = "[I")
    private int[] anIntArray173;

    @OriginalMember(owner = "client!gc", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] aStringArray9;

    @OriginalMember(owner = "client!gc", name = "D", descriptor = "I")
    private int anInt569;

    @OriginalMember(owner = "client!gc", name = "E", descriptor = "I")
    private int anInt570;

    @OriginalMember(owner = "client!gc", name = "H", descriptor = "[I")
    public int[] anIntArray174;

    @OriginalMember(owner = "client!gc", name = "h", descriptor = "J")
    public long aLong23 = -1L;

    @OriginalMember(owner = "client!gc", name = "k", descriptor = "B")
    public byte aByte16 = 1;

    @OriginalMember(owner = "client!gc", name = "n", descriptor = "I")
    public int anInt558 = -1;

    @OriginalMember(owner = "client!gc", name = "o", descriptor = "I")
    public int anInt559 = -1;

    @OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
    public int anInt560 = -1;

    @OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
    public int anInt561 = -1;

    @OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
    public int anInt562 = -1;

    @OriginalMember(owner = "client!gc", name = "v", descriptor = "I")
    private int anInt563 = -1;

    @OriginalMember(owner = "client!gc", name = "w", descriptor = "I")
    private int anInt564 = -1;

    @OriginalMember(owner = "client!gc", name = "x", descriptor = "I")
    private int anInt565 = -1;

    @OriginalMember(owner = "client!gc", name = "y", descriptor = "Z")
    public boolean aBoolean139 = true;

    @OriginalMember(owner = "client!gc", name = "z", descriptor = "I")
    public int anInt566 = -1;

    @OriginalMember(owner = "client!gc", name = "A", descriptor = "I")
    private int anInt567 = 128;

    @OriginalMember(owner = "client!gc", name = "B", descriptor = "I")
    private int anInt568 = 128;

    @OriginalMember(owner = "client!gc", name = "C", descriptor = "Z")
    public boolean aBoolean140 = false;

    @OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
    public int anInt571 = -1;

    @OriginalMember(owner = "client!gc", name = "G", descriptor = "I")
    public int anInt572 = 32;

    @OriginalMember(owner = "client!gc", name = "I", descriptor = "I")
    private int anInt573 = -1;

    @OriginalMember(owner = "client!gc", name = "J", descriptor = "I")
    private int anInt574 = -1;

    @OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!lb;I)V")
    public void method324(@OriginalArg(0) SecondaryParticleLinkedList arg0, @OriginalArg(1) int arg1) {
        try {
            @Pc(9) int local9;
            if (arg1 < 8 || arg1 > 8) {
                for (local9 = 1; local9 > 0; local9++) {
                }
            }
            while (true) {
                while (true) {
                    local9 = arg0.method480();
                    if (local9 == 0) {
                        return;
                    }
                    @Pc(26) int local26;
                    @Pc(32) int local32;
                    if (local9 == 1) {
                        local26 = arg0.method480();
                        this.anIntArray170 = new int[local26];
                        for (local32 = 0; local32 < local26; local32++) {
                            this.anIntArray170[local32] = arg0.method482();
                        }
                    } else if (local9 == 2) {
                        this.aString24 = arg0.method487();
                    } else if (local9 == 3) {
                        this.aByteArray5 = arg0.method488((byte) 6);
                    } else if (local9 == 12) {
                        this.aByte16 = arg0.method481();
                    } else if (local9 == 13) {
                        this.anInt558 = arg0.method482();
                    } else if (local9 == 14) {
                        this.anInt559 = arg0.method482();
                    } else if (local9 == 17) {
                        this.anInt559 = arg0.method482();
                        this.anInt560 = arg0.method482();
                        this.anInt561 = arg0.method482();
                        this.anInt562 = arg0.method482();
                    } else if (local9 >= 30 && local9 < 40) {
                        if (this.aStringArray9 == null) {
                            this.aStringArray9 = new String[5];
                        }
                        this.aStringArray9[local9 - 30] = arg0.method487();
                        if (this.aStringArray9[local9 - 30].equalsIgnoreCase("hidden")) {
                            this.aStringArray9[local9 - 30] = null;
                        }
                    } else if (local9 == 40) {
                        local26 = arg0.method480();
                        this.anIntArray172 = new int[local26];
                        this.anIntArray173 = new int[local26];
                        for (local32 = 0; local32 < local26; local32++) {
                            this.anIntArray172[local32] = arg0.method482();
                            this.anIntArray173[local32] = arg0.method482();
                        }
                    } else if (local9 == 60) {
                        local26 = arg0.method480();
                        this.anIntArray171 = new int[local26];
                        for (local32 = 0; local32 < local26; local32++) {
                            this.anIntArray171[local32] = arg0.method482();
                        }
                    } else if (local9 == 90) {
                        this.anInt563 = arg0.method482();
                    } else if (local9 == 91) {
                        this.anInt564 = arg0.method482();
                    } else if (local9 == 92) {
                        this.anInt565 = arg0.method482();
                    } else if (local9 == 93) {
                        this.aBoolean139 = false;
                    } else if (local9 == 95) {
                        this.anInt566 = arg0.method482();
                    } else if (local9 == 97) {
                        this.anInt567 = arg0.method482();
                    } else if (local9 == 98) {
                        this.anInt568 = arg0.method482();
                    } else if (local9 == 99) {
                        this.aBoolean140 = true;
                    } else if (local9 == 100) {
                        this.anInt569 = arg0.method481();
                    } else if (local9 == 101) {
                        this.anInt570 = arg0.method481() * 5;
                    } else if (local9 == 102) {
                        this.anInt571 = arg0.method482();
                    } else if (local9 == 103) {
                        this.anInt572 = arg0.method482();
                    } else if (local9 == 106) {
                        this.anInt573 = arg0.method482();
                        if (this.anInt573 == 65535) {
                            this.anInt573 = -1;
                        }
                        this.anInt574 = arg0.method482();
                        if (this.anInt574 == 65535) {
                            this.anInt574 = -1;
                        }
                        local26 = arg0.method480();
                        this.anIntArray174 = new int[local26 + 1];
                        for (local32 = 0; local32 <= local26; local32++) {
                            this.anIntArray174[local32] = arg0.method482();
                            if (this.anIntArray174[local32] == 65535) {
                                this.anIntArray174[local32] = -1;
                            }
                        }
                    }
                }
            }
        } catch (@Pc(383) RuntimeException local383) {
            signlink.reporterror("76051, " + arg0 + ", " + arg1 + ", " + local383.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gc", name = "a", descriptor = "(I[IIZ)Lclient!eb;")
    public Sound method325(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
        try {
            if (this.anIntArray174 != null) {
                @Pc(8) Class13 local8 = this.method327(559);
                return local8 == null ? null : local8.method325(arg0, arg1, arg2, false);
            }
            @Pc(25) Sound local25 = (Sound) Static15.aGlModel6.method591(this.aLong23);
            if (arg3) {
                for (@Pc(29) int local29 = 1; local29 > 0; local29++) {
                }
            }
            if (local25 == null) {
                @Pc(38) boolean local38 = false;
                for (@Pc(40) int local40 = 0; local40 < this.anIntArray170.length; local40++) {
                    if (!Static11.method262(this.anIntArray170[local40])) {
                        local38 = true;
                    }
                }
                if (local38) {
                    return null;
                }
                @Pc(65) Sound[] local65 = new Sound[this.anIntArray170.length];
                for (@Pc(67) int local67 = 0; local67 < this.anIntArray170.length; local67++) {
                    local65[local67] = Static11.method261(true, this.anIntArray170[local67]);
                }
                if (local65.length == 1) {
                    local25 = local65[0];
                } else {
                    local25 = new Sound(local65.length, -314, local65);
                }
                if (this.anIntArray172 != null) {
                    for (@Pc(107) int local107 = 0; local107 < this.anIntArray172.length; local107++) {
                        local25.method275(this.anIntArray172[local107], this.anIntArray173[local107]);
                    }
                }
                local25.method268(true);
                local25.method278(this.anInt569 + 64, this.anInt570 + 850, -30, -50, -30, true);
                Static15.aGlModel6.method592(this.aLong23, local25, 10514);
            }
            @Pc(150) Sound local150 = Static11.aSound2;
            local150.method263(local25, false, Static13.method306(arg2, 45733) & Static13.method306(arg0, 45733));
            if (arg2 != -1 && arg0 != -1) {
                local150.method270(-13288, arg0, arg2, arg1);
            } else if (arg2 != -1) {
                local150.method269(true, arg2);
            }
            if (this.anInt567 != 128 || this.anInt568 != 128) {
                local150.method277(this.anInt567, this.anInt567, -34245, this.anInt568);
            }
            local150.method265(-246);
            local150.anIntArrayArray9 = null;
            local150.anIntArrayArray8 = null;
            if (this.aByte16 == 1) {
                local150.aBoolean114 = true;
            }
            return local150;
        } catch (@Pc(218) RuntimeException local218) {
            signlink.reporterror("66785, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local218.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gc", name = "c", descriptor = "(I)Lclient!eb;")
    public Sound method326(@OriginalArg(0) int arg0) {
        try {
            if (this.anIntArray174 != null) {
                @Pc(8) Class13 local8 = this.method327(559);
                return local8 == null ? null : local8.method326(-205);
            } else if (this.anIntArray171 == null) {
                return null;
            } else {
                @Pc(23) boolean local23 = false;
                if (arg0 >= 0) {
                    throw new NullPointerException();
                }
                for (@Pc(33) int local33 = 0; local33 < this.anIntArray171.length; local33++) {
                    if (!Static11.method262(this.anIntArray171[local33])) {
                        local23 = true;
                    }
                }
                if (local23) {
                    return null;
                }
                @Pc(58) Sound[] local58 = new Sound[this.anIntArray171.length];
                for (@Pc(60) int local60 = 0; local60 < this.anIntArray171.length; local60++) {
                    local58[local60] = Static11.method261(true, this.anIntArray171[local60]);
                }
                @Pc(85) Sound local85;
                if (local58.length == 1) {
                    local85 = local58[0];
                } else {
                    local85 = new Sound(local58.length, -314, local58);
                }
                if (this.anIntArray172 != null) {
                    for (@Pc(100) int local100 = 0; local100 < this.anIntArray172.length; local100++) {
                        local85.method275(this.anIntArray172[local100], this.anIntArray173[local100]);
                    }
                }
                return local85;
            }
        } catch (@Pc(121) RuntimeException local121) {
            signlink.reporterror("71278, " + arg0 + ", " + local121.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gc", name = "d", descriptor = "(I)Lclient!gc;")
    public Class13 method327(@OriginalArg(0) int arg0) {
        try {
            @Pc(3) int local3 = 33 / arg0;
            @Pc(5) int local5 = -1;
            if (this.anInt573 != -1) {
                @Pc(14) PathingEntity local14 = Static27.aPathingEntityArray1[this.anInt573];
                @Pc(17) int local17 = local14.anInt846;
                @Pc(20) int local20 = local14.anInt847;
                @Pc(23) int local23 = local14.anInt848;
                @Pc(29) int local29 = client.anIntArray48[local23 - local20];
                local5 = Static15.aClient4.anIntArray50[local17] >> local20 & local29;
            } else if (this.anInt574 != -1) {
                local5 = Static15.aClient4.anIntArray50[this.anInt574];
            }
            return local5 < 0 || local5 >= this.anIntArray174.length || this.anIntArray174[local5] == -1 ? null : Static15.method323(this.anIntArray174[local5]);
        } catch (@Pc(72) RuntimeException local72) {
            signlink.reporterror("25428, " + arg0 + ", " + local72.toString());
            throw new RuntimeException();
        }
    }
}
