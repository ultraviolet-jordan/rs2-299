import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pb")
public final class PcmSound {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!w;")
    private ObjStackNode anObjStackNode34;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Z")
    private boolean aBoolean208 = true;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    private int anInt825 = -22129;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!w;")
    private ObjStackNode anObjStackNode33 = new ObjStackNode();

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Z)V")
    public PcmSound(@OriginalArg(0) boolean arg0) {
        try {
            this.anObjStackNode33.anObjStackNode36 = this.anObjStackNode33;
            if (!arg0) {
                for (@Pc(21) int local21 = 1; local21 > 0; local21++) {
                }
            }
            this.anObjStackNode33.anObjStackNode37 = this.anObjStackNode33;
        } catch (@Pc(32) RuntimeException local32) {
            signlink.reporterror("15336, " + arg0 + ", " + local32.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!w;)V")
    public void method516(@OriginalArg(0) ObjStackNode arg0) {
        if (arg0.anObjStackNode37 != null) {
            arg0.close();
        }
        arg0.anObjStackNode37 = this.anObjStackNode33.anObjStackNode37;
        arg0.anObjStackNode36 = this.anObjStackNode33;
        arg0.anObjStackNode37.anObjStackNode36 = arg0;
        arg0.anObjStackNode36.anObjStackNode37 = arg0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()Lclient!w;")
    public ObjStackNode method517() {
        @Pc(3) ObjStackNode local3 = this.anObjStackNode33.anObjStackNode36;
        if (local3 == this.anObjStackNode33) {
            return null;
        } else {
            local3.close();
            return local3;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "()Lclient!w;")
    public ObjStackNode method518() {
        @Pc(3) ObjStackNode local3 = this.anObjStackNode33.anObjStackNode36;
        if (local3 == this.anObjStackNode33) {
            this.anObjStackNode34 = null;
            return null;
        } else {
            this.anObjStackNode34 = local3.anObjStackNode36;
            return local3;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lclient!w;")
    public ObjStackNode method519(@OriginalArg(0) int arg0) {
        try {
            if (arg0 != 0) {
                this.anInt825 = 491;
            }
            @Pc(7) ObjStackNode local7 = this.anObjStackNode34;
            if (local7 == this.anObjStackNode33) {
                this.anObjStackNode34 = null;
                return null;
            } else {
                this.anObjStackNode34 = local7.anObjStackNode36;
                return local7;
            }
        } catch (@Pc(23) RuntimeException local23) {
            signlink.reporterror("92444, " + arg0 + ", " + local23.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "()I")
    public int method520() {
        @Pc(1) int local1 = 0;
        for (@Pc(5) ObjStackNode local5 = this.anObjStackNode33.anObjStackNode36; local5 != this.anObjStackNode33; local5 = local5.anObjStackNode36) {
            local1++;
        }
        return local1;
    }
}
