import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pb")
public final class Class32 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_34;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Z")
	private boolean aBoolean208 = true;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	private int anInt825 = -22129;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_33 = new Class1_Sub1();

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Z)V")
	public Class32(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass1_Sub1_33.aClass1_Sub1_36 = this.aClass1_Sub1_33;
			if (!arg0) {
				for (@Pc(21) int local21 = 1; local21 > 0; local21++) {
				}
			}
			this.aClass1_Sub1_33.aClass1_Sub1_37 = this.aClass1_Sub1_33;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("15336, " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!w;)V")
	public void method516(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_37 != null) {
			arg0.method674();
		}
		arg0.aClass1_Sub1_37 = this.aClass1_Sub1_33.aClass1_Sub1_37;
		arg0.aClass1_Sub1_36 = this.aClass1_Sub1_33;
		arg0.aClass1_Sub1_37.aClass1_Sub1_36 = arg0;
		arg0.aClass1_Sub1_36.aClass1_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()Lclient!w;")
	public Class1_Sub1 method517() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_33.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_33) {
			return null;
		} else {
			local3.method674();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "()Lclient!w;")
	public Class1_Sub1 method518() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_33.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_33) {
			this.aClass1_Sub1_34 = null;
			return null;
		} else {
			this.aClass1_Sub1_34 = local3.aClass1_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lclient!w;")
	public Class1_Sub1 method519(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.anInt825 = 491;
			}
			@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_34;
			if (local7 == this.aClass1_Sub1_33) {
				this.aClass1_Sub1_34 = null;
				return null;
			} else {
				this.aClass1_Sub1_34 = local7.aClass1_Sub1_36;
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
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_33.aClass1_Sub1_36; local5 != this.aClass1_Sub1_33; local5 = local5.aClass1_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
