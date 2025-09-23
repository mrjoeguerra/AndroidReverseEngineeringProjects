# UnCrackable Level 1 – Static Reversing Walkthrough

## 📂 Repository Structure
```
UnCrackable-Level1/
├── report/
│   ├── full_report.md
│   └── README.md
├── scripts/
│   └── decrypt_secret.py
└── apk/
    └── UnCrackable-Level1.apk (not included)
```

## Steps
1. Decompiled APK with jadx → found MainActivity.
2. Verified anti-tamper checks and secret verification call.
3. Located AES key + ciphertext in verification method.
4. Wrote Python script to decrypt.

## Script Output
```
I want to believe
```
