from base64 import b64decode
from Crypto.Cipher import AES

key_hex = "8d127684cbc37c17616d806cf50473cc"
cipher_b64 = "5UJiFctbmgbDoLXmpL12mkno8HT4Lv8dlat8FxR2GOc="

key = bytes.fromhex(key_hex)
ciphertext = b64decode(cipher_b64)

cipher = AES.new(key, AES.MODE_ECB)
plaintext = cipher.decrypt(ciphertext)

# Strip PKCS#7 padding
pad_len = plaintext[-1]
print("Decrypted secret:", plaintext[:-pad_len].decode("utf-8"))
