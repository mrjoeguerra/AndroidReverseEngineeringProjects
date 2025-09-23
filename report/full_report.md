# Reverse Engineering Report – OWASP UnCrackable Level 1

## 1. Introduction
This report documents the static reverse engineering process for the **OWASP UnCrackable Level 1** Android CrackMe challenge. The objective was to analyze the APK, identify its protection mechanisms, and recover the secret required to solve the challenge.

## 2. Tools & Environment
- jadx-gui
- apktool
- Python + pycryptodome

## 3. Initial Reconnaissance
- Manifest reveals MainActivity as entry point.
- MainActivity performs root/debug checks and calls `a.a(String)` for verification.

## 4. Deep Dive into Verification Logic
- `sg.vantagepoint.a.a` implements AES decryption (ECB, PKCS#7).
- Verification method uses:
  - Key (hex): 8d127684cbc37c17616d806cf50473cc
  - Ciphertext (Base64): 5UJiFctbmgbDoLXmpL12mkno8HT4Lv8dlat8FxR2GOc=

## 5. Decryption & Recovery
Python script recovered secret:
```
I want to believe
```

## 6. Findings
- Root/debug detection present
- AES encryption used to hide secret
- Secret successfully recovered via static reversing

## 7. Conclusion
The challenge demonstrates anti-tamper protections and simple encryption. Through static analysis we successfully extracted the hidden secret.
