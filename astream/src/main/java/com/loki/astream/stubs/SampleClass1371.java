package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1371 {

    @Ignore    private SampleClass1372 sampleClass;

    public SampleClass1371(){
        sampleClass = new SampleClass1372();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}