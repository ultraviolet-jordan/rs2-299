import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class PathingEntity {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/lang/String;")
    private String aString27;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public int anInt846;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public int anInt847;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public int anInt848;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    private int anInt850;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Z")
    public boolean aBoolean212 = false;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    private int anInt849 = -1;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!lb;)V")
    public void method528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
        try {
            if (arg1 == 39196) {
                while (true) {
                    @Pc(8) int local8 = arg2.get1();
                    if (local8 == 0) {
                        return;
                    }
                    if (local8 == 1) {
                        this.anInt846 = arg2.get2();
                        this.anInt847 = arg2.get1();
                        this.anInt848 = arg2.get1();
                    } else if (local8 == 10) {
                        this.aString27 = arg2.getString();
                    } else if (local8 == 2) {
                        this.aBoolean212 = true;
                    } else if (local8 == 3) {
                        this.anInt849 = arg2.get4();
                    } else if (local8 == 4) {
                        this.anInt850 = arg2.get4();
                    } else {
                        System.out.println("Error unrecognised config code: " + local8);
                    }
                }
            }
        } catch (@Pc(74) RuntimeException local74) {
            signlink.reporterror("19731, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local74.toString());
            throw new RuntimeException();
        }
    }
}
