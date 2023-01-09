import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class33 {

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	public int anInt827;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt832;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public int anInt833;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public int anInt834;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	private int anInt829 = -1;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
	private int[] anIntArray229 = new int[6];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "[I")
	private int[] anIntArray230 = new int[6];

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt830 = 128;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt831 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!lb;I)V")
	public void method522(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 8) {
				this.aBoolean210 = !this.aBoolean210;
			}
			while (true) {
				while (true) {
					@Pc(15) int local15 = arg0.method480();
					if (local15 == 0) {
						return;
					}
					if (local15 == 1) {
						this.anInt828 = arg0.method482();
					} else if (local15 == 2) {
						this.anInt829 = arg0.method482();
						if (Static24.aClass27Array1 != null) {
							this.aClass27_2 = Static24.aClass27Array1[this.anInt829];
						}
					} else if (local15 == 4) {
						this.anInt830 = arg0.method482();
					} else if (local15 == 5) {
						this.anInt831 = arg0.method482();
					} else if (local15 == 6) {
						this.anInt832 = arg0.method482();
					} else if (local15 == 7) {
						this.anInt833 = arg0.method480();
					} else if (local15 == 8) {
						this.anInt834 = arg0.method480();
					} else if (local15 >= 40 && local15 < 50) {
						this.anIntArray229[local15 - 40] = arg0.method482();
					} else if (local15 >= 50 && local15 < 60) {
						this.anIntArray230[local15 - 50] = arg0.method482();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local15);
					}
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("74146, " + arg0 + ", " + arg1 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method523() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) Static26.aClass40_9.method591((long) this.anInt827);
		if (local6 != null) {
			return local6;
		}
		local6 = Static11.method261(true, this.anInt828);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray229[0] != 0) {
				local6.method275(this.anIntArray229[local21], this.anIntArray230[local21]);
			}
		}
		Static26.aClass40_9.method592((long) this.anInt827, local6, 10514);
		return local6;
	}
}
