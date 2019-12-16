package com.yixiaolabs;

import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.params.MainNetParams;
import org.bitcoinj.params.RegTestParams;
import org.bitcoinj.params.TestNet3Params;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // 基础概念
        /**
         * 网络环境
         */
        NetworkParameters testNet3Params = TestNet3Params.get(); // test3 测试网络
        NetworkParameters regTestParams = RegTestParams.get(); // 本地测试
        NetworkParameters mainNetParams = MainNetParams.get(); // 主网
        /**
         *  通过 seed随机种子可以 生成 私钥 , 通过私钥可以生成公钥
         */
    }
}
