package com.ss.example.springbootdubboconsumerexample.adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.cluster.Cluster;

/**
 * Cluster$Adaptive
 *
 * @author shisong
 * @date 2020/8/25
 */
public class Cluster$Adaptive implements Cluster {

    public Invoker join(org.apache.dubbo.rpc.cluster.Directory arg0) throws org.apache.dubbo.rpc.RpcException {
        if (arg0 == null){
            throw new IllegalArgumentException("org.apache.dubbo.rpc.cluster.Directory argument == null");
        }
        if (arg0.getUrl() == null){
            throw new IllegalArgumentException("org.apache.dubbo.rpc.cluster.Directory argument getUrl() == null");
        }
        URL url = arg0.getUrl();
        String extName = url.getParameter("cluster", "failover");
        if(extName == null){
            throw new IllegalStateException("Failed to get extension (org.apache.dubbo.rpc.cluster.Cluster) name from url (" + url.toString() + ") use keys([cluster])");
        }
        Cluster extension = ExtensionLoader.getExtensionLoader(Cluster.class).getExtension(extName);
        return extension.join(arg0);
    }
}