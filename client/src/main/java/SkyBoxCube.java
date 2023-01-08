import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

import java.awt.*;
import java.awt.image.PixelGrabber;

@OriginalClass("client!ib")
public final class SkyBoxCube extends World {

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "Z")
    private boolean aBoolean160 = false;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    private int anInt647 = 328;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    private int anInt648 = 1;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "B")
    private byte aByte20 = 1;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "B")
    private byte aByte21 = 100;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "Z")
    private boolean aBoolean161 = true;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    private int bytes = 3;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    private int anInt650 = 646;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "Z")
    private boolean aBoolean162 = false;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    private int state = -31809;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "[I")
    public int[] anIntArray208;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    public int anInt656;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    public int anInt652;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    public int anInt657;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public int contextId;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    private int anInt655;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    private int anInt654;

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
    public SkyBoxCube(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        this.anIntArray208 = new int[arg0 * arg1];
        this.anInt652 = this.anInt656 = arg0;
        this.contextId = this.anInt657 = arg1;
        this.anInt654 = this.anInt655 = 0;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public SkyBoxCube(@OriginalArg(0) byte[] arg0, @OriginalArg(1) java.awt.Component arg1) {
        try {
            @Pc(35) Image local35 = Toolkit.getDefaultToolkit().createImage(arg0);
            @Pc(40) MediaTracker local40 = new MediaTracker(arg1);
            local40.addImage(local35, 0);
            local40.waitForAll();
            this.anInt652 = local35.getWidth(arg1);
            this.contextId = local35.getHeight(arg1);
            this.anInt656 = this.anInt652;
            this.anInt657 = this.contextId;
            this.anInt654 = 0;
            this.anInt655 = 0;
            this.anIntArray208 = new int[this.anInt652 * this.contextId];
            @Pc(94) PixelGrabber local94 = new PixelGrabber(local35, 0, 0, this.anInt652, this.contextId, this.anIntArray208, 0, this.anInt652);
            local94.grabPixels();
        } catch (@Pc(99) Exception local99) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
    public SkyBoxCube(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
        @Pc(49) Buffer local49 = new Buffer(arg0.method666(arg1 + ".dat", null), -26728);
        @Pc(58) Buffer local58 = new Buffer(arg0.method666("index.dat", null), -26728);
        local58.anInt742 = local49.method482();
        this.anInt656 = local58.method482();
        this.anInt657 = local58.method482();
        @Pc(73) int local73 = local58.method480();
        @Pc(76) int[] local76 = new int[local73];
        for (@Pc(78) int local78 = 0; local78 < local73 - 1; local78++) {
            local76[local78 + 1] = local58.method484();
            if (local76[local78 + 1] == 0) {
                local76[local78 + 1] = 1;
            }
        }
        for (@Pc(113) int local113 = 0; local113 < arg2; local113++) {
            local58.anInt742 += 2;
            local49.anInt742 += local58.method482() * local58.method482();
            local58.anInt742++;
        }
        this.anInt654 = local58.method480();
        this.anInt655 = local58.method480();
        this.anInt652 = local58.method482();
        this.contextId = local58.method482();
        @Pc(160) int local160 = local58.method480();
        @Pc(166) int local166 = this.anInt652 * this.contextId;
        this.anIntArray208 = new int[local166];
        @Pc(174) int local174;
        if (local160 == 0) {
            for (local174 = 0; local174 < local166; local174++) {
                this.anIntArray208[local174] = local76[local49.method480()];
            }
        } else if (local160 == 1) {
            for (local174 = 0; local174 < this.anInt652; local174++) {
                for (@Pc(198) int local198 = 0; local198 < this.contextId; local198++) {
                    this.anIntArray208[local174 + local198 * this.anInt652] = local76[local49.method480()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public void method386(@OriginalArg(0) int arg0) {
        try {
            if (arg0 <= 0) {
                for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
                }
            }
            Static14.method434(this.anIntArray208, this.contextId, this.anInt652, 234);
        } catch (@Pc(18) RuntimeException local18) {
            signlink.reporterror("85392, " + arg0 + ", " + local18.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
    public void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            for (@Pc(3) int local3 = 0; local3 < this.anIntArray208.length; local3++) {
                @Pc(10) int local10 = this.anIntArray208[local3];
                if (local10 != 0) {
                    @Pc(18) int local18 = local10 >> 16 & 0xFF;
                    local18 += arg1;
                    if (local18 < 1) {
                        local18 = 1;
                    } else if (local18 > 255) {
                        local18 = 255;
                    }
                    @Pc(40) int local40 = local10 >> 8 & 0xFF;
                    local40 += arg2;
                    if (local40 < 1) {
                        local40 = 1;
                    } else if (local40 > 255) {
                        local40 = 255;
                    }
                    @Pc(60) int local60 = local10 & 0xFF;
                    local60 += arg0;
                    if (local60 < 1) {
                        local60 = 1;
                    } else if (local60 > 255) {
                        local60 = 255;
                    }
                    this.anIntArray208[local3] = (local18 << 16) + (local40 << 8) + local60;
                }
            }
            if (arg3 == 0) {
                ;
            }
        } catch (@Pc(99) RuntimeException local99) {
            signlink.reporterror("54815, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local99.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public void method388(@OriginalArg(0) int arg0) {
        try {
            @Pc(8) int[] local8 = new int[this.anInt656 * this.anInt657];
            for (@Pc(10) int local10 = 0; local10 < this.contextId; local10++) {
                for (@Pc(14) int local14 = 0; local14 < this.anInt652; local14++) {
                    local8[(local10 + this.anInt655) * this.anInt656 + local14 + this.anInt654] = this.anIntArray208[local10 * this.anInt652 + local14];
                }
            }
            @Pc(53) int local53 = 71 / arg0;
            this.anIntArray208 = local8;
            this.anInt652 = this.anInt656;
            this.contextId = this.anInt657;
            this.anInt654 = 0;
            this.anInt655 = 0;
        } catch (@Pc(72) RuntimeException local72) {
            signlink.reporterror("49399, " + arg0 + ", " + local72.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
    public void method389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        try {
            arg0 += this.anInt654;
            arg1 += this.anInt655;
            @Pc(15) int local15 = arg0 + arg1 * Static14.anInt695;
            @Pc(17) int local17 = 0;
            if (arg2 != this.anInt648) {
                this.anInt648 = -35;
            }
            @Pc(27) int local27 = this.contextId;
            @Pc(30) int local30 = this.anInt652;
            @Pc(34) int local34 = Static14.anInt695 - local30;
            @Pc(36) int local36 = 0;
            @Pc(43) int local43;
            if (arg1 < Static14.anInt697) {
                local43 = Static14.anInt697 - arg1;
                local27 -= local43;
                arg1 = Static14.anInt697;
                local17 += local43 * local30;
                local15 += local43 * Static14.anInt695;
            }
            if (arg1 + local27 > Static14.anInt698) {
                local27 -= arg1 + local27 - Static14.anInt698;
            }
            if (arg0 < Static14.anInt699) {
                local43 = Static14.anInt699 - arg0;
                local30 -= local43;
                arg0 = Static14.anInt699;
                local17 += local43;
                local15 += local43;
                local36 += local43;
                local34 += local43;
            }
            if (arg0 + local30 > Static14.anInt700) {
                local43 = arg0 + local30 - Static14.anInt700;
                local30 -= local43;
                local36 += local43;
                local34 += local43;
            }
            if (local30 > 0 && local27 > 0) {
                this.method390(local30, local36, (byte) 1, local27, local15, local34, local17, Static14.anIntArray213, this.anIntArray208);
            }
        } catch (@Pc(145) RuntimeException local145) {
            signlink.reporterror("3957, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local145.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBIIII[I[I)V")
    private void method390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8) {
        try {
            @Pc(6) int local6 = -(arg0 >> 2);
            if (arg2 != this.aByte20) {
                this.state = -225;
            }
            @Pc(18) int local18 = -(arg0 & 0x3);
            for (@Pc(21) int local21 = -arg3; local21 < 0; local21++) {
                for (@Pc(25) int local25 = local6; local25 < 0; local25++) {
                    arg7[arg4++] = arg8[arg6++];
                    arg7[arg4++] = arg8[arg6++];
                    arg7[arg4++] = arg8[arg6++];
                    arg7[arg4++] = arg8[arg6++];
                }
                for (@Pc(64) int local64 = local18; local64 < 0; local64++) {
                    arg7[arg4++] = arg8[arg6++];
                }
                arg4 += arg5;
                arg6 += arg1;
            }
        } catch (@Pc(90) RuntimeException local90) {
            signlink.reporterror("70310, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local90.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)V")
    public void method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        try {
            if (arg2 == 37651) {
                arg0 += this.anInt654;
                arg1 += this.anInt655;
                @Pc(19) int local19 = arg0 + arg1 * Static14.anInt695;
                @Pc(21) int local21 = 0;
                @Pc(24) int local24 = this.contextId;
                @Pc(27) int local27 = this.anInt652;
                @Pc(31) int local31 = Static14.anInt695 - local27;
                @Pc(33) int local33 = 0;
                @Pc(40) int local40;
                if (arg1 < Static14.anInt697) {
                    local40 = Static14.anInt697 - arg1;
                    local24 -= local40;
                    arg1 = Static14.anInt697;
                    local21 += local40 * local27;
                    local19 += local40 * Static14.anInt695;
                }
                if (arg1 + local24 > Static14.anInt698) {
                    local24 -= arg1 + local24 - Static14.anInt698;
                }
                if (arg0 < Static14.anInt699) {
                    local40 = Static14.anInt699 - arg0;
                    local27 -= local40;
                    arg0 = Static14.anInt699;
                    local21 += local40;
                    local19 += local40;
                    local33 += local40;
                    local31 += local40;
                }
                if (arg0 + local27 > Static14.anInt700) {
                    local40 = arg0 + local27 - Static14.anInt700;
                    local27 -= local40;
                    local33 += local40;
                    local31 += local40;
                }
                if (local27 > 0 && local24 > 0) {
                    this.method392(Static14.anIntArray213, this.anIntArray208, 0, local21, local19, local27, local24, local31, local33);
                }
            }
        } catch (@Pc(142) RuntimeException local142) {
            signlink.reporterror("61099, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method392(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
        @Pc(6) int local6 = -(arg5 >> 2);
        @Pc(11) int local11 = -(arg5 & 0x3);
        for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
            @Pc(25) int local25;
            for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
                local25 = arg1[arg3++];
                if (local25 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = local25;
                }
                local25 = arg1[arg3++];
                if (local25 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = local25;
                }
                local25 = arg1[arg3++];
                if (local25 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = local25;
                }
                local25 = arg1[arg3++];
                if (local25 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = local25;
                }
            }
            for (@Pc(85) int local85 = local11; local85 < 0; local85++) {
                local25 = arg1[arg3++];
                if (local25 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = local25;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZIII)V")
    public void method393(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            arg3 += this.anInt654;
            arg1 += this.anInt655;
            @Pc(15) int local15 = arg3 + arg1 * Static14.anInt695;
            @Pc(17) int local17 = 0;
            @Pc(20) int local20 = this.contextId;
            @Pc(23) int local23 = this.anInt652;
            @Pc(27) int local27 = Static14.anInt695 - local23;
            @Pc(29) int local29 = 0;
            if (arg0) {
                this.aBoolean162 = !this.aBoolean162;
            }
            @Pc(46) int local46;
            if (arg1 < Static14.anInt697) {
                local46 = Static14.anInt697 - arg1;
                local20 -= local46;
                arg1 = Static14.anInt697;
                local17 += local46 * local23;
                local15 += local46 * Static14.anInt695;
            }
            if (arg1 + local20 > Static14.anInt698) {
                local20 -= arg1 + local20 - Static14.anInt698;
            }
            if (arg3 < Static14.anInt699) {
                local46 = Static14.anInt699 - arg3;
                local23 -= local46;
                arg3 = Static14.anInt699;
                local17 += local46;
                local15 += local46;
                local29 += local46;
                local27 += local46;
            }
            if (arg3 + local23 > Static14.anInt700) {
                local46 = arg3 + local23 - Static14.anInt700;
                local23 -= local46;
                local29 += local46;
                local27 += local46;
            }
            if (local23 > 0 && local20 > 0) {
                this.method394(Static14.anIntArray213, true, local17, this.anIntArray208, local20, local15, local29, local27, arg2, local23, 0);
            }
        } catch (@Pc(150) RuntimeException local150) {
            signlink.reporterror("57854, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local150.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([IZI[IIIIIIII)V")
    private void method394(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
        try {
            @Pc(5) int local5 = 256 - arg8;
            for (@Pc(8) int local8 = -arg4; local8 < 0; local8++) {
                for (@Pc(13) int local13 = -arg9; local13 < 0; local13++) {
                    @Pc(20) int local20 = arg3[arg2++];
                    if (local20 == 0) {
                        arg5++;
                    } else {
                        @Pc(26) int local26 = arg0[arg5];
                        arg0[arg5++] = ((local20 & 0xFF00FF) * arg8 + (local26 & 0xFF00FF) * local5 & 0xFF00FF00) + ((local20 & 0xFF00) * arg8 + (local26 & 0xFF00) * local5 & 0xFF0000) >> 8;
                    }
                }
                arg5 += arg7;
                arg2 += arg6;
            }
            if (!arg1) {
                this.aBoolean161 = !this.aBoolean161;
            }
        } catch (@Pc(88) RuntimeException local88) {
            signlink.reporterror("75253, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local88.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII[IB[IIII)V")
    public void method395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
        try {
            if (arg6 == 8) {
                try {
                    @Pc(10) int local10 = -arg3 / 2;
                    @Pc(15) int local15 = -arg1 / 2;
                    @Pc(24) int local24 = (int) (Math.sin((double) arg4 / 326.11D) * 65536.0D);
                    @Pc(33) int local33 = (int) (Math.cos((double) arg4 / 326.11D) * 65536.0D);
                    @Pc(39) int local39 = local24 * arg8 >> 8;
                    @Pc(45) int local45 = local33 * arg8 >> 8;
                    @Pc(57) int local57 = (arg2 << 16) + local15 * local39 + local10 * local45;
                    @Pc(69) int local69 = (arg10 << 16) + (local15 * local45 - local10 * local39);
                    @Pc(75) int local75 = arg9 + arg0 * Static14.anInt695;
                    for (@Pc(77) int local77 = 0; local77 < arg1; local77++) {
                        @Pc(83) int local83 = arg5[local77];
                        @Pc(87) int local87 = local75 + local83;
                        @Pc(93) int local93 = local57 + local45 * local83;
                        @Pc(99) int local99 = local69 - local39 * local83;
                        for (@Pc(104) int local104 = -arg7[local77]; local104 < 0; local104++) {
                            Static14.anIntArray213[local87++] = this.anIntArray208[(local93 >> 16) + (local99 >> 16) * this.anInt652];
                            local93 += local45;
                            local99 -= local39;
                        }
                        local57 += local39;
                        local69 += local45;
                        local75 += Static14.anInt695;
                    }
                } catch (@Pc(152) Exception local152) {
                }
            }
        } catch (@Pc(154) RuntimeException local154) {
            signlink.reporterror("51687, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local154.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIDIBI)V")
    public void method396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) double arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) int arg8) {
        try {
            if (arg7 != 114) {
                this.anInt647 = -324;
            }
            try {
                @Pc(12) int local12 = -arg2 / 2;
                @Pc(17) int local17 = -arg8 / 2;
                @Pc(23) int local23 = (int) (Math.sin(arg5) * 65536.0D);
                @Pc(29) int local29 = (int) (Math.cos(arg5) * 65536.0D);
                @Pc(35) int local35 = local23 * arg6 >> 8;
                @Pc(41) int local41 = local29 * arg6 >> 8;
                @Pc(53) int local53 = (arg0 << 16) + local17 * local35 + local12 * local41;
                @Pc(65) int local65 = (arg1 << 16) + (local17 * local41 - local12 * local35);
                @Pc(71) int local71 = arg4 + arg3 * Static14.anInt695;
                for (@Pc(73) int local73 = 0; local73 < arg8; local73++) {
                    @Pc(77) int local77 = local71;
                    @Pc(79) int local79 = local53;
                    @Pc(81) int local81 = local65;
                    for (@Pc(84) int local84 = -arg2; local84 < 0; local84++) {
                        @Pc(100) int local100 = this.anIntArray208[(local79 >> 16) + (local81 >> 16) * this.anInt652];
                        if (local100 == 0) {
                            local77++;
                        } else {
                            Static14.anIntArray213[local77++] = local100;
                        }
                        local79 += local41;
                        local81 -= local35;
                    }
                    local53 += local35;
                    local65 += local41;
                    local71 += Static14.anInt695;
                }
            } catch (@Pc(139) Exception local139) {
            }
        } catch (@Pc(141) RuntimeException local141) {
            signlink.reporterror("80935, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local141.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!jb;II)V")
    public void method397(@OriginalArg(0) int arg0, @OriginalArg(1) GzipDecompressor arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            arg0 += this.anInt654;
            arg2 += this.anInt655;
            @Pc(15) int local15 = arg0 + arg2 * Static14.anInt695;
            @Pc(17) int local17 = 0;
            if (arg3 != 0) {
                this.aBoolean160 = !this.aBoolean160;
            }
            @Pc(30) int local30 = this.contextId;
            @Pc(33) int local33 = this.anInt652;
            @Pc(37) int local37 = Static14.anInt695 - local33;
            @Pc(39) int local39 = 0;
            @Pc(46) int local46;
            if (arg2 < Static14.anInt697) {
                local46 = Static14.anInt697 - arg2;
                local30 -= local46;
                arg2 = Static14.anInt697;
                local17 += local46 * local33;
                local15 += local46 * Static14.anInt695;
            }
            if (arg2 + local30 > Static14.anInt698) {
                local30 -= arg2 + local30 - Static14.anInt698;
            }
            if (arg0 < Static14.anInt699) {
                local46 = Static14.anInt699 - arg0;
                local33 -= local46;
                arg0 = Static14.anInt699;
                local17 += local46;
                local15 += local46;
                local39 += local46;
                local37 += local46;
            }
            if (arg0 + local33 > Static14.anInt700) {
                local46 = arg0 + local33 - Static14.anInt700;
                local33 -= local46;
                local39 += local46;
                local37 += local46;
            }
            if (local33 > 0 && local30 > 0) {
                this.method398(local15, local30, 646, Static14.anIntArray213, this.anIntArray208, 0, local17, local33, local37, local39, arg1.aByteArray7);
            }
        } catch (@Pc(151) RuntimeException local151) {
            signlink.reporterror("10892, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local151.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III[I[IIIIII[B)V")
    private void method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte[] arg10) {
        try {
            if (arg2 <= 0) {
                this.aBoolean162 = !this.aBoolean162;
            }
            @Pc(16) int local16 = -(arg7 >> 2);
            @Pc(21) int local21 = -(arg7 & 0x3);
            for (@Pc(24) int local24 = -arg1; local24 < 0; local24++) {
                @Pc(35) int local35;
                for (@Pc(28) int local28 = local16; local28 < 0; local28++) {
                    local35 = arg4[arg6++];
                    if (local35 != 0 && arg10[arg0] == 0) {
                        arg3[arg0++] = local35;
                    } else {
                        arg0++;
                    }
                    local35 = arg4[arg6++];
                    if (local35 != 0 && arg10[arg0] == 0) {
                        arg3[arg0++] = local35;
                    } else {
                        arg0++;
                    }
                    local35 = arg4[arg6++];
                    if (local35 != 0 && arg10[arg0] == 0) {
                        arg3[arg0++] = local35;
                    } else {
                        arg0++;
                    }
                    local35 = arg4[arg6++];
                    if (local35 != 0 && arg10[arg0] == 0) {
                        arg3[arg0++] = local35;
                    } else {
                        arg0++;
                    }
                }
                for (@Pc(111) int local111 = local21; local111 < 0; local111++) {
                    local35 = arg4[arg6++];
                    if (local35 != 0 && arg10[arg0] == 0) {
                        arg3[arg0++] = local35;
                    } else {
                        arg0++;
                    }
                }
                arg0 += arg8;
                arg6 += arg9;
            }
        } catch (@Pc(148) RuntimeException local148) {
            signlink.reporterror("42733, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local148.toString());
            throw new RuntimeException();
        }
    }
}
