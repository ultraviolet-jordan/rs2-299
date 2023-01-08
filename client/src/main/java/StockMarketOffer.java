import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class StockMarketOffer {

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    private int anInt939;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Z")
    private boolean aBoolean225 = true;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    private int count;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "[Lclient!u;")
    private ModelParticleEffector[] aModelParticleEffectorArray1;

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
    public StockMarketOffer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        try {
            this.count = arg1;
            if (arg0 >= 0) {
                this.aBoolean225 = !this.aBoolean225;
            }
            this.aModelParticleEffectorArray1 = new ModelParticleEffector[arg1];
            for (@Pc(23) int local23 = 0; local23 < arg1; local23++) {
                @Pc(33) ModelParticleEffector local33 = this.aModelParticleEffectorArray1[local23] = new ModelParticleEffector();
                local33.aModelParticleEffector41 = local33;
                local33.aModelParticleEffector42 = local33;
            }
        } catch (@Pc(45) RuntimeException local45) {
            signlink.reporterror("37077, " + arg0 + ", " + arg1 + ", " + local45.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!u;")
    public ModelParticleEffector method632(@OriginalArg(0) long arg0) {
        @Pc(11) ModelParticleEffector local11 = this.aModelParticleEffectorArray1[(int) (arg0 & (long) (this.count - 1))];
        for (@Pc(14) ModelParticleEffector local14 = local11.aModelParticleEffector41; local14 != local11; local14 = local14.aModelParticleEffector41) {
            if (local14.aLong33 == arg0) {
                return local14;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!u;IJ)V")
    public void method633(@OriginalArg(0) ModelParticleEffector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
        try {
            if (arg0.aModelParticleEffector42 != null) {
                arg0.method1211();
            }
            @Pc(18) ModelParticleEffector local18 = this.aModelParticleEffectorArray1[(int) (arg2 & (long) (this.count - 1))];
            arg0.aModelParticleEffector42 = local18.aModelParticleEffector42;
            arg0.aModelParticleEffector41 = local18;
            arg0.aModelParticleEffector42.aModelParticleEffector41 = arg0;
            if (arg1 <= 0) {
                this.anInt939 = -333;
            }
            arg0.aModelParticleEffector41.aModelParticleEffector42 = arg0;
            arg0.aLong33 = arg2;
        } catch (@Pc(51) RuntimeException local51) {
            signlink.reporterror("1528, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local51.toString());
            throw new RuntimeException();
        }
    }
}
