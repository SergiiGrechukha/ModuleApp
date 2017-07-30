package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1087 {

    @Ignore    private SampleClass1088 sampleClass;

    public SampleClass1087(){
        sampleClass = new SampleClass1088();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}