import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class ModelParticleEffector {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "J")
    public long aLong33;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lclient!u;")
    public ModelParticleEffector aModelParticleEffector41;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!u;")
    public ModelParticleEffector aModelParticleEffector42;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public final void method1211() {
        if (this.aModelParticleEffector42 != null) {
            this.aModelParticleEffector42.aModelParticleEffector41 = this.aModelParticleEffector41;
            this.aModelParticleEffector41.aModelParticleEffector42 = this.aModelParticleEffector42;
            this.aModelParticleEffector41 = null;
            this.aModelParticleEffector42 = null;
        }
    }
}
