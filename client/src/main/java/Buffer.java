import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

import java.math.BigInteger;

@OriginalClass("client!lb")
public final class Buffer extends ObjStackNode {

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "[I")
    private static int[] anIntArray219 = new int[256];

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "[B")
    public byte[] aByteArray9;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public int anInt742;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public int anInt743;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "Lclient!wb;")
    public Js5CachedResourceProvider aJs5CachedResourceProvider2;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Z")
    private boolean aBoolean186 = true;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Z")
    private boolean aBoolean187 = false;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    private int anInt737 = 3;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Z")
    private boolean aBoolean188 = true;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    private int anInt738 = -161;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    private int anInt739 = -161;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Z")
    private boolean aBoolean189 = true;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    private int anInt740 = 320;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Z")
    private boolean aBoolean190 = true;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Z")
    private boolean aBoolean191 = false;

    static {
        for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
            @Pc(9) int local9 = local6;
            for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
                if ((local9 & 0x1) == 1) {
                    local9 = local9 >>> 1 ^ 0xEDB88320;
                } else {
                    local9 >>>= 0x1;
                }
            }
            anIntArray219[local6] = local9;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Z)V")
    public Buffer(@OriginalArg(0) boolean arg0) {
        try {
            if (!arg0) {
                throw new NullPointerException();
            }
        } catch (@Pc(38) RuntimeException local38) {
            signlink.reporterror("40647, " + arg0 + ", " + local38.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([BI)V")
    public Buffer(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
        try {
            this.aByteArray9 = arg0;
            if (arg1 != -26728) {
                for (@Pc(39) int local39 = 1; local39 > 0; local39++) {
                }
            }
            this.anInt742 = 0;
        } catch (@Pc(48) RuntimeException local48) {
            signlink.reporterror("74746, " + arg0 + ", " + arg1 + ", " + local48.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
    public void method469(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
        try {
            this.aByteArray9[this.anInt742++] = (byte) (arg1 + this.aJs5CachedResourceProvider2.method662());
            if (arg0) {
                ;
            }
        } catch (@Pc(19) RuntimeException local19) {
            signlink.reporterror("21690, " + arg0 + ", " + arg1 + ", " + local19.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public void method470(@OriginalArg(0) int arg0) {
        this.aByteArray9[this.anInt742++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public void clear(@OriginalArg(0) int arg0) {
        this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 8);
        this.aByteArray9[this.anInt742++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
    public void method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        try {
            this.aByteArray9[this.anInt742++] = (byte) arg0;
            if (arg1 != 0) {
                Static21.anInt741 = -12;
            }
            this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 8);
        } catch (@Pc(31) RuntimeException local31) {
            signlink.reporterror("56391, " + arg0 + ", " + arg1 + ", " + local31.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
    public void method473(@OriginalArg(0) int arg0) {
        this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 16);
        this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 8);
        this.aByteArray9[this.anInt742++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
    public void method474(@OriginalArg(0) int arg0) {
        this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 24);
        this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 16);
        this.aByteArray9[this.anInt742++] = (byte) (arg0 >> 8);
        this.aByteArray9[this.anInt742++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)V")
    public void method475(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
        try {
            this.aByteArray9[this.anInt742++] = (byte) arg1;
            this.aByteArray9[this.anInt742++] = (byte) (arg1 >> 8);
            this.aByteArray9[this.anInt742++] = (byte) (arg1 >> 16);
            if (arg0 == 5) {
                this.aByteArray9[this.anInt742++] = (byte) (arg1 >> 24);
            }
        } catch (@Pc(59) RuntimeException local59) {
            signlink.reporterror("69665, " + arg0 + ", " + arg1 + ", " + local59.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IJ)V")
    public void method476(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
        try {
            this.aByteArray9[this.anInt742++] = (byte) (arg1 >> 56);
            this.aByteArray9[this.anInt742++] = (byte) (arg1 >> 48);
            this.aByteArray9[this.anInt742++] = (byte) (arg1 >> 40);
            if (arg0 != -13398) {
                this.aBoolean186 = !this.aBoolean186;
            }
            this.aByteArray9[this.anInt742++] = (byte) (arg1 >> 32);
            this.aByteArray9[this.anInt742++] = (byte) (arg1 >> 24);
            this.aByteArray9[this.anInt742++] = (byte) (arg1 >> 16);
            this.aByteArray9[this.anInt742++] = (byte) (arg1 >> 8);
            this.aByteArray9[this.anInt742++] = (byte) arg1;
        } catch (@Pc(140) RuntimeException local140) {
            signlink.reporterror("29881, " + arg0 + ", " + arg1 + ", " + local140.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method477(@OriginalArg(0) String arg0) {
        arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt742);
        this.anInt742 += arg0.length();
        this.aByteArray9[this.anInt742++] = 10;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[BI)V")
    public void method478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
        try {
            if (arg3 != 0) {
                this.aBoolean186 = !this.aBoolean186;
            }
            for (@Pc(11) int local11 = arg0; local11 < arg0 + arg1; local11++) {
                this.aByteArray9[this.anInt742++] = arg2[local11];
            }
        } catch (@Pc(34) RuntimeException local34) {
            signlink.reporterror("38834, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local34.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
    public void method479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        try {
            this.aByteArray9[this.anInt742 - arg1 - 1] = (byte) arg1;
            if (arg0 != -28191) {
                this.aBoolean187 = !this.aBoolean187;
            }
        } catch (@Pc(23) RuntimeException local23) {
            signlink.reporterror("72300, " + arg0 + ", " + arg1 + ", " + local23.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "()I")
    public int method480() {
        return this.aByteArray9[this.anInt742++] & 0xFF;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "()B")
    public byte method481() {
        return this.aByteArray9[this.anInt742++];
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "()I")
    public int method482() {
        this.anInt742 += 2;
        return ((this.aByteArray9[this.anInt742 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt742 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "()I")
    public int method483() {
        this.anInt742 += 2;
        @Pc(27) int local27 = ((this.aByteArray9[this.anInt742 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt742 - 1] & 0xFF);
        if (local27 > 32767) {
            local27 -= 65536;
        }
        return local27;
    }

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "()I")
    public int method484() {
        this.anInt742 += 3;
        return ((this.aByteArray9[this.anInt742 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt742 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt742 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "()I")
    public int method485() {
        this.anInt742 += 4;
        return ((this.aByteArray9[this.anInt742 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt742 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt742 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt742 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)J")
    public long method486(@OriginalArg(0) int arg0) {
        try {
            @Pc(5) long local5 = (long) this.method485() & 0xFFFFFFFFL;
            @Pc(11) long local11 = (long) this.method485() & 0xFFFFFFFFL;
            if (arg0 != 0) {
                throw new NullPointerException();
            }
            return (local5 << 32) + local11;
        } catch (@Pc(24) RuntimeException local24) {
            signlink.reporterror("77952, " + arg0 + ", " + local24.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "()Ljava/lang/String;")
    public String method487() {
        @Pc(2) int local2 = this.anInt742;
        while (this.aByteArray9[this.anInt742++] != 10) {
        }
        return new String(this.aByteArray9, local2, this.anInt742 - local2 - 1);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)[B")
    public byte[] method488(@OriginalArg(0) byte arg0) {
        try {
            @Pc(10) int local10;
            if (arg0 == 6) {
                @Pc(6) boolean local6 = false;
            } else {
                for (local10 = 1; local10 > 0; local10++) {
                }
            }
            local10 = this.anInt742;
            while (this.aByteArray9[this.anInt742++] != 10) {
            }
            @Pc(39) byte[] local39 = new byte[this.anInt742 - local10 - 1];
            for (@Pc(41) int local41 = local10; local41 < this.anInt742 - 1; local41++) {
                local39[local41 - local10] = this.aByteArray9[local41];
            }
            return local39;
        } catch (@Pc(62) RuntimeException local62) {
            signlink.reporterror("66620, " + arg0 + ", " + local62.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[BB)V")
    public void method489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte arg3) {
        try {
            if (arg3 == 121) {
                for (@Pc(5) int local5 = arg1; local5 < arg1 + arg0; local5++) {
                    arg2[local5] = this.aByteArray9[this.anInt742++];
                }
            }
        } catch (@Pc(28) RuntimeException local28) {
            signlink.reporterror("55703, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local28.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
    public void method490(@OriginalArg(0) int arg0) {
        try {
            this.anInt743 = this.anInt742 * 8;
            if (arg0 != 0) {
                this.aBoolean187 = !this.aBoolean187;
            }
        } catch (@Pc(17) RuntimeException local17) {
            signlink.reporterror("21454, " + arg0 + ", " + local17.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)I")
    public int method491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        try {
            if (arg0 <= 0) {
                this.aBoolean186 = !this.aBoolean186;
            }
            @Pc(16) int local16 = this.anInt743 >> 3;
            @Pc(23) int local23 = 8 - (this.anInt743 & 0x7);
            @Pc(25) int local25 = 0;
            this.anInt743 += arg1;
            while (arg1 > local23) {
                local25 += (this.aByteArray9[local16++] & Static21.anIntArray220[local23]) << arg1 - local23;
                arg1 -= local23;
                local23 = 8;
            }
            if (arg1 == local23) {
                local25 += this.aByteArray9[local16] & Static21.anIntArray220[local23];
            } else {
                local25 += this.aByteArray9[local16] >> local23 - arg1 & Static21.anIntArray220[arg1];
            }
            return local25;
        } catch (@Pc(92) RuntimeException local92) {
            signlink.reporterror("46146, " + arg0 + ", " + arg1 + ", " + local92.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V")
    public void method492(@OriginalArg(0) int arg0) {
        try {
            this.anInt742 = (this.anInt743 + 7) / 8;
            @Pc(11) int local11 = 74 / arg0;
        } catch (@Pc(13) RuntimeException local13) {
            signlink.reporterror("1631, " + arg0 + ", " + local13.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "()I")
    public int method493() {
        @Pc(7) int local7 = this.aByteArray9[this.anInt742] & 0xFF;
        return local7 < 128 ? this.method480() - 64 : this.method482() - 49152;
    }

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "()I")
    public int method494() {
        @Pc(7) int local7 = this.aByteArray9[this.anInt742] & 0xFF;
        return local7 < 128 ? this.method480() : this.method482() - 32768;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method495(@OriginalArg(0) int arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) BigInteger arg2) {
        try {
            @Pc(2) int local2 = this.anInt742;
            this.anInt742 = 0;
            @Pc(8) byte[] local8 = new byte[local2];
            this.method489(local2, 0, local8, (byte) 121);
            @Pc(19) BigInteger local19 = new BigInteger(local8);
            if (arg0 >= 0 && arg0 <= 0) {
                @Pc(29) BigInteger local29 = local19.modPow(arg1, arg2);
                @Pc(32) byte[] local32 = local29.toByteArray();
                this.anInt742 = 0;
                this.method470(local32.length);
                this.method478(0, local32.length, local32, 0);
            }
        } catch (@Pc(48) RuntimeException local48) {
            signlink.reporterror("67746, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
            throw new RuntimeException();
        }
    }
}
