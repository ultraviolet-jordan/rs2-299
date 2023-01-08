import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class39 {

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Ljava/lang/String;")
    private String aString28;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    private int anInt890;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    private int anInt891;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public int anInt892;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    private int anInt893;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    private int anInt894;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Z")
    private boolean aBoolean217 = false;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
    private boolean aBoolean218 = true;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Z")
    private boolean aBoolean219 = false;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
    public boolean aBoolean220 = false;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    private int anInt895 = -1;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!lb;)V")
    public void method590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
        try {
            if (arg1 == 39196) {
                while (true) {
                    @Pc(8) int local8 = arg2.method480();
                    if (local8 == 0) {
                        return;
                    }
                    if (local8 == 1) {
                        this.anInt890 = arg2.method480();
                    } else if (local8 == 2) {
                        this.anInt891 = arg2.method480();
                    } else if (local8 == 3) {
                        this.aBoolean217 = true;
                        Static30.anIntArray247[NpcList.size++] = arg0;
                    } else if (local8 == 4) {
                        this.aBoolean218 = false;
                    } else if (local8 == 5) {
                        this.anInt892 = arg2.method482();
                    } else if (local8 == 6) {
                        this.aBoolean219 = true;
                    } else if (local8 == 7) {
                        this.anInt893 = arg2.method485();
                    } else if (local8 == 8) {
                        this.anInt894 = 1;
                        this.aBoolean220 = true;
                    } else if (local8 == 10) {
                        this.aString28 = arg2.method487();
                    } else if (local8 == 11) {
                        this.aBoolean220 = true;
                    } else if (local8 == 12) {
                        this.anInt895 = arg2.method485();
                    } else if (local8 == 13) {
                        this.anInt894 = 2;
                    } else {
                        System.out.println("Error unrecognised config code: " + local8);
                    }
                }
            }
        } catch (@Pc(135) RuntimeException local135) {
            signlink.reporterror("54006, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local135.toString());
            throw new RuntimeException();
        }
    }
}
