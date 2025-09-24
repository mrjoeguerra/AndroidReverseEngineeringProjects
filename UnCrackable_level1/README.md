# OWASP UnCrackable Level 1 – Reverse Engineering Report

This repository contains my **static reversing solution** for the OWASP *UnCrackable Level 1* Android CrackMe challenge.

## 📂 Structure
```
UnCrackable-Level1/
├── report/
│   ├── full_report.md        # Detailed professional write-up
│   └── README.md             # Short walkthrough summary
├── scripts/
│   └── decrypt_secret.py     # Script to decrypt the secret
├── apk/
│   └── UnCrackable-Level1.apk (challenge APK, add manually if missing)
├── LICENSE
└── README.md (this file)
```

## 🚀 Overview
- Decompiled APK using `jadx`.
- Identified anti-tamper checks (root/debug detection).
- Found AES-128 encrypted secret and hardcoded key.
- Decrypted offline using Python.

## 🔑 Recovered Secret
```
I want to believe
```

## 🛠️ Skills Demonstrated
- Android reverse engineering (static analysis)
- Understanding of anti-tamper/root detection techniques
- Cryptography analysis (AES/ECB/PKCS7)
- Clean documentation & professional reporting

---

📄 Licensed under the MIT License.
