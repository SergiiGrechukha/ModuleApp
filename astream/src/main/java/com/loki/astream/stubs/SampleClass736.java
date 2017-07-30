package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass736 {

    @Ignore    private SampleClass737 sampleClass;

    public SampleClass736(){
        sampleClass = new SampleClass737();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}