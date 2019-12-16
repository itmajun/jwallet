# bitcoinJ

这是一个处理比特币协议的java库. 可以唯一个钱包, 其中包括, 发送/接收交易

# 特性

* SPV: 轻量级简化付款验证
* 小额支付通道

# 抽象

* NetworkParameters : 网络设置
* Wallet : 秘钥管理 `ECKeys`
* PeerGroup : p2p 网络
* BlockChain : 区块数据
* BlockStore : 本地化区块存储
* WalletEventListener : 事件监听, 比如 `receive` event

`WalletAppKit`:  是构建与上述抽象结构之上的高层工具类.