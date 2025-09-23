from base64 import b64decode
from Crypto.Cipher import AES

def hex_to_bytes(hex_str):
    return bytes.fromhex(hex_str)

key_hex = "8d127684cbc37c17616d806cf50473cc"
cipher_b64 = "5UJiFctbmgbDoLXmpL12mkno8HT4Lv8dlat8FxR2GOc="

key = hex_to_bytes(key_hex)
ciphertext = b64decode(cipher_b64)

cipher = AES.new(key, AES.MODE_ECB)
plaintext = cipher.decrypt(ciphertext)

print("Decrypted secret:", plaintext.decode("utf-8"))
