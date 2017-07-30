package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1255 {

    @Ignore    private SampleClass1256 sampleClass;

    public SampleClass1255(){
        sampleClass = new SampleClass1256();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}