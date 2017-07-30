package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass622 {

    @Ignore    private SampleClass623 sampleClass;

    public SampleClass622(){
        sampleClass = new SampleClass623();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}