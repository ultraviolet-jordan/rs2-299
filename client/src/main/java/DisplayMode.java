import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;

@OriginalClass("client!ub")
public final class DisplayMode extends Keyboard implements Runnable {

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    private int refreshRate;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    private int anInt5283;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "[B")
    private byte[] aByteArray17;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "[I")
    private int[] anIntArray256;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
    private int[] anIntArray257;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "[I")
    private int[] anIntArray258;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "[I")
    private int[] anIntArray259;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "[I")
    private int[] anIntArray260;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "[I")
    private int[] anIntArray261;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "Lclient!client;")
    private client aClient5;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    private int anInt946;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    private int anInt947;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    private int anInt948;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    private int anInt949;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "Ljava/net/Socket;")
    private Socket aSocket3;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "Ljava/io/InputStream;")
    private InputStream anInputStream2;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "Ljava/io/OutputStream;")
    private OutputStream anOutputStream2;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public int anInt950;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "Lclient!mb;")
    private ParticleNode aParticleNode1;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    private int anInt951;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    private int anInt952;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    private int anInt953;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    private int anInt954;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "J")
    private long aLong31;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public int anInt955;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Z")
    private boolean aBoolean226 = false;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Z")
    private boolean aBoolean227 = false;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    private int anInt941 = 131;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    private int height = 2;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    private int width = 964;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "B")
    private byte aByte31 = 50;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "B")
    private byte aByte32 = -126;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[[I")
    private int[][] anIntArrayArray24 = new int[4][];

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "[[I")
    private int[][] anIntArrayArray25 = new int[4][];

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "[[B")
    private byte[][] aByteArrayArray6 = new byte[4][];

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Z")
    private boolean aBoolean228 = true;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 aCRC32_2 = new CRC32();

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Z")
    private boolean aBoolean229 = false;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!pb;")
    private PcmSound aPcmSound2 = new PcmSound(true);

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!ob;")
    private FrameBuffer aFrameBuffer8 = new FrameBuffer(6);

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!ob;")
    private FrameBuffer aFrameBuffer9 = new FrameBuffer(6);

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "Lclient!ob;")
    private FrameBuffer aFrameBuffer10 = new FrameBuffer(6);

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "Lclient!ob;")
    private FrameBuffer aFrameBuffer11 = new FrameBuffer(6);

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "Lclient!ob;")
    private FrameBuffer aFrameBuffer12 = new FrameBuffer(6);

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "Ljava/lang/String;")
    public String aString29 = "";

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "[B")
    private byte[] aByteArray18 = new byte[500];

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "[B")
    private byte[] aByteArray19 = new byte[65000];

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!xb;Lclient!client;)V")
    public void method636(@OriginalArg(0) Class47 arg0, @OriginalArg(1) client arg1) {
        @Pc(20) String[] local20 = new String[]{"model_version", "anim_version", "midi_version", "map_version"};
        @Pc(36) int local36;
        @Pc(56) int local56;
        for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
            @Pc(31) byte[] local31 = arg0.method666(local20[local22], null);
            local36 = local31.length / 2;
            @Pc(42) Buffer local42 = new Buffer(local31, -26728);
            this.anIntArrayArray24[local22] = new int[local36];
            this.aByteArrayArray6[local22] = new byte[local36];
            for (local56 = 0; local56 < local36; local56++) {
                this.anIntArrayArray24[local22][local56] = local42.method482();
            }
        }
        @Pc(93) String[] local93 = new String[]{"model_crc", "anim_crc", "midi_crc", "map_crc"};
        @Pc(104) byte[] local104;
        for (local36 = 0; local36 < 4; local36++) {
            local104 = arg0.method666(local93[local36], null);
            local56 = local104.length / 4;
            @Pc(115) Buffer local115 = new Buffer(local104, -26728);
            this.anIntArrayArray25[local36] = new int[local56];
            for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
                this.anIntArrayArray25[local36][local123] = local115.method485();
            }
        }
        local104 = arg0.method666("model_index", null);
        local56 = this.anIntArrayArray24[0].length;
        this.aByteArray17 = new byte[local56];
        for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
            if (local158 < local104.length) {
                this.aByteArray17[local158] = local104[local158];
            } else {
                this.aByteArray17[local158] = 0;
            }
        }
        local104 = arg0.method666("map_index", null);
        @Pc(193) Buffer local193 = new Buffer(local104, -26728);
        local56 = local104.length / 7;
        this.anIntArray256 = new int[local56];
        this.anIntArray257 = new int[local56];
        this.anIntArray258 = new int[local56];
        this.anIntArray259 = new int[local56];
        for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
            this.anIntArray256[local216] = local193.method482();
            this.anIntArray257[local216] = local193.method482();
            this.anIntArray258[local216] = local193.method482();
            this.anIntArray259[local216] = local193.method480();
        }
        local104 = arg0.method666("anim_index", null);
        local193 = new Buffer(local104, -26728);
        local56 = local104.length / 2;
        this.anIntArray260 = new int[local56];
        for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
            this.anIntArray260[local268] = local193.method482();
        }
        local104 = arg0.method666("midi_index", null);
        local193 = new Buffer(local104, -26728);
        local56 = local104.length;
        this.anIntArray261 = new int[local56];
        for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
            this.anIntArray261[local300] = local193.method480();
        }
        this.aClient5 = arg1;
        this.aBoolean228 = true;
        this.aClient5.method95(this, 2);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
    public void method637() {
        this.aBoolean228 = false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)I")
    public int method638(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
        try {
            return arg1 == -73 ? this.anIntArrayArray24[arg0].length : 2;
        } catch (@Pc(11) RuntimeException local11) {
            signlink.reporterror("29294, " + arg0 + ", " + arg1 + ", " + local11.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
    public int method639(@OriginalArg(0) int arg0) {
        try {
            return arg0 == -1919 ? this.anIntArray260.length : 3;
        } catch (@Pc(9) RuntimeException local9) {
            signlink.reporterror("49643, " + arg0 + ", " + local9.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)I")
    public int method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            @Pc(5) int local5 = (arg3 << 8) + arg0;
            @Pc(9) int local9 = 69 / arg1;
            for (@Pc(11) int local11 = 0; local11 < this.anIntArray256.length; local11++) {
                if (this.anIntArray256[local11] == local5) {
                    if (arg2 == 0) {
                        return this.anIntArray257[local11];
                    }
                    return this.anIntArray258[local11];
                }
            }
            return -1;
        } catch (@Pc(40) RuntimeException local40) {
            signlink.reporterror("85207, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local40.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BZ)V")
    public void method641(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
        try {
            if (arg0 != -34) {
                this.aBoolean227 = !this.aBoolean227;
            }
            @Pc(14) int local14 = this.anIntArray256.length;
            for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
                if (arg1 || this.anIntArray259[local16] != 0) {
                    this.method648((byte) 2, this.anIntArray258[local16], 3, 8);
                    this.method648((byte) 2, this.anIntArray257[local16], 3, 8);
                }
            }
        } catch (@Pc(49) RuntimeException local49) {
            signlink.reporterror("43094, " + arg0 + ", " + arg1 + ", " + local49.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Z")
    public boolean method642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        try {
            label32:
            while (true) {
                @Pc(5) int local5;
                if (arg1 >= 0) {
                    local5 = 1;
                    while (true) {
                        if (local5 <= 0) {
                            continue label32;
                        }
                        local5++;
                    }
                }
                for (local5 = 0; local5 < this.anIntArray256.length; local5++) {
                    if (this.anIntArray258[local5] == arg0) {
                        return true;
                    }
                }
                return false;
            }
        } catch (@Pc(33) RuntimeException local33) {
            signlink.reporterror("47003, " + arg0 + ", " + arg1 + ", " + local33.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)I")
    public int method643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        try {
            return arg1 == 0 ? this.aByteArray17[arg0] & 0xFF : this.anInt941;
        } catch (@Pc(12) RuntimeException local12) {
            signlink.reporterror("88467, " + arg0 + ", " + arg1 + ", " + local12.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)Z")
    public boolean method644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        try {
            if (arg0 != 0) {
                throw new NullPointerException();
            }
            return this.anIntArray261[arg1] == 1;
        } catch (@Pc(16) RuntimeException local16) {
            signlink.reporterror("27309, " + arg0 + ", " + arg1 + ", " + local16.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    @Override
    public void readPlayerInfoPacket(@OriginalArg(0) int arg0) {
        this.method645(0, arg0);
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(II)V")
    public void method645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        if (arg0 < 0 || arg0 > this.anIntArrayArray24.length || arg1 < 0 || arg1 > this.anIntArrayArray24[arg0].length || this.anIntArrayArray24[arg0][arg1] == 0) {
            return;
        }
        @Pc(27) PcmSound local27 = this.aPcmSound2;
        synchronized (this.aPcmSound2) {
            @Pc(34) ParticleNode local34;
            for (local34 = (ParticleNode) this.aPcmSound2.method518(); local34 != null; local34 = (ParticleNode) this.aPcmSound2.method519(0)) {
                if (local34.anInt770 == arg0 && local34.index == arg1) {
                    return;
                }
            }
            local34 = new ParticleNode();
            local34.anInt770 = arg0;
            local34.index = arg1;
            local34.aBoolean195 = true;
            @Pc(71) FrameBuffer local71 = this.aFrameBuffer8;
            synchronized (this.aFrameBuffer8) {
                this.aFrameBuffer8.method508(local34);
            }
            this.aPcmSound2.method516(local34);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()I")
    public int method646() {
        @Pc(2) PcmSound local2 = this.aPcmSound2;
        synchronized (this.aPcmSound2) {
            return this.aPcmSound2.method520();
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()Lclient!mb;")
    public ParticleNode method647() {
        @Pc(4) FrameBuffer local4 = this.aFrameBuffer11;
        @Pc(11) ParticleNode local11;
        synchronized (this.aFrameBuffer11) {
            local11 = (ParticleNode) this.aFrameBuffer11.method510();
        }
        if (local11 == null) {
            return null;
        }
        @Pc(24) PcmSound local24 = this.aPcmSound2;
        synchronized (this.aPcmSound2) {
            local11.close();
        }
        if (local11.aByteArray10 == null) {
            return local11;
        }
        @Pc(41) int local41 = 0;
        try {
            @Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray10));
            while (true) {
                if (local41 == this.aByteArray19.length) {
                    throw new RuntimeException("buffer overflow!");
                }
                @Pc(71) int local71 = local50.read(this.aByteArray19, local41, this.aByteArray19.length - local41);
                if (local71 == -1) {
                    break;
                }
                local41 += local71;
            }
        } catch (@Pc(82) IOException local82) {
            throw new RuntimeException("error unzipping");
        }
        local11.aByteArray10 = new byte[local41];
        for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
            local11.aByteArray10[local93] = this.aByteArray19[local93];
        }
        return local11;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIII)V")
    public void method648(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            if (this.aClient5.aTextureOpWaveformArray1[0] != null && this.anIntArrayArray24[arg2][arg1] != 0) {
                @Pc(25) byte[] local25 = this.aClient5.aTextureOpWaveformArray1[arg2 + 1].method658(arg1, 8);
                if (arg3 < 8 || arg3 > 8) {
                    this.aBoolean226 = !this.aBoolean226;
                }
                if (!this.method655(local25, (byte) 50, this.anIntArrayArray25[arg2][arg1], this.anIntArrayArray24[arg2][arg1])) {
                    this.aByteArrayArray6[arg2][arg1] = arg0;
                    if (arg0 > this.anInt5283) {
                        this.anInt5283 = arg0;
                    }
                    this.anInt949++;
                }
            }
        } catch (@Pc(79) RuntimeException local79) {
            signlink.reporterror("30397, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local79.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
    public void method649(@OriginalArg(0) int arg0) {
        try {
            @Pc(2) FrameBuffer local2 = this.aFrameBuffer12;
            synchronized (this.aFrameBuffer12) {
                this.aFrameBuffer12.method515();
            }
            if (arg0 != 0) {
                this.height = -53;
            }
        } catch (@Pc(20) RuntimeException local20) {
            signlink.reporterror("61381, " + arg0 + ", " + local20.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
    public void method650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        try {
            if (arg1 != 47179) {
                this.aBoolean227 = !this.aBoolean227;
            }
            if (this.aClient5.aTextureOpWaveformArray1[0] != null && (this.anIntArrayArray24[arg0][arg2] != 0 && (this.aByteArrayArray6[arg0][arg2] != 0 && this.anInt5283 != 0))) {
                @Pc(41) ParticleNode local41 = new ParticleNode();
                local41.anInt770 = arg0;
                local41.index = arg2;
                local41.aBoolean195 = false;
                @Pc(53) FrameBuffer local53 = this.aFrameBuffer12;
                synchronized (this.aFrameBuffer12) {
                    this.aFrameBuffer12.method508(local41);
                }
            }
        } catch (@Pc(66) RuntimeException local66) {
            signlink.reporterror("63289, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local66.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "run", descriptor = "()V")
    @Override
    public void run() {
        try {
            while (this.aBoolean228) {
                this.anInt955++;
                @Pc(11) byte local11 = 20;
                if (this.anInt5283 == 0 && this.aClient5.aTextureOpWaveformArray1[0] != null) {
                    local11 = 50;
                }
                try {
                    Thread.sleep((long) local11);
                } catch (@Pc(27) Exception local27) {
                }
                this.aBoolean229 = true;
                for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean229; local32++) {
                    this.aBoolean229 = false;
                    this.method651((byte) 2);
                    this.method652(0);
                    if (this.anInt946 == 0 && local32 >= 5) {
                        break;
                    }
                    this.method653(964);
                    if (this.anInputStream2 != null) {
                        this.method654(this.refreshRate);
                    }
                }
                @Pc(68) boolean local68 = false;
                @Pc(73) ParticleNode local73;
                for (local73 = (ParticleNode) this.aFrameBuffer10.method511(); local73 != null; local73 = (ParticleNode) this.aFrameBuffer10.method513(0)) {
                    if (local73.aBoolean195) {
                        local68 = true;
                        local73.anInt772++;
                        if (local73.anInt772 > 50) {
                            local73.anInt772 = 0;
                            this.method656(local73, (byte) -126);
                        }
                    }
                }
                if (!local68) {
                    for (local73 = (ParticleNode) this.aFrameBuffer10.method511(); local73 != null; local73 = (ParticleNode) this.aFrameBuffer10.method513(0)) {
                        local68 = true;
                        local73.anInt772++;
                        if (local73.anInt772 > 50) {
                            local73.anInt772 = 0;
                            this.method656(local73, (byte) -126);
                        }
                    }
                }
                if (local68) {
                    this.anInt953++;
                    if (this.anInt953 > 750) {
                        try {
                            this.aSocket3.close();
                        } catch (@Pc(158) Exception local158) {
                        }
                        this.aSocket3 = null;
                        this.anInputStream2 = null;
                        this.anOutputStream2 = null;
                        this.anInt952 = 0;
                    }
                } else {
                    this.anInt953 = 0;
                    this.aString29 = "";
                }
                if (this.aClient5.aBoolean54 && this.aSocket3 != null && this.anOutputStream2 != null && (this.anInt5283 > 0 || this.aClient5.aTextureOpWaveformArray1[0] == null)) {
                    this.anInt954++;
                    if (this.anInt954 > 500) {
                        this.anInt954 = 0;
                        this.aByteArray18[0] = 0;
                        this.aByteArray18[1] = 0;
                        this.aByteArray18[2] = 0;
                        this.aByteArray18[3] = 10;
                        try {
                            this.anOutputStream2.write(this.aByteArray18, 0, 4);
                        } catch (@Pc(239) IOException local239) {
                            this.anInt953 = 5000;
                        }
                    }
                }
            }
        } catch (@Pc(248) Exception local248) {
            signlink.reporterror("od_ex " + local248.getMessage());
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    private void method651(@OriginalArg(0) byte arg0) {
        try {
            if (arg0 == 2) {
                @Pc(6) boolean local6 = false;
            } else {
                for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
                }
            }
            @Pc(18) FrameBuffer local18 = this.aFrameBuffer8;
            @Pc(25) ParticleNode local25;
            synchronized (this.aFrameBuffer8) {
                local25 = (ParticleNode) this.aFrameBuffer8.method510();
            }
            while (local25 != null) {
                this.aBoolean229 = true;
                @Pc(36) byte[] local36 = null;
                if (this.aClient5.aTextureOpWaveformArray1[0] != null) {
                    local36 = this.aClient5.aTextureOpWaveformArray1[local25.anInt770 + 1].method658(local25.index, 8);
                }
                if (!this.method655(local36, (byte) 50, this.anIntArrayArray25[local25.anInt770][local25.index], this.anIntArrayArray24[local25.anInt770][local25.index])) {
                    local36 = null;
                }
                @Pc(81) FrameBuffer local81 = this.aFrameBuffer8;
                synchronized (this.aFrameBuffer8) {
                    if (local36 == null) {
                        this.aFrameBuffer9.method508(local25);
                    } else {
                        local25.aByteArray10 = local36;
                        @Pc(97) FrameBuffer local97 = this.aFrameBuffer11;
                        synchronized (this.aFrameBuffer11) {
                            this.aFrameBuffer11.method508(local25);
                        }
                    }
                    local25 = (ParticleNode) this.aFrameBuffer8.method510();
                }
            }
        } catch (@Pc(124) RuntimeException local124) {
            signlink.reporterror("15401, " + arg0 + ", " + local124.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    private void method652(@OriginalArg(0) int arg0) {
        try {
            this.anInt946 = 0;
            this.anInt947 = 0;
            @Pc(12) ParticleNode local12 = (ParticleNode) this.aFrameBuffer10.method511();
            if (arg0 != 0) {
                this.refreshRate = 124;
            }
            while (local12 != null) {
                if (local12.aBoolean195) {
                    this.anInt946++;
                } else {
                    this.anInt947++;
                }
                local12 = (ParticleNode) this.aFrameBuffer10.method513(0);
            }
            while (this.anInt946 < 10) {
                local12 = (ParticleNode) this.aFrameBuffer9.method510();
                if (local12 == null) {
                    break;
                }
                if (this.aByteArrayArray6[local12.anInt770][local12.index] != 0) {
                    this.anInt948++;
                }
                this.aByteArrayArray6[local12.anInt770][local12.index] = 0;
                this.aFrameBuffer10.method508(local12);
                this.anInt946++;
                this.method656(local12, (byte) -126);
                this.aBoolean229 = true;
            }
        } catch (@Pc(100) RuntimeException local100) {
            signlink.reporterror("56140, " + arg0 + ", " + local100.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    private void method653(@OriginalArg(0) int arg0) {
        try {
            if (arg0 <= 0) {
                for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
                }
            }
            while (this.anInt946 == 0) {
                if (this.anInt947 >= 10 || this.anInt5283 == 0) {
                    return;
                }
                @Pc(18) FrameBuffer local18 = this.aFrameBuffer12;
                @Pc(25) ParticleNode local25;
                synchronized (this.aFrameBuffer12) {
                    local25 = (ParticleNode) this.aFrameBuffer12.method510();
                }
                while (local25 != null) {
                    if (this.aByteArrayArray6[local25.anInt770][local25.index] != 0) {
                        this.aByteArrayArray6[local25.anInt770][local25.index] = 0;
                        this.aFrameBuffer10.method508(local25);
                        this.method656(local25, (byte) -126);
                        this.aBoolean229 = true;
                        if (this.anInt948 < this.anInt949) {
                            this.anInt948++;
                        }
                        this.aString29 = "Loading extra files - " + this.anInt948 * 100 / this.anInt949 + "%";
                        this.anInt947++;
                        if (this.anInt947 == 10) {
                            return;
                        }
                    }
                    local18 = this.aFrameBuffer12;
                    synchronized (this.aFrameBuffer12) {
                        local25 = (ParticleNode) this.aFrameBuffer12.method510();
                    }
                }
                for (@Pc(119) int local119 = 0; local119 < 4; local119++) {
                    @Pc(126) byte[] local126 = this.aByteArrayArray6[local119];
                    @Pc(129) int local129 = local126.length;
                    for (@Pc(131) int local131 = 0; local131 < local129; local131++) {
                        if (local126[local131] == this.anInt5283) {
                            local126[local131] = 0;
                            local25 = new ParticleNode();
                            local25.anInt770 = local119;
                            local25.index = local131;
                            local25.aBoolean195 = false;
                            this.aFrameBuffer10.method508(local25);
                            this.method656(local25, (byte) -126);
                            this.aBoolean229 = true;
                            if (this.anInt948 < this.anInt949) {
                                this.anInt948++;
                            }
                            this.aString29 = "Loading extra files - " + this.anInt948 * 100 / this.anInt949 + "%";
                            this.anInt947++;
                            if (this.anInt947 == 10) {
                                return;
                            }
                        }
                    }
                }
                this.anInt5283--;
            }
        } catch (@Pc(229) RuntimeException local229) {
            signlink.reporterror("34712, " + arg0 + ", " + local229.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
    private void method654(@OriginalArg(0) int arg0) {
        try {
            if (arg0 == 0) {
                try {
                    @Pc(8) int local8 = this.anInputStream2.available();
                    @Pc(43) int local43;
                    @Pc(59) int local59;
                    if (this.anInt952 == 0 && local8 >= 6) {
                        this.aBoolean229 = true;
                        for (@Pc(19) int local19 = 0; local19 < 6; local19 += this.anInputStream2.read(this.aByteArray18, local19, 6 - local19)) {
                        }
                        local43 = this.aByteArray18[0] & 0xFF;
                        local59 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
                        @Pc(75) int local75 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
                        @Pc(82) int local82 = this.aByteArray18[5] & 0xFF;
                        this.aParticleNode1 = null;
                        for (@Pc(90) ParticleNode local90 = (ParticleNode) this.aFrameBuffer10.method511(); local90 != null; local90 = (ParticleNode) this.aFrameBuffer10.method513(0)) {
                            if (local90.anInt770 == local43 && local90.index == local59) {
                                this.aParticleNode1 = local90;
                            }
                            if (this.aParticleNode1 != null) {
                                local90.anInt772 = 0;
                            }
                        }
                        if (this.aParticleNode1 != null) {
                            this.anInt953 = 0;
                            if (local75 == 0) {
                                signlink.reporterror("Rej: " + local43 + "," + local59);
                                this.aParticleNode1.aByteArray10 = null;
                                if (this.aParticleNode1.aBoolean195) {
                                    @Pc(148) FrameBuffer local148 = this.aFrameBuffer11;
                                    synchronized (this.aFrameBuffer11) {
                                        this.aFrameBuffer11.method508(this.aParticleNode1);
                                    }
                                } else {
                                    this.aParticleNode1.method1211();
                                }
                                this.aParticleNode1 = null;
                            } else {
                                if (this.aParticleNode1.aByteArray10 == null && local82 == 0) {
                                    this.aParticleNode1.aByteArray10 = new byte[local75];
                                }
                                if (this.aParticleNode1.aByteArray10 == null && local82 != 0) {
                                    throw new IOException("missing start of file");
                                }
                            }
                        }
                        this.anInt951 = local82 * 500;
                        this.anInt952 = 500;
                        if (this.anInt952 > local75 - local82 * 500) {
                            this.anInt952 = local75 - local82 * 500;
                        }
                    }
                    if (this.anInt952 > 0 && local8 >= this.anInt952) {
                        this.aBoolean229 = true;
                        @Pc(227) byte[] local227 = this.aByteArray18;
                        local43 = 0;
                        if (this.aParticleNode1 != null) {
                            local227 = this.aParticleNode1.aByteArray10;
                            local43 = this.anInt951;
                        }
                        for (local59 = 0; local59 < this.anInt952; local59 += this.anInputStream2.read(local227, local59 + local43, this.anInt952 - local59)) {
                        }
                        if (this.anInt952 + this.anInt951 >= local227.length && this.aParticleNode1 != null) {
                            if (this.aClient5.aTextureOpWaveformArray1[0] != null) {
                                this.aClient5.aTextureOpWaveformArray1[this.aParticleNode1.anInt770 + 1].method659(7, local227, this.aParticleNode1.index, local227.length);
                            }
                            if (!this.aParticleNode1.aBoolean195 && this.aParticleNode1.anInt770 == 3) {
                                this.aParticleNode1.aBoolean195 = true;
                                this.aParticleNode1.anInt770 = 93;
                            }
                            if (this.aParticleNode1.aBoolean195) {
                                @Pc(320) FrameBuffer local320 = this.aFrameBuffer11;
                                synchronized (this.aFrameBuffer11) {
                                    this.aFrameBuffer11.method508(this.aParticleNode1);
                                }
                            } else {
                                this.aParticleNode1.method1211();
                            }
                        }
                        this.anInt952 = 0;
                    }
                } catch (@Pc(341) IOException local341) {
                    try {
                        this.aSocket3.close();
                    } catch (@Pc(346) Exception local346) {
                    }
                    this.aSocket3 = null;
                    this.anInputStream2 = null;
                    this.anOutputStream2 = null;
                    this.anInt952 = 0;
                }
            }
        } catch (@Pc(360) RuntimeException local360) {
            signlink.reporterror("92613, " + arg0 + ", " + local360.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BBII)Z")
    private boolean method655(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            if (arg0 == null || arg0.length < 2) {
                return false;
            }
            @Pc(12) int local12 = arg0.length - 2;
            @Pc(28) int local28 = ((arg0[local12] & 0xFF) << 8) + (arg0[local12 + 1] & 0xFF);
            this.aCRC32_2.reset();
            @Pc(37) int local37;
            if (arg1 != this.aByte31) {
                for (local37 = 1; local37 > 0; local37++) {
                }
            }
            this.aCRC32_2.update(arg0, 0, local12);
            local37 = (int) this.aCRC32_2.getValue();
            if (local28 == arg3) {
                return local37 == arg2;
            } else {
                return false;
            }
        } catch (@Pc(66) RuntimeException local66) {
            signlink.reporterror("99655, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local66.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!mb;B)V")
    private void method656(@OriginalArg(0) ParticleNode arg0, @OriginalArg(1) byte arg1) {
        try {
            if (arg1 == this.aByte32) {
                try {
                    if (this.aSocket3 == null) {
                        @Pc(11) long local11 = System.currentTimeMillis();
                        if (local11 - this.aLong31 < 4000L) {
                            return;
                        }
                        this.aLong31 = local11;
                        this.aSocket3 = this.aClient5.method230(Static8.anInt348 + 43594);
                        this.anInputStream2 = this.aSocket3.getInputStream();
                        this.anOutputStream2 = this.aSocket3.getOutputStream();
                        this.anOutputStream2.write(15);
                        for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
                            this.anInputStream2.read();
                        }
                        this.anInt953 = 0;
                    }
                    this.aByteArray18[0] = (byte) arg0.anInt770;
                    this.aByteArray18[1] = (byte) (arg0.index >> 8);
                    this.aByteArray18[2] = (byte) arg0.index;
                    if (arg0.aBoolean195) {
                        this.aByteArray18[3] = 2;
                    } else if (this.aClient5.aBoolean54) {
                        this.aByteArray18[3] = 0;
                    } else {
                        this.aByteArray18[3] = 1;
                    }
                    this.anOutputStream2.write(this.aByteArray18, 0, 4);
                    this.anInt954 = 0;
                    this.anInt950 = -10000;
                } catch (@Pc(123) IOException local123) {
                    try {
                        this.aSocket3.close();
                    } catch (@Pc(128) Exception local128) {
                    }
                    this.aSocket3 = null;
                    this.anInputStream2 = null;
                    this.anOutputStream2 = null;
                    this.anInt952 = 0;
                    this.anInt950++;
                }
            }
        } catch (@Pc(148) RuntimeException local148) {
            signlink.reporterror("22553, " + arg0 + ", " + arg1 + ", " + local148.toString());
            throw new RuntimeException();
        }
    }
}
