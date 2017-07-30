package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass939 {

    @Ignore    private SampleClass940 sampleClass;

    public SampleClass939(){
        sampleClass = new SampleClass940();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}