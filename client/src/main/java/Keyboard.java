import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class Keyboard {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public void readPlayerInfoPacket(@OriginalArg(0) int arg0) {
    }
}
