import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class SoftLruHashTable {

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    private int available;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    private int anInt184;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    private int anInt181 = 921;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    private int anInt528 = 18835;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "[Lclient!dc;")
    private ParticleEffectorType[] aParticleEffectorTypeArray1 = new ParticleEffectorType[10];

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
    public SoftLruHashTable(@OriginalArg(0) int capacity) {
        try {
            if (capacity >= 0) {
                throw new NullPointerException();
            }
        } catch (@Pc(18) RuntimeException local18) {
            signlink.reporterror("89172, " + capacity + ", " + local18.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!lb;I)V")
    public void method80(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
        try {
            for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
                @Pc(6) int local6 = arg0.method480();
                if (local6 != 0) {
                    arg0.anInt742--;
                    this.aParticleEffectorTypeArray1[local1] = new ParticleEffectorType();
                    this.aParticleEffectorTypeArray1[local1].method246(arg0, 8);
                }
            }
            if (arg1 != 8) {
                this.anInt181 = -128;
            }
            this.available = arg0.method482();
            this.anInt184 = arg0.method482();
        } catch (@Pc(48) RuntimeException local48) {
            signlink.reporterror("49815, " + arg0 + ", " + arg1 + ", " + local48.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
    public int method81(@OriginalArg(0) int arg0) {
        try {
            @Pc(3) int local3 = 9999999;
            if (arg0 != -36823) {
                return this.anInt181;
            }
            for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
                if (this.aParticleEffectorTypeArray1[local11] != null && this.aParticleEffectorTypeArray1[local11].anInt906 / 20 < local3) {
                    local3 = this.aParticleEffectorTypeArray1[local11].anInt906 / 20;
                }
            }
            if (this.available < this.anInt184 && this.available / 20 < local3) {
                local3 = this.available / 20;
            }
            if (local3 == 9999999 || local3 == 0) {
                return 0;
            }
            for (@Pc(64) int local64 = 0; local64 < 10; local64++) {
                if (this.aParticleEffectorTypeArray1[local64] != null) {
                    this.aParticleEffectorTypeArray1[local64].anInt906 -= local3 * 20;
                }
            }
            if (this.available < this.anInt184) {
                this.available -= local3 * 20;
                this.anInt184 -= local3 * 20;
            }
            return local3;
        } catch (@Pc(110) RuntimeException local110) {
            signlink.reporterror("23171, " + arg0 + ", " + local110.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!lb;")
    public Buffer method82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        try {
            @Pc(3) int local3 = this.method83(arg0);
            Static7.aSecondaryParticleLinkedList1.anInt742 = 0;
            Static7.aSecondaryParticleLinkedList1.method474(1380533830);
            Static7.aSecondaryParticleLinkedList1.method475((byte) 5, local3 + 36);
            Static7.aSecondaryParticleLinkedList1.method474(1463899717);
            Static7.aSecondaryParticleLinkedList1.method474(1718449184);
            Static7.aSecondaryParticleLinkedList1.method475((byte) 5, 16);
            Static7.aSecondaryParticleLinkedList1.method472(1, 0);
            Static7.aSecondaryParticleLinkedList1.method472(1, 0);
            Static7.aSecondaryParticleLinkedList1.method475((byte) 5, 22050);
            Static7.aSecondaryParticleLinkedList1.method475((byte) 5, 22050);
            Static7.aSecondaryParticleLinkedList1.method472(1, 0);
            Static7.aSecondaryParticleLinkedList1.method472(8, 0);
            Static7.aSecondaryParticleLinkedList1.method474(1684108385);
            Static7.aSecondaryParticleLinkedList1.method475((byte) 5, local3);
            if (arg1 != -33430) {
                this.anInt528 = 337;
            }
            Static7.aSecondaryParticleLinkedList1.anInt742 += local3;
            return Static7.aSecondaryParticleLinkedList1;
        } catch (@Pc(71) RuntimeException local71) {
            signlink.reporterror("26993, " + arg0 + ", " + arg1 + ", " + local71.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I")
    private int method83(@OriginalArg(0) int arg0) {
        @Pc(3) int local3 = 0;
        for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
            if (this.aParticleEffectorTypeArray1[local5] != null && this.aParticleEffectorTypeArray1[local5].anInt905 + this.aParticleEffectorTypeArray1[local5].anInt906 > local3) {
                local3 = this.aParticleEffectorTypeArray1[local5].anInt905 + this.aParticleEffectorTypeArray1[local5].anInt906;
            }
        }
        if (local3 == 0) {
            return 0;
        }
        @Pc(51) int local51 = local3 * 22050 / 1000;
        @Pc(58) int local58 = this.available * 22050 / 1000;
        @Pc(65) int local65 = this.anInt184 * 22050 / 1000;
        if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
            arg0 = 0;
        }
        @Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
        for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
            Static7.aByteArray1[local92] = -128;
        }
        @Pc(123) int local123;
        @Pc(133) int local133;
        @Pc(147) int local147;
        for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
            if (this.aParticleEffectorTypeArray1[local106] != null) {
                local123 = this.aParticleEffectorTypeArray1[local106].anInt905 * 22050 / 1000;
                local133 = this.aParticleEffectorTypeArray1[local106].anInt906 * 22050 / 1000;
                @Pc(145) int[] local145 = this.aParticleEffectorTypeArray1[local106].method244(local123, this.aParticleEffectorTypeArray1[local106].anInt905);
                for (local147 = 0; local147 < local123; local147++) {
                    Static7.aByteArray1[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
                }
            }
        }
        if (arg0 > 1) {
            local58 += 44;
            local65 += 44;
            local51 += 44;
            local90 += 44;
            local123 = local90 - local51;
            for (local133 = local51 - 1; local133 >= local65; local133--) {
                Static7.aByteArray1[local133 + local123] = Static7.aByteArray1[local133];
            }
            for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
                local123 = (local65 - local58) * local205;
                for (local147 = local58; local147 < local65; local147++) {
                    Static7.aByteArray1[local147 + local123] = Static7.aByteArray1[local147];
                }
            }
            local90 -= 44;
        }
        return local90;
    }
}
