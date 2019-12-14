# [BIP39](https://github.com/bitcoin/bips/blob/master/bip-0039.mediawiki)

通过助记词生成种子.

# 理解
我们知道btc地址是我们区块网络中的地址,如何确定网络中的地址是属于自己的,这里有公钥和私钥,用户私钥进行区分地址归属,这里BIP39通过人类容易理解的助记词生成seed. 而seed用于生成私钥.
一般情况.
助记词有12 ~ 24个单词对应 128 ~ 256 位随机序列 
seed有512位.

* [助记词详解](https://cloud.tencent.com/developer/news/327709)

## Step1

生成128位随机数. ENT

## Step2
生成检测码(checksum)
checksum长度 = ENT/32
hash = sha256(seed) 
checksum = hash前四位(ENT/32)

## Step3
seed + checksum 连接

## Step4

总长度位128 + 4 = 132位
划分为12段, 每一段11位.
最后转换为十进制[425,]

## Step5

官方提供的有 wordlist. 从 1 开始 到 2048. 注意得到的数组从0开始.


