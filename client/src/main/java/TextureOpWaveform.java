import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

import java.io.IOException;
import java.io.RandomAccessFile;

@OriginalClass("client!vb")
public final class TextureOpWaveform {

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    private int anInt969 = 65000;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    private int anInt968;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile aRandomAccessFile1;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile aRandomAccessFile2;

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IIILjava/io/RandomAccessFile;)V")
    public TextureOpWaveform(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) RandomAccessFile arg4) {
        try {
            this.anInt968 = arg3;
            this.aRandomAccessFile1 = arg0;
            this.aRandomAccessFile2 = arg4;
            this.anInt969 = arg2;
            if (arg1 < 2 || arg1 > 2) {
                throw new NullPointerException();
            }
        } catch (@Pc(27) RuntimeException local27) {
            signlink.reporterror("68774, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local27.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        try {
            if (arg1 != 8) {
                throw new NullPointerException();
            }
            try {
                this.method661(this.aRandomAccessFile2, (byte) -38, arg0 * 6);
                @Pc(18) int local18;
                @Pc(29) int local29;
                for (local18 = 0; local18 < 6; local18 += local29) {
                    local29 = this.aRandomAccessFile2.read(Static34.aByteArray20, local18, 6 - local18);
                    if (local29 == -1) {
                        return null;
                    }
                }
                local29 = ((Static34.aByteArray20[0] & 0xFF) << 16) + ((Static34.aByteArray20[1] & 0xFF) << 8) + (Static34.aByteArray20[2] & 0xFF);
                @Pc(85) int local85 = ((Static34.aByteArray20[3] & 0xFF) << 16) + ((Static34.aByteArray20[4] & 0xFF) << 8) + (Static34.aByteArray20[5] & 0xFF);
                if (local29 < 0 || local29 > this.anInt969) {
                    return null;
                } else if (local85 > 0 && (long) local85 <= this.aRandomAccessFile1.length() / 520L) {
                    @Pc(109) byte[] local109 = new byte[local29];
                    @Pc(111) int local111 = 0;
                    @Pc(113) int local113 = 0;
                    while (local111 < local29) {
                        if (local85 == 0) {
                            return null;
                        }
                        this.method661(this.aRandomAccessFile1, (byte) -38, local85 * 520);
                        local18 = 0;
                        @Pc(133) int local133 = local29 - local111;
                        if (local133 > 512) {
                            local133 = 512;
                        }
                        @Pc(151) int local151;
                        while (local18 < local133 + 8) {
                            local151 = this.aRandomAccessFile1.read(Static34.aByteArray20, local18, local133 + 8 - local18);
                            if (local151 == -1) {
                                return null;
                            }
                            local18 += local151;
                        }
                        local151 = ((Static34.aByteArray20[0] & 0xFF) << 8) + (Static34.aByteArray20[1] & 0xFF);
                        @Pc(193) int local193 = ((Static34.aByteArray20[2] & 0xFF) << 8) + (Static34.aByteArray20[3] & 0xFF);
                        @Pc(215) int local215 = ((Static34.aByteArray20[4] & 0xFF) << 16) + ((Static34.aByteArray20[5] & 0xFF) << 8) + (Static34.aByteArray20[6] & 0xFF);
                        @Pc(221) int local221 = Static34.aByteArray20[7] & 0xFF;
                        if (local151 == arg0 && local193 == local113 && local221 == this.anInt968) {
                            if (local215 >= 0 && (long) local215 <= this.aRandomAccessFile1.length() / 520L) {
                                for (@Pc(248) int local248 = 0; local248 < local133; local248++) {
                                    local109[local111++] = Static34.aByteArray20[local248 + 8];
                                }
                                local85 = local215;
                                local113++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return local109;
                } else {
                    return null;
                }
            } catch (@Pc(272) IOException local272) {
                return null;
            }
        } catch (@Pc(275) RuntimeException local275) {
            signlink.reporterror("76263, " + arg0 + ", " + arg1 + ", " + local275.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[BII)Z")
    public synchronized boolean method659(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
        try {
            @Pc(7) boolean local7 = this.method660(-12880, true, arg2, arg1, arg3);
            if (arg0 != 7) {
                for (@Pc(12) int local12 = 1; local12 > 0; local12++) {
                }
            }
            if (!local7) {
                local7 = this.method660(-12880, false, arg2, arg1, arg3);
            }
            return local7;
        } catch (@Pc(30) RuntimeException local30) {
            signlink.reporterror("48569, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local30.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZI[BI)Z")
    private synchronized boolean method660(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
        try {
            if (arg0 != -12880) {
                throw new NullPointerException();
            }
            try {
                @Pc(65) int local65;
                @Pc(20) int local20;
                @Pc(31) int local31;
                if (arg1) {
                    this.method661(this.aRandomAccessFile2, (byte) -38, arg2 * 6);
                    local20 = 0;
                    while (true) {
                        if (local20 >= 6) {
                            local65 = ((Static34.aByteArray20[3] & 0xFF) << 16) + ((Static34.aByteArray20[4] & 0xFF) << 8) + (Static34.aByteArray20[5] & 0xFF);
                            if (local65 <= 0 || (long) local65 > this.aRandomAccessFile1.length() / 520L) {
                                return false;
                            }
                            break;
                        }
                        local31 = this.aRandomAccessFile2.read(Static34.aByteArray20, local20, 6 - local20);
                        if (local31 == -1) {
                            return false;
                        }
                        local20 += local31;
                    }
                } else {
                    local65 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
                    if (local65 == 0) {
                        local65 = 1;
                    }
                }
                Static34.aByteArray20[0] = (byte) (arg4 >> 16);
                Static34.aByteArray20[1] = (byte) (arg4 >> 8);
                Static34.aByteArray20[2] = (byte) arg4;
                Static34.aByteArray20[3] = (byte) (local65 >> 16);
                Static34.aByteArray20[4] = (byte) (local65 >> 8);
                Static34.aByteArray20[5] = (byte) local65;
                this.method661(this.aRandomAccessFile2, (byte) -38, arg2 * 6);
                this.aRandomAccessFile2.write(Static34.aByteArray20, 0, 6);
                local20 = 0;
                local31 = 0;
                while (local20 < arg4) {
                    @Pc(151) int local151 = 0;
                    @Pc(163) int local163;
                    if (arg1) {
                        this.method661(this.aRandomAccessFile1, (byte) -38, local65 * 520);
                        @Pc(174) int local174;
                        for (local163 = 0; local163 < 8; local163 += local174) {
                            local174 = this.aRandomAccessFile1.read(Static34.aByteArray20, local163, 8 - local163);
                            if (local174 == -1) {
                                break;
                            }
                        }
                        if (local163 == 8) {
                            local174 = ((Static34.aByteArray20[0] & 0xFF) << 8) + (Static34.aByteArray20[1] & 0xFF);
                            @Pc(215) int local215 = ((Static34.aByteArray20[2] & 0xFF) << 8) + (Static34.aByteArray20[3] & 0xFF);
                            local151 = ((Static34.aByteArray20[4] & 0xFF) << 16) + ((Static34.aByteArray20[5] & 0xFF) << 8) + (Static34.aByteArray20[6] & 0xFF);
                            @Pc(243) int local243 = Static34.aByteArray20[7] & 0xFF;
                            if (local174 != arg2 || local215 != local31 || local243 != this.anInt968) {
                                return false;
                            }
                            if (local151 < 0 || (long) local151 > this.aRandomAccessFile1.length() / 520L) {
                                return false;
                            }
                        }
                    }
                    if (local151 == 0) {
                        arg1 = false;
                        local151 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
                        if (local151 == 0) {
                            local151++;
                        }
                        if (local151 == local65) {
                            local151++;
                        }
                    }
                    if (arg4 - local20 <= 512) {
                        local151 = 0;
                    }
                    Static34.aByteArray20[0] = (byte) (arg2 >> 8);
                    Static34.aByteArray20[1] = (byte) arg2;
                    Static34.aByteArray20[2] = (byte) (local31 >> 8);
                    Static34.aByteArray20[3] = (byte) local31;
                    Static34.aByteArray20[4] = (byte) (local151 >> 16);
                    Static34.aByteArray20[5] = (byte) (local151 >> 8);
                    Static34.aByteArray20[6] = (byte) local151;
                    Static34.aByteArray20[7] = (byte) this.anInt968;
                    this.method661(this.aRandomAccessFile1, (byte) -38, local65 * 520);
                    this.aRandomAccessFile1.write(Static34.aByteArray20, 0, 8);
                    local163 = arg4 - local20;
                    if (local163 > 512) {
                        local163 = 512;
                    }
                    this.aRandomAccessFile1.write(arg3, local20, local163);
                    local20 += local163;
                    local65 = local151;
                    local31++;
                }
                return true;
            } catch (@Pc(386) IOException local386) {
                return false;
            }
        } catch (@Pc(389) RuntimeException local389) {
            signlink.reporterror("4635, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local389.toString());
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/io/RandomAccessFile;BI)V")
    private synchronized void method661(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) throws IOException {
        try {
            if (arg2 < 0 || arg2 > 62914560) {
                System.out.println("Badseek - pos:" + arg2 + " len:" + arg0.length());
                arg2 = 62914560;
                try {
                    Thread.sleep(1000L);
                } catch (@Pc(24) Exception local24) {
                }
            }
            arg0.seek((long) arg2);
            if (arg1 == -38) {
                ;
            }
        } catch (@Pc(34) RuntimeException local34) {
            signlink.reporterror("16516, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local34.toString());
            throw new RuntimeException();
        }
    }
}
