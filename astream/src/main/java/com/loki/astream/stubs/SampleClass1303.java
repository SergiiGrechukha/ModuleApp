package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1303 {

    @Ignore    private SampleClass1304 sampleClass;

    public SampleClass1303(){
        sampleClass = new SampleClass1304();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}