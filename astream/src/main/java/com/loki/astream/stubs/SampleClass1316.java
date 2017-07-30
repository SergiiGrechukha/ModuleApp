package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1316 {

    @Ignore    private SampleClass1317 sampleClass;

    public SampleClass1316(){
        sampleClass = new SampleClass1317();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}