import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static20 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "[Lclient!kc;")
    public static GroundShadowModel[] aGroundShadowModelArray1;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!xb;)V")
    public static void method462(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
        try {
            if (arg0 == 0) {
                @Pc(11) Buffer local11 = new Buffer(arg1.method666("flo.dat", null), -26728);
                GroundShadowModel.textureId = local11.method482();
                if (aGroundShadowModelArray1 == null) {
                    aGroundShadowModelArray1 = new GroundShadowModel[GroundShadowModel.textureId];
                }
                for (@Pc(21) int local21 = 0; local21 < GroundShadowModel.textureId; local21++) {
                    if (aGroundShadowModelArray1[local21] == null) {
                        aGroundShadowModelArray1[local21] = new GroundShadowModel();
                    }
                    aGroundShadowModelArray1[local21].method463(local11, 8);
                }
            }
        } catch (@Pc(45) RuntimeException local45) {
            signlink.reporterror("171, " + arg0 + ", " + arg1 + ", " + local45.toString());
            throw new RuntimeException();
        }
    }
}
