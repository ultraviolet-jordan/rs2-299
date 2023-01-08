import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class ObjStackNode extends ModelParticleEffector {

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Lclient!w;")
    public ObjStackNode anObjStackNode36;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lclient!w;")
    public ObjStackNode anObjStackNode37;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
    public final void close() {
        if (this.anObjStackNode37 != null) {
            this.anObjStackNode37.anObjStackNode36 = this.anObjStackNode36;
            this.anObjStackNode36.anObjStackNode37 = this.anObjStackNode37;
            this.anObjStackNode36 = null;
            this.anObjStackNode37 = null;
        }
    }
}
