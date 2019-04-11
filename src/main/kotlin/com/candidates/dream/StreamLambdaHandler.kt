package com.candidates.dream

import com.amazonaws.serverless.proxy.model.AwsProxyRequest
import com.amazonaws.serverless.proxy.model.AwsProxyResponse
import com.amazonaws.serverless.proxy.spring.SpringBootLambdaContainerHandler
import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestStreamHandler
import java.io.InputStream
import java.io.OutputStream


class StreamLambdaHandler : RequestStreamHandler {
    private var handler: SpringBootLambdaContainerHandler<AwsProxyRequest, AwsProxyResponse> = SpringBootLambdaContainerHandler.getAwsProxyHandler(DreamApplication::class.java)


    override fun handleRequest(inputStream: InputStream?, outputStream: OutputStream?, context: Context?) {
        handler.proxyStream(inputStream, outputStream, context)
    }
}