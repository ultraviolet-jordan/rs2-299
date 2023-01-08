import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class ParticleNode extends ObjStackNode {

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public int anInt770;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public int index;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "[B")
    public byte[] aByteArray10;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public int anInt772;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Z")
    public boolean aBoolean195 = true;
}
