package android.support.v4.b;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

/* loaded from: classes.dex */
class d extends g {
    d() {
    }

    private File a(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0059 A[Catch: all -> 0x005d, Throwable -> 0x0060, TryCatch #4 {Throwable -> 0x0060, blocks: (B:7:0x0018, B:9:0x001e, B:12:0x0025, B:16:0x002f, B:18:0x003c, B:34:0x005c, B:33:0x0059, B:32:0x0055), top: B:55:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[Catch: IOException -> 0x0077, SYNTHETIC, TRY_LEAVE, TryCatch #1 {IOException -> 0x0077, blocks: (B:6:0x000e, B:14:0x002b, B:20:0x0041, B:43:0x006a, B:47:0x0073, B:46:0x006f, B:48:0x0076), top: B:52:0x000e, inners: #2 }] */
    @Override // android.support.v4.b.g, android.support.v4.b.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface a(android.content.Context r5, android.os.CancellationSignal r6, android.support.v4.e.b.C0006b[] r7, int r8) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r7.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L6
            return r1
        L6:
            android.support.v4.e.b$b r7 = r4.a(r7, r8)
            android.content.ContentResolver r8 = r5.getContentResolver()
            android.net.Uri r7 = r7.a()     // Catch: java.io.IOException -> L77
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r6 = r8.openFileDescriptor(r7, r0, r6)     // Catch: java.io.IOException -> L77
            java.io.File r7 = r4.a(r6)     // Catch: java.lang.Throwable -> L5d java.lang.Throwable -> L60
            if (r7 == 0) goto L2f
            boolean r8 = r7.canRead()     // Catch: java.lang.Throwable -> L5d java.lang.Throwable -> L60
            if (r8 != 0) goto L25
            goto L2f
        L25:
            android.graphics.Typeface r5 = android.graphics.Typeface.createFromFile(r7)     // Catch: java.lang.Throwable -> L5d java.lang.Throwable -> L60
            if (r6 == 0) goto L2e
            r6.close()     // Catch: java.io.IOException -> L77
        L2e:
            return r5
        L2f:
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L5d java.lang.Throwable -> L60
            java.io.FileDescriptor r8 = r6.getFileDescriptor()     // Catch: java.lang.Throwable -> L5d java.lang.Throwable -> L60
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L5d java.lang.Throwable -> L60
            android.graphics.Typeface r5 = super.a(r5, r7)     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L48
            r7.close()     // Catch: java.lang.Throwable -> L5d java.lang.Throwable -> L60
            if (r6 == 0) goto L44
            r6.close()     // Catch: java.io.IOException -> L77
        L44:
            return r5
        L45:
            r5 = move-exception
            r8 = r1
            goto L4e
        L48:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L4a
        L4a:
            r8 = move-exception
            r3 = r8
            r8 = r5
            r5 = r3
        L4e:
            if (r8 == 0) goto L59
            r7.close()     // Catch: java.lang.Throwable -> L54 java.lang.Throwable -> L5d
            goto L5c
        L54:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch: java.lang.Throwable -> L5d java.lang.Throwable -> L60
            goto L5c
        L59:
            r7.close()     // Catch: java.lang.Throwable -> L5d java.lang.Throwable -> L60
        L5c:
            throw r5     // Catch: java.lang.Throwable -> L5d java.lang.Throwable -> L60
        L5d:
            r5 = move-exception
            r7 = r1
            goto L66
        L60:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L62
        L62:
            r7 = move-exception
            r3 = r7
            r7 = r5
            r5 = r3
        L66:
            if (r6 == 0) goto L76
            if (r7 == 0) goto L73
            r6.close()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L77
            goto L76
        L6e:
            r6 = move-exception
            r7.addSuppressed(r6)     // Catch: java.io.IOException -> L77
            goto L76
        L73:
            r6.close()     // Catch: java.io.IOException -> L77
        L76:
            throw r5     // Catch: java.io.IOException -> L77
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.d.a(android.content.Context, android.os.CancellationSignal, android.support.v4.e.b$b[], int):android.graphics.Typeface");
    }
}
