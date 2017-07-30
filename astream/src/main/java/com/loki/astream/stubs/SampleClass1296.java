package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1296 {

    @Ignore    private SampleClass1297 sampleClass;

    public SampleClass1296(){
        sampleClass = new SampleClass1297();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}