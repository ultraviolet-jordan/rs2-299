import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ob")
public final class FrameBuffer {

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!u;")
    private ModelParticleEffector aModelParticleEffector38;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Z")
    private boolean aBoolean207 = true;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    private int anInt810 = 530;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    private int anInt5195 = 9;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!u;")
    private ModelParticleEffector aModelParticleEffector37 = new ModelParticleEffector();

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
    public FrameBuffer(@OriginalArg(0) int arg0) {
        try {
            this.aModelParticleEffector37.aModelParticleEffector41 = this.aModelParticleEffector37;
            this.aModelParticleEffector37.aModelParticleEffector42 = this.aModelParticleEffector37;
            if (arg0 < 6 || arg0 > 6) {
                this.anInt5195 = -277;
            }
        } catch (@Pc(36) RuntimeException local36) {
            signlink.reporterror("32263, " + arg0 + ", " + local36.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!u;)V")
    public void method508(@OriginalArg(0) ModelParticleEffector arg0) {
        if (arg0.aModelParticleEffector42 != null) {
            arg0.method1211();
        }
        arg0.aModelParticleEffector42 = this.aModelParticleEffector37.aModelParticleEffector42;
        arg0.aModelParticleEffector41 = this.aModelParticleEffector37;
        arg0.aModelParticleEffector42.aModelParticleEffector41 = arg0;
        arg0.aModelParticleEffector41.aModelParticleEffector42 = arg0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!u;Z)V")
    public void method509(@OriginalArg(0) ModelParticleEffector arg0, @OriginalArg(1) boolean arg1) {
        try {
            if (arg0.aModelParticleEffector42 != null) {
                arg0.method1211();
            }
            arg0.aModelParticleEffector42 = this.aModelParticleEffector37;
            arg0.aModelParticleEffector41 = this.aModelParticleEffector37.aModelParticleEffector41;
            if (arg1) {
                arg0.aModelParticleEffector42.aModelParticleEffector41 = arg0;
                arg0.aModelParticleEffector41.aModelParticleEffector42 = arg0;
            }
        } catch (@Pc(26) RuntimeException local26) {
            signlink.reporterror("99958, " + arg0 + ", " + arg1 + ", " + local26.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()Lclient!u;")
    public ModelParticleEffector method510() {
        @Pc(3) ModelParticleEffector local3 = this.aModelParticleEffector37.aModelParticleEffector41;
        if (local3 == this.aModelParticleEffector37) {
            return null;
        } else {
            local3.method1211();
            return local3;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "()Lclient!u;")
    public ModelParticleEffector method511() {
        @Pc(3) ModelParticleEffector local3 = this.aModelParticleEffector37.aModelParticleEffector41;
        if (local3 == this.aModelParticleEffector37) {
            this.aModelParticleEffector38 = null;
            return null;
        } else {
            this.aModelParticleEffector38 = local3.aModelParticleEffector41;
            return local3;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lclient!u;")
    public ModelParticleEffector method512(@OriginalArg(0) int arg0) {
        try {
            @Pc(3) ModelParticleEffector local3 = this.aModelParticleEffector37.aModelParticleEffector42;
            if (arg0 != 8) {
                throw new NullPointerException();
            } else if (local3 == this.aModelParticleEffector37) {
                this.aModelParticleEffector38 = null;
                return null;
            } else {
                this.aModelParticleEffector38 = local3.aModelParticleEffector42;
                return local3;
            }
        } catch (@Pc(26) RuntimeException local26) {
            signlink.reporterror("11139, " + arg0 + ", " + local26.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Lclient!u;")
    public ModelParticleEffector method513(@OriginalArg(0) int arg0) {
        try {
            @Pc(2) ModelParticleEffector local2 = this.aModelParticleEffector38;
            if (local2 == this.aModelParticleEffector37) {
                this.aModelParticleEffector38 = null;
                return null;
            }
            this.aModelParticleEffector38 = local2.aModelParticleEffector41;
            if (arg0 != 0) {
                this.aBoolean207 = !this.aBoolean207;
            }
            return local2;
        } catch (@Pc(28) RuntimeException local28) {
            signlink.reporterror("62942, " + arg0 + ", " + local28.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)Lclient!u;")
    public ModelParticleEffector method514(@OriginalArg(0) int arg0) {
        try {
            if (arg0 <= 0) {
                throw new NullPointerException();
            }
            @Pc(8) ModelParticleEffector local8 = this.aModelParticleEffector38;
            if (local8 == this.aModelParticleEffector37) {
                this.aModelParticleEffector38 = null;
                return null;
            } else {
                this.aModelParticleEffector38 = local8.aModelParticleEffector42;
                return local8;
            }
        } catch (@Pc(24) RuntimeException local24) {
            signlink.reporterror("23386, " + arg0 + ", " + local24.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "()V")
    public void method515() {
        if (this.aModelParticleEffector37.aModelParticleEffector41 == this.aModelParticleEffector37) {
            return;
        }
        while (true) {
            @Pc(10) ModelParticleEffector local10 = this.aModelParticleEffector37.aModelParticleEffector41;
            if (local10 == this.aModelParticleEffector37) {
                return;
            }
            local10.method1211();
        }
    }
}
