import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    private int anInt792;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public int anInt794;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "[I")
    public int[] anIntArray225;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
    public int[] anIntArray226;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
    private int[] anIntArray227;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "[I")
    public int[] anIntArray228;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public int anInt802;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    private int anInt803;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public int anInt795 = -1;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Z")
    public boolean aBoolean204 = false;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public int anInt796 = 5;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public int anInt797 = -1;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public int anInt798 = -1;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public int anInt799 = 99;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public int anInt800 = -1;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public int anInt801 = -1;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
    public int method506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        try {
            while (arg0 >= 0) {
                this.anInt792 = -245;
            }
            @Pc(11) int local11 = this.anIntArray227[arg1];
            if (local11 == 0) {
                @Pc(20) DelayedStateChange local20 = Static13.method305(true, this.anIntArray225[arg1]);
                if (local20 != null) {
                    local11 = this.anIntArray227[arg1] = local20.anInt542;
                }
            }
            if (local11 == 0) {
                local11 = 1;
            }
            return local11;
        } catch (@Pc(37) RuntimeException local37) {
            signlink.reporterror("38215, " + arg0 + ", " + arg1 + ", " + local37.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!lb;I)V")
    public void method507(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
        try {
            if (arg1 != 8) {
                this.anInt792 = -320;
            }
            while (true) {
                while (true) {
                    @Pc(10) int local10 = arg0.get1();
                    if (local10 == 0) {
                        if (this.anInt794 == 0) {
                            this.anInt794 = 1;
                            this.anIntArray225 = new int[1];
                            this.anIntArray225[0] = -1;
                            this.anIntArray226 = new int[1];
                            this.anIntArray226[0] = -1;
                            this.anIntArray227 = new int[1];
                            this.anIntArray227[0] = -1;
                        }
                        if (this.anInt800 == -1) {
                            if (this.anIntArray228 == null) {
                                this.anInt800 = 0;
                            } else {
                                this.anInt800 = 2;
                            }
                        }
                        if (this.anInt801 == -1) {
                            if (this.anIntArray228 != null) {
                                this.anInt801 = 2;
                                return;
                            }
                            this.anInt801 = 0;
                            return;
                        }
                        return;
                    }
                    @Pc(37) int local37;
                    if (local10 == 1) {
                        this.anInt794 = arg0.get1();
                        this.anIntArray225 = new int[this.anInt794];
                        this.anIntArray226 = new int[this.anInt794];
                        this.anIntArray227 = new int[this.anInt794];
                        for (local37 = 0; local37 < this.anInt794; local37++) {
                            this.anIntArray225[local37] = arg0.get2();
                            this.anIntArray226[local37] = arg0.get2();
                            if (this.anIntArray226[local37] == 65535) {
                                this.anIntArray226[local37] = -1;
                            }
                            this.anIntArray227[local37] = arg0.get2();
                        }
                    } else if (local10 == 2) {
                        this.anInt795 = arg0.get2();
                    } else if (local10 == 3) {
                        local37 = arg0.get1();
                        this.anIntArray228 = new int[local37 + 1];
                        for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
                            this.anIntArray228[local98] = arg0.get1();
                        }
                        this.anIntArray228[local37] = 9999999;
                    } else if (local10 == 4) {
                        this.aBoolean204 = true;
                    } else if (local10 == 5) {
                        this.anInt796 = arg0.get1();
                    } else if (local10 == 6) {
                        this.anInt797 = arg0.get2();
                    } else if (local10 == 7) {
                        this.anInt798 = arg0.get2();
                    } else if (local10 == 8) {
                        this.anInt799 = arg0.get1();
                    } else if (local10 == 9) {
                        this.anInt800 = arg0.get1();
                    } else if (local10 == 10) {
                        this.anInt801 = arg0.get1();
                    } else if (local10 == 11) {
                        this.anInt802 = arg0.get1();
                    } else if (local10 == 12) {
                        this.anInt803 = arg0.get4();
                    } else {
                        System.out.println("Error unrecognised seq config code: " + local10);
                    }
                }
            }
        } catch (@Pc(272) RuntimeException local272) {
            signlink.reporterror("26704, " + arg0 + ", " + arg1 + ", " + local272.toString());
            throw new RuntimeException();
        }
    }
}
